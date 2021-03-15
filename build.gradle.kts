import org.openapitools.generator.gradle.plugin.tasks.GenerateTask
import org.ajoberstar.grgit.Grgit

plugins {
    java
    kotlin("jvm") version "1.4.21"
    id("org.openapi.generator") version "5.0.1"
    id("org.ajoberstar.grgit") version "4.0.1"

    `java-library`
}

group = "org.openapi.yjp"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation("io.swagger:swagger-annotations:1.5.24")
    implementation("com.google.code.gson:gson:2.8.5")

    implementation("com.squareup.okhttp3:okhttp:4.9.1")
    implementation("com.squareup.okhttp3:logging-interceptor:4.9.1")
    implementation("com.squareup.retrofit:retrofit:1.9.0")
    implementation("org.threeten:threetenbp:1.4.0")
    implementation("io.gsonfire:gson-fire:1.8.4")
    implementation("javax.annotation:javax.annotation-api:1.2-b01")
    implementation("org.apache.oltu.oauth2:org.apache.oltu.oauth2.client:1.0.1")
    implementation("com.google.code.findbugs:jsr305:3.0.2")

    testCompile("junit", "junit", "4.12")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

val projectPath = "${project.rootDir}"
val yahooGeneratedSourceCodePath = "${project.rootDir}/yahoo-ads-search-api-generation"
val apiVersion = "v4"
val yahooOpenApiGitUrl = "https://github.com/yahoojp-marketing/ads-search-api-documents.git"
val commitHash = "8775e7a35a2bfc3260648a9834674f309ea92407" //reset to Feb 24, 2021
val mode = "hard"

tasks.register("cloneYahooAdsSearchApi") {
    doFirst {
        println("Cleaning up service.")
        project.delete(
            "yahoo-ads-search-api-generation",
            "ads-search-api-documents"
        )

        println("Cloning $yahooOpenApiGitUrl")
        Grgit.clone(mapOf(
            "dir" to "$projectPath/ads-search-api-documents",
            "uri" to yahooOpenApiGitUrl
        )).reset(mapOf(
            "mode" to mode,
            "commit" to commitHash
        ))
    }
}


tasks.register("generateYahooLibrary", GenerateTask::class.java) {
    println("Generating Yahoo Ads Search API")
    generatorName.set("java")
    modelPackage.set("jp.co.yahoo.adssearchapi.$apiVersion.model")
    inputSpec.set("$projectPath/ads-search-api-documents/design/$apiVersion/Route.yaml")
    outputDir.set(yahooGeneratedSourceCodePath)
    generateApiTests.set(false)
    generateModelTests.set(false)
    generateApiDocumentation.set(false)
    generateModelDocumentation.set(false)
    additionalProperties.set(mapOf("variableNamingConvention" to "camelCase", "enumPropertyNaming" to "UPPERCASE", "serializationLibrary" to "gson"))

    doLast {
        println("Copying Yahoo Ads Search API models")
        copy {
            from(file("$yahooGeneratedSourceCodePath/src/main/java"))
            into("${projectPath}/src/main/java")
        }

        println("Cleaning up once more!")
        project.delete(
            "yahoo-ads-search-api-generation",
            "ads-search-api-documents"
        )
    }
}

tasks["generateYahooLibrary"].dependsOn("cloneYahooAdsSearchApi")
tasks["build"].dependsOn("generateYahooLibrary")

