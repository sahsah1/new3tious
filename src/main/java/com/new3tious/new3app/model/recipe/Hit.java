
package com.new3tious.new3app.model.recipe;

import java.io.Serializable;
import java.util.HashMap;
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
    "recipe",
    "bookmarked",
    "bought"
})
public class Hit implements Serializable
{

    @JsonProperty("recipe")
    private Recipe recipe;
    @JsonProperty("bookmarked")
    private Boolean bookmarked;
    @JsonProperty("bought")
    private Boolean bought;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7510271202653504276L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Hit() {
    }

    /**
     * 
     * @param recipe
     * @param bought
     * @param bookmarked
     */
    public Hit(Recipe recipe, Boolean bookmarked, Boolean bought) {
        super();
        this.recipe = recipe;
        this.bookmarked = bookmarked;
        this.bought = bought;
    }

    @JsonProperty("recipe")
    public Recipe getRecipe() {
        return recipe;
    }

    @JsonProperty("recipe")
    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Hit withRecipe(Recipe recipe) {
        this.recipe = recipe;
        return this;
    }

    @JsonProperty("bookmarked")
    public Boolean getBookmarked() {
        return bookmarked;
    }

    @JsonProperty("bookmarked")
    public void setBookmarked(Boolean bookmarked) {
        this.bookmarked = bookmarked;
    }

    public Hit withBookmarked(Boolean bookmarked) {
        this.bookmarked = bookmarked;
        return this;
    }

    @JsonProperty("bought")
    public Boolean getBought() {
        return bought;
    }

    @JsonProperty("bought")
    public void setBought(Boolean bought) {
        this.bought = bought;
    }

    public Hit withBought(Boolean bought) {
        this.bought = bought;
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

    public Hit withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("recipe", recipe).append("bookmarked", bookmarked).append("bought", bought).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(recipe).append(additionalProperties).append(bought).append(bookmarked).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Hit) == false) {
            return false;
        }
        Hit rhs = ((Hit) other);
        return new EqualsBuilder().append(recipe, rhs.recipe).append(additionalProperties, rhs.additionalProperties).append(bought, rhs.bought).append(bookmarked, rhs.bookmarked).isEquals();
    }

}
