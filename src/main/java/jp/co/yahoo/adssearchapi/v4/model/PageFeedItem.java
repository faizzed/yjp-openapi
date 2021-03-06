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
import jp.co.yahoo.adssearchapi.v4.model.PageFeedItemServiceApprovalStatus;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PageFeedItemオブジェクトは、ページフィードアイテム情報を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedItem object retains page feed Item.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PageFeedItemオブジェクトは、ページフィードアイテム情報を格納します。</div> <div lang=\"en\">PageFeedItem object retains page feed Item.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class PageFeedItem {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId;

  public static final String SERIALIZED_NAME_APPROVAL_STATUS = "approvalStatus";
  @SerializedName(SERIALIZED_NAME_APPROVAL_STATUS)
  private PageFeedItemServiceApprovalStatus approvalStatus;

  public static final String SERIALIZED_NAME_DISAPPROVAL_REASON_CODES = "disapprovalReasonCodes";
  @SerializedName(SERIALIZED_NAME_DISAPPROVAL_REASON_CODES)
  private List<String> disapprovalReasonCodes = null;

  public static final String SERIALIZED_NAME_DISAPPROVAL_REASON_COMMENT = "disapprovalReasonComment";
  @SerializedName(SERIALIZED_NAME_DISAPPROVAL_REASON_COMMENT)
  private String disapprovalReasonComment;

  public static final String SERIALIZED_NAME_FEED_ID = "feedId";
  @SerializedName(SERIALIZED_NAME_FEED_ID)
  private Long feedId;

  public static final String SERIALIZED_NAME_PAGE_FEED_CUSTOM_LABEL = "pageFeedCustomLabel";
  @SerializedName(SERIALIZED_NAME_PAGE_FEED_CUSTOM_LABEL)
  private String pageFeedCustomLabel;

  public static final String SERIALIZED_NAME_PAGE_FEED_ITEM_ID = "pageFeedItemId";
  @SerializedName(SERIALIZED_NAME_PAGE_FEED_ITEM_ID)
  private Long pageFeedItemId;

  public static final String SERIALIZED_NAME_PAGE_FEED_URL = "pageFeedUrl";
  @SerializedName(SERIALIZED_NAME_PAGE_FEED_URL)
  private String pageFeedUrl;


  public PageFeedItem accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID</div> ")

  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public PageFeedItem approvalStatus(PageFeedItemServiceApprovalStatus approvalStatus) {
    
    this.approvalStatus = approvalStatus;
    return this;
  }

   /**
   * Get approvalStatus
   * @return approvalStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PageFeedItemServiceApprovalStatus getApprovalStatus() {
    return approvalStatus;
  }


  public void setApprovalStatus(PageFeedItemServiceApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
  }


  public PageFeedItem disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    
    this.disapprovalReasonCodes = disapprovalReasonCodes;
    return this;
  }

  public PageFeedItem addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null) {
      this.disapprovalReasonCodes = new ArrayList<String>();
    }
    this.disapprovalReasonCodes.add(disapprovalReasonCodesItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査否認理由コード&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Codes of disapproval reason&lt;/div&gt; 
   * @return disapprovalReasonCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">審査否認理由コード</div> <div lang=\"en\">Codes of disapproval reason</div> ")

  public List<String> getDisapprovalReasonCodes() {
    return disapprovalReasonCodes;
  }


  public void setDisapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
  }


  public PageFeedItem disapprovalReasonComment(String disapprovalReasonComment) {
    
    this.disapprovalReasonComment = disapprovalReasonComment;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査否認理由のコメント&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Comment of disapproval reason&lt;/div&gt; 
   * @return disapprovalReasonComment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">審査否認理由のコメント</div> <div lang=\"en\">Comment of disapproval reason</div> ")

  public String getDisapprovalReasonComment() {
    return disapprovalReasonComment;
  }


  public void setDisapprovalReasonComment(String disapprovalReasonComment) {
    this.disapprovalReasonComment = disapprovalReasonComment;
  }


  public PageFeedItem feedId(Long feedId) {
    
    this.feedId = feedId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;フィードID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Feed ID&lt;/div&gt; 
   * @return feedId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">フィードID</div> <div lang=\"en\">Feed ID</div> ")

  public Long getFeedId() {
    return feedId;
  }


  public void setFeedId(Long feedId) {
    this.feedId = feedId;
  }


  public PageFeedItem pageFeedCustomLabel(String pageFeedCustomLabel) {
    
    this.pageFeedCustomLabel = pageFeedCustomLabel;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページフィードアイテムのカスタムラベル&lt;br&gt; 複数ある場合はカンマ区切り&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Custom label of Page feed item.&lt;br&gt; If multiple, comma separated.&lt;/div&gt; 
   * @return pageFeedCustomLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ページフィードアイテムのカスタムラベル<br> 複数ある場合はカンマ区切り</div> <div lang=\"en\">Custom label of Page feed item.<br> If multiple, comma separated.</div> ")

  public String getPageFeedCustomLabel() {
    return pageFeedCustomLabel;
  }


  public void setPageFeedCustomLabel(String pageFeedCustomLabel) {
    this.pageFeedCustomLabel = pageFeedCustomLabel;
  }


  public PageFeedItem pageFeedItemId(Long pageFeedItemId) {
    
    this.pageFeedItemId = pageFeedItemId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページフィードアイテムID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Page feed item ID&lt;/div&gt; 
   * @return pageFeedItemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ページフィードアイテムID</div> <div lang=\"en\">Page feed item ID</div> ")

  public Long getPageFeedItemId() {
    return pageFeedItemId;
  }


  public void setPageFeedItemId(Long pageFeedItemId) {
    this.pageFeedItemId = pageFeedItemId;
  }


  public PageFeedItem pageFeedUrl(String pageFeedUrl) {
    
    this.pageFeedUrl = pageFeedUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページフィードURL。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Url of page feed&lt;/div&gt; 
   * @return pageFeedUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ページフィードURL。</div> <div lang=\"en\">Url of page feed</div> ")

  public String getPageFeedUrl() {
    return pageFeedUrl;
  }


  public void setPageFeedUrl(String pageFeedUrl) {
    this.pageFeedUrl = pageFeedUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageFeedItem pageFeedItem = (PageFeedItem) o;
    return Objects.equals(this.accountId, pageFeedItem.accountId) &&
        Objects.equals(this.approvalStatus, pageFeedItem.approvalStatus) &&
        Objects.equals(this.disapprovalReasonCodes, pageFeedItem.disapprovalReasonCodes) &&
        Objects.equals(this.disapprovalReasonComment, pageFeedItem.disapprovalReasonComment) &&
        Objects.equals(this.feedId, pageFeedItem.feedId) &&
        Objects.equals(this.pageFeedCustomLabel, pageFeedItem.pageFeedCustomLabel) &&
        Objects.equals(this.pageFeedItemId, pageFeedItem.pageFeedItemId) &&
        Objects.equals(this.pageFeedUrl, pageFeedItem.pageFeedUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, approvalStatus, disapprovalReasonCodes, disapprovalReasonComment, feedId, pageFeedCustomLabel, pageFeedItemId, pageFeedUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFeedItem {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    disapprovalReasonCodes: ").append(toIndentedString(disapprovalReasonCodes)).append("\n");
    sb.append("    disapprovalReasonComment: ").append(toIndentedString(disapprovalReasonComment)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    pageFeedCustomLabel: ").append(toIndentedString(pageFeedCustomLabel)).append("\n");
    sb.append("    pageFeedItemId: ").append(toIndentedString(pageFeedItemId)).append("\n");
    sb.append("    pageFeedUrl: ").append(toIndentedString(pageFeedUrl)).append("\n");
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

