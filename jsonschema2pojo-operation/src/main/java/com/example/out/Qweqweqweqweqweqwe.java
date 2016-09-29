
package com.example.out;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.example.oth.Custom;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "voo",
    "foo",
    "doo",
    "drink",
    "sub",
    "custom"
})
public class Qweqweqweqweqweqwe
    extends Water
    implements Serializable, Cloneable
{

    @JsonProperty("name")
    private Object name;
    @JsonProperty("voo")
    private Qweqweqweqweqweqwe.Voo voo;
    @JsonProperty("foo")
    private String foo;
    @JsonProperty("doo")
    private String doo;
    /**
     * 
     * Corresponds to the "drink" property.
     * 
     */
    @JsonProperty("drink")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    private Set<Water> water = new LinkedHashSet<Water>();
    @JsonProperty("sub")
    private List<Qweqweqweqweqweqwe> sub = new ArrayList<Qweqweqweqweqweqwe>();
    @JsonProperty("custom")
    private Custom custom;
    @JsonIgnore
    private Map<String, Double> additionalProperties = new HashMap<String, Double>();

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public Object getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(Object name) {
        this.name = name;
    }

    public Qweqweqweqweqweqwe withName(Object name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The voo
     */
    @JsonProperty("voo")
    public Qweqweqweqweqweqwe.Voo getVoo() {
        return voo;
    }

    /**
     * 
     * @param voo
     *     The voo
     */
    @JsonProperty("voo")
    public void setVoo(Qweqweqweqweqweqwe.Voo voo) {
        this.voo = voo;
    }

    public Qweqweqweqweqweqwe withVoo(Qweqweqweqweqweqwe.Voo voo) {
        this.voo = voo;
        return this;
    }

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

    public Qweqweqweqweqweqwe withFoo(String foo) {
        this.foo = foo;
        return this;
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

    public Qweqweqweqweqweqwe withDoo(String doo) {
        this.doo = doo;
        return this;
    }

    /**
     * 
     * Corresponds to the "drink" property.
     * 
     * @return
     *     The water
     */
    @JsonProperty("drink")
    public Set<Water> getWater() {
        return water;
    }

    /**
     * 
     * Corresponds to the "drink" property.
     * 
     * @param water
     *     The drink
     */
    @JsonProperty("drink")
    public void setWater(Set<Water> water) {
        this.water = water;
    }

    public Qweqweqweqweqweqwe withWater(Set<Water> water) {
        this.water = water;
        return this;
    }

    /**
     * 
     * @return
     *     The sub
     */
    @JsonProperty("sub")
    public List<Qweqweqweqweqweqwe> getSub() {
        return sub;
    }

    /**
     * 
     * @param sub
     *     The sub
     */
    @JsonProperty("sub")
    public void setSub(List<Qweqweqweqweqweqwe> sub) {
        this.sub = sub;
    }

    public Qweqweqweqweqweqwe withSub(List<Qweqweqweqweqweqwe> sub) {
        this.sub = sub;
        return this;
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

    public Qweqweqweqweqweqwe withCustom(Custom custom) {
        this.custom = custom;
        return this;
    }

    @Override
    public Qweqweqweqweqweqwe withTemperature(Double temperature) {
        super.withTemperature(temperature);
        return this;
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

    public Qweqweqweqweqweqwe withAdditionalProperty(String name, Double value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(name).append(voo).append(foo).append(doo).append(water).append(sub).append(custom).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Qweqweqweqweqweqwe) == false) {
            return false;
        }
        Qweqweqweqweqweqwe rhs = ((Qweqweqweqweqweqwe) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(name, rhs.name).append(voo, rhs.voo).append(foo, rhs.foo).append(doo, rhs.doo).append(water, rhs.water).append(sub, rhs.sub).append(custom, rhs.custom).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    public enum Voo {

        HIGH("H"),
        LOW("L");
        private final String value;
        private final static Map<String, Qweqweqweqweqweqwe.Voo> CONSTANTS = new HashMap<String, Qweqweqweqweqweqwe.Voo>();

        static {
            for (Qweqweqweqweqweqwe.Voo c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Voo(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Qweqweqweqweqweqwe.Voo fromValue(String value) {
            Qweqweqweqweqweqwe.Voo constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
