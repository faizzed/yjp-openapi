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
import jp.co.yahoo.adssearchapi.v4.model.CampaignTargetServiceNetworkCoverageType;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignTargetServiceNetworkTargetオブジェクトは、広告掲載方式を表します。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。&lt;br&gt; ※targetTypeがNETWORKの場合、このフィールドはADD時に必須となります。&lt;br&gt; なおNetworkTargetを設定しない場合、「YAHOO_SEARCH」を含むすべての広告掲載方式に広告は配信されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignTargetServiceNetworkTarget object describes Network coverage type.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; *If targetType is NETWORK, this field is required in ADD operation.&lt;br&gt; If you do not set the NetworkTarget, ads are delivered to the advertising system including all \&quot;YAHOO_SEARCH\&quot;.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignTargetServiceNetworkTargetオブジェクトは、広告掲載方式を表します。<br> このフィールドは、ADDおよびSET時に省略可能となります。<br> ※targetTypeがNETWORKの場合、このフィールドはADD時に必須となります。<br> なおNetworkTargetを設定しない場合、「YAHOO_SEARCH」を含むすべての広告掲載方式に広告は配信されます。</div> <div lang=\"en\">CampaignTargetServiceNetworkTarget object describes Network coverage type.<br> This field is optional in ADD and SET operation.<br> *If targetType is NETWORK, this field is required in ADD operation.<br> If you do not set the NetworkTarget, ads are delivered to the advertising system including all \"YAHOO_SEARCH\".</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class CampaignTargetServiceNetworkTarget {
  public static final String SERIALIZED_NAME_NETWORK_COVERAGE_TYPE = "networkCoverageType";
  @SerializedName(SERIALIZED_NAME_NETWORK_COVERAGE_TYPE)
  private CampaignTargetServiceNetworkCoverageType networkCoverageType;


  public CampaignTargetServiceNetworkTarget networkCoverageType(CampaignTargetServiceNetworkCoverageType networkCoverageType) {
    
    this.networkCoverageType = networkCoverageType;
    return this;
  }

   /**
   * Get networkCoverageType
   * @return networkCoverageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CampaignTargetServiceNetworkCoverageType getNetworkCoverageType() {
    return networkCoverageType;
  }


  public void setNetworkCoverageType(CampaignTargetServiceNetworkCoverageType networkCoverageType) {
    this.networkCoverageType = networkCoverageType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignTargetServiceNetworkTarget campaignTargetServiceNetworkTarget = (CampaignTargetServiceNetworkTarget) o;
    return Objects.equals(this.networkCoverageType, campaignTargetServiceNetworkTarget.networkCoverageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkCoverageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignTargetServiceNetworkTarget {\n");
    sb.append("    networkCoverageType: ").append(toIndentedString(networkCoverageType)).append("\n");
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

