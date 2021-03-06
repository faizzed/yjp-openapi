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
import jp.co.yahoo.adssearchapi.v4.model.AccountTrackingUrlServiceUrlApprovalStatus;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountTrackingUrlオブジェクトは、アカウントトラッキングの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountTrackingUrl object describes account tracking information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountTrackingUrlオブジェクトは、アカウントトラッキングの情報を表します。</div> <div lang=\"en\">AccountTrackingUrl object describes account tracking information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class AccountTrackingUrl {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId;

  public static final String SERIALIZED_NAME_ACCOUNT_NAME = "accountName";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NAME)
  private String accountName;

  public static final String SERIALIZED_NAME_DISAPPROVAL_REASON_CODES = "disapprovalReasonCodes";
  @SerializedName(SERIALIZED_NAME_DISAPPROVAL_REASON_CODES)
  private List<String> disapprovalReasonCodes = null;

  public static final String SERIALIZED_NAME_DISAPPROVAL_REVIEW_URL = "disapprovalReviewUrl";
  @SerializedName(SERIALIZED_NAME_DISAPPROVAL_REVIEW_URL)
  private String disapprovalReviewUrl;

  public static final String SERIALIZED_NAME_IN_REVIEW_URL = "inReviewUrl";
  @SerializedName(SERIALIZED_NAME_IN_REVIEW_URL)
  private String inReviewUrl;

  public static final String SERIALIZED_NAME_TRACKING_URL = "trackingUrl";
  @SerializedName(SERIALIZED_NAME_TRACKING_URL)
  private String trackingUrl;

  public static final String SERIALIZED_NAME_URL_APPROVAL_STATUS = "urlApprovalStatus";
  @SerializedName(SERIALIZED_NAME_URL_APPROVAL_STATUS)
  private AccountTrackingUrlServiceUrlApprovalStatus urlApprovalStatus;


  public AccountTrackingUrl accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;br&gt; SET時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;br&gt; This field is required in SET operation.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> SET時、このフィールドは必須となります。</div> <div lang=\"en\">Account ID.<br> This field is required in SET operation.</div> ")

  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public AccountTrackingUrl accountName(String accountName) {
    
    this.accountName = accountName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウント名です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account name.&lt;/div&gt; 
   * @return accountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウント名です。</div> <div lang=\"en\">Account name.</div> ")

  public String getAccountName() {
    return accountName;
  }


  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  public AccountTrackingUrl disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    
    this.disapprovalReasonCodes = disapprovalReasonCodes;
    return this;
  }

  public AccountTrackingUrl addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null) {
      this.disapprovalReasonCodes = new ArrayList<String>();
    }
    this.disapprovalReasonCodes.add(disapprovalReasonCodesItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査否認理由コードです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Code of disapproval reason.&lt;/div&gt; 
   * @return disapprovalReasonCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">審査否認理由コードです。</div> <div lang=\"en\">Code of disapproval reason.</div> ")

  public List<String> getDisapprovalReasonCodes() {
    return disapprovalReasonCodes;
  }


  public void setDisapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
  }


  public AccountTrackingUrl disapprovalReviewUrl(String disapprovalReviewUrl) {
    
    this.disapprovalReviewUrl = disapprovalReviewUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査否認されたトラッキングURLです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Tracking URL that has been disapproved.&lt;/div&gt; 
   * @return disapprovalReviewUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">審査否認されたトラッキングURLです。</div> <div lang=\"en\">Tracking URL that has been disapproved.</div> ")

  public String getDisapprovalReviewUrl() {
    return disapprovalReviewUrl;
  }


  public void setDisapprovalReviewUrl(String disapprovalReviewUrl) {
    this.disapprovalReviewUrl = disapprovalReviewUrl;
  }


  public AccountTrackingUrl inReviewUrl(String inReviewUrl) {
    
    this.inReviewUrl = inReviewUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査中のトラッキングURLです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Tracking URL that is in review.&lt;/div&gt; 
   * @return inReviewUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">審査中のトラッキングURLです。</div> <div lang=\"en\">Tracking URL that is in review.</div> ")

  public String getInReviewUrl() {
    return inReviewUrl;
  }


  public void setInReviewUrl(String inReviewUrl) {
    this.inReviewUrl = inReviewUrl;
  }


  public AccountTrackingUrl trackingUrl(String trackingUrl) {
    
    this.trackingUrl = trackingUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;トラッキングURLです。&lt;br&gt; SET時、このフィールドは省略可能となります。&lt;br&gt; ※空で設定すると、既存のトラッキングURLは削除されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Tracking URL.&lt;br&gt; this field is optional in SET operation.&lt;br&gt; *When tag is set blank, existing Tracking URL will be deleted.&lt;/div&gt; 
   * @return trackingUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキングURLです。<br> SET時、このフィールドは省略可能となります。<br> ※空で設定すると、既存のトラッキングURLは削除されます。</div> <div lang=\"en\">Tracking URL.<br> this field is optional in SET operation.<br> *When tag is set blank, existing Tracking URL will be deleted.</div> ")

  public String getTrackingUrl() {
    return trackingUrl;
  }


  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }


  public AccountTrackingUrl urlApprovalStatus(AccountTrackingUrlServiceUrlApprovalStatus urlApprovalStatus) {
    
    this.urlApprovalStatus = urlApprovalStatus;
    return this;
  }

   /**
   * Get urlApprovalStatus
   * @return urlApprovalStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountTrackingUrlServiceUrlApprovalStatus getUrlApprovalStatus() {
    return urlApprovalStatus;
  }


  public void setUrlApprovalStatus(AccountTrackingUrlServiceUrlApprovalStatus urlApprovalStatus) {
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
    AccountTrackingUrl accountTrackingUrl = (AccountTrackingUrl) o;
    return Objects.equals(this.accountId, accountTrackingUrl.accountId) &&
        Objects.equals(this.accountName, accountTrackingUrl.accountName) &&
        Objects.equals(this.disapprovalReasonCodes, accountTrackingUrl.disapprovalReasonCodes) &&
        Objects.equals(this.disapprovalReviewUrl, accountTrackingUrl.disapprovalReviewUrl) &&
        Objects.equals(this.inReviewUrl, accountTrackingUrl.inReviewUrl) &&
        Objects.equals(this.trackingUrl, accountTrackingUrl.trackingUrl) &&
        Objects.equals(this.urlApprovalStatus, accountTrackingUrl.urlApprovalStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountName, disapprovalReasonCodes, disapprovalReviewUrl, inReviewUrl, trackingUrl, urlApprovalStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountTrackingUrl {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    disapprovalReasonCodes: ").append(toIndentedString(disapprovalReasonCodes)).append("\n");
    sb.append("    disapprovalReviewUrl: ").append(toIndentedString(disapprovalReviewUrl)).append("\n");
    sb.append("    inReviewUrl: ").append(toIndentedString(inReviewUrl)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
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

