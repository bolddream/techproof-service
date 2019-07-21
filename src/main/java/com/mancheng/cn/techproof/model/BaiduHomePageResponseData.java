package com.mancheng.cn.techproof.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.mancheng.cn.techproof.model.BaiduHomePageResponseParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BaiduHomePageResponseData
 */
@Validated
public class BaiduHomePageResponseData   {
  @JsonProperty("responseData")
  private BaiduHomePageResponseParameter responseData = null;

  @JsonProperty("returnCode")
  private Integer returnCode = null;

  @JsonProperty("returnMessage")
  private String returnMessage = null;

  public BaiduHomePageResponseData responseData(BaiduHomePageResponseParameter responseData) {
    this.responseData = responseData;
    return this;
  }

  /**
   * Get responseData
   * @return responseData
  **/
  @ApiModelProperty(value = "")

  @Valid
  public BaiduHomePageResponseParameter getResponseData() {
    return responseData;
  }

  public void setResponseData(BaiduHomePageResponseParameter responseData) {
    this.responseData = responseData;
  }

  public BaiduHomePageResponseData returnCode(Integer returnCode) {
    this.returnCode = returnCode;
    return this;
  }

  /**
   * Get returnCode
   * @return returnCode
  **/
  @ApiModelProperty(example = "0", value = "")

  public Integer getReturnCode() {
    return returnCode;
  }

  public void setReturnCode(Integer returnCode) {
    this.returnCode = returnCode;
  }

  public BaiduHomePageResponseData returnMessage(String returnMessage) {
    this.returnMessage = returnMessage;
    return this;
  }

  /**
   * Get returnMessage
   * @return returnMessage
  **/
  @ApiModelProperty(example = "Success", value = "")

  public String getReturnMessage() {
    return returnMessage;
  }

  public void setReturnMessage(String returnMessage) {
    this.returnMessage = returnMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaiduHomePageResponseData baiduHomePageResponseData = (BaiduHomePageResponseData) o;
    return Objects.equals(this.responseData, baiduHomePageResponseData.responseData) &&
        Objects.equals(this.returnCode, baiduHomePageResponseData.returnCode) &&
        Objects.equals(this.returnMessage, baiduHomePageResponseData.returnMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseData, returnCode, returnMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaiduHomePageResponseData {\n");
    
    sb.append("    responseData: ").append(toIndentedString(responseData)).append("\n");
    sb.append("    returnCode: ").append(toIndentedString(returnCode)).append("\n");
    sb.append("    returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
