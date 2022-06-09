package com.solvd.laba.desingpatterns;

import com.solvd.laba.dao.IBaseDAO;
import com.solvd.laba.dao.jdbc.mysql.impo.*;
import com.solvd.laba.tables.*;

public class DaoFactory extends AbstractFactory {
    public static IBaseDAO<?> getDao(String dao) {
        switch (dao.toLowerCase()) {
            case "animal":
                IBaseDAO<Animal> animalDAO = new AnimalDAO();
                return animalDAO;
            case "breed":
                IBaseDAO<Breed> breedDAO = new BreedDAO();
                return breedDAO;
            case "building":
                IBaseDAO<Building> buildingDAO = new BuildingDAO();
                return buildingDAO;
            case "city":
                IBaseDAO<City> cityDAO = new CityDAO();
                return cityDAO;
            case "item":
                IBaseDAO<Item> itemDAO = new ItemDAO();
                return itemDAO;
            case "meatcuts":
                IBaseDAO<MeatCuts> meatCutsDAO = new MeatCutsDAO();
                return meatCutsDAO;
        }
        return null;
    }
}
