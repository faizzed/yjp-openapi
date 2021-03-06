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
import jp.co.yahoo.adssearchapi.v4.model.AdGroupCriterionServiceBidSource;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCriterionServiceBidオブジェクトは、入札価格を表示します。 （AdGroupCriterionService用のオブジェクトです。）&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterionServiceBid object displays the bid values. *Object for AdGroupCriterionService.&lt;br&gt; This field is optional in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupCriterionServiceBidオブジェクトは、入札価格を表示します。 （AdGroupCriterionService用のオブジェクトです。）<br> ADDおよびSET時、このフィールドは省略可能となります。</div> <div lang=\"en\">AdGroupCriterionServiceBid object displays the bid values. *Object for AdGroupCriterionService.<br> This field is optional in ADD and SET operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class AdGroupCriterionServiceBid {
  public static final String SERIALIZED_NAME_AD_GROUP_MAX_CPC = "adGroupMaxCpc";
  @SerializedName(SERIALIZED_NAME_AD_GROUP_MAX_CPC)
  private Long adGroupMaxCpc;

  public static final String SERIALIZED_NAME_BID_SOURCE = "bidSource";
  @SerializedName(SERIALIZED_NAME_BID_SOURCE)
  private AdGroupCriterionServiceBidSource bidSource;

  public static final String SERIALIZED_NAME_KEYWORD_MAX_CPC = "keywordMaxCpc";
  @SerializedName(SERIALIZED_NAME_KEYWORD_MAX_CPC)
  private Long keywordMaxCpc;

  public static final String SERIALIZED_NAME_MAX_CPC = "maxCpc";
  @SerializedName(SERIALIZED_NAME_MAX_CPC)
  private Long maxCpc;


  public AdGroupCriterionServiceBid adGroupMaxCpc(Long adGroupMaxCpc) {
    
    this.adGroupMaxCpc = adGroupMaxCpc;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告グループ入札価格です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CPC of Ad group.&lt;/div&gt; 
   * @return adGroupMaxCpc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループ入札価格です。</div> <div lang=\"en\">CPC of Ad group.</div> ")

  public Long getAdGroupMaxCpc() {
    return adGroupMaxCpc;
  }


  public void setAdGroupMaxCpc(Long adGroupMaxCpc) {
    this.adGroupMaxCpc = adGroupMaxCpc;
  }


  public AdGroupCriterionServiceBid bidSource(AdGroupCriterionServiceBidSource bidSource) {
    
    this.bidSource = bidSource;
    return this;
  }

   /**
   * Get bidSource
   * @return bidSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdGroupCriterionServiceBidSource getBidSource() {
    return bidSource;
  }


  public void setBidSource(AdGroupCriterionServiceBidSource bidSource) {
    this.bidSource = bidSource;
  }


  public AdGroupCriterionServiceBid keywordMaxCpc(Long keywordMaxCpc) {
    
    this.keywordMaxCpc = keywordMaxCpc;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キーワード入札価格です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CPC of Keyword.&lt;/div&gt; 
   * @return keywordMaxCpc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キーワード入札価格です。</div> <div lang=\"en\">CPC of Keyword.</div> ")

  public Long getKeywordMaxCpc() {
    return keywordMaxCpc;
  }


  public void setKeywordMaxCpc(Long keywordMaxCpc) {
    this.keywordMaxCpc = keywordMaxCpc;
  }


  public AdGroupCriterionServiceBid maxCpc(Long maxCpc) {
    
    this.maxCpc = maxCpc;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キーワード入札価格です。&lt;br&gt; このフィールドは、省略可能となります。その際、ADD時のデフォルト設定値は1となります。&lt;br&gt; ※maxCpcが0の場合は、設定なしと同様です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CPC of Keyword.&lt;br&gt; This field is optional. The default value in ADD operation will be 1.&lt;br&gt; *Confirmed as no setting, if value is set &amp;#34;0&amp;#34;.&lt;/div&gt; 
   * @return maxCpc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キーワード入札価格です。<br> このフィールドは、省略可能となります。その際、ADD時のデフォルト設定値は1となります。<br> ※maxCpcが0の場合は、設定なしと同様です。</div> <div lang=\"en\">CPC of Keyword.<br> This field is optional. The default value in ADD operation will be 1.<br> *Confirmed as no setting, if value is set &#34;0&#34;.</div> ")

  public Long getMaxCpc() {
    return maxCpc;
  }


  public void setMaxCpc(Long maxCpc) {
    this.maxCpc = maxCpc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupCriterionServiceBid adGroupCriterionServiceBid = (AdGroupCriterionServiceBid) o;
    return Objects.equals(this.adGroupMaxCpc, adGroupCriterionServiceBid.adGroupMaxCpc) &&
        Objects.equals(this.bidSource, adGroupCriterionServiceBid.bidSource) &&
        Objects.equals(this.keywordMaxCpc, adGroupCriterionServiceBid.keywordMaxCpc) &&
        Objects.equals(this.maxCpc, adGroupCriterionServiceBid.maxCpc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupMaxCpc, bidSource, keywordMaxCpc, maxCpc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCriterionServiceBid {\n");
    sb.append("    adGroupMaxCpc: ").append(toIndentedString(adGroupMaxCpc)).append("\n");
    sb.append("    bidSource: ").append(toIndentedString(bidSource)).append("\n");
    sb.append("    keywordMaxCpc: ").append(toIndentedString(keywordMaxCpc)).append("\n");
    sb.append("    maxCpc: ").append(toIndentedString(maxCpc)).append("\n");
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

