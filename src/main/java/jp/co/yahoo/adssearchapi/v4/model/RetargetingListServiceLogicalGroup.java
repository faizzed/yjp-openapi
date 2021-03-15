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
import jp.co.yahoo.adssearchapi.v4.model.RetargetingListServiceLogicalCondition;
import jp.co.yahoo.adssearchapi.v4.model.RetargetingListServiceLogicalRuleOperand;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceLogicalGroupは、組合せグループの情報を保持するオブジェクトです。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceLogicalGroup is an object that holds combination group information.&lt;br&gt; This field is required in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceLogicalGroupは、組合せグループの情報を保持するオブジェクトです。<br> このフィールドは、ADDおよびSET時に必須となります。</div> <div lang=\"en\">RetargetingListServiceLogicalGroup is an object that holds combination group information.<br> This field is required in ADD and SET operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class RetargetingListServiceLogicalGroup {
  public static final String SERIALIZED_NAME_LOGICAL_CONDITION = "logicalCondition";
  @SerializedName(SERIALIZED_NAME_LOGICAL_CONDITION)
  private RetargetingListServiceLogicalCondition logicalCondition;

  public static final String SERIALIZED_NAME_LOGICAL_OPERAND = "logicalOperand";
  @SerializedName(SERIALIZED_NAME_LOGICAL_OPERAND)
  private List<RetargetingListServiceLogicalRuleOperand> logicalOperand = null;


  public RetargetingListServiceLogicalGroup logicalCondition(RetargetingListServiceLogicalCondition logicalCondition) {
    
    this.logicalCondition = logicalCondition;
    return this;
  }

   /**
   * Get logicalCondition
   * @return logicalCondition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RetargetingListServiceLogicalCondition getLogicalCondition() {
    return logicalCondition;
  }


  public void setLogicalCondition(RetargetingListServiceLogicalCondition logicalCondition) {
    this.logicalCondition = logicalCondition;
  }


  public RetargetingListServiceLogicalGroup logicalOperand(List<RetargetingListServiceLogicalRuleOperand> logicalOperand) {
    
    this.logicalOperand = logicalOperand;
    return this;
  }

  public RetargetingListServiceLogicalGroup addLogicalOperandItem(RetargetingListServiceLogicalRuleOperand logicalOperandItem) {
    if (this.logicalOperand == null) {
      this.logicalOperand = new ArrayList<RetargetingListServiceLogicalRuleOperand>();
    }
    this.logicalOperand.add(logicalOperandItem);
    return this;
  }

   /**
   * Get logicalOperand
   * @return logicalOperand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RetargetingListServiceLogicalRuleOperand> getLogicalOperand() {
    return logicalOperand;
  }


  public void setLogicalOperand(List<RetargetingListServiceLogicalRuleOperand> logicalOperand) {
    this.logicalOperand = logicalOperand;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceLogicalGroup retargetingListServiceLogicalGroup = (RetargetingListServiceLogicalGroup) o;
    return Objects.equals(this.logicalCondition, retargetingListServiceLogicalGroup.logicalCondition) &&
        Objects.equals(this.logicalOperand, retargetingListServiceLogicalGroup.logicalOperand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logicalCondition, logicalOperand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceLogicalGroup {\n");
    sb.append("    logicalCondition: ").append(toIndentedString(logicalCondition)).append("\n");
    sb.append("    logicalOperand: ").append(toIndentedString(logicalOperand)).append("\n");
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
