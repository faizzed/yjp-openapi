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
import jp.co.yahoo.adssearchapi.v4.model.KeywordForecastMetricsServiceMatchType;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword オブジェクトは、見積もりリクエストを格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword object contains the estimate request.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword オブジェクトは、見積もりリクエストを格納します。</div> <div lang=\"en\">KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword object contains the estimate request.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword {
  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_MATCH_TYPE = "matchType";
  @SerializedName(SERIALIZED_NAME_MATCH_TYPE)
  private KeywordForecastMetricsServiceMatchType matchType;

  public static final String SERIALIZED_NAME_MAX_CPC = "maxCpc";
  @SerializedName(SERIALIZED_NAME_MAX_CPC)
  private Long maxCpc;

  public static final String SERIALIZED_NAME_IS_NEGATIVE = "isNegative";
  @SerializedName(SERIALIZED_NAME_IS_NEGATIVE)
  private Boolean isNegative;


  public KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キーワードです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Keyword&lt;/div&gt; 
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">キーワードです。</div> <div lang=\"en\">Keyword</div> ")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword matchType(KeywordForecastMetricsServiceMatchType matchType) {
    
    this.matchType = matchType;
    return this;
  }

   /**
   * Get matchType
   * @return matchType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public KeywordForecastMetricsServiceMatchType getMatchType() {
    return matchType;
  }


  public void setMatchType(KeywordForecastMetricsServiceMatchType matchType) {
    this.matchType = matchType;
  }


  public KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword maxCpc(Long maxCpc) {
    
    this.maxCpc = maxCpc;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;最大クリック単価です。&lt;br&gt; isNegativeがTRUEのときにmaxCpcを指定することはできません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Maximum CPC.&lt;br&gt; When isNegative is TRUE, maxCPC cannot be specified.&lt;/div&gt; 
   * @return maxCpc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">最大クリック単価です。<br> isNegativeがTRUEのときにmaxCpcを指定することはできません。</div> <div lang=\"en\">Maximum CPC.<br> When isNegative is TRUE, maxCPC cannot be specified.</div> ")

  public Long getMaxCpc() {
    return maxCpc;
  }


  public void setMaxCpc(Long maxCpc) {
    this.maxCpc = maxCpc;
  }


  public KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword isNegative(Boolean isNegative) {
    
    this.isNegative = isNegative;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;除外キーワードです。&lt;br&gt; デフォルト値はfalseです。&lt;br&gt; 除外キーワードのみでのリクエストはできません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Refine keyword.&lt;br&gt; The default value will be FALSE.&lt;br&gt; Cannot request with only refine keyword.&lt;/div&gt; 
   * @return isNegative
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">除外キーワードです。<br> デフォルト値はfalseです。<br> 除外キーワードのみでのリクエストはできません。</div> <div lang=\"en\">Refine keyword.<br> The default value will be FALSE.<br> Cannot request with only refine keyword.</div> ")

  public Boolean getIsNegative() {
    return isNegative;
  }


  public void setIsNegative(Boolean isNegative) {
    this.isNegative = isNegative;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword keywordForecastMetricsServiceKeywordPlanAdGroupKeyword = (KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword) o;
    return Objects.equals(this.text, keywordForecastMetricsServiceKeywordPlanAdGroupKeyword.text) &&
        Objects.equals(this.matchType, keywordForecastMetricsServiceKeywordPlanAdGroupKeyword.matchType) &&
        Objects.equals(this.maxCpc, keywordForecastMetricsServiceKeywordPlanAdGroupKeyword.maxCpc) &&
        Objects.equals(this.isNegative, keywordForecastMetricsServiceKeywordPlanAdGroupKeyword.isNegative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, matchType, maxCpc, isNegative);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    maxCpc: ").append(toIndentedString(maxCpc)).append("\n");
    sb.append("    isNegative: ").append(toIndentedString(isNegative)).append("\n");
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
