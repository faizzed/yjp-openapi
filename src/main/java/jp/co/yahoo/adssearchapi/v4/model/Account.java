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
import jp.co.yahoo.adssearchapi.v4.model.AccountServiceAuthType;
import jp.co.yahoo.adssearchapi.v4.model.AccountServiceAutoTaggingEnabled;
import jp.co.yahoo.adssearchapi.v4.model.AccountServiceDeliveryStatus;
import jp.co.yahoo.adssearchapi.v4.model.AccountServiceIsManagerAccount;
import jp.co.yahoo.adssearchapi.v4.model.AccountServiceIsTestAccount;
import jp.co.yahoo.adssearchapi.v4.model.AccountServiceStatus;
import jp.co.yahoo.adssearchapi.v4.model.AccountServiceType;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Accountオブジェクトは、アカウントを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account object describes the account information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">Accountオブジェクトは、アカウントを表します。</div> <div lang=\"en\">Account object describes the account information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class Account {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId;

  public static final String SERIALIZED_NAME_ACCOUNT_NAME = "accountName";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NAME)
  private String accountName;

  public static final String SERIALIZED_NAME_ACCOUNT_STATUS = "accountStatus";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_STATUS)
  private AccountServiceStatus accountStatus;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "accountType";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private AccountServiceType accountType;

  public static final String SERIALIZED_NAME_AUTH_TYPE = "authType";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private AccountServiceAuthType authType;

  public static final String SERIALIZED_NAME_AUTO_TAGGING_ENABLED = "autoTaggingEnabled";
  @SerializedName(SERIALIZED_NAME_AUTO_TAGGING_ENABLED)
  private AccountServiceAutoTaggingEnabled autoTaggingEnabled;

  public static final String SERIALIZED_NAME_DELIVERY_STATUS = "deliveryStatus";
  @SerializedName(SERIALIZED_NAME_DELIVERY_STATUS)
  private AccountServiceDeliveryStatus deliveryStatus;

  public static final String SERIALIZED_NAME_IS_TEST_ACCOUNT = "isTestAccount";
  @SerializedName(SERIALIZED_NAME_IS_TEST_ACCOUNT)
  private AccountServiceIsTestAccount isTestAccount;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_IS_MANAGER_ACCOUNT = "isManagerAccount";
  @SerializedName(SERIALIZED_NAME_IS_MANAGER_ACCOUNT)
  private AccountServiceIsManagerAccount isManagerAccount;

  public static final String SERIALIZED_NAME_CONTACT_BIZ_ID = "contactBizId";
  @SerializedName(SERIALIZED_NAME_CONTACT_BIZ_ID)
  private String contactBizId;


  public Account accountId(Long accountId) {
    
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


  public Account accountName(String accountName) {
    
    this.accountName = accountName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウント名です。&lt;br&gt; SET時、このフィールドは省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account Name.&lt;br&gt; This field is optional in SET operation.&lt;/div&gt; 
   * @return accountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウント名です。<br> SET時、このフィールドは省略可能となります。</div> <div lang=\"en\">Account Name.<br> This field is optional in SET operation.</div> ")

  public String getAccountName() {
    return accountName;
  }


  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  public Account accountStatus(AccountServiceStatus accountStatus) {
    
    this.accountStatus = accountStatus;
    return this;
  }

   /**
   * Get accountStatus
   * @return accountStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountServiceStatus getAccountStatus() {
    return accountStatus;
  }


  public void setAccountStatus(AccountServiceStatus accountStatus) {
    this.accountStatus = accountStatus;
  }


  public Account accountType(AccountServiceType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountServiceType getAccountType() {
    return accountType;
  }


  public void setAccountType(AccountServiceType accountType) {
    this.accountType = accountType;
  }


  public Account authType(AccountServiceAuthType authType) {
    
    this.authType = authType;
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountServiceAuthType getAuthType() {
    return authType;
  }


  public void setAuthType(AccountServiceAuthType authType) {
    this.authType = authType;
  }


  public Account autoTaggingEnabled(AccountServiceAutoTaggingEnabled autoTaggingEnabled) {
    
    this.autoTaggingEnabled = autoTaggingEnabled;
    return this;
  }

   /**
   * Get autoTaggingEnabled
   * @return autoTaggingEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountServiceAutoTaggingEnabled getAutoTaggingEnabled() {
    return autoTaggingEnabled;
  }


  public void setAutoTaggingEnabled(AccountServiceAutoTaggingEnabled autoTaggingEnabled) {
    this.autoTaggingEnabled = autoTaggingEnabled;
  }


  public Account deliveryStatus(AccountServiceDeliveryStatus deliveryStatus) {
    
    this.deliveryStatus = deliveryStatus;
    return this;
  }

   /**
   * Get deliveryStatus
   * @return deliveryStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountServiceDeliveryStatus getDeliveryStatus() {
    return deliveryStatus;
  }


  public void setDeliveryStatus(AccountServiceDeliveryStatus deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }


  public Account isTestAccount(AccountServiceIsTestAccount isTestAccount) {
    
    this.isTestAccount = isTestAccount;
    return this;
  }

   /**
   * Get isTestAccount
   * @return isTestAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountServiceIsTestAccount getIsTestAccount() {
    return isTestAccount;
  }


  public void setIsTestAccount(AccountServiceIsTestAccount isTestAccount) {
    this.isTestAccount = isTestAccount;
  }


  public Account startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;掲載開始日です。&lt;br&gt; 「yyyyMMdd」形式で表示されます。&lt;br&gt; SET時、このフィールドは無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Start date of ad serving.&lt;br&gt; This field will be ignored in SET operation.&lt;br&gt; It is displayed in &amp;#39;yyyyMMdd&amp;#39; format.&lt;/div&gt; 
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">掲載開始日です。<br> 「yyyyMMdd」形式で表示されます。<br> SET時、このフィールドは無視されます。</div> <div lang=\"en\">Start date of ad serving.<br> This field will be ignored in SET operation.<br> It is displayed in &#39;yyyyMMdd&#39; format.</div> ")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public Account endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;掲載終了日です。&lt;br&gt; SET時、このフィールドは無視されます。&lt;br&gt;「yyyyMMdd」形式で表示されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;End date of ad serving.&lt;br&gt;This field will be ignored in SET operation.&lt;br&gt; It is displayed in &amp;#39;yyyyMMdd&amp;#39; format.&lt;/div&gt; 
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">掲載終了日です。<br> SET時、このフィールドは無視されます。<br>「yyyyMMdd」形式で表示されます。</div> <div lang=\"en\">End date of ad serving.<br>This field will be ignored in SET operation.<br> It is displayed in &#39;yyyyMMdd&#39; format.</div> ")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public Account isManagerAccount(AccountServiceIsManagerAccount isManagerAccount) {
    
    this.isManagerAccount = isManagerAccount;
    return this;
  }

   /**
   * Get isManagerAccount
   * @return isManagerAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountServiceIsManagerAccount getIsManagerAccount() {
    return isManagerAccount;
  }


  public void setIsManagerAccount(AccountServiceIsManagerAccount isManagerAccount) {
    this.isManagerAccount = isManagerAccount;
  }


  public Account contactBizId(String contactBizId) {
    
    this.contactBizId = contactBizId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウント管理者のYahoo! JAPANビジネスIDです。&lt;br&gt; MCCアカウントの場合、このフィールドは返却されず、リクエストの際も無視されます。&lt;br&gt; テストアカウントの場合、このフィールドは更新できません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Contact Business ID.&lt;br&gt; If isManagerAccount is \&quot;TRUE\&quot;, this field will not be returned and will be ignored on request.&lt;br&gt; If isTestAccount is \&quot;TRUE\&quot;, this field cannot be set.&lt;/div&gt; 
   * @return contactBizId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウント管理者のYahoo! JAPANビジネスIDです。<br> MCCアカウントの場合、このフィールドは返却されず、リクエストの際も無視されます。<br> テストアカウントの場合、このフィールドは更新できません。</div> <div lang=\"en\">Contact Business ID.<br> If isManagerAccount is \"TRUE\", this field will not be returned and will be ignored on request.<br> If isTestAccount is \"TRUE\", this field cannot be set.</div> ")

  public String getContactBizId() {
    return contactBizId;
  }


  public void setContactBizId(String contactBizId) {
    this.contactBizId = contactBizId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.accountId, account.accountId) &&
        Objects.equals(this.accountName, account.accountName) &&
        Objects.equals(this.accountStatus, account.accountStatus) &&
        Objects.equals(this.accountType, account.accountType) &&
        Objects.equals(this.authType, account.authType) &&
        Objects.equals(this.autoTaggingEnabled, account.autoTaggingEnabled) &&
        Objects.equals(this.deliveryStatus, account.deliveryStatus) &&
        Objects.equals(this.isTestAccount, account.isTestAccount) &&
        Objects.equals(this.startDate, account.startDate) &&
        Objects.equals(this.endDate, account.endDate) &&
        Objects.equals(this.isManagerAccount, account.isManagerAccount) &&
        Objects.equals(this.contactBizId, account.contactBizId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountName, accountStatus, accountType, authType, autoTaggingEnabled, deliveryStatus, isTestAccount, startDate, endDate, isManagerAccount, contactBizId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    autoTaggingEnabled: ").append(toIndentedString(autoTaggingEnabled)).append("\n");
    sb.append("    deliveryStatus: ").append(toIndentedString(deliveryStatus)).append("\n");
    sb.append("    isTestAccount: ").append(toIndentedString(isTestAccount)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    isManagerAccount: ").append(toIndentedString(isManagerAccount)).append("\n");
    sb.append("    contactBizId: ").append(toIndentedString(contactBizId)).append("\n");
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
