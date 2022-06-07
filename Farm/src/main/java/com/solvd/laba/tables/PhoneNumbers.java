package com.solvd.laba.tables;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "phoneNumbers")
@XmlType(propOrder = {"id", "number"})
public class PhoneNumbers {
    private int id;
    private int number;

    @XmlAttribute(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getNumber() {
        return number;
    }

    @XmlElement(name = "number")
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ": number=" + number;
    }
}
