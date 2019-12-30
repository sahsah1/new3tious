
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
    "label",
    "quantity",
    "unit"
})
public class ZN implements Serializable
{

    @JsonProperty("label")
    private String label;
    @JsonProperty("quantity")
    private Double quantity;
    @JsonProperty("unit")
    private String unit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8483760387171367622L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ZN() {
    }

    /**
     * 
     * @param unit
     * @param quantity
     * @param label
     */
    public ZN(String label, Double quantity, String unit) {
        super();
        this.label = label;
        this.quantity = quantity;
        this.unit = unit;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    public ZN withLabel(String label) {
        this.label = label;
        return this;
    }

    @JsonProperty("quantity")
    public Double getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public ZN withQuantity(Double quantity) {
        this.quantity = quantity;
        return this;
    }

    @JsonProperty("unit")
    public String getUnit() {
        return unit;
    }

    @JsonProperty("unit")
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public ZN withUnit(String unit) {
        this.unit = unit;
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

    public ZN withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("label", label).append("quantity", quantity).append("unit", unit).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(unit).append(additionalProperties).append(quantity).append(label).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ZN) == false) {
            return false;
        }
        ZN rhs = ((ZN) other);
        return new EqualsBuilder().append(unit, rhs.unit).append(additionalProperties, rhs.additionalProperties).append(quantity, rhs.quantity).append(label, rhs.label).isEquals();
    }

}
