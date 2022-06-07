package com.solvd.laba.sax;

import com.solvd.laba.tables.*;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class AnimalSax extends DefaultHandler {
    private final ArrayList<Animal> animals = new ArrayList();
    private final StringBuilder buffer = new StringBuilder();
    private Animal animal;
    private Status status;
    private Breed breed;
    private Objective objective;
    private Building building;

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void startDocument() throws SAXException {
        super.startDocument();
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case "animal":
                animal = new Animal();
                status = new Status();
                breed = new Breed();
                objective = new Objective();
                building = new Building();
                animal.setId(Integer.parseInt(attributes.getValue("id")));
                break;
            case "status":
            case "breed":
            case "objective":
            case "building":
            case "age":
            case "weight":
                buffer.delete(0, buffer.length());
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            case "animal":
                animal.setStatus(status);
                animal.setBreed(breed);
                animal.setObjective(objective);
                animal.setBuilding(building);
                animals.add(animal);
                break;
            case "status":
                status.setStatus_name(buffer.toString());
                break;
            case "breed":
                breed.setBreed_name(buffer.toString());
                break;
            case "objective":
                objective.setObjective(buffer.toString());
                break;
            case "building":
                building.setName(buffer.toString());
                break;
            case "age":
                animal.setAge(Integer.parseInt(buffer.toString()));
                break;
            case "weight":
                animal.setWeight(Integer.parseInt(buffer.toString()));
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        buffer.append(ch, start, length);
    }
}
