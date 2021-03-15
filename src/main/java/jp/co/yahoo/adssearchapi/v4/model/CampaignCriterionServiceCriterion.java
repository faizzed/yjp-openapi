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
import jp.co.yahoo.adssearchapi.v4.model.CampaignCriterionServiceCriterionType;
import jp.co.yahoo.adssearchapi.v4.model.CampaignCriterionServiceKeyword;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignCriterionServiceCriterionオブジェクトは、クライテリアを表します。※キャンペーン用クライテリアです。&lt;br&gt; ADD時およびREMOVE時、このフィールドは必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignCriterionServiceCriterion object describes criteria information. *This is a criteria for campaign.&lt;br&gt; This field is required in ADD and REMOVE operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignCriterionServiceCriterionオブジェクトは、クライテリアを表します。※キャンペーン用クライテリアです。<br> ADD時およびREMOVE時、このフィールドは必須です。</div> <div lang=\"en\">CampaignCriterionServiceCriterion object describes criteria information. *This is a criteria for campaign.<br> This field is required in ADD and REMOVE operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class CampaignCriterionServiceCriterion {
  public static final String SERIALIZED_NAME_CRITERION_ID = "criterionId";
  @SerializedName(SERIALIZED_NAME_CRITERION_ID)
  private Long criterionId;

  public static final String SERIALIZED_NAME_CRITERION_TRACK_ID = "criterionTrackId";
  @SerializedName(SERIALIZED_NAME_CRITERION_TRACK_ID)
  private Long criterionTrackId;

  public static final String SERIALIZED_NAME_CRITERION_TYPE = "criterionType";
  @SerializedName(SERIALIZED_NAME_CRITERION_TYPE)
  private CampaignCriterionServiceCriterionType criterionType;

  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private CampaignCriterionServiceKeyword keyword;


  public CampaignCriterionServiceCriterion criterionId(Long criterionId) {
    
    this.criterionId = criterionId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;クライテリアIDです。&lt;br&gt; REMOVE時、このフィールドは必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignCriterionServiceCriterion ID.&lt;br&gt; This field is required in REMOVE operation.&lt;/div&gt; 
   * @return criterionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">クライテリアIDです。<br> REMOVE時、このフィールドは必須です。</div> <div lang=\"en\">CampaignCriterionServiceCriterion ID.<br> This field is required in REMOVE operation.</div> ")

  public Long getCriterionId() {
    return criterionId;
  }


  public void setCriterionId(Long criterionId) {
    this.criterionId = criterionId;
  }


  public CampaignCriterionServiceCriterion criterionTrackId(Long criterionTrackId) {
    
    this.criterionTrackId = criterionTrackId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;クライテリオントラックIDです。&lt;br&gt; 対象外キーワードでは返却されません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignCriterionServiceCriterion Track ID.&lt;br&gt; This is not returned for Negative keyword.&lt;/div&gt; 
   * @return criterionTrackId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">クライテリオントラックIDです。<br> 対象外キーワードでは返却されません。</div> <div lang=\"en\">CampaignCriterionServiceCriterion Track ID.<br> This is not returned for Negative keyword.</div> ")

  public Long getCriterionTrackId() {
    return criterionTrackId;
  }


  public void setCriterionTrackId(Long criterionTrackId) {
    this.criterionTrackId = criterionTrackId;
  }


  public CampaignCriterionServiceCriterion criterionType(CampaignCriterionServiceCriterionType criterionType) {
    
    this.criterionType = criterionType;
    return this;
  }

   /**
   * Get criterionType
   * @return criterionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CampaignCriterionServiceCriterionType getCriterionType() {
    return criterionType;
  }


  public void setCriterionType(CampaignCriterionServiceCriterionType criterionType) {
    this.criterionType = criterionType;
  }


  public CampaignCriterionServiceCriterion keyword(CampaignCriterionServiceKeyword keyword) {
    
    this.keyword = keyword;
    return this;
  }

   /**
   * Get keyword
   * @return keyword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CampaignCriterionServiceKeyword getKeyword() {
    return keyword;
  }


  public void setKeyword(CampaignCriterionServiceKeyword keyword) {
    this.keyword = keyword;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignCriterionServiceCriterion campaignCriterionServiceCriterion = (CampaignCriterionServiceCriterion) o;
    return Objects.equals(this.criterionId, campaignCriterionServiceCriterion.criterionId) &&
        Objects.equals(this.criterionTrackId, campaignCriterionServiceCriterion.criterionTrackId) &&
        Objects.equals(this.criterionType, campaignCriterionServiceCriterion.criterionType) &&
        Objects.equals(this.keyword, campaignCriterionServiceCriterion.keyword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criterionId, criterionTrackId, criterionType, keyword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCriterionServiceCriterion {\n");
    sb.append("    criterionId: ").append(toIndentedString(criterionId)).append("\n");
    sb.append("    criterionTrackId: ").append(toIndentedString(criterionTrackId)).append("\n");
    sb.append("    criterionType: ").append(toIndentedString(criterionType)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
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
