/**
 * 
 */
package com.akhil.pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "mediaId", "isPrimary", "imageType" })
/**
 * @author ajay
 *
 */
public class ImageMediaId {

	@JsonProperty("mediaId")
	private String mediaId;
	@JsonProperty("isPrimary")
	private Boolean isPrimary;
	@JsonProperty("imageType")
	private String imageType;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("mediaId")
	public String getMediaId() {
		return mediaId;
	}

	@JsonProperty("mediaId")
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	@JsonProperty("isPrimary")
	public Boolean getIsPrimary() {
		return isPrimary;
	}

	@JsonProperty("isPrimary")
	public void setIsPrimary(Boolean isPrimary) {
		this.isPrimary = isPrimary;
	}

	@JsonProperty("imageType")
	public String getImageType() {
		return imageType;
	}

	@JsonProperty("imageType")
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
