package com.solvd.laba.tables;

import java.util.List;

public class Position {
    private int id;
    private String position_name;
    private int pay_per_hour;
    private List<Worker> workersAssigned;

    public Position(int id, String position_name) {
        this.id = id;
        this.position_name = position_name;
    }

    public Position() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition_name() {
        return position_name;
    }

    public void setPosition_name(String position_name) {
        this.position_name = position_name;
    }

    public int getPay_per_hour() {
        return pay_per_hour;
    }

    public void setPay_per_hour(int pay_per_hour) {
        this.pay_per_hour = pay_per_hour;
    }

    public List<Worker> getWorkersAssigned() {
        return workersAssigned;
    }

    public void setWorkersAssigned(List<Worker> workersAssigned) {
        this.workersAssigned = workersAssigned;
    }
}
