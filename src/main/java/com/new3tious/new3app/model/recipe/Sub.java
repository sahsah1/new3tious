
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
    "tag",
    "schemaOrgTag",
    "total",
    "hasRDI",
    "daily",
    "unit"
})
public class Sub implements Serializable
{

    @JsonProperty("label")
    private String label;
    @JsonProperty("tag")
    private String tag;
    @JsonProperty("schemaOrgTag")
    private Object schemaOrgTag;
    @JsonProperty("total")
    private Integer total;
    @JsonProperty("hasRDI")
    private Boolean hasRDI;
    @JsonProperty("daily")
    private Integer daily;
    @JsonProperty("unit")
    private String unit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5003516953963451132L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sub() {
    }

    /**
     * 
     * @param total
     * @param unit
     * @param tag
     * @param schemaOrgTag
     * @param label
     * @param daily
     * @param hasRDI
     */
    public Sub(String label, String tag, Object schemaOrgTag, Integer total, Boolean hasRDI, Integer daily, String unit) {
        super();
        this.label = label;
        this.tag = tag;
        this.schemaOrgTag = schemaOrgTag;
        this.total = total;
        this.hasRDI = hasRDI;
        this.daily = daily;
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

    public Sub withLabel(String label) {
        this.label = label;
        return this;
    }

    @JsonProperty("tag")
    public String getTag() {
        return tag;
    }

    @JsonProperty("tag")
    public void setTag(String tag) {
        this.tag = tag;
    }

    public Sub withTag(String tag) {
        this.tag = tag;
        return this;
    }

    @JsonProperty("schemaOrgTag")
    public Object getSchemaOrgTag() {
        return schemaOrgTag;
    }

    @JsonProperty("schemaOrgTag")
    public void setSchemaOrgTag(Object schemaOrgTag) {
        this.schemaOrgTag = schemaOrgTag;
    }

    public Sub withSchemaOrgTag(Object schemaOrgTag) {
        this.schemaOrgTag = schemaOrgTag;
        return this;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    public Sub withTotal(Integer total) {
        this.total = total;
        return this;
    }

    @JsonProperty("hasRDI")
    public Boolean getHasRDI() {
        return hasRDI;
    }

    @JsonProperty("hasRDI")
    public void setHasRDI(Boolean hasRDI) {
        this.hasRDI = hasRDI;
    }

    public Sub withHasRDI(Boolean hasRDI) {
        this.hasRDI = hasRDI;
        return this;
    }

    @JsonProperty("daily")
    public Integer getDaily() {
        return daily;
    }

    @JsonProperty("daily")
    public void setDaily(Integer daily) {
        this.daily = daily;
    }

    public Sub withDaily(Integer daily) {
        this.daily = daily;
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

    public Sub withUnit(String unit) {
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

    public Sub withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("label", label).append("tag", tag).append("schemaOrgTag", schemaOrgTag).append("total", total).append("hasRDI", hasRDI).append("daily", daily).append("unit", unit).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(total).append(unit).append(additionalProperties).append(tag).append(schemaOrgTag).append(label).append(daily).append(hasRDI).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sub) == false) {
            return false;
        }
        Sub rhs = ((Sub) other);
        return new EqualsBuilder().append(total, rhs.total).append(unit, rhs.unit).append(additionalProperties, rhs.additionalProperties).append(tag, rhs.tag).append(schemaOrgTag, rhs.schemaOrgTag).append(label, rhs.label).append(daily, rhs.daily).append(hasRDI, rhs.hasRDI).isEquals();
    }

}
