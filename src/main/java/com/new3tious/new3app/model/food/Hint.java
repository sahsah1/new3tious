
package com.new3tious.new3app.model.food;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "food",
        "measures"
})
public class Hint implements Serializable {

    @JsonProperty("food")
    private Food food;
    @JsonProperty("measures")
    private List<Measure> measures = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -160585472110842918L;

    /**
     * No args constructor for use in serialization
     */
    public Hint() {
    }

    /**
     * @param food
     * @param measures
     */
    public Hint(Food food, List<Measure> measures) {
        super();
        this.food = food;
        this.measures = measures;
    }

    @JsonProperty("food")
    public Food getFood() {
        return food;
    }

    @JsonProperty("food")
    public void setFood(Food food) {
        this.food = food;
    }

    public Hint withFood(Food food) {
        this.food = food;
        return this;
    }

    @JsonProperty("measures")
    public List<Measure> getMeasures() {
        return measures;
    }

    @JsonProperty("measures")
    public void setMeasures(List<Measure> measures) {
        this.measures = measures;
    }

    public Hint withMeasures(List<Measure> measures) {
        this.measures = measures;
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

    public Hint withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("food", food).append("measures", measures).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(food).append(measures).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Hint) == false) {
            return false;
        }
        Hint rhs = ((Hint) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(food, rhs.food).append(measures, rhs.measures).isEquals();
    }

    public static boolean isRichFood(Hint hint) {

        if (hint.getFood() != null && hint.getFood().getNutrients() != null && hint.getFood().getNutrients().getFAT() != null &&
                hint.getFood().getNutrients() != null && hint.getFood().getNutrients().getENERCKCAL() != null) {
            return hint.getFood().getNutrients().getFAT() / hint.getFood().getNutrients().getENERCKCAL() < 0.10;
        }

        return false;

    }
}
