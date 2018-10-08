package com.bme.janosvelenyak.mobillab.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse200ImagesDownsizedStill   {
  
  @SerializedName("width")
  private String width = null;
  
  @SerializedName("url")
  private String url = null;
  
  @SerializedName("height")
  private String height = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getWidth() {
    return width;
  }
  public void setWidth(String width) {
    this.width = width;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getHeight() {
    return height;
  }
  public void setHeight(String height) {
    this.height = height;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200ImagesDownsizedStill inlineResponse200ImagesDownsizedStill = (InlineResponse200ImagesDownsizedStill) o;
    return Objects.equals(width, inlineResponse200ImagesDownsizedStill.width) &&
        Objects.equals(url, inlineResponse200ImagesDownsizedStill.url) &&
        Objects.equals(height, inlineResponse200ImagesDownsizedStill.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, url, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200ImagesDownsizedStill {\n");
    
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
