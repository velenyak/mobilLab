package com.bme.janosvelenyak.mobillab.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse2002   {
  
  @SerializedName("pagination")
  private InlineResponse200Pagination pagination = null;
  
  @SerializedName("data")
  private List<InlineResponse2002Data> data = new ArrayList<InlineResponse2002Data>();
  
  @SerializedName("meta")
  private InlineResponse200Meta meta = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public InlineResponse200Pagination getPagination() {
    return pagination;
  }
  public void setPagination(InlineResponse200Pagination pagination) {
    this.pagination = pagination;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2002Data> getData() {
    return data;
  }
  public void setData(List<InlineResponse2002Data> data) {
    this.data = data;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public InlineResponse200Meta getMeta() {
    return meta;
  }
  public void setMeta(InlineResponse200Meta meta) {
    this.meta = meta;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002 inlineResponse2002 = (InlineResponse2002) o;
    return Objects.equals(pagination, inlineResponse2002.pagination) &&
        Objects.equals(data, inlineResponse2002.data) &&
        Objects.equals(meta, inlineResponse2002.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002 {\n");
    
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
