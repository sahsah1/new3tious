
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
    "label",
    "tag",
    "schemaOrgTag",
    "total",
    "hasRDI",
    "daily",
    "unit",
    "sub"
})
public class Digest implements Serializable
{

    @JsonProperty("label")
    private String label;
    @JsonProperty("tag")
    private String tag;
    @JsonProperty("schemaOrgTag")
    private Object schemaOrgTag;
    @JsonProperty("total")
    private Double total;
    @JsonProperty("hasRDI")
    private Boolean hasRDI;
    @JsonProperty("daily")
    private Double daily;
    @JsonProperty("unit")
    private String unit;
    @JsonProperty("sub")
    private List<Sub> sub = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2815531370993639995L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Digest() {
    }

    /**
     * 
     * @param total
     * @param unit
     * @param sub
     * @param tag
     * @param schemaOrgTag
     * @param label
     * @param daily
     * @param hasRDI
     */
    public Digest(String label, String tag, Object schemaOrgTag, Double total, Boolean hasRDI, Double daily, String unit, List<Sub> sub) {
        super();
        this.label = label;
        this.tag = tag;
        this.schemaOrgTag = schemaOrgTag;
        this.total = total;
        this.hasRDI = hasRDI;
        this.daily = daily;
        this.unit = unit;
        this.sub = sub;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    public Digest withLabel(String label) {
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

    public Digest withTag(String tag) {
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

    public Digest withSchemaOrgTag(Object schemaOrgTag) {
        this.schemaOrgTag = schemaOrgTag;
        return this;
    }

    @JsonProperty("total")
    public Double getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Double total) {
        this.total = total;
    }

    public Digest withTotal(Double total) {
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

    public Digest withHasRDI(Boolean hasRDI) {
        this.hasRDI = hasRDI;
        return this;
    }

    @JsonProperty("daily")
    public Double getDaily() {
        return daily;
    }

    @JsonProperty("daily")
    public void setDaily(Double daily) {
        this.daily = daily;
    }

    public Digest withDaily(Double daily) {
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

    public Digest withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    @JsonProperty("sub")
    public List<Sub> getSub() {
        return sub;
    }

    @JsonProperty("sub")
    public void setSub(List<Sub> sub) {
        this.sub = sub;
    }

    public Digest withSub(List<Sub> sub) {
        this.sub = sub;
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

    public Digest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("label", label).append("tag", tag).append("schemaOrgTag", schemaOrgTag).append("total", total).append("hasRDI", hasRDI).append("daily", daily).append("unit", unit).append("sub", sub).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(total).append(unit).append(sub).append(additionalProperties).append(tag).append(schemaOrgTag).append(label).append(daily).append(hasRDI).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Digest) == false) {
            return false;
        }
        Digest rhs = ((Digest) other);
        return new EqualsBuilder().append(total, rhs.total).append(unit, rhs.unit).append(sub, rhs.sub).append(additionalProperties, rhs.additionalProperties).append(tag, rhs.tag).append(schemaOrgTag, rhs.schemaOrgTag).append(label, rhs.label).append(daily, rhs.daily).append(hasRDI, rhs.hasRDI).isEquals();
    }

}
