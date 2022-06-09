package com.solvd.laba.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.laba.tables.City;
import com.solvd.laba.tables.Worker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class JacksonHandler {
    private static final Logger LOGGER = LogManager.getLogger(JacksonHandler.class);
    private static ObjectMapper objectMapper = new ObjectMapper();


    public static Worker readWorker() {
        File file = new File("src/main/resources/json/workerdata.json");
        Worker worker;

        try {
            worker = objectMapper.readValue(file, Worker.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        LOGGER.info(worker);
        return worker;
    }

    public static void writeWorker(Worker worker) {
        File file = new File("src/main/resources/json/jsonoutput.json");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            objectMapper.writeValue(file, worker);
        } catch (IOException e) {
            LOGGER.info(e.getMessage());
        }
    }

    public static City readCity() {
        File file = new File("src/main/resources/json/citydata.json");
        City city;

        try {
            city = objectMapper.readValue(file, City.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        LOGGER.info(city);
        return city;
    }

    public static void writeCity(City city) {
        File file = new File("src/main/resources/json/cityoutput.json");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            objectMapper.writeValue(file, city);
        } catch (IOException e) {
            LOGGER.info(e.getMessage());
        }
    }
}
