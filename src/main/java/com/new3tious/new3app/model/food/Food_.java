
package com.new3tious.new3app.model.food;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "foodId",
    "label",
    "nutrients",
    "category",
    "categoryLabel",
    "image",
    "brand",
    "foodContentsLabel"
})
public class Food_ implements Serializable
{

    @JsonProperty("foodId")
    private String foodId;
    @JsonProperty("label")
    private String label;
    @JsonProperty("nutrients")
    private Nutrients_ nutrients;
    @JsonProperty("category")
    private String category;
    @JsonProperty("categoryLabel")
    private String categoryLabel;
    @JsonProperty("image")
    private String image;
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("foodContentsLabel")
    private String foodContentsLabel;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5073607571680067207L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Food_() {
    }

    /**
     * 
     * @param nutrients
     * @param foodId
     * @param category
     * @param foodContentsLabel
     * @param categoryLabel
     * @param brand
     * @param image
     * @param label
     */
    public Food_(String foodId, String label, Nutrients_ nutrients, String category, String categoryLabel, String image, String brand, String foodContentsLabel) {
        super();
        this.foodId = foodId;
        this.label = label;
        this.nutrients = nutrients;
        this.category = category;
        this.categoryLabel = categoryLabel;
        this.image = image;
        this.brand = brand;
        this.foodContentsLabel = foodContentsLabel;
    }

    @JsonProperty("foodId")
    public String getFoodId() {
        return foodId;
    }

    @JsonProperty("foodId")
    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public Food_ withFoodId(String foodId) {
        this.foodId = foodId;
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

    public Food_ withLabel(String label) {
        this.label = label;
        return this;
    }

    @JsonProperty("nutrients")
    public Nutrients_ getNutrients() {
        return nutrients;
    }

    @JsonProperty("nutrients")
    public void setNutrients(Nutrients_ nutrients) {
        this.nutrients = nutrients;
    }

    public Food_ withNutrients(Nutrients_ nutrients) {
        this.nutrients = nutrients;
        return this;
    }

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    public Food_ withCategory(String category) {
        this.category = category;
        return this;
    }

    @JsonProperty("categoryLabel")
    public String getCategoryLabel() {
        return categoryLabel;
    }

    @JsonProperty("categoryLabel")
    public void setCategoryLabel(String categoryLabel) {
        this.categoryLabel = categoryLabel;
    }

    public Food_ withCategoryLabel(String categoryLabel) {
        this.categoryLabel = categoryLabel;
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

    public Food_ withImage(String image) {
        this.image = image;
        return this;
    }

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Food_ withBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @JsonProperty("foodContentsLabel")
    public String getFoodContentsLabel() {
        return foodContentsLabel;
    }

    @JsonProperty("foodContentsLabel")
    public void setFoodContentsLabel(String foodContentsLabel) {
        this.foodContentsLabel = foodContentsLabel;
    }

    public Food_ withFoodContentsLabel(String foodContentsLabel) {
        this.foodContentsLabel = foodContentsLabel;
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

    public Food_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("foodId", foodId).append("label", label).append("nutrients", nutrients).append("category", category).append("categoryLabel", categoryLabel).append("image", image).append("brand", brand).append("foodContentsLabel", foodContentsLabel).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nutrients).append(foodId).append(category).append(foodContentsLabel).append(additionalProperties).append(categoryLabel).append(brand).append(image).append(label).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Food_) == false) {
            return false;
        }
        Food_ rhs = ((Food_) other);
        return new EqualsBuilder().append(nutrients, rhs.nutrients).append(foodId, rhs.foodId).append(category, rhs.category).append(foodContentsLabel, rhs.foodContentsLabel).append(additionalProperties, rhs.additionalProperties).append(categoryLabel, rhs.categoryLabel).append(brand, rhs.brand).append(image, rhs.image).append(label, rhs.label).isEquals();
    }

}
