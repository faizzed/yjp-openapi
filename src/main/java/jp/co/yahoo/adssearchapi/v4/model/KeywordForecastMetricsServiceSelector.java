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
import jp.co.yahoo.adssearchapi.v4.model.KeywordForecastMetricsServiceDateInterval;
import jp.co.yahoo.adssearchapi.v4.model.KeywordForecastMetricsServiceKeywordPlanCampaign;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordForecastMetricsServiceSelector オブジェクトは、見積もりリクエストを格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordForecastMetricsServiceSelector object contains estimate request.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordForecastMetricsServiceSelector オブジェクトは、見積もりリクエストを格納します。</div> <div lang=\"en\">KeywordForecastMetricsServiceSelector object contains estimate request.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class KeywordForecastMetricsServiceSelector {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId;

  public static final String SERIALIZED_NAME_DATE_INTERVAL = "dateInterval";
  @SerializedName(SERIALIZED_NAME_DATE_INTERVAL)
  private KeywordForecastMetricsServiceDateInterval dateInterval;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_KEYWORD_PLAN_CAMPAIGN = "keywordPlanCampaign";
  @SerializedName(SERIALIZED_NAME_KEYWORD_PLAN_CAMPAIGN)
  private KeywordForecastMetricsServiceKeywordPlanCampaign keywordPlanCampaign;


  public KeywordForecastMetricsServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID&lt;/div&gt; 
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID</div> ")

  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public KeywordForecastMetricsServiceSelector dateInterval(KeywordForecastMetricsServiceDateInterval dateInterval) {
    
    this.dateInterval = dateInterval;
    return this;
  }

   /**
   * Get dateInterval
   * @return dateInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public KeywordForecastMetricsServiceDateInterval getDateInterval() {
    return dateInterval;
  }


  public void setDateInterval(KeywordForecastMetricsServiceDateInterval dateInterval) {
    this.dateInterval = dateInterval;
  }


  public KeywordForecastMetricsServiceSelector startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;dateIntervalがCUSTOM_DATEのときに指定する開始日です。&lt;br&gt; 現在より先の日付、かつ一年未満である必要があります。&lt;br&gt; ※フォーマット：yyyyMMdd&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Start date specified when dateInterval is CUSTOM_DATE.&lt;br&gt; Must be earlier than the current date and less than a year old.&lt;br&gt; * Format: yyyyMMdd&lt;/div&gt; 
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">dateIntervalがCUSTOM_DATEのときに指定する開始日です。<br> 現在より先の日付、かつ一年未満である必要があります。<br> ※フォーマット：yyyyMMdd</div> <div lang=\"en\">Start date specified when dateInterval is CUSTOM_DATE.<br> Must be earlier than the current date and less than a year old.<br> * Format: yyyyMMdd</div> ")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public KeywordForecastMetricsServiceSelector endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;dateIntervalがCUSTOM_DATEのときに指定する終了日です。&lt;br&gt; 現在より先の日付、かつ一年未満である必要があります。&lt;br&gt; ※フォーマット：yyyyMMdd&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;End date specified when dateInterval is CUSTOM_DATE.&lt;br&gt; Must be earlier than the current date and less than a year old.&lt;br&gt; * Format: yyyyMMdd&lt;/div&gt; 
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">dateIntervalがCUSTOM_DATEのときに指定する終了日です。<br> 現在より先の日付、かつ一年未満である必要があります。<br> ※フォーマット：yyyyMMdd</div> <div lang=\"en\">End date specified when dateInterval is CUSTOM_DATE.<br> Must be earlier than the current date and less than a year old.<br> * Format: yyyyMMdd</div> ")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public KeywordForecastMetricsServiceSelector keywordPlanCampaign(KeywordForecastMetricsServiceKeywordPlanCampaign keywordPlanCampaign) {
    
    this.keywordPlanCampaign = keywordPlanCampaign;
    return this;
  }

   /**
   * Get keywordPlanCampaign
   * @return keywordPlanCampaign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public KeywordForecastMetricsServiceKeywordPlanCampaign getKeywordPlanCampaign() {
    return keywordPlanCampaign;
  }


  public void setKeywordPlanCampaign(KeywordForecastMetricsServiceKeywordPlanCampaign keywordPlanCampaign) {
    this.keywordPlanCampaign = keywordPlanCampaign;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordForecastMetricsServiceSelector keywordForecastMetricsServiceSelector = (KeywordForecastMetricsServiceSelector) o;
    return Objects.equals(this.accountId, keywordForecastMetricsServiceSelector.accountId) &&
        Objects.equals(this.dateInterval, keywordForecastMetricsServiceSelector.dateInterval) &&
        Objects.equals(this.startDate, keywordForecastMetricsServiceSelector.startDate) &&
        Objects.equals(this.endDate, keywordForecastMetricsServiceSelector.endDate) &&
        Objects.equals(this.keywordPlanCampaign, keywordForecastMetricsServiceSelector.keywordPlanCampaign);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, dateInterval, startDate, endDate, keywordPlanCampaign);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordForecastMetricsServiceSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    dateInterval: ").append(toIndentedString(dateInterval)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    keywordPlanCampaign: ").append(toIndentedString(keywordPlanCampaign)).append("\n");
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
