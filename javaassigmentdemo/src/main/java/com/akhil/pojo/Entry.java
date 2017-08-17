/**
 * 
 */
package com.akhil.pojo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"guid",
"updated",
"title",
"description",
"added",
"approved",
"credits",
"descriptionLocalized",
"displayGenre",
"editorialRating",
"imageMediaIds",
"isAdult",
"languages",
"longDescription",
"longDescriptionLocalized",
"programType",
"ratings",
"seriesEpisodeNumber",
"seriesId",
"shortDescription",
"shortDescriptionLocalized",
"tagIds",
"tags",
"thumbnails",
"titleLocalized",
"tvSeasonEpisodeNumber",
"tvSeasonId",
"tvSeasonNumber",
"year",
"media",
"peg$ExclusiveFrench",
"peg$arAgeRating",
"peg$arContentRating",
"peg$availableInSection",
"peg$contentClassification",
"peg$contractName",
"peg$countryOfOrigin",
"peg$priorityLevel",
"peg$priorityLevelActionandAdventure",
"peg$priorityLevelArabic",
"peg$priorityLevelChildrenandFamily",
"peg$priorityLevelComedy",
"peg$priorityLevelDisney",
"peg$priorityLevelDisneyKids",
"peg$priorityLevelDrama",
"peg$priorityLevelKids",
"peg$priorityLevelKidsAction",
"peg$priorityLevelKidsFunandAdventure",
"peg$priorityLevelKidsMagicandDreams",
"peg$priorityLevelKidsPreschool",
"peg$priorityLevelRomance",
"peg$priorityLevelThriller",
"peg$productCode",
"peg$programMediaAvailability",
"peg$testDefaultValue",
"peg$ISOcountryOfOrigin"
})

/**
 * @author ajay
 *
 */
public class Entry {
	@JsonProperty("id")
	private String id;
	@JsonProperty("guid")
	private String guid;
	@JsonProperty("updated")
	private Long updated;
	@JsonProperty("title")
	private String title;
	@JsonProperty("description")
	private Object description;
	@JsonProperty("added")
	private Long added;
	@JsonProperty("approved")
	private Boolean approved;
	@JsonProperty("credits")
	private List<Credit> credits = null;
	@JsonProperty("descriptionLocalized")
	private DescriptionLocalized descriptionLocalized;
	@JsonProperty("displayGenre")
	private Object displayGenre;
	@JsonProperty("editorialRating")
	private Object editorialRating;
	@JsonProperty("imageMediaIds")
	private List<ImageMediaId> imageMediaIds = null;
	@JsonProperty("isAdult")
	private Object isAdult;
	@JsonProperty("languages")
	private List<String> languages = null;
	@JsonProperty("longDescription")
	private String longDescription;
	@JsonProperty("longDescriptionLocalized")
	private LongDescriptionLocalized longDescriptionLocalized;
	@JsonProperty("programType")
	private String programType;
	@JsonProperty("ratings")
	private List<Object> ratings = null;
	@JsonProperty("seriesEpisodeNumber")
	private Object seriesEpisodeNumber;
	@JsonProperty("seriesId")
	private Object seriesId;
	@JsonProperty("shortDescription")
	private String shortDescription;
	@JsonProperty("shortDescriptionLocalized")
	private ShortDescriptionLocalized shortDescriptionLocalized;
	@JsonProperty("tagIds")
	private List<String> tagIds = null;
	@JsonProperty("tags")
	private List<Tag> tags = null;
	@JsonProperty("thumbnails")
	private Thumbnails thumbnails;
	@JsonProperty("titleLocalized")
	private TitleLocalized titleLocalized;
	@JsonProperty("tvSeasonEpisodeNumber")
	private Object tvSeasonEpisodeNumber;
	@JsonProperty("tvSeasonId")
	private Object tvSeasonId;
	@JsonProperty("tvSeasonNumber")
	private Object tvSeasonNumber;
	@JsonProperty("year")
	private Integer year;
	@JsonProperty("media")
	private List<Medium> media = null;
	@JsonProperty("peg$ExclusiveFrench")
	private String peg$ExclusiveFrench;
	@JsonProperty("peg$arAgeRating")
	private Integer peg$arAgeRating;
	@JsonProperty("peg$arContentRating")
	private String peg$arContentRating;
	@JsonProperty("peg$availableInSection")
	private String peg$availableInSection;
	@JsonProperty("peg$contentClassification")
	private String peg$contentClassification;
	@JsonProperty("peg$contractName")
	private String peg$contractName;
	@JsonProperty("peg$countryOfOrigin")
	private String peg$countryOfOrigin;
	@JsonProperty("peg$priorityLevel")
	private String peg$priorityLevel;
	@JsonProperty("peg$priorityLevelActionandAdventure")
	private String peg$priorityLevelActionandAdventure;
	@JsonProperty("peg$priorityLevelArabic")
	private String peg$priorityLevelArabic;
	@JsonProperty("peg$priorityLevelChildrenandFamily")
	private String peg$priorityLevelChildrenandFamily;
	@JsonProperty("peg$priorityLevelComedy")
	private String peg$priorityLevelComedy;
	@JsonProperty("peg$priorityLevelDisney")
	private String peg$priorityLevelDisney;
	@JsonProperty("peg$priorityLevelDisneyKids")
	private String peg$priorityLevelDisneyKids;
	@JsonProperty("peg$priorityLevelDrama")
	private String peg$priorityLevelDrama;
	@JsonProperty("peg$priorityLevelKids")
	private String peg$priorityLevelKids;
	@JsonProperty("peg$priorityLevelKidsAction")
	private String peg$priorityLevelKidsAction;
	@JsonProperty("peg$priorityLevelKidsFunandAdventure")
	private String peg$priorityLevelKidsFunandAdventure;
	@JsonProperty("peg$priorityLevelKidsMagicandDreams")
	private String peg$priorityLevelKidsMagicandDreams;
	@JsonProperty("peg$priorityLevelKidsPreschool")
	private String peg$priorityLevelKidsPreschool;
	@JsonProperty("peg$priorityLevelRomance")
	private String peg$priorityLevelRomance;
	@JsonProperty("peg$priorityLevelThriller")
	private String peg$priorityLevelThriller;
	@JsonProperty("peg$productCode")
	private String peg$productCode;
	@JsonProperty("peg$programMediaAvailability")
	private String peg$programMediaAvailability;
	@JsonProperty("peg$testDefaultValue")
	private String peg$testDefaultValue;
	@JsonProperty("peg$ISOcountryOfOrigin")
	private String peg$ISOcountryOfOrigin;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("id")
	public String getId() {
	return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
	this.id = id;
	}

	@JsonProperty("guid")
	public String getGuid() {
	return guid;
	}

	@JsonProperty("guid")
	public void setGuid(String guid) {
	this.guid = guid;
	}

	@JsonProperty("updated")
	public Long getUpdated() {
	return updated;
	}

	@JsonProperty("updated")
	public void setUpdated(Long updated) {
	this.updated = updated;
	}

	@JsonProperty("title")
	public String getTitle() {
	return title;
	}

	@JsonProperty("title")
	public void setTitle(String title) {
	this.title = title;
	}

	@JsonProperty("description")
	public Object getDescription() {
	return description;
	}

	@JsonProperty("description")
	public void setDescription(Object description) {
	this.description = description;
	}

	@JsonProperty("added")
	public Long getAdded() {
	return added;
	}

	@JsonProperty("added")
	public void setAdded(Long added) {
	this.added = added;
	}

	@JsonProperty("approved")
	public Boolean getApproved() {
	return approved;
	}

	@JsonProperty("approved")
	public void setApproved(Boolean approved) {
	this.approved = approved;
	}

	@JsonProperty("credits")
	public List<Credit> getCredits() {
	return credits;
	}

	@JsonProperty("credits")
	public void setCredits(List<Credit> credits) {
	this.credits = credits;
	}

	@JsonProperty("descriptionLocalized")
	public DescriptionLocalized getDescriptionLocalized() {
	return descriptionLocalized;
	}

	@JsonProperty("descriptionLocalized")
	public void setDescriptionLocalized(DescriptionLocalized descriptionLocalized) {
	this.descriptionLocalized = descriptionLocalized;
	}

	@JsonProperty("displayGenre")
	public Object getDisplayGenre() {
	return displayGenre;
	}

	@JsonProperty("displayGenre")
	public void setDisplayGenre(Object displayGenre) {
	this.displayGenre = displayGenre;
	}

	@JsonProperty("editorialRating")
	public Object getEditorialRating() {
	return editorialRating;
	}

	@JsonProperty("editorialRating")
	public void setEditorialRating(Object editorialRating) {
	this.editorialRating = editorialRating;
	}

	@JsonProperty("imageMediaIds")
	public List<ImageMediaId> getImageMediaIds() {
	return imageMediaIds;
	}

	@JsonProperty("imageMediaIds")
	public void setImageMediaIds(List<ImageMediaId> imageMediaIds) {
	this.imageMediaIds = imageMediaIds;
	}

	@JsonProperty("isAdult")
	public Object getIsAdult() {
	return isAdult;
	}

	@JsonProperty("isAdult")
	public void setIsAdult(Object isAdult) {
	this.isAdult = isAdult;
	}

	@JsonProperty("languages")
	public List<String> getLanguages() {
	return languages;
	}

	@JsonProperty("languages")
	public void setLanguages(List<String> languages) {
	this.languages = languages;
	}

	@JsonProperty("longDescription")
	public String getLongDescription() {
	return longDescription;
	}

	@JsonProperty("longDescription")
	public void setLongDescription(String longDescription) {
	this.longDescription = longDescription;
	}

	@JsonProperty("longDescriptionLocalized")
	public LongDescriptionLocalized getLongDescriptionLocalized() {
	return longDescriptionLocalized;
	}

	@JsonProperty("longDescriptionLocalized")
	public void setLongDescriptionLocalized(LongDescriptionLocalized longDescriptionLocalized) {
	this.longDescriptionLocalized = longDescriptionLocalized;
	}

	@JsonProperty("programType")
	public String getProgramType() {
	return programType;
	}

	@JsonProperty("programType")
	public void setProgramType(String programType) {
	this.programType = programType;
	}

	@JsonProperty("ratings")
	public List<Object> getRatings() {
	return ratings;
	}

	@JsonProperty("ratings")
	public void setRatings(List<Object> ratings) {
	this.ratings = ratings;
	}

	@JsonProperty("seriesEpisodeNumber")
	public Object getSeriesEpisodeNumber() {
	return seriesEpisodeNumber;
	}

	@JsonProperty("seriesEpisodeNumber")
	public void setSeriesEpisodeNumber(Object seriesEpisodeNumber) {
	this.seriesEpisodeNumber = seriesEpisodeNumber;
	}

	@JsonProperty("seriesId")
	public Object getSeriesId() {
	return seriesId;
	}

	@JsonProperty("seriesId")
	public void setSeriesId(Object seriesId) {
	this.seriesId = seriesId;
	}

	@JsonProperty("shortDescription")
	public String getShortDescription() {
	return shortDescription;
	}

	@JsonProperty("shortDescription")
	public void setShortDescription(String shortDescription) {
	this.shortDescription = shortDescription;
	}

	@JsonProperty("shortDescriptionLocalized")
	public ShortDescriptionLocalized getShortDescriptionLocalized() {
	return shortDescriptionLocalized;
	}

	@JsonProperty("shortDescriptionLocalized")
	public void setShortDescriptionLocalized(ShortDescriptionLocalized shortDescriptionLocalized) {
	this.shortDescriptionLocalized = shortDescriptionLocalized;
	}

	@JsonProperty("tagIds")
	public List<String> getTagIds() {
	return tagIds;
	}

	@JsonProperty("tagIds")
	public void setTagIds(List<String> tagIds) {
	this.tagIds = tagIds;
	}

	@JsonProperty("tags")
	public List<Tag> getTags() {
	return tags;
	}

	@JsonProperty("tags")
	public void setTags(List<Tag> tags) {
	this.tags = tags;
	}

	@JsonProperty("thumbnails")
	public Thumbnails getThumbnails() {
	return thumbnails;
	}

	@JsonProperty("thumbnails")
	public void setThumbnails(Thumbnails thumbnails) {
	this.thumbnails = thumbnails;
	}

	@JsonProperty("titleLocalized")
	public TitleLocalized getTitleLocalized() {
	return titleLocalized;
	}

	@JsonProperty("titleLocalized")
	public void setTitleLocalized(TitleLocalized titleLocalized) {
	this.titleLocalized = titleLocalized;
	}

	@JsonProperty("tvSeasonEpisodeNumber")
	public Object getTvSeasonEpisodeNumber() {
	return tvSeasonEpisodeNumber;
	}

	@JsonProperty("tvSeasonEpisodeNumber")
	public void setTvSeasonEpisodeNumber(Object tvSeasonEpisodeNumber) {
	this.tvSeasonEpisodeNumber = tvSeasonEpisodeNumber;
	}

	@JsonProperty("tvSeasonId")
	public Object getTvSeasonId() {
	return tvSeasonId;
	}

	@JsonProperty("tvSeasonId")
	public void setTvSeasonId(Object tvSeasonId) {
	this.tvSeasonId = tvSeasonId;
	}

	@JsonProperty("tvSeasonNumber")
	public Object getTvSeasonNumber() {
	return tvSeasonNumber;
	}

	@JsonProperty("tvSeasonNumber")
	public void setTvSeasonNumber(Object tvSeasonNumber) {
	this.tvSeasonNumber = tvSeasonNumber;
	}

	@JsonProperty("year")
	public Integer getYear() {
	return year;
	}

	@JsonProperty("year")
	public void setYear(Integer year) {
	this.year = year;
	}

	@JsonProperty("media")
	public List<Medium> getMedia() {
	return media;
	}

	@JsonProperty("media")
	public void setMedia(List<Medium> media) {
	this.media = media;
	}

	@JsonProperty("peg$ExclusiveFrench")
	public String getPeg$ExclusiveFrench() {
	return peg$ExclusiveFrench;
	}

	@JsonProperty("peg$ExclusiveFrench")
	public void setPeg$ExclusiveFrench(String peg$ExclusiveFrench) {
	this.peg$ExclusiveFrench = peg$ExclusiveFrench;
	}

	@JsonProperty("peg$arAgeRating")
	public Integer getPeg$arAgeRating() {
	return peg$arAgeRating;
	}

	@JsonProperty("peg$arAgeRating")
	public void setPeg$arAgeRating(Integer peg$arAgeRating) {
	this.peg$arAgeRating = peg$arAgeRating;
	}

	@JsonProperty("peg$arContentRating")
	public String getPeg$arContentRating() {
	return peg$arContentRating;
	}

	@JsonProperty("peg$arContentRating")
	public void setPeg$arContentRating(String peg$arContentRating) {
	this.peg$arContentRating = peg$arContentRating;
	}

	@JsonProperty("peg$availableInSection")
	public String getPeg$availableInSection() {
	return peg$availableInSection;
	}

	@JsonProperty("peg$availableInSection")
	public void setPeg$availableInSection(String peg$availableInSection) {
	this.peg$availableInSection = peg$availableInSection;
	}

	@JsonProperty("peg$contentClassification")
	public String getPeg$contentClassification() {
	return peg$contentClassification;
	}

	@JsonProperty("peg$contentClassification")
	public void setPeg$contentClassification(String peg$contentClassification) {
	this.peg$contentClassification = peg$contentClassification;
	}

	@JsonProperty("peg$contractName")
	public String getPeg$contractName() {
	return peg$contractName;
	}

	@JsonProperty("peg$contractName")
	public void setPeg$contractName(String peg$contractName) {
	this.peg$contractName = peg$contractName;
	}

	@JsonProperty("peg$countryOfOrigin")
	public String getPeg$countryOfOrigin() {
	return peg$countryOfOrigin;
	}

	@JsonProperty("peg$countryOfOrigin")
	public void setPeg$countryOfOrigin(String peg$countryOfOrigin) {
	this.peg$countryOfOrigin = peg$countryOfOrigin;
	}

	@JsonProperty("peg$priorityLevel")
	public String getPeg$priorityLevel() {
	return peg$priorityLevel;
	}

	@JsonProperty("peg$priorityLevel")
	public void setPeg$priorityLevel(String peg$priorityLevel) {
	this.peg$priorityLevel = peg$priorityLevel;
	}

	@JsonProperty("peg$priorityLevelActionandAdventure")
	public String getPeg$priorityLevelActionandAdventure() {
	return peg$priorityLevelActionandAdventure;
	}

	@JsonProperty("peg$priorityLevelActionandAdventure")
	public void setPeg$priorityLevelActionandAdventure(String peg$priorityLevelActionandAdventure) {
	this.peg$priorityLevelActionandAdventure = peg$priorityLevelActionandAdventure;
	}

	@JsonProperty("peg$priorityLevelArabic")
	public String getPeg$priorityLevelArabic() {
	return peg$priorityLevelArabic;
	}

	@JsonProperty("peg$priorityLevelArabic")
	public void setPeg$priorityLevelArabic(String peg$priorityLevelArabic) {
	this.peg$priorityLevelArabic = peg$priorityLevelArabic;
	}

	@JsonProperty("peg$priorityLevelChildrenandFamily")
	public String getPeg$priorityLevelChildrenandFamily() {
	return peg$priorityLevelChildrenandFamily;
	}

	@JsonProperty("peg$priorityLevelChildrenandFamily")
	public void setPeg$priorityLevelChildrenandFamily(String peg$priorityLevelChildrenandFamily) {
	this.peg$priorityLevelChildrenandFamily = peg$priorityLevelChildrenandFamily;
	}

	@JsonProperty("peg$priorityLevelComedy")
	public String getPeg$priorityLevelComedy() {
	return peg$priorityLevelComedy;
	}

	@JsonProperty("peg$priorityLevelComedy")
	public void setPeg$priorityLevelComedy(String peg$priorityLevelComedy) {
	this.peg$priorityLevelComedy = peg$priorityLevelComedy;
	}

	@JsonProperty("peg$priorityLevelDisney")
	public String getPeg$priorityLevelDisney() {
	return peg$priorityLevelDisney;
	}

	@JsonProperty("peg$priorityLevelDisney")
	public void setPeg$priorityLevelDisney(String peg$priorityLevelDisney) {
	this.peg$priorityLevelDisney = peg$priorityLevelDisney;
	}

	@JsonProperty("peg$priorityLevelDisneyKids")
	public String getPeg$priorityLevelDisneyKids() {
	return peg$priorityLevelDisneyKids;
	}

	@JsonProperty("peg$priorityLevelDisneyKids")
	public void setPeg$priorityLevelDisneyKids(String peg$priorityLevelDisneyKids) {
	this.peg$priorityLevelDisneyKids = peg$priorityLevelDisneyKids;
	}

	@JsonProperty("peg$priorityLevelDrama")
	public String getPeg$priorityLevelDrama() {
	return peg$priorityLevelDrama;
	}

	@JsonProperty("peg$priorityLevelDrama")
	public void setPeg$priorityLevelDrama(String peg$priorityLevelDrama) {
	this.peg$priorityLevelDrama = peg$priorityLevelDrama;
	}

	@JsonProperty("peg$priorityLevelKids")
	public String getPeg$priorityLevelKids() {
	return peg$priorityLevelKids;
	}

	@JsonProperty("peg$priorityLevelKids")
	public void setPeg$priorityLevelKids(String peg$priorityLevelKids) {
	this.peg$priorityLevelKids = peg$priorityLevelKids;
	}

	@JsonProperty("peg$priorityLevelKidsAction")
	public String getPeg$priorityLevelKidsAction() {
	return peg$priorityLevelKidsAction;
	}

	@JsonProperty("peg$priorityLevelKidsAction")
	public void setPeg$priorityLevelKidsAction(String peg$priorityLevelKidsAction) {
	this.peg$priorityLevelKidsAction = peg$priorityLevelKidsAction;
	}

	@JsonProperty("peg$priorityLevelKidsFunandAdventure")
	public String getPeg$priorityLevelKidsFunandAdventure() {
	return peg$priorityLevelKidsFunandAdventure;
	}

	@JsonProperty("peg$priorityLevelKidsFunandAdventure")
	public void setPeg$priorityLevelKidsFunandAdventure(String peg$priorityLevelKidsFunandAdventure) {
	this.peg$priorityLevelKidsFunandAdventure = peg$priorityLevelKidsFunandAdventure;
	}

	@JsonProperty("peg$priorityLevelKidsMagicandDreams")
	public String getPeg$priorityLevelKidsMagicandDreams() {
	return peg$priorityLevelKidsMagicandDreams;
	}

	@JsonProperty("peg$priorityLevelKidsMagicandDreams")
	public void setPeg$priorityLevelKidsMagicandDreams(String peg$priorityLevelKidsMagicandDreams) {
	this.peg$priorityLevelKidsMagicandDreams = peg$priorityLevelKidsMagicandDreams;
	}

	@JsonProperty("peg$priorityLevelKidsPreschool")
	public String getPeg$priorityLevelKidsPreschool() {
	return peg$priorityLevelKidsPreschool;
	}

	@JsonProperty("peg$priorityLevelKidsPreschool")
	public void setPeg$priorityLevelKidsPreschool(String peg$priorityLevelKidsPreschool) {
	this.peg$priorityLevelKidsPreschool = peg$priorityLevelKidsPreschool;
	}

	@JsonProperty("peg$priorityLevelRomance")
	public String getPeg$priorityLevelRomance() {
	return peg$priorityLevelRomance;
	}

	@JsonProperty("peg$priorityLevelRomance")
	public void setPeg$priorityLevelRomance(String peg$priorityLevelRomance) {
	this.peg$priorityLevelRomance = peg$priorityLevelRomance;
	}

	@JsonProperty("peg$priorityLevelThriller")
	public String getPeg$priorityLevelThriller() {
	return peg$priorityLevelThriller;
	}

	@JsonProperty("peg$priorityLevelThriller")
	public void setPeg$priorityLevelThriller(String peg$priorityLevelThriller) {
	this.peg$priorityLevelThriller = peg$priorityLevelThriller;
	}

	@JsonProperty("peg$productCode")
	public String getPeg$productCode() {
	return peg$productCode;
	}

	@JsonProperty("peg$productCode")
	public void setPeg$productCode(String peg$productCode) {
	this.peg$productCode = peg$productCode;
	}

	@JsonProperty("peg$programMediaAvailability")
	public String getPeg$programMediaAvailability() {
	return peg$programMediaAvailability;
	}

	@JsonProperty("peg$programMediaAvailability")
	public void setPeg$programMediaAvailability(String peg$programMediaAvailability) {
	this.peg$programMediaAvailability = peg$programMediaAvailability;
	}

	@JsonProperty("peg$testDefaultValue")
	public String getPeg$testDefaultValue() {
	return peg$testDefaultValue;
	}

	@JsonProperty("peg$testDefaultValue")
	public void setPeg$testDefaultValue(String peg$testDefaultValue) {
	this.peg$testDefaultValue = peg$testDefaultValue;
	}

	@JsonProperty("peg$ISOcountryOfOrigin")
	public String getPeg$ISOcountryOfOrigin() {
	return peg$ISOcountryOfOrigin;
	}

	@JsonProperty("peg$ISOcountryOfOrigin")
	public void setPeg$ISOcountryOfOrigin(String peg$ISOcountryOfOrigin) {
	this.peg$ISOcountryOfOrigin = peg$ISOcountryOfOrigin;
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
