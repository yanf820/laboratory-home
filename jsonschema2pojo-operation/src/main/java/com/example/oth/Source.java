
package com.example.oth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "foo",
    "doo",
    "drink",
    "sub",
    "custom"
})
public class Source
    extends SourceParent
{

    @JsonProperty("foo")
    private String foo;
    @JsonProperty("doo")
    private String doo;
    @JsonProperty("drink")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    private Set<SourceParent> drink = new LinkedHashSet<SourceParent>();
    @JsonProperty("sub")
    private List<Source> sub = new ArrayList<Source>();
    @JsonProperty("custom")
    private Custom custom;
    @JsonIgnore
    private Map<String, Double> additionalProperties = new HashMap<String, Double>();

    /**
     * 
     * @return
     *     The foo
     */
    @JsonProperty("foo")
    public String getFoo() {
        return foo;
    }

    /**
     * 
     * @param foo
     *     The foo
     */
    @JsonProperty("foo")
    public void setFoo(String foo) {
        this.foo = foo;
    }

    /**
     * 
     * @return
     *     The doo
     */
    @JsonProperty("doo")
    public String getDoo() {
        return doo;
    }

    /**
     * 
     * @param doo
     *     The doo
     */
    @JsonProperty("doo")
    public void setDoo(String doo) {
        this.doo = doo;
    }

    /**
     * 
     * @return
     *     The drink
     */
    @JsonProperty("drink")
    public Set<SourceParent> getDrink() {
        return drink;
    }

    /**
     * 
     * @param drink
     *     The drink
     */
    @JsonProperty("drink")
    public void setDrink(Set<SourceParent> drink) {
        this.drink = drink;
    }

    /**
     * 
     * @return
     *     The sub
     */
    @JsonProperty("sub")
    public List<Source> getSub() {
        return sub;
    }

    /**
     * 
     * @param sub
     *     The sub
     */
    @JsonProperty("sub")
    public void setSub(List<Source> sub) {
        this.sub = sub;
    }

    /**
     * 
     * @return
     *     The custom
     */
    @JsonProperty("custom")
    public Custom getCustom() {
        return custom;
    }

    /**
     * 
     * @param custom
     *     The custom
     */
    @JsonProperty("custom")
    public void setCustom(Custom custom) {
        this.custom = custom;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Double> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Double value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(foo).append(doo).append(drink).append(sub).append(custom).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Source) == false) {
            return false;
        }
        Source rhs = ((Source) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(foo, rhs.foo).append(doo, rhs.doo).append(drink, rhs.drink).append(sub, rhs.sub).append(custom, rhs.custom).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
