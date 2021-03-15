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
import jp.co.yahoo.adssearchapi.v4.model.BudgetOrderServiceAccountType;
import jp.co.yahoo.adssearchapi.v4.model.BudgetOrderServiceLimitChargeType;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BudgetOrderオブジェクトは、アカウント予算情報を示します。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;BudgetOrder object is a container for storing the account budget.&lt;br&gt; &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">BudgetOrderオブジェクトは、アカウント予算情報を示します。<br> </div> <div lang=\"en\">BudgetOrder object is a container for storing the account budget.<br> </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class BudgetOrder {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "accountType";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private BudgetOrderServiceAccountType accountType;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount;

  public static final String SERIALIZED_NAME_LIMIT_CHARGE_TYPE = "limitChargeType";
  @SerializedName(SERIALIZED_NAME_LIMIT_CHARGE_TYPE)
  private BudgetOrderServiceLimitChargeType limitChargeType;


  public BudgetOrder accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アカウントIDです。&lt;br&gt; SET時、このフィールドは必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Account ID.&lt;br&gt; This field is required in SET operation. &lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> SET時、このフィールドは必須となります。 </div> <div lang=\"en\"> Account ID.<br> This field is required in SET operation. </div> ")

  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public BudgetOrder accountType(BudgetOrderServiceAccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BudgetOrderServiceAccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(BudgetOrderServiceAccountType accountType) {
    this.accountType = accountType;
  }


  public BudgetOrder amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アカウントの広告予算金額です。&lt;br&gt; SET時、このフィールドは省略可能となります。 月額予算は、accountTypeが&lt;code&gt;INVOICE&lt;/code&gt;の場合のみ変更可能です。 また、予算額は1000円単位で指定する必要があります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Amount of budget.&lt;br&gt; This field is optional in SET operation. The monthly budget can be changed only when accountType is &lt;code&gt;INVOICE&lt;/code&gt;. In addition, the budget amount must be specified in units of 1000 yen. &lt;/div&gt; 
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントの広告予算金額です。<br> SET時、このフィールドは省略可能となります。 月額予算は、accountTypeが<code>INVOICE</code>の場合のみ変更可能です。 また、予算額は1000円単位で指定する必要があります。 </div> <div lang=\"en\"> Amount of budget.<br> This field is optional in SET operation. The monthly budget can be changed only when accountType is <code>INVOICE</code>. In addition, the budget amount must be specified in units of 1000 yen. </div> ")

  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public BudgetOrder limitChargeType(BudgetOrderServiceLimitChargeType limitChargeType) {
    
    this.limitChargeType = limitChargeType;
    return this;
  }

   /**
   * Get limitChargeType
   * @return limitChargeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BudgetOrderServiceLimitChargeType getLimitChargeType() {
    return limitChargeType;
  }


  public void setLimitChargeType(BudgetOrderServiceLimitChargeType limitChargeType) {
    this.limitChargeType = limitChargeType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetOrder budgetOrder = (BudgetOrder) o;
    return Objects.equals(this.accountId, budgetOrder.accountId) &&
        Objects.equals(this.accountType, budgetOrder.accountType) &&
        Objects.equals(this.amount, budgetOrder.amount) &&
        Objects.equals(this.limitChargeType, budgetOrder.limitChargeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountType, amount, limitChargeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetOrder {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    limitChargeType: ").append(toIndentedString(limitChargeType)).append("\n");
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
