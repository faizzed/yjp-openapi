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
import jp.co.yahoo.adssearchapi.v4.model.ConversionTrackerServiceAppConversion;
import jp.co.yahoo.adssearchapi.v4.model.ConversionTrackerServiceAppLinkConversion;
import jp.co.yahoo.adssearchapi.v4.model.ConversionTrackerServiceCategory;
import jp.co.yahoo.adssearchapi.v4.model.ConversionTrackerServiceConversionCountingType;
import jp.co.yahoo.adssearchapi.v4.model.ConversionTrackerServiceConversionTrackerType;
import jp.co.yahoo.adssearchapi.v4.model.ConversionTrackerServiceExcludeFromBidding;
import jp.co.yahoo.adssearchapi.v4.model.ConversionTrackerServiceStatus;
import jp.co.yahoo.adssearchapi.v4.model.ConversionTrackerServiceWebConversion;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerオブジェクトは、コンバージョン測定タグやタグごとのパフォーマンスデータなどのコンバージョントラッカー情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTracker object shows ConversionTracker information such as ConversionTag and performance data by tag.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerオブジェクトは、コンバージョン測定タグやタグごとのパフォーマンスデータなどのコンバージョントラッカー情報を表します。</div> <div lang=\"en\">ConversionTracker object shows ConversionTracker information such as ConversionTag and performance data by tag.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class ConversionTracker {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId;

  public static final String SERIALIZED_NAME_ALL_CONVERSION_VALUE = "allConversionValue";
  @SerializedName(SERIALIZED_NAME_ALL_CONVERSION_VALUE)
  private String allConversionValue;

  public static final String SERIALIZED_NAME_ALL_CONVERSIONS = "allConversions";
  @SerializedName(SERIALIZED_NAME_ALL_CONVERSIONS)
  private Long allConversions;

  public static final String SERIALIZED_NAME_APP_CONVERSION = "appConversion";
  @SerializedName(SERIALIZED_NAME_APP_CONVERSION)
  private ConversionTrackerServiceAppConversion appConversion;

  public static final String SERIALIZED_NAME_APP_LINK_CONVERSION = "appLinkConversion";
  @SerializedName(SERIALIZED_NAME_APP_LINK_CONVERSION)
  private ConversionTrackerServiceAppLinkConversion appLinkConversion;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private ConversionTrackerServiceCategory category;

  public static final String SERIALIZED_NAME_CONVERSION_COUNTING_TYPE = "conversionCountingType";
  @SerializedName(SERIALIZED_NAME_CONVERSION_COUNTING_TYPE)
  private ConversionTrackerServiceConversionCountingType conversionCountingType;

  public static final String SERIALIZED_NAME_CONVERSION_TRACKER_ID = "conversionTrackerId";
  @SerializedName(SERIALIZED_NAME_CONVERSION_TRACKER_ID)
  private Long conversionTrackerId;

  public static final String SERIALIZED_NAME_CONVERSION_TRACKER_TRACK_ID = "conversionTrackerTrackId";
  @SerializedName(SERIALIZED_NAME_CONVERSION_TRACKER_TRACK_ID)
  private Long conversionTrackerTrackId;

  public static final String SERIALIZED_NAME_CONVERSION_TRACKER_NAME = "conversionTrackerName";
  @SerializedName(SERIALIZED_NAME_CONVERSION_TRACKER_NAME)
  private String conversionTrackerName;

  public static final String SERIALIZED_NAME_CONVERSION_TRACKER_TYPE = "conversionTrackerType";
  @SerializedName(SERIALIZED_NAME_CONVERSION_TRACKER_TYPE)
  private ConversionTrackerServiceConversionTrackerType conversionTrackerType;

  public static final String SERIALIZED_NAME_CONVERSION_VALUE = "conversionValue";
  @SerializedName(SERIALIZED_NAME_CONVERSION_VALUE)
  private String conversionValue;

  public static final String SERIALIZED_NAME_CONVERSIONS = "conversions";
  @SerializedName(SERIALIZED_NAME_CONVERSIONS)
  private Long conversions;

  public static final String SERIALIZED_NAME_EXCLUDE_FROM_BIDDING = "excludeFromBidding";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_FROM_BIDDING)
  private ConversionTrackerServiceExcludeFromBidding excludeFromBidding;

  public static final String SERIALIZED_NAME_MEASUREMENT_PERIOD = "measurementPeriod";
  @SerializedName(SERIALIZED_NAME_MEASUREMENT_PERIOD)
  private Integer measurementPeriod;

  public static final String SERIALIZED_NAME_MOST_RECENT_CONVERSION_DATE = "mostRecentConversionDate";
  @SerializedName(SERIALIZED_NAME_MOST_RECENT_CONVERSION_DATE)
  private String mostRecentConversionDate;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ConversionTrackerServiceStatus status;

  public static final String SERIALIZED_NAME_USER_REVENUE_VALUE = "userRevenueValue";
  @SerializedName(SERIALIZED_NAME_USER_REVENUE_VALUE)
  private String userRevenueValue;

  public static final String SERIALIZED_NAME_WEB_CONVERSION = "webConversion";
  @SerializedName(SERIALIZED_NAME_WEB_CONVERSION)
  private ConversionTrackerServiceWebConversion webConversion;


  public ConversionTracker accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")

  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public ConversionTracker allConversionValue(String allConversionValue) {
    
    this.allConversionValue = allConversionValue;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;自動入札設定対象のコンバージョン値と、対象外のコンバージョン値の合計です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Total value of conversions to be included to auto bidding and to be exluded from auto bidding.&lt;/div&gt; 
   * @return allConversionValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札設定対象のコンバージョン値と、対象外のコンバージョン値の合計です。</div> <div lang=\"en\">Total value of conversions to be included to auto bidding and to be exluded from auto bidding.</div> ")

  public String getAllConversionValue() {
    return allConversionValue;
  }


  public void setAllConversionValue(String allConversionValue) {
    this.allConversionValue = allConversionValue;
  }


  public ConversionTracker allConversions(Long allConversions) {
    
    this.allConversions = allConversions;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;自動入札設定対象のコンバージョン数と、対象外のコンバージョン数の合計です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Total number of conversions to be included to auto bidding and to be excluded from auto bidding.&lt;/div&gt; 
   * @return allConversions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札設定対象のコンバージョン数と、対象外のコンバージョン数の合計です。</div> <div lang=\"en\">Total number of conversions to be included to auto bidding and to be excluded from auto bidding.</div> ")

  public Long getAllConversions() {
    return allConversions;
  }


  public void setAllConversions(Long allConversions) {
    this.allConversions = allConversions;
  }


  public ConversionTracker appConversion(ConversionTrackerServiceAppConversion appConversion) {
    
    this.appConversion = appConversion;
    return this;
  }

   /**
   * Get appConversion
   * @return appConversion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConversionTrackerServiceAppConversion getAppConversion() {
    return appConversion;
  }


  public void setAppConversion(ConversionTrackerServiceAppConversion appConversion) {
    this.appConversion = appConversion;
  }


  public ConversionTracker appLinkConversion(ConversionTrackerServiceAppLinkConversion appLinkConversion) {
    
    this.appLinkConversion = appLinkConversion;
    return this;
  }

   /**
   * Get appLinkConversion
   * @return appLinkConversion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConversionTrackerServiceAppLinkConversion getAppLinkConversion() {
    return appLinkConversion;
  }


  public void setAppLinkConversion(ConversionTrackerServiceAppLinkConversion appLinkConversion) {
    this.appLinkConversion = appLinkConversion;
  }


  public ConversionTracker category(ConversionTrackerServiceCategory category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConversionTrackerServiceCategory getCategory() {
    return category;
  }


  public void setCategory(ConversionTrackerServiceCategory category) {
    this.category = category;
  }


  public ConversionTracker conversionCountingType(ConversionTrackerServiceConversionCountingType conversionCountingType) {
    
    this.conversionCountingType = conversionCountingType;
    return this;
  }

   /**
   * Get conversionCountingType
   * @return conversionCountingType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConversionTrackerServiceConversionCountingType getConversionCountingType() {
    return conversionCountingType;
  }


  public void setConversionCountingType(ConversionTrackerServiceConversionCountingType conversionCountingType) {
    this.conversionCountingType = conversionCountingType;
  }


  public ConversionTracker conversionTrackerId(Long conversionTrackerId) {
    
    this.conversionTrackerId = conversionTrackerId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;コンバージョントラッカーのIDです。&lt;br&gt; このフィールドは、SET時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTracker ID.&lt;br&gt; This field is required in SET operation.&lt;/div&gt; 
   * @return conversionTrackerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョントラッカーのIDです。<br> このフィールドは、SET時に必須となります。</div> <div lang=\"en\">ConversionTracker ID.<br> This field is required in SET operation.</div> ")

  public Long getConversionTrackerId() {
    return conversionTrackerId;
  }


  public void setConversionTrackerId(Long conversionTrackerId) {
    this.conversionTrackerId = conversionTrackerId;
  }


  public ConversionTracker conversionTrackerTrackId(Long conversionTrackerTrackId) {
    
    this.conversionTrackerTrackId = conversionTrackerTrackId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;トラッキング用コンバージョントラッカーIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTracker ID for tracking.&lt;/div&gt; 
   * @return conversionTrackerTrackId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキング用コンバージョントラッカーIDです。</div> <div lang=\"en\">ConversionTracker ID for tracking.</div> ")

  public Long getConversionTrackerTrackId() {
    return conversionTrackerTrackId;
  }


  public void setConversionTrackerTrackId(Long conversionTrackerTrackId) {
    this.conversionTrackerTrackId = conversionTrackerTrackId;
  }


  public ConversionTracker conversionTrackerName(String conversionTrackerName) {
    
    this.conversionTrackerName = conversionTrackerName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;コンバージョントラッカーの名称です。&lt;br&gt; このフィールドは、ADD時に必須となり、SET時に省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTracker Name.&lt;br&gt; This field is required in ADD operation, and is optional in SET operation.&lt;/div&gt; 
   * @return conversionTrackerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョントラッカーの名称です。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。</div> <div lang=\"en\">ConversionTracker Name.<br> This field is required in ADD operation, and is optional in SET operation.</div> ")

  public String getConversionTrackerName() {
    return conversionTrackerName;
  }


  public void setConversionTrackerName(String conversionTrackerName) {
    this.conversionTrackerName = conversionTrackerName;
  }


  public ConversionTracker conversionTrackerType(ConversionTrackerServiceConversionTrackerType conversionTrackerType) {
    
    this.conversionTrackerType = conversionTrackerType;
    return this;
  }

   /**
   * Get conversionTrackerType
   * @return conversionTrackerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConversionTrackerServiceConversionTrackerType getConversionTrackerType() {
    return conversionTrackerType;
  }


  public void setConversionTrackerType(ConversionTrackerServiceConversionTrackerType conversionTrackerType) {
    this.conversionTrackerType = conversionTrackerType;
  }


  public ConversionTracker conversionValue(String conversionValue) {
    
    this.conversionValue = conversionValue;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;自動入札設定対象のコンバージョン値です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Conversion value to be included to auto bidding.&lt;/div&gt; 
   * @return conversionValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札設定対象のコンバージョン値です。</div> <div lang=\"en\">Conversion value to be included to auto bidding.</div> ")

  public String getConversionValue() {
    return conversionValue;
  }


  public void setConversionValue(String conversionValue) {
    this.conversionValue = conversionValue;
  }


  public ConversionTracker conversions(Long conversions) {
    
    this.conversions = conversions;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;自動入札設定対象のコンバージョン数です。&lt;br&gt; ユニークコンバージョンか総コンバージョンかは、countingTypeに依存します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Conversions which counts as included to Auto Bidding setting.&lt;br&gt; countingType specifies whether one-per-click or many-per-click.&lt;/div&gt; 
   * @return conversions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札設定対象のコンバージョン数です。<br> ユニークコンバージョンか総コンバージョンかは、countingTypeに依存します。</div> <div lang=\"en\">Conversions which counts as included to Auto Bidding setting.<br> countingType specifies whether one-per-click or many-per-click.</div> ")

  public Long getConversions() {
    return conversions;
  }


  public void setConversions(Long conversions) {
    this.conversions = conversions;
  }


  public ConversionTracker excludeFromBidding(ConversionTrackerServiceExcludeFromBidding excludeFromBidding) {
    
    this.excludeFromBidding = excludeFromBidding;
    return this;
  }

   /**
   * Get excludeFromBidding
   * @return excludeFromBidding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConversionTrackerServiceExcludeFromBidding getExcludeFromBidding() {
    return excludeFromBidding;
  }


  public void setExcludeFromBidding(ConversionTrackerServiceExcludeFromBidding excludeFromBidding) {
    this.excludeFromBidding = excludeFromBidding;
  }


  public ConversionTracker measurementPeriod(Integer measurementPeriod) {
    
    this.measurementPeriod = measurementPeriod;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;コンバージョン計測期間です（単位：日)。&lt;br&gt; 7～90日間で設定可能です。&lt;br&gt;※アプリダウンロードの場合は30日間固定。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。&lt;br&gt;※ADD時のデフォルト設定値は30となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Counting period of conversoins (days).&lt;br&gt;It is available between 7 to 90 days&lt;br&gt; * For Mobile App Download, this period is fixed as 30 days.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; *The default value in ADD operation will be 30.&lt;/div&gt; 
   * @return measurementPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョン計測期間です（単位：日)。<br> 7～90日間で設定可能です。<br>※アプリダウンロードの場合は30日間固定。<br> このフィールドは、ADDおよびSET時に省略可能となります。<br>※ADD時のデフォルト設定値は30となります。</div> <div lang=\"en\">Counting period of conversoins (days).<br>It is available between 7 to 90 days<br> * For Mobile App Download, this period is fixed as 30 days.<br> This field is optional in ADD and SET operation.<br> *The default value in ADD operation will be 30.</div> ")

  public Integer getMeasurementPeriod() {
    return measurementPeriod;
  }


  public void setMeasurementPeriod(Integer measurementPeriod) {
    this.measurementPeriod = measurementPeriod;
  }


  public ConversionTracker mostRecentConversionDate(String mostRecentConversionDate) {
    
    this.mostRecentConversionDate = mostRecentConversionDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;直近のコンバージョン発生日です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The most latest date when conversion occured.&lt;/div&gt; 
   * @return mostRecentConversionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">直近のコンバージョン発生日です。</div> <div lang=\"en\">The most latest date when conversion occured.</div> ")

  public String getMostRecentConversionDate() {
    return mostRecentConversionDate;
  }


  public void setMostRecentConversionDate(String mostRecentConversionDate) {
    this.mostRecentConversionDate = mostRecentConversionDate;
  }


  public ConversionTracker status(ConversionTrackerServiceStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConversionTrackerServiceStatus getStatus() {
    return status;
  }


  public void setStatus(ConversionTrackerServiceStatus status) {
    this.status = status;
  }


  public ConversionTracker userRevenueValue(String userRevenueValue) {
    
    this.userRevenueValue = userRevenueValue;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;このコンバージョントラッカーに対するユーザー指定の収益値です。&lt;br&gt; 1コンバージョンあたりの売上金額が固定値の場合、その金額を設定することで、売上金額をレポートなどで確認できます。&lt;br&gt; ADDリクエスト時に未指定の場合、0が設定されます。&lt;br&gt; このフィールドは、ADD時およびSET時に省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The value of revenue of the conversion tracker specified by user.&lt;br&gt; When the sales revenue of 1 conversion is fixed value, you are able to review the total sales on reports by specifying the amount on this item.&lt;br&gt; If it is not specified on ADD request, the value &amp;#34;0&amp;#34; is set.&lt;br&gt; This field is optional in ADD and SET operation.&lt;/div&gt; 
   * @return userRevenueValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">このコンバージョントラッカーに対するユーザー指定の収益値です。<br> 1コンバージョンあたりの売上金額が固定値の場合、その金額を設定することで、売上金額をレポートなどで確認できます。<br> ADDリクエスト時に未指定の場合、0が設定されます。<br> このフィールドは、ADD時およびSET時に省略可能となります。</div> <div lang=\"en\">The value of revenue of the conversion tracker specified by user.<br> When the sales revenue of 1 conversion is fixed value, you are able to review the total sales on reports by specifying the amount on this item.<br> If it is not specified on ADD request, the value &#34;0&#34; is set.<br> This field is optional in ADD and SET operation.</div> ")

  public String getUserRevenueValue() {
    return userRevenueValue;
  }


  public void setUserRevenueValue(String userRevenueValue) {
    this.userRevenueValue = userRevenueValue;
  }


  public ConversionTracker webConversion(ConversionTrackerServiceWebConversion webConversion) {
    
    this.webConversion = webConversion;
    return this;
  }

   /**
   * Get webConversion
   * @return webConversion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConversionTrackerServiceWebConversion getWebConversion() {
    return webConversion;
  }


  public void setWebConversion(ConversionTrackerServiceWebConversion webConversion) {
    this.webConversion = webConversion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionTracker conversionTracker = (ConversionTracker) o;
    return Objects.equals(this.accountId, conversionTracker.accountId) &&
        Objects.equals(this.allConversionValue, conversionTracker.allConversionValue) &&
        Objects.equals(this.allConversions, conversionTracker.allConversions) &&
        Objects.equals(this.appConversion, conversionTracker.appConversion) &&
        Objects.equals(this.appLinkConversion, conversionTracker.appLinkConversion) &&
        Objects.equals(this.category, conversionTracker.category) &&
        Objects.equals(this.conversionCountingType, conversionTracker.conversionCountingType) &&
        Objects.equals(this.conversionTrackerId, conversionTracker.conversionTrackerId) &&
        Objects.equals(this.conversionTrackerTrackId, conversionTracker.conversionTrackerTrackId) &&
        Objects.equals(this.conversionTrackerName, conversionTracker.conversionTrackerName) &&
        Objects.equals(this.conversionTrackerType, conversionTracker.conversionTrackerType) &&
        Objects.equals(this.conversionValue, conversionTracker.conversionValue) &&
        Objects.equals(this.conversions, conversionTracker.conversions) &&
        Objects.equals(this.excludeFromBidding, conversionTracker.excludeFromBidding) &&
        Objects.equals(this.measurementPeriod, conversionTracker.measurementPeriod) &&
        Objects.equals(this.mostRecentConversionDate, conversionTracker.mostRecentConversionDate) &&
        Objects.equals(this.status, conversionTracker.status) &&
        Objects.equals(this.userRevenueValue, conversionTracker.userRevenueValue) &&
        Objects.equals(this.webConversion, conversionTracker.webConversion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, allConversionValue, allConversions, appConversion, appLinkConversion, category, conversionCountingType, conversionTrackerId, conversionTrackerTrackId, conversionTrackerName, conversionTrackerType, conversionValue, conversions, excludeFromBidding, measurementPeriod, mostRecentConversionDate, status, userRevenueValue, webConversion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTracker {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    allConversionValue: ").append(toIndentedString(allConversionValue)).append("\n");
    sb.append("    allConversions: ").append(toIndentedString(allConversions)).append("\n");
    sb.append("    appConversion: ").append(toIndentedString(appConversion)).append("\n");
    sb.append("    appLinkConversion: ").append(toIndentedString(appLinkConversion)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    conversionCountingType: ").append(toIndentedString(conversionCountingType)).append("\n");
    sb.append("    conversionTrackerId: ").append(toIndentedString(conversionTrackerId)).append("\n");
    sb.append("    conversionTrackerTrackId: ").append(toIndentedString(conversionTrackerTrackId)).append("\n");
    sb.append("    conversionTrackerName: ").append(toIndentedString(conversionTrackerName)).append("\n");
    sb.append("    conversionTrackerType: ").append(toIndentedString(conversionTrackerType)).append("\n");
    sb.append("    conversionValue: ").append(toIndentedString(conversionValue)).append("\n");
    sb.append("    conversions: ").append(toIndentedString(conversions)).append("\n");
    sb.append("    excludeFromBidding: ").append(toIndentedString(excludeFromBidding)).append("\n");
    sb.append("    measurementPeriod: ").append(toIndentedString(measurementPeriod)).append("\n");
    sb.append("    mostRecentConversionDate: ").append(toIndentedString(mostRecentConversionDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userRevenueValue: ").append(toIndentedString(userRevenueValue)).append("\n");
    sb.append("    webConversion: ").append(toIndentedString(webConversion)).append("\n");
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

