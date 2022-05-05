package com.solvd.laba.tables;

public class HoursRegistered {
    private int id;
    private Worker worker;
    private Month month;
    private int year;
    private int hoursRegistered;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHoursRegistered() {
        return hoursRegistered;
    }

    public void setHoursRegistered(int hoursRegistered) {
        this.hoursRegistered = hoursRegistered;
    }
}
