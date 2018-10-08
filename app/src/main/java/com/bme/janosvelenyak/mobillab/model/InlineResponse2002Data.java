package com.bme.janosvelenyak.mobillab.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class InlineResponse2002Data   {
  
  @SerializedName("import_datetime")
  private String importDatetime = null;
  
  @SerializedName("images")
  private InlineResponse200Images images = null;
  
  @SerializedName("embed_url")
  private String embedUrl = null;
  
  @SerializedName("trending_datetime")
  private String trendingDatetime = null;
  
  @SerializedName("bitly_url")
  private String bitlyUrl = null;
  
  @SerializedName("rating")
  private String rating = null;
  
  @SerializedName("source")
  private String source = null;
  
  @SerializedName("type")
  private String type = null;
  
  @SerializedName("bitly_gif_url")
  private String bitlyGifUrl = null;
  
  @SerializedName("source_tld")
  private String sourceTld = null;
  
  @SerializedName("url")
  private String url = null;
  
  @SerializedName("source_post_url")
  private String sourcePostUrl = null;
  
  @SerializedName("content_url")
  private String contentUrl = null;
  
  @SerializedName("id")
  private String id = null;
  
  @SerializedName("user")
  private InlineResponse2002User user = null;
  
  @SerializedName("slug")
  private String slug = null;
  
  @SerializedName("username")
  private String username = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getImportDatetime() {
    return importDatetime;
  }
  public void setImportDatetime(String importDatetime) {
    this.importDatetime = importDatetime;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public InlineResponse200Images getImages() {
    return images;
  }
  public void setImages(InlineResponse200Images images) {
    this.images = images;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getEmbedUrl() {
    return embedUrl;
  }
  public void setEmbedUrl(String embedUrl) {
    this.embedUrl = embedUrl;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getTrendingDatetime() {
    return trendingDatetime;
  }
  public void setTrendingDatetime(String trendingDatetime) {
    this.trendingDatetime = trendingDatetime;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getBitlyUrl() {
    return bitlyUrl;
  }
  public void setBitlyUrl(String bitlyUrl) {
    this.bitlyUrl = bitlyUrl;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getRating() {
    return rating;
  }
  public void setRating(String rating) {
    this.rating = rating;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getBitlyGifUrl() {
    return bitlyGifUrl;
  }
  public void setBitlyGifUrl(String bitlyGifUrl) {
    this.bitlyGifUrl = bitlyGifUrl;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getSourceTld() {
    return sourceTld;
  }
  public void setSourceTld(String sourceTld) {
    this.sourceTld = sourceTld;
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
  public String getSourcePostUrl() {
    return sourcePostUrl;
  }
  public void setSourcePostUrl(String sourcePostUrl) {
    this.sourcePostUrl = sourcePostUrl;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getContentUrl() {
    return contentUrl;
  }
  public void setContentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public InlineResponse2002User getUser() {
    return user;
  }
  public void setUser(InlineResponse2002User user) {
    this.user = user;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getSlug() {
    return slug;
  }
  public void setSlug(String slug) {
    this.slug = slug;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002Data inlineResponse2002Data = (InlineResponse2002Data) o;
    return Objects.equals(importDatetime, inlineResponse2002Data.importDatetime) &&
        Objects.equals(images, inlineResponse2002Data.images) &&
        Objects.equals(embedUrl, inlineResponse2002Data.embedUrl) &&
        Objects.equals(trendingDatetime, inlineResponse2002Data.trendingDatetime) &&
        Objects.equals(bitlyUrl, inlineResponse2002Data.bitlyUrl) &&
        Objects.equals(rating, inlineResponse2002Data.rating) &&
        Objects.equals(source, inlineResponse2002Data.source) &&
        Objects.equals(type, inlineResponse2002Data.type) &&
        Objects.equals(bitlyGifUrl, inlineResponse2002Data.bitlyGifUrl) &&
        Objects.equals(sourceTld, inlineResponse2002Data.sourceTld) &&
        Objects.equals(url, inlineResponse2002Data.url) &&
        Objects.equals(sourcePostUrl, inlineResponse2002Data.sourcePostUrl) &&
        Objects.equals(contentUrl, inlineResponse2002Data.contentUrl) &&
        Objects.equals(id, inlineResponse2002Data.id) &&
        Objects.equals(user, inlineResponse2002Data.user) &&
        Objects.equals(slug, inlineResponse2002Data.slug) &&
        Objects.equals(username, inlineResponse2002Data.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importDatetime, images, embedUrl, trendingDatetime, bitlyUrl, rating, source, type, bitlyGifUrl, sourceTld, url, sourcePostUrl, contentUrl, id, user, slug, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002Data {\n");
    
    sb.append("    importDatetime: ").append(toIndentedString(importDatetime)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    embedUrl: ").append(toIndentedString(embedUrl)).append("\n");
    sb.append("    trendingDatetime: ").append(toIndentedString(trendingDatetime)).append("\n");
    sb.append("    bitlyUrl: ").append(toIndentedString(bitlyUrl)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    bitlyGifUrl: ").append(toIndentedString(bitlyGifUrl)).append("\n");
    sb.append("    sourceTld: ").append(toIndentedString(sourceTld)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    sourcePostUrl: ").append(toIndentedString(sourcePostUrl)).append("\n");
    sb.append("    contentUrl: ").append(toIndentedString(contentUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
