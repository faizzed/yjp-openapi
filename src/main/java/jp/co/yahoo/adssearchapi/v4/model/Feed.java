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
import jp.co.yahoo.adssearchapi.v4.model.FeedServiceAttribute;
import jp.co.yahoo.adssearchapi.v4.model.FeedServicePlaceholderType;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Feedオブジェクトは、自動データ挿入のリストを格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Feed object is the list of Data elements on auto data insertion.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">Feedオブジェクトは、自動データ挿入のリストを格納します。</div> <div lang=\"en\">Feed object is the list of Data elements on auto data insertion.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class Feed {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_FEED_ATTRIBUTE = "feedAttribute";
  @SerializedName(SERIALIZED_NAME_FEED_ATTRIBUTE)
  private List<FeedServiceAttribute> feedAttribute = null;

  public static final String SERIALIZED_NAME_FEED_ID = "feedId";
  @SerializedName(SERIALIZED_NAME_FEED_ID)
  private Long feedId;

  public static final String SERIALIZED_NAME_FEED_NAME = "feedName";
  @SerializedName(SERIALIZED_NAME_FEED_NAME)
  private String feedName;

  public static final String SERIALIZED_NAME_FEED_TRACK_ID = "feedTrackId";
  @SerializedName(SERIALIZED_NAME_FEED_TRACK_ID)
  private Long feedTrackId;

  public static final String SERIALIZED_NAME_PLACEHOLDER_TYPE = "placeholderType";
  @SerializedName(SERIALIZED_NAME_PLACEHOLDER_TYPE)
  private FeedServicePlaceholderType placeholderType;


  public Feed accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;br&gt; ※入稿の仕様変更により不要になりました。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;br&gt; *Not required by design change on editorials.　&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> ※入稿の仕様変更により不要になりました。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Account ID.<br> *Not required by design change on editorials.　<br> Although this field will be returned in the response, it will be ignored on input.</div> ")

  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public Feed domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ドメインです。&lt;br&gt; このフィールドは、ADD時に省略可能となり、SETおよびREMOVE時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Domain.　&lt;br&gt; This field is optional in ADD operation, and will be ignored in SET and REMOVE operation.&lt;/div&gt; 
   * @return domain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ドメインです。<br> このフィールドは、ADD時に省略可能となり、SETおよびREMOVE時に無視されます。</div> <div lang=\"en\">Domain.　<br> This field is optional in ADD operation, and will be ignored in SET and REMOVE operation.</div> ")

  public String getDomain() {
    return domain;
  }


  public void setDomain(String domain) {
    this.domain = domain;
  }


  public Feed feedAttribute(List<FeedServiceAttribute> feedAttribute) {
    
    this.feedAttribute = feedAttribute;
    return this;
  }

  public Feed addFeedAttributeItem(FeedServiceAttribute feedAttributeItem) {
    if (this.feedAttribute == null) {
      this.feedAttribute = new ArrayList<FeedServiceAttribute>();
    }
    this.feedAttribute.add(feedAttributeItem);
    return this;
  }

   /**
   * Get feedAttribute
   * @return feedAttribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FeedServiceAttribute> getFeedAttribute() {
    return feedAttribute;
  }


  public void setFeedAttribute(List<FeedServiceAttribute> feedAttribute) {
    this.feedAttribute = feedAttribute;
  }


  public Feed feedId(Long feedId) {
    
    this.feedId = feedId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedIDです。&lt;br&gt; このフィールドは、SETおよびREMOVE時に必須となり、ADD時は無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Feed ID.&lt;br&gt; This field is required in SET and REMOVE operation, and will be ignored in ADD operation.&lt;/div&gt; 
   * @return feedId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">FeedIDです。<br> このフィールドは、SETおよびREMOVE時に必須となり、ADD時は無視されます。</div> <div lang=\"en\">Feed ID.<br> This field is required in SET and REMOVE operation, and will be ignored in ADD operation.</div> ")

  public Long getFeedId() {
    return feedId;
  }


  public void setFeedId(Long feedId) {
    this.feedId = feedId;
  }


  public Feed feedName(String feedName) {
    
    this.feedName = feedName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Feedのリスト名です。&lt;br&gt; このフィールドは、ADD時に必須となり、SETおよびREMOVE時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;List name of Feed.&lt;br&gt; This field is required in ADD operation, and will be ignored in SET and REMOVE operation.&lt;/div&gt; 
   * @return feedName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">Feedのリスト名です。<br> このフィールドは、ADD時に必須となり、SETおよびREMOVE時に無視されます。</div> <div lang=\"en\">List name of Feed.<br> This field is required in ADD operation, and will be ignored in SET and REMOVE operation.</div> ")

  public String getFeedName() {
    return feedName;
  }


  public void setFeedName(String feedName) {
    this.feedName = feedName;
  }


  public Feed feedTrackId(Long feedTrackId) {
    
    this.feedTrackId = feedTrackId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Feedのトラッキング用IDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Tracking ID of Feed.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return feedTrackId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">Feedのトラッキング用IDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Tracking ID of Feed.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")

  public Long getFeedTrackId() {
    return feedTrackId;
  }


  public void setFeedTrackId(Long feedTrackId) {
    this.feedTrackId = feedTrackId;
  }


  public Feed placeholderType(FeedServicePlaceholderType placeholderType) {
    
    this.placeholderType = placeholderType;
    return this;
  }

   /**
   * Get placeholderType
   * @return placeholderType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FeedServicePlaceholderType getPlaceholderType() {
    return placeholderType;
  }


  public void setPlaceholderType(FeedServicePlaceholderType placeholderType) {
    this.placeholderType = placeholderType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Feed feed = (Feed) o;
    return Objects.equals(this.accountId, feed.accountId) &&
        Objects.equals(this.domain, feed.domain) &&
        Objects.equals(this.feedAttribute, feed.feedAttribute) &&
        Objects.equals(this.feedId, feed.feedId) &&
        Objects.equals(this.feedName, feed.feedName) &&
        Objects.equals(this.feedTrackId, feed.feedTrackId) &&
        Objects.equals(this.placeholderType, feed.placeholderType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, domain, feedAttribute, feedId, feedName, feedTrackId, placeholderType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feed {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    feedAttribute: ").append(toIndentedString(feedAttribute)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    feedName: ").append(toIndentedString(feedName)).append("\n");
    sb.append("    feedTrackId: ").append(toIndentedString(feedTrackId)).append("\n");
    sb.append("    placeholderType: ").append(toIndentedString(placeholderType)).append("\n");
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

