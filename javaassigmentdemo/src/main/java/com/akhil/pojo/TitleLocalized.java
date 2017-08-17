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
@JsonPropertyOrder({
"ar",
"en"
})

/**
 * @author ajay
 *
 */
public class TitleLocalized {
	@JsonProperty("ar")
	private String ar;
	@JsonProperty("en")
	private String en;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("ar")
	public String getAr() {
	return ar;
	}

	@JsonProperty("ar")
	public void setAr(String ar) {
	this.ar = ar;
	}

	@JsonProperty("en")
	public String getEn() {
	return en;
	}

	@JsonProperty("en")
	public void setEn(String en) {
	this.en = en;
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
