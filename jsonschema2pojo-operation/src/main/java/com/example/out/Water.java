
package com.example.out;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "temperature"
})
public class Water {

    @JsonProperty("temperature")
    private Double temperature;

    /**
     * 
     * @return
     *     The temperature
     */
    @JsonProperty("temperature")
    public Double getTemperature() {
        return temperature;
    }

    /**
     * 
     * @param temperature
     *     The temperature
     */
    @JsonProperty("temperature")
    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Water withTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(temperature).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Water) == false) {
            return false;
        }
        Water rhs = ((Water) other);
        return new EqualsBuilder().append(temperature, rhs.temperature).isEquals();
    }

}
