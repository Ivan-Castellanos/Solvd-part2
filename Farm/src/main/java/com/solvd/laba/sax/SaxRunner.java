package com.solvd.laba.sax;

import com.solvd.laba.tables.Animal;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.util.ArrayList;

public class SaxRunner {
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            File file = new File("src/main/resources/animaldata.xml");
            AnimalSax animalSax = new AnimalSax();
            saxParser.parse(file, animalSax);
            ArrayList<Animal> animals = animalSax.getAnimals();

            for (Animal a : animals) {
                System.out.println(a);
            }
        } catch (Exception e) {
        }
    }
}
