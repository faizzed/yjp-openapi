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
import jp.co.yahoo.adssearchapi.v4.model.AccountTrackingUrl;
import jp.co.yahoo.adssearchapi.v4.model.Error;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountTrackingUrlServiceValueオブジェクトは、実行結果（1 Entity）を含むアカウントトラッキング情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountTrackingUrlServiceValue object describes the account tracking details per entity result.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountTrackingUrlServiceValueオブジェクトは、実行結果（1 Entity）を含むアカウントトラッキング情報を表します。</div> <div lang=\"en\">AccountTrackingUrlServiceValue object describes the account tracking details per entity result.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class AccountTrackingUrlServiceValue {
  public static final String SERIALIZED_NAME_ACCOUNT_TRACKING_URL = "accountTrackingUrl";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TRACKING_URL)
  private AccountTrackingUrl accountTrackingUrl;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<Error> errors = null;

  public static final String SERIALIZED_NAME_OPERATION_SUCCEEDED = "operationSucceeded";
  @SerializedName(SERIALIZED_NAME_OPERATION_SUCCEEDED)
  private Boolean operationSucceeded;


  public AccountTrackingUrlServiceValue accountTrackingUrl(AccountTrackingUrl accountTrackingUrl) {
    
    this.accountTrackingUrl = accountTrackingUrl;
    return this;
  }

   /**
   * Get accountTrackingUrl
   * @return accountTrackingUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountTrackingUrl getAccountTrackingUrl() {
    return accountTrackingUrl;
  }


  public void setAccountTrackingUrl(AccountTrackingUrl accountTrackingUrl) {
    this.accountTrackingUrl = accountTrackingUrl;
  }


  public AccountTrackingUrlServiceValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public AccountTrackingUrlServiceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<Error>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Error> getErrors() {
    return errors;
  }


  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  public AccountTrackingUrlServiceValue operationSucceeded(Boolean operationSucceeded) {
    
    this.operationSucceeded = operationSucceeded;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;処理結果を表示します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Displays process result.&lt;/div&gt; 
   * @return operationSucceeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果を表示します。</div> <div lang=\"en\">Displays process result.</div> ")

  public Boolean getOperationSucceeded() {
    return operationSucceeded;
  }


  public void setOperationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountTrackingUrlServiceValue accountTrackingUrlServiceValue = (AccountTrackingUrlServiceValue) o;
    return Objects.equals(this.accountTrackingUrl, accountTrackingUrlServiceValue.accountTrackingUrl) &&
        Objects.equals(this.errors, accountTrackingUrlServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, accountTrackingUrlServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountTrackingUrl, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountTrackingUrlServiceValue {\n");
    sb.append("    accountTrackingUrl: ").append(toIndentedString(accountTrackingUrl)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
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
