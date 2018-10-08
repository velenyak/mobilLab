package com.bme.janosvelenyak.mobillab.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse200ImagesOriginal   {
  
  @SerializedName("mp4")
  private String mp4 = null;
  
  @SerializedName("size")
  private String size = null;
  
  @SerializedName("frames")
  private String frames = null;
  
  @SerializedName("width")
  private String width = null;
  
  @SerializedName("mp4_size")
  private String mp4Size = null;
  
  @SerializedName("webp")
  private String webp = null;
  
  @SerializedName("webp_size")
  private String webpSize = null;
  
  @SerializedName("url")
  private String url = null;
  
  @SerializedName("height")
  private String height = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getMp4() {
    return mp4;
  }
  public void setMp4(String mp4) {
    this.mp4 = mp4;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getSize() {
    return size;
  }
  public void setSize(String size) {
    this.size = size;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getFrames() {
    return frames;
  }
  public void setFrames(String frames) {
    this.frames = frames;
  }

  
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
  public String getMp4Size() {
    return mp4Size;
  }
  public void setMp4Size(String mp4Size) {
    this.mp4Size = mp4Size;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getWebp() {
    return webp;
  }
  public void setWebp(String webp) {
    this.webp = webp;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getWebpSize() {
    return webpSize;
  }
  public void setWebpSize(String webpSize) {
    this.webpSize = webpSize;
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
    InlineResponse200ImagesOriginal inlineResponse200ImagesOriginal = (InlineResponse200ImagesOriginal) o;
    return Objects.equals(mp4, inlineResponse200ImagesOriginal.mp4) &&
        Objects.equals(size, inlineResponse200ImagesOriginal.size) &&
        Objects.equals(frames, inlineResponse200ImagesOriginal.frames) &&
        Objects.equals(width, inlineResponse200ImagesOriginal.width) &&
        Objects.equals(mp4Size, inlineResponse200ImagesOriginal.mp4Size) &&
        Objects.equals(webp, inlineResponse200ImagesOriginal.webp) &&
        Objects.equals(webpSize, inlineResponse200ImagesOriginal.webpSize) &&
        Objects.equals(url, inlineResponse200ImagesOriginal.url) &&
        Objects.equals(height, inlineResponse200ImagesOriginal.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mp4, size, frames, width, mp4Size, webp, webpSize, url, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200ImagesOriginal {\n");
    
    sb.append("    mp4: ").append(toIndentedString(mp4)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    frames: ").append(toIndentedString(frames)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    mp4Size: ").append(toIndentedString(mp4Size)).append("\n");
    sb.append("    webp: ").append(toIndentedString(webp)).append("\n");
    sb.append("    webpSize: ").append(toIndentedString(webpSize)).append("\n");
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
