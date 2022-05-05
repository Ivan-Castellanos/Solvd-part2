package com.solvd.laba.tables;

import java.util.List;

public class Building {
    private int id;
    private String name; //not null
    private int animal_capacity; //not null
    private int mt2;
    private String address;
    private int address_number;
    private String email;
    private List<PhoneNumbers> phoneNumbers;
    private City city;
    private BuildingType buildingType;

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

    public int getAnimal_capacity() {
        return animal_capacity;
    }

    public void setAnimal_capacity(int animal_capacity) {
        this.animal_capacity = animal_capacity;
    }

    public int getMt2() {
        return mt2;
    }

    public void setMt2(int mt2) {
        this.mt2 = mt2;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAddress_number() {
        return address_number;
    }

    public void setAddress_number(int address_number) {
        this.address_number = address_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<PhoneNumbers> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumbers> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public BuildingType getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(BuildingType buildingType) {
        this.buildingType = buildingType;
    }
}
