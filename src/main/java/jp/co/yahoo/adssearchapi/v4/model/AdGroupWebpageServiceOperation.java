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
import jp.co.yahoo.adssearchapi.v4.model.AdGroupWebpage;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupWebpageServiceOperationオブジェクトは、mutateメソッドで操作対象となるPageFeedItemの配信/除外設定を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupWebpageServiceOperation object contains the allowed or excluded setting of PageFeedItem which is the target of mutate operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupWebpageServiceOperationオブジェクトは、mutateメソッドで操作対象となるPageFeedItemの配信/除外設定を保持します。</div> <div lang=\"en\">AdGroupWebpageServiceOperation object contains the allowed or excluded setting of PageFeedItem which is the target of mutate operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class AdGroupWebpageServiceOperation {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId;

  public static final String SERIALIZED_NAME_OPERAND = "operand";
  @SerializedName(SERIALIZED_NAME_OPERAND)
  private List<AdGroupWebpage> operand = new ArrayList<AdGroupWebpage>();


  public AdGroupWebpageServiceOperation accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID&lt;/div&gt; 
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID</div> ")

  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public AdGroupWebpageServiceOperation operand(List<AdGroupWebpage> operand) {
    
    this.operand = operand;
    return this;
  }

  public AdGroupWebpageServiceOperation addOperandItem(AdGroupWebpage operandItem) {
    this.operand.add(operandItem);
    return this;
  }

   /**
   * Get operand
   * @return operand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public List<AdGroupWebpage> getOperand() {
    return operand;
  }


  public void setOperand(List<AdGroupWebpage> operand) {
    this.operand = operand;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupWebpageServiceOperation adGroupWebpageServiceOperation = (AdGroupWebpageServiceOperation) o;
    return Objects.equals(this.accountId, adGroupWebpageServiceOperation.accountId) &&
        Objects.equals(this.operand, adGroupWebpageServiceOperation.operand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, operand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupWebpageServiceOperation {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    operand: ").append(toIndentedString(operand)).append("\n");
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

