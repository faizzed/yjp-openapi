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
import jp.co.yahoo.adssearchapi.v4.model.AdGroupRetargetingListServiceCriterionTargetList;
import jp.co.yahoo.adssearchapi.v4.model.AdGroupRetargetingListServiceExcludedType;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupRetargetingListは、広告グループレベルでのターゲットリスト設定を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupRetargetingList is an object that holds ad group user list information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupRetargetingListは、広告グループレベルでのターゲットリスト設定を保持するオブジェクトです。</div> <div lang=\"en\">AdGroupRetargetingList is an object that holds ad group user list information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class AdGroupRetargetingList {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId;

  public static final String SERIALIZED_NAME_AD_GROUP_ID = "adGroupId";
  @SerializedName(SERIALIZED_NAME_AD_GROUP_ID)
  private Long adGroupId;

  public static final String SERIALIZED_NAME_AD_GROUP_NAME = "adGroupName";
  @SerializedName(SERIALIZED_NAME_AD_GROUP_NAME)
  private String adGroupName;

  public static final String SERIALIZED_NAME_BID_MULTIPLIER = "bidMultiplier";
  @SerializedName(SERIALIZED_NAME_BID_MULTIPLIER)
  private Double bidMultiplier;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId;

  public static final String SERIALIZED_NAME_CAMPAIGN_NAME = "campaignName";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_NAME)
  private String campaignName;

  public static final String SERIALIZED_NAME_CRITERION_TARGET_LIST = "criterionTargetList";
  @SerializedName(SERIALIZED_NAME_CRITERION_TARGET_LIST)
  private AdGroupRetargetingListServiceCriterionTargetList criterionTargetList;

  public static final String SERIALIZED_NAME_EXCLUDED_TYPE = "excludedType";
  @SerializedName(SERIALIZED_NAME_EXCLUDED_TYPE)
  private AdGroupRetargetingListServiceExcludedType excludedType;


  public AdGroupRetargetingList accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Account ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")

  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public AdGroupRetargetingList adGroupId(Long adGroupId) {
    
    this.adGroupId = adGroupId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告グループIDです。&lt;br&gt; このフィールドは、いずれの場合でも必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Ad group ID.&lt;br&gt; This field is required in any cases.&lt;/div&gt; 
   * @return adGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループIDです。<br> このフィールドは、いずれの場合でも必須です。</div> <div lang=\"en\">Ad group ID.<br> This field is required in any cases.</div> ")

  public Long getAdGroupId() {
    return adGroupId;
  }


  public void setAdGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
  }


  public AdGroupRetargetingList adGroupName(String adGroupName) {
    
    this.adGroupName = adGroupName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告グループ名です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Ad group name.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return adGroupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループ名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Ad group name.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")

  public String getAdGroupName() {
    return adGroupName;
  }


  public void setAdGroupName(String adGroupName) {
    this.adGroupName = adGroupName;
  }


  public AdGroupRetargetingList bidMultiplier(Double bidMultiplier) {
    
    this.bidMultiplier = bidMultiplier;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;MaxCPC上昇値です。&lt;br&gt; このフィールドは省略可能となります。その際、デフォルト設定値は1.00となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Maximum CPC increase value.&lt;br&gt; This field is optional. The default value will be 1.00.&lt;/div&gt; 
   * @return bidMultiplier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">MaxCPC上昇値です。<br> このフィールドは省略可能となります。その際、デフォルト設定値は1.00となります。</div> <div lang=\"en\">Maximum CPC increase value.<br> This field is optional. The default value will be 1.00.</div> ")

  public Double getBidMultiplier() {
    return bidMultiplier;
  }


  public void setBidMultiplier(Double bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
  }


  public AdGroupRetargetingList campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンIDです。&lt;br&gt; このフィールドは、いずれの場合でも必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign ID.&lt;br&gt; This field is required in any cases.&lt;/div&gt; 
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br> このフィールドは、いずれの場合でも必須です。</div> <div lang=\"en\">Campaign ID.<br> This field is required in any cases.</div> ")

  public Long getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public AdGroupRetargetingList campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーン名です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign name.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return campaignName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーン名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Campaign name.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")

  public String getCampaignName() {
    return campaignName;
  }


  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }


  public AdGroupRetargetingList criterionTargetList(AdGroupRetargetingListServiceCriterionTargetList criterionTargetList) {
    
    this.criterionTargetList = criterionTargetList;
    return this;
  }

   /**
   * Get criterionTargetList
   * @return criterionTargetList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdGroupRetargetingListServiceCriterionTargetList getCriterionTargetList() {
    return criterionTargetList;
  }


  public void setCriterionTargetList(AdGroupRetargetingListServiceCriterionTargetList criterionTargetList) {
    this.criterionTargetList = criterionTargetList;
  }


  public AdGroupRetargetingList excludedType(AdGroupRetargetingListServiceExcludedType excludedType) {
    
    this.excludedType = excludedType;
    return this;
  }

   /**
   * Get excludedType
   * @return excludedType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdGroupRetargetingListServiceExcludedType getExcludedType() {
    return excludedType;
  }


  public void setExcludedType(AdGroupRetargetingListServiceExcludedType excludedType) {
    this.excludedType = excludedType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupRetargetingList adGroupRetargetingList = (AdGroupRetargetingList) o;
    return Objects.equals(this.accountId, adGroupRetargetingList.accountId) &&
        Objects.equals(this.adGroupId, adGroupRetargetingList.adGroupId) &&
        Objects.equals(this.adGroupName, adGroupRetargetingList.adGroupName) &&
        Objects.equals(this.bidMultiplier, adGroupRetargetingList.bidMultiplier) &&
        Objects.equals(this.campaignId, adGroupRetargetingList.campaignId) &&
        Objects.equals(this.campaignName, adGroupRetargetingList.campaignName) &&
        Objects.equals(this.criterionTargetList, adGroupRetargetingList.criterionTargetList) &&
        Objects.equals(this.excludedType, adGroupRetargetingList.excludedType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adGroupId, adGroupName, bidMultiplier, campaignId, campaignName, criterionTargetList, excludedType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupRetargetingList {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    adGroupName: ").append(toIndentedString(adGroupName)).append("\n");
    sb.append("    bidMultiplier: ").append(toIndentedString(bidMultiplier)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    criterionTargetList: ").append(toIndentedString(criterionTargetList)).append("\n");
    sb.append("    excludedType: ").append(toIndentedString(excludedType)).append("\n");
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

