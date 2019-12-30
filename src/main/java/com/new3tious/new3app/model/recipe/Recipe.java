
package com.new3tious.new3app.model.recipe;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "uri",
    "label",
    "image",
    "source",
    "url",
    "shareAs",
    "yield",
    "dietLabels",
    "healthLabels",
    "cautions",
    "ingredientLines",
    "ingredients",
    "calories",
    "totalWeight",
    "totalTime",
    "totalNutrients",
    "totalDaily",
    "digest"
})
public class Recipe implements Serializable
{

    @JsonProperty("uri")
    private String uri;
    @JsonProperty("label")
    private String label;
    @JsonProperty("image")
    private String image;
    @JsonProperty("source")
    private String source;
    @JsonProperty("url")
    private String url;
    @JsonProperty("shareAs")
    private String shareAs;
    @JsonProperty("yield")
    private Integer yield;
    @JsonProperty("dietLabels")
    private List<String> dietLabels = null;
    @JsonProperty("healthLabels")
    private List<String> healthLabels = null;
    @JsonProperty("cautions")
    private List<Object> cautions = null;
    @JsonProperty("ingredientLines")
    private List<String> ingredientLines = null;
    @JsonProperty("ingredients")
    private List<Ingredient> ingredients = null;
    @JsonProperty("calories")
    private Double calories;
    @JsonProperty("totalWeight")
    private Double totalWeight;
    @JsonProperty("totalTime")
    private Integer totalTime;
    @JsonProperty("totalNutrients")
    private TotalNutrients totalNutrients;
    @JsonProperty("totalDaily")
    private TotalDaily totalDaily;
    @JsonProperty("digest")
    private List<Digest> digest = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 775982988702778709L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Recipe() {
    }

    /**
     * 
     * @param dietLabels
     * @param totalDaily
     * @param yield
     * @param cautions
     * @param ingredientLines
     * @param image
     * @param digest
     * @param label
     * @param uri
     * @param url
     * @param shareAs
     * @param ingredients
     * @param source
     * @param healthLabels
     * @param totalWeight
     * @param totalNutrients
     * @param calories
     * @param totalTime
     */
    public Recipe(String uri, String label, String image, String source, String url, String shareAs, Integer yield, List<String> dietLabels, List<String> healthLabels, List<Object> cautions, List<String> ingredientLines, List<Ingredient> ingredients, Double calories, Double totalWeight, Integer totalTime, TotalNutrients totalNutrients, TotalDaily totalDaily, List<Digest> digest) {
        super();
        this.uri = uri;
        this.label = label;
        this.image = image;
        this.source = source;
        this.url = url;
        this.shareAs = shareAs;
        this.yield = yield;
        this.dietLabels = dietLabels;
        this.healthLabels = healthLabels;
        this.cautions = cautions;
        this.ingredientLines = ingredientLines;
        this.ingredients = ingredients;
        this.calories = calories;
        this.totalWeight = totalWeight;
        this.totalTime = totalTime;
        this.totalNutrients = totalNutrients;
        this.totalDaily = totalDaily;
        this.digest = digest;
    }

    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    public Recipe withUri(String uri) {
        this.uri = uri;
        return this;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    public Recipe withLabel(String label) {
        this.label = label;
        return this;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    public Recipe withImage(String image) {
        this.image = image;
        return this;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    public Recipe withSource(String source) {
        this.source = source;
        return this;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public Recipe withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("shareAs")
    public String getShareAs() {
        return shareAs;
    }

    @JsonProperty("shareAs")
    public void setShareAs(String shareAs) {
        this.shareAs = shareAs;
    }

    public Recipe withShareAs(String shareAs) {
        this.shareAs = shareAs;
        return this;
    }

    @JsonProperty("yield")
    public Integer getYield() {
        return yield;
    }

    @JsonProperty("yield")
    public void setYield(Integer yield) {
        this.yield = yield;
    }

    public Recipe withYield(Integer yield) {
        this.yield = yield;
        return this;
    }

    @JsonProperty("dietLabels")
    public List<String> getDietLabels() {
        return dietLabels;
    }

    @JsonProperty("dietLabels")
    public void setDietLabels(List<String> dietLabels) {
        this.dietLabels = dietLabels;
    }

    public Recipe withDietLabels(List<String> dietLabels) {
        this.dietLabels = dietLabels;
        return this;
    }

    @JsonProperty("healthLabels")
    public List<String> getHealthLabels() {
        return healthLabels;
    }

    @JsonProperty("healthLabels")
    public void setHealthLabels(List<String> healthLabels) {
        this.healthLabels = healthLabels;
    }

    public Recipe withHealthLabels(List<String> healthLabels) {
        this.healthLabels = healthLabels;
        return this;
    }

    @JsonProperty("cautions")
    public List<Object> getCautions() {
        return cautions;
    }

    @JsonProperty("cautions")
    public void setCautions(List<Object> cautions) {
        this.cautions = cautions;
    }

    public Recipe withCautions(List<Object> cautions) {
        this.cautions = cautions;
        return this;
    }

    @JsonProperty("ingredientLines")
    public List<String> getIngredientLines() {
        return ingredientLines;
    }

    @JsonProperty("ingredientLines")
    public void setIngredientLines(List<String> ingredientLines) {
        this.ingredientLines = ingredientLines;
    }

    public Recipe withIngredientLines(List<String> ingredientLines) {
        this.ingredientLines = ingredientLines;
        return this;
    }

    @JsonProperty("ingredients")
    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    @JsonProperty("ingredients")
    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Recipe withIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
        return this;
    }

    @JsonProperty("calories")
    public Double getCalories() {
        return calories;
    }

    @JsonProperty("calories")
    public void setCalories(Double calories) {
        this.calories = calories;
    }

    public Recipe withCalories(Double calories) {
        this.calories = calories;
        return this;
    }

    @JsonProperty("totalWeight")
    public Double getTotalWeight() {
        return totalWeight;
    }

    @JsonProperty("totalWeight")
    public void setTotalWeight(Double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public Recipe withTotalWeight(Double totalWeight) {
        this.totalWeight = totalWeight;
        return this;
    }

    @JsonProperty("totalTime")
    public Integer getTotalTime() {
        return totalTime;
    }

    @JsonProperty("totalTime")
    public void setTotalTime(Integer totalTime) {
        this.totalTime = totalTime;
    }

    public Recipe withTotalTime(Integer totalTime) {
        this.totalTime = totalTime;
        return this;
    }

    @JsonProperty("totalNutrients")
    public TotalNutrients getTotalNutrients() {
        return totalNutrients;
    }

    @JsonProperty("totalNutrients")
    public void setTotalNutrients(TotalNutrients totalNutrients) {
        this.totalNutrients = totalNutrients;
    }

    public Recipe withTotalNutrients(TotalNutrients totalNutrients) {
        this.totalNutrients = totalNutrients;
        return this;
    }

    @JsonProperty("totalDaily")
    public TotalDaily getTotalDaily() {
        return totalDaily;
    }

    @JsonProperty("totalDaily")
    public void setTotalDaily(TotalDaily totalDaily) {
        this.totalDaily = totalDaily;
    }

    public Recipe withTotalDaily(TotalDaily totalDaily) {
        this.totalDaily = totalDaily;
        return this;
    }

    @JsonProperty("digest")
    public List<Digest> getDigest() {
        return digest;
    }

    @JsonProperty("digest")
    public void setDigest(List<Digest> digest) {
        this.digest = digest;
    }

    public Recipe withDigest(List<Digest> digest) {
        this.digest = digest;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Recipe withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("uri", uri).append("label", label).append("image", image).append("source", source).append("url", url).append("shareAs", shareAs).append("yield", yield).append("dietLabels", dietLabels).append("healthLabels", healthLabels).append("cautions", cautions).append("ingredientLines", ingredientLines).append("ingredients", ingredients).append("calories", calories).append("totalWeight", totalWeight).append("totalTime", totalTime).append("totalNutrients", totalNutrients).append("totalDaily", totalDaily).append("digest", digest).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dietLabels).append(totalDaily).append(yield).append(ingredientLines).append(cautions).append(image).append(digest).append(label).append(uri).append(url).append(shareAs).append(ingredients).append(healthLabels).append(source).append(additionalProperties).append(totalWeight).append(totalNutrients).append(calories).append(totalTime).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Recipe) == false) {
            return false;
        }
        Recipe rhs = ((Recipe) other);
        return new EqualsBuilder().append(dietLabels, rhs.dietLabels).append(totalDaily, rhs.totalDaily).append(yield, rhs.yield).append(ingredientLines, rhs.ingredientLines).append(cautions, rhs.cautions).append(image, rhs.image).append(digest, rhs.digest).append(label, rhs.label).append(uri, rhs.uri).append(url, rhs.url).append(shareAs, rhs.shareAs).append(ingredients, rhs.ingredients).append(healthLabels, rhs.healthLabels).append(source, rhs.source).append(additionalProperties, rhs.additionalProperties).append(totalWeight, rhs.totalWeight).append(totalNutrients, rhs.totalNutrients).append(calories, rhs.calories).append(totalTime, rhs.totalTime).isEquals();
    }

}
