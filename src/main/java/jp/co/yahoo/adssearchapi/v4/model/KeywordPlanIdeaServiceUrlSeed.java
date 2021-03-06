/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v4/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordPlanIdeaServiceUrlSeedオブジェクトは、キーワード候補作成条件としてURLを指定するオブジェクトです。&lt;br&gt;seedTypeが&lt;code&gt;URL&lt;/code&gt;の場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordPlanIdeaServiceUrlSeed object is for specifying URL as related keywords creation conditions.&lt;br&gt;If seedType is &lt;code&gt;URL&lt;/code&gt;, this field is required.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordPlanIdeaServiceUrlSeedオブジェクトは、キーワード候補作成条件としてURLを指定するオブジェクトです。<br>seedTypeが<code>URL</code>の場合は必須です。</div> <div lang=\"en\">KeywordPlanIdeaServiceUrlSeed object is for specifying URL as related keywords creation conditions.<br>If seedType is <code>URL</code>, this field is required.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class KeywordPlanIdeaServiceUrlSeed {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public KeywordPlanIdeaServiceUrlSeed url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;URLです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;URL.&lt;/div&gt; 
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">URLです。</div> <div lang=\"en\">URL.</div> ")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordPlanIdeaServiceUrlSeed keywordPlanIdeaServiceUrlSeed = (KeywordPlanIdeaServiceUrlSeed) o;
    return Objects.equals(this.url, keywordPlanIdeaServiceUrlSeed.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordPlanIdeaServiceUrlSeed {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

