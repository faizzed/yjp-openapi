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
import jp.co.yahoo.adssearchapi.v4.model.ConversionTrackerServiceAppPostbackUrlClearFlag;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ポストバックURLです。&lt;br&gt; このフィールドは、いずれの場合でも省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Postback URL.&lt;br&gt; This field is optional in any cases.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ポストバックURLです。<br> このフィールドは、いずれの場合でも省略可能となります。</div> <div lang=\"en\">Postback URL.<br> This field is optional in any cases.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class ConversionTrackerServiceAppPostbackUrl {
  public static final String SERIALIZED_NAME_APP_POSTBACK_URL_CLEAR_FLAG = "appPostbackUrlClearFlag";
  @SerializedName(SERIALIZED_NAME_APP_POSTBACK_URL_CLEAR_FLAG)
  private ConversionTrackerServiceAppPostbackUrlClearFlag appPostbackUrlClearFlag;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public ConversionTrackerServiceAppPostbackUrl appPostbackUrlClearFlag(ConversionTrackerServiceAppPostbackUrlClearFlag appPostbackUrlClearFlag) {
    
    this.appPostbackUrlClearFlag = appPostbackUrlClearFlag;
    return this;
  }

   /**
   * Get appPostbackUrlClearFlag
   * @return appPostbackUrlClearFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConversionTrackerServiceAppPostbackUrlClearFlag getAppPostbackUrlClearFlag() {
    return appPostbackUrlClearFlag;
  }


  public void setAppPostbackUrlClearFlag(ConversionTrackerServiceAppPostbackUrlClearFlag appPostbackUrlClearFlag) {
    this.appPostbackUrlClearFlag = appPostbackUrlClearFlag;
  }


  public ConversionTrackerServiceAppPostbackUrl url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    ConversionTrackerServiceAppPostbackUrl conversionTrackerServiceAppPostbackUrl = (ConversionTrackerServiceAppPostbackUrl) o;
    return Objects.equals(this.appPostbackUrlClearFlag, conversionTrackerServiceAppPostbackUrl.appPostbackUrlClearFlag) &&
        Objects.equals(this.url, conversionTrackerServiceAppPostbackUrl.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appPostbackUrlClearFlag, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTrackerServiceAppPostbackUrl {\n");
    sb.append("    appPostbackUrlClearFlag: ").append(toIndentedString(appPostbackUrlClearFlag)).append("\n");
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

