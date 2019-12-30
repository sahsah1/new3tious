
package com.new3tious.new3app.model.food;

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
    "qualified"
})
public class Measure implements Serializable
{

    @JsonProperty("uri")
    private String uri;
    @JsonProperty("label")
    private String label;
    @JsonProperty("qualified")
    private List<List<Qualified>> qualified = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7887707462704951985L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Measure() {
    }

    /**
     * 
     * @param label
     * @param uri
     * @param qualified
     */
    public Measure(String uri, String label, List<List<Qualified>> qualified) {
        super();
        this.uri = uri;
        this.label = label;
        this.qualified = qualified;
    }

    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    public Measure withUri(String uri) {
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

    public Measure withLabel(String label) {
        this.label = label;
        return this;
    }

    @JsonProperty("qualified")
    public List<List<Qualified>> getQualified() {
        return qualified;
    }

    @JsonProperty("qualified")
    public void setQualified(List<List<Qualified>> qualified) {
        this.qualified = qualified;
    }

    public Measure withQualified(List<List<Qualified>> qualified) {
        this.qualified = qualified;
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

    public Measure withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("uri", uri).append("label", label).append("qualified", qualified).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(label).append(uri).append(qualified).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Measure) == false) {
            return false;
        }
        Measure rhs = ((Measure) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(label, rhs.label).append(uri, rhs.uri).append(qualified, rhs.qualified).isEquals();
    }

}
