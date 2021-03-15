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
import jp.co.yahoo.adssearchapi.v4.model.Error;
import jp.co.yahoo.adssearchapi.v4.model.PageFeedItemServiceDownloadJob;
import jp.co.yahoo.adssearchapi.v4.model.PageFeedItemServiceUploadJob;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PageFeedItemServiceJobValueは、upload、downloadの処理状況を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedItemServiceJobValue retains a container of the processing situation results (upload/download).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PageFeedItemServiceJobValueは、upload、downloadの処理状況を格納するコンテナです。</div> <div lang=\"en\">PageFeedItemServiceJobValue retains a container of the processing situation results (upload/download).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T15:50:35.264006+01:00[Europe/Paris]")
public class PageFeedItemServiceJobValue {
  public static final String SERIALIZED_NAME_DOWNLOAD_JOB = "downloadJob";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_JOB)
  private PageFeedItemServiceDownloadJob downloadJob;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<Error> errors = null;

  public static final String SERIALIZED_NAME_OPERATION_SUCCEEDED = "operationSucceeded";
  @SerializedName(SERIALIZED_NAME_OPERATION_SUCCEEDED)
  private Boolean operationSucceeded;

  public static final String SERIALIZED_NAME_UPLOAD_JOB = "uploadJob";
  @SerializedName(SERIALIZED_NAME_UPLOAD_JOB)
  private PageFeedItemServiceUploadJob uploadJob;


  public PageFeedItemServiceJobValue downloadJob(PageFeedItemServiceDownloadJob downloadJob) {
    
    this.downloadJob = downloadJob;
    return this;
  }

   /**
   * Get downloadJob
   * @return downloadJob
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PageFeedItemServiceDownloadJob getDownloadJob() {
    return downloadJob;
  }


  public void setDownloadJob(PageFeedItemServiceDownloadJob downloadJob) {
    this.downloadJob = downloadJob;
  }


  public PageFeedItemServiceJobValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public PageFeedItemServiceJobValue addErrorsItem(Error errorsItem) {
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


  public PageFeedItemServiceJobValue operationSucceeded(Boolean operationSucceeded) {
    
    this.operationSucceeded = operationSucceeded;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The process results. If true, the process succeeded. If false, the process failed.&lt;/div&gt; 
   * @return operationSucceeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> ")

  public Boolean getOperationSucceeded() {
    return operationSucceeded;
  }


  public void setOperationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }


  public PageFeedItemServiceJobValue uploadJob(PageFeedItemServiceUploadJob uploadJob) {
    
    this.uploadJob = uploadJob;
    return this;
  }

   /**
   * Get uploadJob
   * @return uploadJob
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PageFeedItemServiceUploadJob getUploadJob() {
    return uploadJob;
  }


  public void setUploadJob(PageFeedItemServiceUploadJob uploadJob) {
    this.uploadJob = uploadJob;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageFeedItemServiceJobValue pageFeedItemServiceJobValue = (PageFeedItemServiceJobValue) o;
    return Objects.equals(this.downloadJob, pageFeedItemServiceJobValue.downloadJob) &&
        Objects.equals(this.errors, pageFeedItemServiceJobValue.errors) &&
        Objects.equals(this.operationSucceeded, pageFeedItemServiceJobValue.operationSucceeded) &&
        Objects.equals(this.uploadJob, pageFeedItemServiceJobValue.uploadJob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadJob, errors, operationSucceeded, uploadJob);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFeedItemServiceJobValue {\n");
    sb.append("    downloadJob: ").append(toIndentedString(downloadJob)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
    sb.append("    uploadJob: ").append(toIndentedString(uploadJob)).append("\n");
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

