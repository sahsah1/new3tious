
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
    "text",
    "parsed",
    "hints",
    "_links"
})
public class FoodSearchResponse implements Serializable
{

    @JsonProperty("text")
    private String text;
    @JsonProperty("parsed")
    private List<Parsed> parsed = null;
    @JsonProperty("hints")
    private List<Hint> hints = null;
    @JsonProperty("_links")
    private Links links;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1538403103257460783L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FoodSearchResponse() {
    }

    /**
     * 
     * @param text
     * @param parsed
     * @param hints
     * @param links
     */
    public FoodSearchResponse(String text, List<Parsed> parsed, List<Hint> hints, Links links) {
        super();
        this.text = text;
        this.parsed = parsed;
        this.hints = hints;
        this.links = links;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    public FoodSearchResponse withText(String text) {
        this.text = text;
        return this;
    }

    @JsonProperty("parsed")
    public List<Parsed> getParsed() {
        return parsed;
    }

    @JsonProperty("parsed")
    public void setParsed(List<Parsed> parsed) {
        this.parsed = parsed;
    }

    public FoodSearchResponse withParsed(List<Parsed> parsed) {
        this.parsed = parsed;
        return this;
    }

    @JsonProperty("hints")
    public List<Hint> getHints() {
        return hints;
    }

    @JsonProperty("hints")
    public void setHints(List<Hint> hints) {
        this.hints = hints;
    }

    public FoodSearchResponse withHints(List<Hint> hints) {
        this.hints = hints;
        return this;
    }

    @JsonProperty("_links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("_links")
    public void setLinks(Links links) {
        this.links = links;
    }

    public FoodSearchResponse withLinks(Links links) {
        this.links = links;
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

    public FoodSearchResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("text", text).append("parsed", parsed).append("hints", hints).append("links", links).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(text).append(parsed).append(additionalProperties).append(hints).append(links).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FoodSearchResponse) == false) {
            return false;
        }
        FoodSearchResponse rhs = ((FoodSearchResponse) other);
        return new EqualsBuilder().append(text, rhs.text).append(parsed, rhs.parsed).append(additionalProperties, rhs.additionalProperties).append(hints, rhs.hints).append(links, rhs.links).isEquals();
    }

}
