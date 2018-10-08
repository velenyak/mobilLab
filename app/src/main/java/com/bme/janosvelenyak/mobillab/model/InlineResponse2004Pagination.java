package com.bme.janosvelenyak.mobillab.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse2004Pagination   {
  
  @SerializedName("offset")
  private Integer offset = null;
  
  @SerializedName("count")
  private Integer count = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getOffset() {
    return offset;
  }
  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004Pagination inlineResponse2004Pagination = (InlineResponse2004Pagination) o;
    return Objects.equals(offset, inlineResponse2004Pagination.offset) &&
        Objects.equals(count, inlineResponse2004Pagination.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004Pagination {\n");
    
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
