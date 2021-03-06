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
import jp.co.yahoo.adssearchapi.v4.model.AccountManagementServiceAuthType;
import jp.co.yahoo.adssearchapi.v4.model.AccountManagementServiceAutoTaggingEnabled;
import jp.co.yahoo.adssearchapi.v4.model.AccountManagementServiceClient;
import jp.co.yahoo.adssearchapi.v4.model.AccountManagementServiceClientType;
import jp.co.yahoo.adssearchapi.v4.model.AccountManagementServiceDeliveryStatus;
import jp.co.yahoo.adssearchapi.v4.model.AccountManagementServiceIsAdultAccount;
import jp.co.yahoo.adssearchapi.v4.model.AccountManagementServiceIsTestAccount;
import jp.co.yahoo.adssearchapi.v4.model.AccountManagementServicePayment;
import jp.co.yahoo.adssearchapi.v4.model.AccountManagementServicePrefectureCode;
import jp.co.yahoo.adssearchapi.v4.model.AccountManagementServiceStatus;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountManagementオブジェクトは、アカウント情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountManagement object serves account information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountManagementオブジェクトは、アカウント情報を表します。</div> <div lang=\"en\">AccountManagement object serves account information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class AccountManagement {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId;

  public static final String SERIALIZED_NAME_ACCOUNT_NAME = "accountName";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NAME)
  private String accountName;

  public static final String SERIALIZED_NAME_ACCOUNT_PAYMENT = "accountPayment";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_PAYMENT)
  private AccountManagementServicePayment accountPayment;

  public static final String SERIALIZED_NAME_AGENCY_PERSON_NAME = "agencyPersonName";
  @SerializedName(SERIALIZED_NAME_AGENCY_PERSON_NAME)
  private String agencyPersonName;

  public static final String SERIALIZED_NAME_AGENCY_PREFECTURE_CODE = "agencyPrefectureCode";
  @SerializedName(SERIALIZED_NAME_AGENCY_PREFECTURE_CODE)
  private AccountManagementServicePrefectureCode agencyPrefectureCode;

  public static final String SERIALIZED_NAME_AUTH_TYPE = "authType";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private AccountManagementServiceAuthType authType;

  public static final String SERIALIZED_NAME_AUTO_TAGGING_ENABLED = "autoTaggingEnabled";
  @SerializedName(SERIALIZED_NAME_AUTO_TAGGING_ENABLED)
  private AccountManagementServiceAutoTaggingEnabled autoTaggingEnabled;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  private AccountManagementServiceClient client;

  public static final String SERIALIZED_NAME_CLIENT_TYPE = "clientType";
  @SerializedName(SERIALIZED_NAME_CLIENT_TYPE)
  private AccountManagementServiceClientType clientType;

  public static final String SERIALIZED_NAME_CONTACT_BIZ_ID = "contactBizId";
  @SerializedName(SERIALIZED_NAME_CONTACT_BIZ_ID)
  private String contactBizId;

  public static final String SERIALIZED_NAME_DELIVERY_STATUS = "deliveryStatus";
  @SerializedName(SERIALIZED_NAME_DELIVERY_STATUS)
  private AccountManagementServiceDeliveryStatus deliveryStatus;

  public static final String SERIALIZED_NAME_IS_ADULT_ACCOUNT = "isAdultAccount";
  @SerializedName(SERIALIZED_NAME_IS_ADULT_ACCOUNT)
  private AccountManagementServiceIsAdultAccount isAdultAccount;

  public static final String SERIALIZED_NAME_IS_TEST_ACCOUNT = "isTestAccount";
  @SerializedName(SERIALIZED_NAME_IS_TEST_ACCOUNT)
  private AccountManagementServiceIsTestAccount isTestAccount;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private AccountManagementServiceStatus status;


  public AccountManagement accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Account ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")

  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public AccountManagement accountName(String accountName) {
    
    this.accountName = accountName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウント名です。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account Name.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;/div&gt; 
   * @return accountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウント名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。</div> <div lang=\"en\">Account Name.<br> This field is required in ADD operation, and will be optional in SET operation.</div> ")

  public String getAccountName() {
    return accountName;
  }


  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  public AccountManagement accountPayment(AccountManagementServicePayment accountPayment) {
    
    this.accountPayment = accountPayment;
    return this;
  }

   /**
   * Get accountPayment
   * @return accountPayment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountManagementServicePayment getAccountPayment() {
    return accountPayment;
  }


  public void setAccountPayment(AccountManagementServicePayment accountPayment) {
    this.accountPayment = accountPayment;
  }


  public AccountManagement agencyPersonName(String agencyPersonName) {
    
    this.agencyPersonName = agencyPersonName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;代理店担当者名です。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Agency Person Name.&lt;br&gt; This field is optional in ADD and SET operation.&lt;/div&gt; 
   * @return agencyPersonName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">代理店担当者名です。<br> ADDおよびSET時、このフィールドは省略可能となります。</div> <div lang=\"en\">Agency Person Name.<br> This field is optional in ADD and SET operation.</div> ")

  public String getAgencyPersonName() {
    return agencyPersonName;
  }


  public void setAgencyPersonName(String agencyPersonName) {
    this.agencyPersonName = agencyPersonName;
  }


  public AccountManagement agencyPrefectureCode(AccountManagementServicePrefectureCode agencyPrefectureCode) {
    
    this.agencyPrefectureCode = agencyPrefectureCode;
    return this;
  }

   /**
   * Get agencyPrefectureCode
   * @return agencyPrefectureCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountManagementServicePrefectureCode getAgencyPrefectureCode() {
    return agencyPrefectureCode;
  }


  public void setAgencyPrefectureCode(AccountManagementServicePrefectureCode agencyPrefectureCode) {
    this.agencyPrefectureCode = agencyPrefectureCode;
  }


  public AccountManagement authType(AccountManagementServiceAuthType authType) {
    
    this.authType = authType;
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountManagementServiceAuthType getAuthType() {
    return authType;
  }


  public void setAuthType(AccountManagementServiceAuthType authType) {
    this.authType = authType;
  }


  public AccountManagement autoTaggingEnabled(AccountManagementServiceAutoTaggingEnabled autoTaggingEnabled) {
    
    this.autoTaggingEnabled = autoTaggingEnabled;
    return this;
  }

   /**
   * Get autoTaggingEnabled
   * @return autoTaggingEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountManagementServiceAutoTaggingEnabled getAutoTaggingEnabled() {
    return autoTaggingEnabled;
  }


  public void setAutoTaggingEnabled(AccountManagementServiceAutoTaggingEnabled autoTaggingEnabled) {
    this.autoTaggingEnabled = autoTaggingEnabled;
  }


  public AccountManagement client(AccountManagementServiceClient client) {
    
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountManagementServiceClient getClient() {
    return client;
  }


  public void setClient(AccountManagementServiceClient client) {
    this.client = client;
  }


  public AccountManagement clientType(AccountManagementServiceClientType clientType) {
    
    this.clientType = clientType;
    return this;
  }

   /**
   * Get clientType
   * @return clientType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountManagementServiceClientType getClientType() {
    return clientType;
  }


  public void setClientType(AccountManagementServiceClientType clientType) {
    this.clientType = clientType;
  }


  public AccountManagement contactBizId(String contactBizId) {
    
    this.contactBizId = contactBizId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウント管理者のYahoo! JAPANビジネスIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Contact Business ID.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return contactBizId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウント管理者のYahoo! JAPANビジネスIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Contact Business ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")

  public String getContactBizId() {
    return contactBizId;
  }


  public void setContactBizId(String contactBizId) {
    this.contactBizId = contactBizId;
  }


  public AccountManagement deliveryStatus(AccountManagementServiceDeliveryStatus deliveryStatus) {
    
    this.deliveryStatus = deliveryStatus;
    return this;
  }

   /**
   * Get deliveryStatus
   * @return deliveryStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountManagementServiceDeliveryStatus getDeliveryStatus() {
    return deliveryStatus;
  }


  public void setDeliveryStatus(AccountManagementServiceDeliveryStatus deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }


  public AccountManagement isAdultAccount(AccountManagementServiceIsAdultAccount isAdultAccount) {
    
    this.isAdultAccount = isAdultAccount;
    return this;
  }

   /**
   * Get isAdultAccount
   * @return isAdultAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountManagementServiceIsAdultAccount getIsAdultAccount() {
    return isAdultAccount;
  }


  public void setIsAdultAccount(AccountManagementServiceIsAdultAccount isAdultAccount) {
    this.isAdultAccount = isAdultAccount;
  }


  public AccountManagement isTestAccount(AccountManagementServiceIsTestAccount isTestAccount) {
    
    this.isTestAccount = isTestAccount;
    return this;
  }

   /**
   * Get isTestAccount
   * @return isTestAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountManagementServiceIsTestAccount getIsTestAccount() {
    return isTestAccount;
  }


  public void setIsTestAccount(AccountManagementServiceIsTestAccount isTestAccount) {
    this.isTestAccount = isTestAccount;
  }


  public AccountManagement status(AccountManagementServiceStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountManagementServiceStatus getStatus() {
    return status;
  }


  public void setStatus(AccountManagementServiceStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountManagement accountManagement = (AccountManagement) o;
    return Objects.equals(this.accountId, accountManagement.accountId) &&
        Objects.equals(this.accountName, accountManagement.accountName) &&
        Objects.equals(this.accountPayment, accountManagement.accountPayment) &&
        Objects.equals(this.agencyPersonName, accountManagement.agencyPersonName) &&
        Objects.equals(this.agencyPrefectureCode, accountManagement.agencyPrefectureCode) &&
        Objects.equals(this.authType, accountManagement.authType) &&
        Objects.equals(this.autoTaggingEnabled, accountManagement.autoTaggingEnabled) &&
        Objects.equals(this.client, accountManagement.client) &&
        Objects.equals(this.clientType, accountManagement.clientType) &&
        Objects.equals(this.contactBizId, accountManagement.contactBizId) &&
        Objects.equals(this.deliveryStatus, accountManagement.deliveryStatus) &&
        Objects.equals(this.isAdultAccount, accountManagement.isAdultAccount) &&
        Objects.equals(this.isTestAccount, accountManagement.isTestAccount) &&
        Objects.equals(this.status, accountManagement.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountName, accountPayment, agencyPersonName, agencyPrefectureCode, authType, autoTaggingEnabled, client, clientType, contactBizId, deliveryStatus, isAdultAccount, isTestAccount, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountManagement {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountPayment: ").append(toIndentedString(accountPayment)).append("\n");
    sb.append("    agencyPersonName: ").append(toIndentedString(agencyPersonName)).append("\n");
    sb.append("    agencyPrefectureCode: ").append(toIndentedString(agencyPrefectureCode)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    autoTaggingEnabled: ").append(toIndentedString(autoTaggingEnabled)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
    sb.append("    contactBizId: ").append(toIndentedString(contactBizId)).append("\n");
    sb.append("    deliveryStatus: ").append(toIndentedString(deliveryStatus)).append("\n");
    sb.append("    isAdultAccount: ").append(toIndentedString(isAdultAccount)).append("\n");
    sb.append("    isTestAccount: ").append(toIndentedString(isTestAccount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

