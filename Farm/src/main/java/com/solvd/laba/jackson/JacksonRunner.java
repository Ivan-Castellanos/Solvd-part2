package com.solvd.laba.jackson;

import com.solvd.laba.tables.Worker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JacksonRunner {
    private static final Logger LOGGER = LogManager.getLogger(JacksonRunner.class);

    public static void main(String[] args) {
        Worker worker = JacksonHandler.readWorker();
        JacksonHandler.writeWorker(worker);
    }
}
