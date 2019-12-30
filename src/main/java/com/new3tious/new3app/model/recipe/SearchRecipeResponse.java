
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
    "q",
    "from",
    "to",
    "params",
    "more",
    "count",
    "hits"
})
public class SearchRecipeResponse implements Serializable
{

    @JsonProperty("q")
    private String q;
    @JsonProperty("from")
    private Integer from;
    @JsonProperty("to")
    private Integer to;
    @JsonProperty("params")
    private Params params;
    @JsonProperty("more")
    private Boolean more;
    @JsonProperty("count")
    private Integer count;
    @JsonProperty("hits")
    private List<Hit> hits = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6354255770502080299L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SearchRecipeResponse() {
    }

    /**
     * 
     * @param to
     * @param hits
     * @param more
     * @param count
     * @param q
     * @param params
     * @param from
     */
    public SearchRecipeResponse(String q, Integer from, Integer to, Params params, Boolean more, Integer count, List<Hit> hits) {
        super();
        this.q = q;
        this.from = from;
        this.to = to;
        this.params = params;
        this.more = more;
        this.count = count;
        this.hits = hits;
    }

    @JsonProperty("q")
    public String getQ() {
        return q;
    }

    @JsonProperty("q")
    public void setQ(String q) {
        this.q = q;
    }

    public SearchRecipeResponse withQ(String q) {
        this.q = q;
        return this;
    }

    @JsonProperty("from")
    public Integer getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(Integer from) {
        this.from = from;
    }

    public SearchRecipeResponse withFrom(Integer from) {
        this.from = from;
        return this;
    }

    @JsonProperty("to")
    public Integer getTo() {
        return to;
    }

    @JsonProperty("to")
    public void setTo(Integer to) {
        this.to = to;
    }

    public SearchRecipeResponse withTo(Integer to) {
        this.to = to;
        return this;
    }

    @JsonProperty("params")
    public Params getParams() {
        return params;
    }

    @JsonProperty("params")
    public void setParams(Params params) {
        this.params = params;
    }

    public SearchRecipeResponse withParams(Params params) {
        this.params = params;
        return this;
    }

    @JsonProperty("more")
    public Boolean getMore() {
        return more;
    }

    @JsonProperty("more")
    public void setMore(Boolean more) {
        this.more = more;
    }

    public SearchRecipeResponse withMore(Boolean more) {
        this.more = more;
        return this;
    }

    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    public SearchRecipeResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    @JsonProperty("hits")
    public List<Hit> getHits() {
        return hits;
    }

    @JsonProperty("hits")
    public void setHits(List<Hit> hits) {
        this.hits = hits;
    }

    public SearchRecipeResponse withHits(List<Hit> hits) {
        this.hits = hits;
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

    public SearchRecipeResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("q", q).append("from", from).append("to", to).append("params", params).append("more", more).append("count", count).append("hits", hits).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(to).append(hits).append(more).append(count).append(additionalProperties).append(q).append(params).append(from).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SearchRecipeResponse) == false) {
            return false;
        }
        SearchRecipeResponse rhs = ((SearchRecipeResponse) other);
        return new EqualsBuilder().append(to, rhs.to).append(hits, rhs.hits).append(more, rhs.more).append(count, rhs.count).append(additionalProperties, rhs.additionalProperties).append(q, rhs.q).append(params, rhs.params).append(from, rhs.from).isEquals();
    }

}
