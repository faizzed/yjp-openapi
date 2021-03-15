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
import jp.co.yahoo.adssearchapi.v4.model.FeedServicePlaceholderField;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedServiceAttributeオブジェクトは、自動データ挿入のリストの属性を格納します。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedServiceAttribute object contains the attribute of auto data insertion list.&lt;br&gt; This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedServiceAttributeオブジェクトは、自動データ挿入のリストの属性を格納します。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。</div> <div lang=\"en\">FeedServiceAttribute object contains the attribute of auto data insertion list.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class FeedServiceAttribute {
  public static final String SERIALIZED_NAME_FEED_ATTRIBUTE_ID = "feedAttributeId";
  @SerializedName(SERIALIZED_NAME_FEED_ATTRIBUTE_ID)
  private Long feedAttributeId;

  public static final String SERIALIZED_NAME_FEED_ATTRIBUTE_NAME = "feedAttributeName";
  @SerializedName(SERIALIZED_NAME_FEED_ATTRIBUTE_NAME)
  private String feedAttributeName;

  public static final String SERIALIZED_NAME_PLACEHOLDER_FIELD = "placeholderField";
  @SerializedName(SERIALIZED_NAME_PLACEHOLDER_FIELD)
  private FeedServicePlaceholderField placeholderField;


  public FeedServiceAttribute feedAttributeId(Long feedAttributeId) {
    
    this.feedAttributeId = feedAttributeId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;自動データ挿入のリストの属性（カラム）IDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Attribute ID (column ID) of auto data insertion list.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return feedAttributeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">自動データ挿入のリストの属性（カラム）IDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Attribute ID (column ID) of auto data insertion list.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")

  public Long getFeedAttributeId() {
    return feedAttributeId;
  }


  public void setFeedAttributeId(Long feedAttributeId) {
    this.feedAttributeId = feedAttributeId;
  }


  public FeedServiceAttribute feedAttributeName(String feedAttributeName) {
    
    this.feedAttributeName = feedAttributeName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;自動データ挿入のリストの属性（カラム）名です。&lt;br&gt; このフィールドはADDおよびSET時に必須となり、REMOVE時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Attribute name (column name) of auto data insertion list.&lt;br&gt; This field is required in ADD and SET operation, and will be ignored in REMOVE operation.&lt;/div&gt; 
   * @return feedAttributeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">自動データ挿入のリストの属性（カラム）名です。<br> このフィールドはADDおよびSET時に必須となり、REMOVE時に無視されます。</div> <div lang=\"en\">Attribute name (column name) of auto data insertion list.<br> This field is required in ADD and SET operation, and will be ignored in REMOVE operation.</div> ")

  public String getFeedAttributeName() {
    return feedAttributeName;
  }


  public void setFeedAttributeName(String feedAttributeName) {
    this.feedAttributeName = feedAttributeName;
  }


  public FeedServiceAttribute placeholderField(FeedServicePlaceholderField placeholderField) {
    
    this.placeholderField = placeholderField;
    return this;
  }

   /**
   * Get placeholderField
   * @return placeholderField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FeedServicePlaceholderField getPlaceholderField() {
    return placeholderField;
  }


  public void setPlaceholderField(FeedServicePlaceholderField placeholderField) {
    this.placeholderField = placeholderField;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedServiceAttribute feedServiceAttribute = (FeedServiceAttribute) o;
    return Objects.equals(this.feedAttributeId, feedServiceAttribute.feedAttributeId) &&
        Objects.equals(this.feedAttributeName, feedServiceAttribute.feedAttributeName) &&
        Objects.equals(this.placeholderField, feedServiceAttribute.placeholderField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedAttributeId, feedAttributeName, placeholderField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedServiceAttribute {\n");
    sb.append("    feedAttributeId: ").append(toIndentedString(feedAttributeId)).append("\n");
    sb.append("    feedAttributeName: ").append(toIndentedString(feedAttributeName)).append("\n");
    sb.append("    placeholderField: ").append(toIndentedString(placeholderField)).append("\n");
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

