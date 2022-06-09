package com.solvd.laba.tables;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement(name = "building")
//@XmlType(propOrder = {"id", "name", "animal_capacity"})
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

    public Building(int id, String name, int animal_capacity, int mt2, String address, int address_number, String email, List<PhoneNumbers> phoneNumbers, City city, BuildingType buildingType) {
        this.id = id;
        this.name = name;
        this.animal_capacity = animal_capacity;
        this.mt2 = mt2;
        this.address = address;
        this.address_number = address_number;
        this.email = email;
        this.phoneNumbers = phoneNumbers;
        this.city = city;
        this.buildingType = buildingType;
    }

    public Building() {
    }

    public Building(int id, String name) {
    }


    public int getId() {
        return id;
    }

    @XmlAttribute(name = "id")
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlElement(name = "name")
    public void setName(String name) {
        this.name = name;
    }


    public int getAnimal_capacity() {
        return animal_capacity;
    }

    @XmlElement(name = "capacity")
    public void set2Animal_capacity(int animal_capacity) {
        this.animal_capacity = animal_capacity;
    }


    public int getMt2() {
        return mt2;
    }

    @XmlElement(name = "mts2")
    public void setMt2(int mt2) {
        this.mt2 = mt2;
    }


    public String getAddress() {
        return address;
    }

    @XmlElement(name = "address")
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

    @XmlElement(name = "email")
    public void setEmail(String email) {
        this.email = email;
    }


    public List<PhoneNumbers> getPhoneNumbers() {
        return phoneNumbers;
    }

    @XmlElementWrapper(name = "phoneNumbers")
    @XmlElement(name = "number")
    public void setPhoneNumbers(List<PhoneNumbers> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }


    public City getCity() {
        return city;
    }

    @XmlElement(name = "city")
    public void setCity(City city) {
        this.city = city;
    }


    public String getCityName() {
        return city.getName();
    }

    @XmlElement(name = "buildingType")
    public BuildingType getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(BuildingType buildingType) {
        this.buildingType = buildingType;
    }

    @Override
    public String toString() {
        return "Building{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", animal_capacity=" + animal_capacity +
                ", mt2=" + mt2 +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}
