package com.mancheng.cn.techproof.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BaiduHomePageData
 */
@Validated
public class BaiduHomePageData   {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("dateTime")
  private String dateTime = null;

  public BaiduHomePageData title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "baidu", value = "")

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public BaiduHomePageData dateTime(String dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * Get dateTime
   * @return dateTime
  **/
  @ApiModelProperty(example = "2019-01-01 00:00:00", value = "")

  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaiduHomePageData baiduHomePageData = (BaiduHomePageData) o;
    return Objects.equals(this.title, baiduHomePageData.title) &&
        Objects.equals(this.dateTime, baiduHomePageData.dateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, dateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaiduHomePageData {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
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
