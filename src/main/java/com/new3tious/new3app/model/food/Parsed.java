
package com.new3tious.new3app.model.food;

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
    "food"
})
public class Parsed implements Serializable
{

    @JsonProperty("food")
    private Food food;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7618016538996087287L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Parsed() {
    }

    /**
     * 
     * @param food
     */
    public Parsed(Food food) {
        super();
        this.food = food;
    }

    @JsonProperty("food")
    public Food getFood() {
        return food;
    }

    @JsonProperty("food")
    public void setFood(Food food) {
        this.food = food;
    }

    public Parsed withFood(Food food) {
        this.food = food;
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

    public Parsed withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("food", food).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(food).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Parsed) == false) {
            return false;
        }
        Parsed rhs = ((Parsed) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(food, rhs.food).isEquals();
    }

}
