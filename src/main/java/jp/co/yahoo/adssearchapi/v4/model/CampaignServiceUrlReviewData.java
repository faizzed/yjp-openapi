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
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.CampaignServiceReviewUrl;
import jp.co.yahoo.adssearchapi.v4.model.CampaignServiceUrlApprovalStatus;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceUrlReviewDataオブジェクトは、URLの審査状況を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceUrlReviewData object displays review status of URL.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceUrlReviewDataオブジェクトは、URLの審査状況を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">CampaignServiceUrlReviewData object displays review status of URL.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class CampaignServiceUrlReviewData {
  public static final String SERIALIZED_NAME_DISAPPROVAL_REASON_CODES = "disapprovalReasonCodes";
  @SerializedName(SERIALIZED_NAME_DISAPPROVAL_REASON_CODES)
  private List<String> disapprovalReasonCodes = null;

  public static final String SERIALIZED_NAME_DISAPPROVAL_REVIEW_URL = "disapprovalReviewUrl";
  @SerializedName(SERIALIZED_NAME_DISAPPROVAL_REVIEW_URL)
  private CampaignServiceReviewUrl disapprovalReviewUrl;

  public static final String SERIALIZED_NAME_IN_REVIEW_URL = "inReviewUrl";
  @SerializedName(SERIALIZED_NAME_IN_REVIEW_URL)
  private CampaignServiceReviewUrl inReviewUrl;

  public static final String SERIALIZED_NAME_URL_APPROVAL_STATUS = "urlApprovalStatus";
  @SerializedName(SERIALIZED_NAME_URL_APPROVAL_STATUS)
  private CampaignServiceUrlApprovalStatus urlApprovalStatus;


  public CampaignServiceUrlReviewData disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    
    this.disapprovalReasonCodes = disapprovalReasonCodes;
    return this;
  }

  public CampaignServiceUrlReviewData addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null) {
      this.disapprovalReasonCodes = new ArrayList<String>();
    }
    this.disapprovalReasonCodes.add(disapprovalReasonCodesItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査否認理由コードです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Code of Disapproval reason.&lt;br&gt;&lt;/div&gt; 
   * @return disapprovalReasonCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">審査否認理由コードです。</div> <div lang=\"en\">Code of Disapproval reason.<br></div> ")

  public List<String> getDisapprovalReasonCodes() {
    return disapprovalReasonCodes;
  }


  public void setDisapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
  }


  public CampaignServiceUrlReviewData disapprovalReviewUrl(CampaignServiceReviewUrl disapprovalReviewUrl) {
    
    this.disapprovalReviewUrl = disapprovalReviewUrl;
    return this;
  }

   /**
   * Get disapprovalReviewUrl
   * @return disapprovalReviewUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CampaignServiceReviewUrl getDisapprovalReviewUrl() {
    return disapprovalReviewUrl;
  }


  public void setDisapprovalReviewUrl(CampaignServiceReviewUrl disapprovalReviewUrl) {
    this.disapprovalReviewUrl = disapprovalReviewUrl;
  }


  public CampaignServiceUrlReviewData inReviewUrl(CampaignServiceReviewUrl inReviewUrl) {
    
    this.inReviewUrl = inReviewUrl;
    return this;
  }

   /**
   * Get inReviewUrl
   * @return inReviewUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CampaignServiceReviewUrl getInReviewUrl() {
    return inReviewUrl;
  }


  public void setInReviewUrl(CampaignServiceReviewUrl inReviewUrl) {
    this.inReviewUrl = inReviewUrl;
  }


  public CampaignServiceUrlReviewData urlApprovalStatus(CampaignServiceUrlApprovalStatus urlApprovalStatus) {
    
    this.urlApprovalStatus = urlApprovalStatus;
    return this;
  }

   /**
   * Get urlApprovalStatus
   * @return urlApprovalStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CampaignServiceUrlApprovalStatus getUrlApprovalStatus() {
    return urlApprovalStatus;
  }


  public void setUrlApprovalStatus(CampaignServiceUrlApprovalStatus urlApprovalStatus) {
    this.urlApprovalStatus = urlApprovalStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceUrlReviewData campaignServiceUrlReviewData = (CampaignServiceUrlReviewData) o;
    return Objects.equals(this.disapprovalReasonCodes, campaignServiceUrlReviewData.disapprovalReasonCodes) &&
        Objects.equals(this.disapprovalReviewUrl, campaignServiceUrlReviewData.disapprovalReviewUrl) &&
        Objects.equals(this.inReviewUrl, campaignServiceUrlReviewData.inReviewUrl) &&
        Objects.equals(this.urlApprovalStatus, campaignServiceUrlReviewData.urlApprovalStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disapprovalReasonCodes, disapprovalReviewUrl, inReviewUrl, urlApprovalStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceUrlReviewData {\n");
    sb.append("    disapprovalReasonCodes: ").append(toIndentedString(disapprovalReasonCodes)).append("\n");
    sb.append("    disapprovalReviewUrl: ").append(toIndentedString(disapprovalReviewUrl)).append("\n");
    sb.append("    inReviewUrl: ").append(toIndentedString(inReviewUrl)).append("\n");
    sb.append("    urlApprovalStatus: ").append(toIndentedString(urlApprovalStatus)).append("\n");
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
