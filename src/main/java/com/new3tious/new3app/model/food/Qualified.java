
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
    "uri",
    "label"
})
public class Qualified implements Serializable
{

    @JsonProperty("uri")
    private String uri;
    @JsonProperty("label")
    private String label;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6886179315330686110L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Qualified() {
    }

    /**
     * 
     * @param label
     * @param uri
     */
    public Qualified(String uri, String label) {
        super();
        this.uri = uri;
        this.label = label;
    }

    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    public Qualified withUri(String uri) {
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

    public Qualified withLabel(String label) {
        this.label = label;
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

    public Qualified withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("uri", uri).append("label", label).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(label).append(uri).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Qualified) == false) {
            return false;
        }
        Qualified rhs = ((Qualified) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(label, rhs.label).append(uri, rhs.uri).isEquals();
    }

}
