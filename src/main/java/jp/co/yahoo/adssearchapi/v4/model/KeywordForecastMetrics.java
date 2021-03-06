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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordForecastMetrics オブジェクトは、見積もりリクエストを格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordForecastMetrics object contains the estimate request.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordForecastMetrics オブジェクトは、見積もりリクエストを格納します。</div> <div lang=\"en\">KeywordForecastMetrics object contains the estimate request.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class KeywordForecastMetrics {
  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword;

  public static final String SERIALIZED_NAME_IMPRESSIONS = "impressions";
  @SerializedName(SERIALIZED_NAME_IMPRESSIONS)
  private Double impressions;

  public static final String SERIALIZED_NAME_CTR = "ctr";
  @SerializedName(SERIALIZED_NAME_CTR)
  private Double ctr;

  public static final String SERIALIZED_NAME_AVERAGE_CPC = "averageCpc";
  @SerializedName(SERIALIZED_NAME_AVERAGE_CPC)
  private Double averageCpc;

  public static final String SERIALIZED_NAME_CLICKS = "clicks";
  @SerializedName(SERIALIZED_NAME_CLICKS)
  private Double clicks;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private Double cost;


  public KeywordForecastMetrics keyword(String keyword) {
    
    this.keyword = keyword;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キーワードです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Keywords.&lt;/div&gt; 
   * @return keyword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キーワードです。</div> <div lang=\"en\">Keywords.</div> ")

  public String getKeyword() {
    return keyword;
  }


  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public KeywordForecastMetrics impressions(Double impressions) {
    
    this.impressions = impressions;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;インプレッション数です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Number of impression.&lt;/div&gt; 
   * @return impressions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">インプレッション数です。</div> <div lang=\"en\">Number of impression.</div> ")

  public Double getImpressions() {
    return impressions;
  }


  public void setImpressions(Double impressions) {
    this.impressions = impressions;
  }


  public KeywordForecastMetrics ctr(Double ctr) {
    
    this.ctr = ctr;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;クリック率です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Click rate.&lt;/div&gt; 
   * @return ctr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">クリック率です。</div> <div lang=\"en\">Click rate.</div> ")

  public Double getCtr() {
    return ctr;
  }


  public void setCtr(Double ctr) {
    this.ctr = ctr;
  }


  public KeywordForecastMetrics averageCpc(Double averageCpc) {
    
    this.averageCpc = averageCpc;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;平均CPCです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Average CPC.&lt;/div&gt; 
   * @return averageCpc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">平均CPCです。</div> <div lang=\"en\">Average CPC.</div> ")

  public Double getAverageCpc() {
    return averageCpc;
  }


  public void setAverageCpc(Double averageCpc) {
    this.averageCpc = averageCpc;
  }


  public KeywordForecastMetrics clicks(Double clicks) {
    
    this.clicks = clicks;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;クリック数です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Number of click.&lt;/div&gt; 
   * @return clicks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">クリック数です。</div> <div lang=\"en\">Number of click.</div> ")

  public Double getClicks() {
    return clicks;
  }


  public void setClicks(Double clicks) {
    this.clicks = clicks;
  }


  public KeywordForecastMetrics cost(Double cost) {
    
    this.cost = cost;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;コストです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Cost.&lt;/div&gt; 
   * @return cost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">コストです。</div> <div lang=\"en\">Cost.</div> ")

  public Double getCost() {
    return cost;
  }


  public void setCost(Double cost) {
    this.cost = cost;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordForecastMetrics keywordForecastMetrics = (KeywordForecastMetrics) o;
    return Objects.equals(this.keyword, keywordForecastMetrics.keyword) &&
        Objects.equals(this.impressions, keywordForecastMetrics.impressions) &&
        Objects.equals(this.ctr, keywordForecastMetrics.ctr) &&
        Objects.equals(this.averageCpc, keywordForecastMetrics.averageCpc) &&
        Objects.equals(this.clicks, keywordForecastMetrics.clicks) &&
        Objects.equals(this.cost, keywordForecastMetrics.cost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyword, impressions, ctr, averageCpc, clicks, cost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordForecastMetrics {\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    impressions: ").append(toIndentedString(impressions)).append("\n");
    sb.append("    ctr: ").append(toIndentedString(ctr)).append("\n");
    sb.append("    averageCpc: ").append(toIndentedString(averageCpc)).append("\n");
    sb.append("    clicks: ").append(toIndentedString(clicks)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
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

