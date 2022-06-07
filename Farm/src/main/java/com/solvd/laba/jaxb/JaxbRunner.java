package com.solvd.laba.jaxb;

import com.solvd.laba.tables.Building;
import jakarta.xml.bind.JAXBException;

import java.io.IOException;

public class JaxbRunner {
    public static void main(String[] args) throws JAXBException, IOException {
        Building building = JaxbHandler.unmarshalBuilding("src/main/resources/buildingdata.xml");

        System.out.println(building.toString());
    }
}
