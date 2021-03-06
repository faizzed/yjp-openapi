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
import jp.co.yahoo.adssearchapi.v4.model.FeedItemServiceFeedAttributeValue;
import jp.co.yahoo.adssearchapi.v4.model.FeedItemServiceIsRemove;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時には無視されます。&lt;br&gt; ※placeholderFieldがSTRUCTURED_SNIPPET_VALUES, ADDITIONAL_ADVANCED_URLS, ADDITIONAL_ADVANCED_MOBILE_URLSの場合、ADDおよびSET時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.&lt;br&gt; If the placeholderField is STRUCTURED_SNIPPET_VALUES, ADDITIONAL_ADVANCED_URLS, or ADDITIONAL_ADVANCED_MOBILE_URLS, this field is required in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時には無視されます。<br> ※placeholderFieldがSTRUCTURED_SNIPPET_VALUES, ADDITIONAL_ADVANCED_URLS, ADDITIONAL_ADVANCED_MOBILE_URLSの場合、ADDおよびSET時に必須となります。</div> <div lang=\"en\">This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.<br> If the placeholderField is STRUCTURED_SNIPPET_VALUES, ADDITIONAL_ADVANCED_URLS, or ADDITIONAL_ADVANCED_MOBILE_URLS, this field is required in ADD and SET operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class FeedItemServiceMultipleFeedItemAttribute {
  public static final String SERIALIZED_NAME_FEED_ATTRIBUTE_VALUES = "feedAttributeValues";
  @SerializedName(SERIALIZED_NAME_FEED_ATTRIBUTE_VALUES)
  private List<FeedItemServiceFeedAttributeValue> feedAttributeValues = null;

  public static final String SERIALIZED_NAME_IS_REMOVE = "isRemove";
  @SerializedName(SERIALIZED_NAME_IS_REMOVE)
  private FeedItemServiceIsRemove isRemove;


  public FeedItemServiceMultipleFeedItemAttribute feedAttributeValues(List<FeedItemServiceFeedAttributeValue> feedAttributeValues) {
    
    this.feedAttributeValues = feedAttributeValues;
    return this;
  }

  public FeedItemServiceMultipleFeedItemAttribute addFeedAttributeValuesItem(FeedItemServiceFeedAttributeValue feedAttributeValuesItem) {
    if (this.feedAttributeValues == null) {
      this.feedAttributeValues = new ArrayList<FeedItemServiceFeedAttributeValue>();
    }
    this.feedAttributeValues.add(feedAttributeValuesItem);
    return this;
  }

   /**
   * Get feedAttributeValues
   * @return feedAttributeValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FeedItemServiceFeedAttributeValue> getFeedAttributeValues() {
    return feedAttributeValues;
  }


  public void setFeedAttributeValues(List<FeedItemServiceFeedAttributeValue> feedAttributeValues) {
    this.feedAttributeValues = feedAttributeValues;
  }


  public FeedItemServiceMultipleFeedItemAttribute isRemove(FeedItemServiceIsRemove isRemove) {
    
    this.isRemove = isRemove;
    return this;
  }

   /**
   * Get isRemove
   * @return isRemove
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FeedItemServiceIsRemove getIsRemove() {
    return isRemove;
  }


  public void setIsRemove(FeedItemServiceIsRemove isRemove) {
    this.isRemove = isRemove;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedItemServiceMultipleFeedItemAttribute feedItemServiceMultipleFeedItemAttribute = (FeedItemServiceMultipleFeedItemAttribute) o;
    return Objects.equals(this.feedAttributeValues, feedItemServiceMultipleFeedItemAttribute.feedAttributeValues) &&
        Objects.equals(this.isRemove, feedItemServiceMultipleFeedItemAttribute.isRemove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedAttributeValues, isRemove);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedItemServiceMultipleFeedItemAttribute {\n");
    sb.append("    feedAttributeValues: ").append(toIndentedString(feedAttributeValues)).append("\n");
    sb.append("    isRemove: ").append(toIndentedString(isRemove)).append("\n");
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

