package com.solvd.laba.tables;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "city")
public class City {
    @JsonProperty
    private int id;
    @JsonProperty
    private String name;

    public City(int id, String city_name) {

    }

    public City() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlElement(name = "city")
    public void setName(String name) {
        this.name = name;
    }
}
