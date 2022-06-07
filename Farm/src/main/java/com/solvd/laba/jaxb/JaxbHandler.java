package com.solvd.laba.jaxb;

import com.solvd.laba.tables.Building;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JaxbHandler {

    public static Building unmarshalBuilding(String path) throws JAXBException, IOException {
        JAXBContext cont = JAXBContext.newInstance(Building.class);
        Unmarshaller unmarshaller = cont.createUnmarshaller();
        return (Building) unmarshaller.unmarshal(new FileReader(path));
    }

    public static void marshallBuilding(Building building) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Building.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(building, new File("src/main/resources/jaxboutput.xml"));
    }

}
