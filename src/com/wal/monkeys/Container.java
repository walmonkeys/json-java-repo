
package com.wal.monkeys;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_id",
    "name",
    "statuspage",
    "__v",
    "position",
    "location_geo",
    "location"
})
public class Container {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("statuspage")
    private String statuspage;
    @JsonProperty("__v")
    private Integer v;
    @JsonProperty("position")
    private Integer position;
    @JsonProperty("location_geo")
    private LocationGeo locationGeo;
    @JsonProperty("location")
    private Object location;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("statuspage")
    public String getStatuspage() {
        return statuspage;
    }

    @JsonProperty("statuspage")
    public void setStatuspage(String statuspage) {
        this.statuspage = statuspage;
    }

    @JsonProperty("__v")
    public Integer getV() {
        return v;
    }

    @JsonProperty("__v")
    public void setV(Integer v) {
        this.v = v;
    }

    @JsonProperty("position")
    public Integer getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(Integer position) {
        this.position = position;
    }

    @JsonProperty("location_geo")
    public LocationGeo getLocationGeo() {
        return locationGeo;
    }

    @JsonProperty("location_geo")
    public void setLocationGeo(LocationGeo locationGeo) {
        this.locationGeo = locationGeo;
    }

    @JsonProperty("location")
    public Object getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Object location) {
        this.location = location;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	@Override
	public String toString() {
		return "Container [id=" + id + ", name=" + name + ", statuspage=" + statuspage + ", v=" + v + ", position="
				+ position + ", locationGeo=" + locationGeo + ", location=" + location + ", additionalProperties="
				+ additionalProperties + "]";
	}

}
