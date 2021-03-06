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
import jp.co.yahoo.adssearchapi.v4.model.KeywordEstimatorServiceKeywordMatchType;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordEstimatorServiceEstimateKeyword オブジェクトは、見積もりのリクエストを格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordEstimatorServiceEstimateKeyword object is a container for the estimate request.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordEstimatorServiceEstimateKeyword オブジェクトは、見積もりのリクエストを格納するコンテナです。</div> <div lang=\"en\">KeywordEstimatorServiceEstimateKeyword object is a container for the estimate request.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class KeywordEstimatorServiceEstimateKeyword {
  public static final String SERIALIZED_NAME_KEYWORD_MATCH_TYPE = "keywordMatchType";
  @SerializedName(SERIALIZED_NAME_KEYWORD_MATCH_TYPE)
  private KeywordEstimatorServiceKeywordMatchType keywordMatchType;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;


  public KeywordEstimatorServiceEstimateKeyword keywordMatchType(KeywordEstimatorServiceKeywordMatchType keywordMatchType) {
    
    this.keywordMatchType = keywordMatchType;
    return this;
  }

   /**
   * Get keywordMatchType
   * @return keywordMatchType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public KeywordEstimatorServiceKeywordMatchType getKeywordMatchType() {
    return keywordMatchType;
  }


  public void setKeywordMatchType(KeywordEstimatorServiceKeywordMatchType keywordMatchType) {
    this.keywordMatchType = keywordMatchType;
  }


  public KeywordEstimatorServiceEstimateKeyword text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キーワードです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Keywords&lt;/div&gt; 
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">キーワードです。</div> <div lang=\"en\">Keywords</div> ")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordEstimatorServiceEstimateKeyword keywordEstimatorServiceEstimateKeyword = (KeywordEstimatorServiceEstimateKeyword) o;
    return Objects.equals(this.keywordMatchType, keywordEstimatorServiceEstimateKeyword.keywordMatchType) &&
        Objects.equals(this.text, keywordEstimatorServiceEstimateKeyword.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywordMatchType, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordEstimatorServiceEstimateKeyword {\n");
    sb.append("    keywordMatchType: ").append(toIndentedString(keywordMatchType)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

