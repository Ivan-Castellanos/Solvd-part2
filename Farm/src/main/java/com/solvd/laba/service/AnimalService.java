package com.solvd.laba.service;

import com.solvd.laba.dao.IAnimalDAO;
import com.solvd.laba.dao.jdbc.mysql.impo.AnimalDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AnimalService {
    private final static Logger LOGGER = LogManager.getLogger(AnimalService.class);
    private final IAnimalDAO animalDAO = new AnimalDAO();
}
