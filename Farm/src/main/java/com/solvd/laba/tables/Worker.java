package com.solvd.laba.tables;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Worker {
    @JsonProperty
    private int id;
    @JsonProperty
    private String name;
    @JsonProperty
    private String last_name;
    @JsonProperty
    private String position;

    public Worker() {
    }

    public Worker(int id, String name, String last_name, String position) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.position = position;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", position=" + position +
                '}';
    }
}
