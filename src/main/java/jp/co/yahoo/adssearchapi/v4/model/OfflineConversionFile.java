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
import jp.co.yahoo.adssearchapi.v4.model.OfflineConversionServiceProcessStatus;
import jp.co.yahoo.adssearchapi.v4.model.OfflineConversionServiceUploadSourceType;
import jp.co.yahoo.adssearchapi.v4.model.OfflineConversionServiceUploadType;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;オフラインコンバージョンデータをアップロードする処理内容を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;This object contains contents of offline conversion information for upload.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">オフラインコンバージョンデータをアップロードする処理内容を格納します。</div> <div lang=\"en\">This object contains contents of offline conversion information for upload.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class OfflineConversionFile {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId;

  public static final String SERIALIZED_NAME_UPLOAD_ID = "uploadId";
  @SerializedName(SERIALIZED_NAME_UPLOAD_ID)
  private Long uploadId;

  public static final String SERIALIZED_NAME_UPLOAD_FILE_NAME = "uploadFileName";
  @SerializedName(SERIALIZED_NAME_UPLOAD_FILE_NAME)
  private String uploadFileName;

  public static final String SERIALIZED_NAME_UPLOAD_TYPE = "uploadType";
  @SerializedName(SERIALIZED_NAME_UPLOAD_TYPE)
  private OfflineConversionServiceUploadType uploadType;

  public static final String SERIALIZED_NAME_UPLOADED_DATE = "uploadedDate";
  @SerializedName(SERIALIZED_NAME_UPLOADED_DATE)
  private String uploadedDate;

  public static final String SERIALIZED_NAME_UPLOAD_SOURCE_TYPE = "uploadSourceType";
  @SerializedName(SERIALIZED_NAME_UPLOAD_SOURCE_TYPE)
  private OfflineConversionServiceUploadSourceType uploadSourceType;

  public static final String SERIALIZED_NAME_PROCESS_STATUS = "processStatus";
  @SerializedName(SERIALIZED_NAME_PROCESS_STATUS)
  private OfflineConversionServiceProcessStatus processStatus;


  public OfflineConversionFile accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")

  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public OfflineConversionFile uploadId(Long uploadId) {
    
    this.uploadId = uploadId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アップロードIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Upload ID.&lt;/div&gt; 
   * @return uploadId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アップロードIDです。</div> <div lang=\"en\">Upload ID.</div> ")

  public Long getUploadId() {
    return uploadId;
  }


  public void setUploadId(Long uploadId) {
    this.uploadId = uploadId;
  }


  public OfflineConversionFile uploadFileName(String uploadFileName) {
    
    this.uploadFileName = uploadFileName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アップロードファイル名です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Upload file name.&lt;/div&gt; 
   * @return uploadFileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アップロードファイル名です。</div> <div lang=\"en\">Upload file name.</div> ")

  public String getUploadFileName() {
    return uploadFileName;
  }


  public void setUploadFileName(String uploadFileName) {
    this.uploadFileName = uploadFileName;
  }


  public OfflineConversionFile uploadType(OfflineConversionServiceUploadType uploadType) {
    
    this.uploadType = uploadType;
    return this;
  }

   /**
   * Get uploadType
   * @return uploadType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OfflineConversionServiceUploadType getUploadType() {
    return uploadType;
  }


  public void setUploadType(OfflineConversionServiceUploadType uploadType) {
    this.uploadType = uploadType;
  }


  public OfflineConversionFile uploadedDate(String uploadedDate) {
    
    this.uploadedDate = uploadedDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アップロード日時です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Upload date and time.&lt;/div&gt; 
   * @return uploadedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アップロード日時です。</div> <div lang=\"en\">Upload date and time.</div> ")

  public String getUploadedDate() {
    return uploadedDate;
  }


  public void setUploadedDate(String uploadedDate) {
    this.uploadedDate = uploadedDate;
  }


  public OfflineConversionFile uploadSourceType(OfflineConversionServiceUploadSourceType uploadSourceType) {
    
    this.uploadSourceType = uploadSourceType;
    return this;
  }

   /**
   * Get uploadSourceType
   * @return uploadSourceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OfflineConversionServiceUploadSourceType getUploadSourceType() {
    return uploadSourceType;
  }


  public void setUploadSourceType(OfflineConversionServiceUploadSourceType uploadSourceType) {
    this.uploadSourceType = uploadSourceType;
  }


  public OfflineConversionFile processStatus(OfflineConversionServiceProcessStatus processStatus) {
    
    this.processStatus = processStatus;
    return this;
  }

   /**
   * Get processStatus
   * @return processStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OfflineConversionServiceProcessStatus getProcessStatus() {
    return processStatus;
  }


  public void setProcessStatus(OfflineConversionServiceProcessStatus processStatus) {
    this.processStatus = processStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfflineConversionFile offlineConversionFile = (OfflineConversionFile) o;
    return Objects.equals(this.accountId, offlineConversionFile.accountId) &&
        Objects.equals(this.uploadId, offlineConversionFile.uploadId) &&
        Objects.equals(this.uploadFileName, offlineConversionFile.uploadFileName) &&
        Objects.equals(this.uploadType, offlineConversionFile.uploadType) &&
        Objects.equals(this.uploadedDate, offlineConversionFile.uploadedDate) &&
        Objects.equals(this.uploadSourceType, offlineConversionFile.uploadSourceType) &&
        Objects.equals(this.processStatus, offlineConversionFile.processStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, uploadId, uploadFileName, uploadType, uploadedDate, uploadSourceType, processStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfflineConversionFile {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
    sb.append("    uploadFileName: ").append(toIndentedString(uploadFileName)).append("\n");
    sb.append("    uploadType: ").append(toIndentedString(uploadType)).append("\n");
    sb.append("    uploadedDate: ").append(toIndentedString(uploadedDate)).append("\n");
    sb.append("    uploadSourceType: ").append(toIndentedString(uploadSourceType)).append("\n");
    sb.append("    processStatus: ").append(toIndentedString(processStatus)).append("\n");
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
