
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
    "sane",
    "q",
    "app_key",
    "from",
    "to",
    "calories",
    "app_id"
})
public class Params implements Serializable
{

    @JsonProperty("sane")
    private List<Object> sane = null;
    @JsonProperty("q")
    private List<String> q = null;
    @JsonProperty("app_key")
    private List<String> appKey = null;
    @JsonProperty("from")
    private List<String> from = null;
    @JsonProperty("to")
    private List<String> to = null;
    @JsonProperty("calories")
    private List<String> calories = null;
    @JsonProperty("app_id")
    private List<String> appId = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1122518077734766105L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Params() {
    }

    /**
     * 
     * @param to
     * @param sane
     * @param appId
     * @param q
     * @param calories
     * @param from
     * @param appKey
     */
    public Params(List<Object> sane, List<String> q, List<String> appKey, List<String> from, List<String> to, List<String> calories, List<String> appId) {
        super();
        this.sane = sane;
        this.q = q;
        this.appKey = appKey;
        this.from = from;
        this.to = to;
        this.calories = calories;
        this.appId = appId;
    }

    @JsonProperty("sane")
    public List<Object> getSane() {
        return sane;
    }

    @JsonProperty("sane")
    public void setSane(List<Object> sane) {
        this.sane = sane;
    }

    public Params withSane(List<Object> sane) {
        this.sane = sane;
        return this;
    }

    @JsonProperty("q")
    public List<String> getQ() {
        return q;
    }

    @JsonProperty("q")
    public void setQ(List<String> q) {
        this.q = q;
    }

    public Params withQ(List<String> q) {
        this.q = q;
        return this;
    }

    @JsonProperty("app_key")
    public List<String> getAppKey() {
        return appKey;
    }

    @JsonProperty("app_key")
    public void setAppKey(List<String> appKey) {
        this.appKey = appKey;
    }

    public Params withAppKey(List<String> appKey) {
        this.appKey = appKey;
        return this;
    }

    @JsonProperty("from")
    public List<String> getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(List<String> from) {
        this.from = from;
    }

    public Params withFrom(List<String> from) {
        this.from = from;
        return this;
    }

    @JsonProperty("to")
    public List<String> getTo() {
        return to;
    }

    @JsonProperty("to")
    public void setTo(List<String> to) {
        this.to = to;
    }

    public Params withTo(List<String> to) {
        this.to = to;
        return this;
    }

    @JsonProperty("calories")
    public List<String> getCalories() {
        return calories;
    }

    @JsonProperty("calories")
    public void setCalories(List<String> calories) {
        this.calories = calories;
    }

    public Params withCalories(List<String> calories) {
        this.calories = calories;
        return this;
    }

    @JsonProperty("app_id")
    public List<String> getAppId() {
        return appId;
    }

    @JsonProperty("app_id")
    public void setAppId(List<String> appId) {
        this.appId = appId;
    }

    public Params withAppId(List<String> appId) {
        this.appId = appId;
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

    public Params withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sane", sane).append("q", q).append("appKey", appKey).append("from", from).append("to", to).append("calories", calories).append("appId", appId).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(to).append(sane).append(appId).append(additionalProperties).append(q).append(calories).append(from).append(appKey).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Params) == false) {
            return false;
        }
        Params rhs = ((Params) other);
        return new EqualsBuilder().append(to, rhs.to).append(sane, rhs.sane).append(appId, rhs.appId).append(additionalProperties, rhs.additionalProperties).append(q, rhs.q).append(calories, rhs.calories).append(from, rhs.from).append(appKey, rhs.appKey).isEquals();
    }

}
