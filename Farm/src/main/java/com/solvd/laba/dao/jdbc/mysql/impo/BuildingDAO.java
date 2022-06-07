package com.solvd.laba.dao.jdbc.mysql.impo;

import com.solvd.laba.dao.IBuildingDAO;
import com.solvd.laba.tables.Building;

import java.util.List;

public class BuildingDAO implements IBuildingDAO {

    @Override
    public Building getEntityById(long id) {
        return null;
    }

    @Override
    public List<Building> viewTable() {
        return null;
    }

    @Override
    public void saveEntity(Building entity) {

    }

    @Override
    public void updateEntity(Building entity) {

    }

    @Override
    public void removeEntity(long entity) {

    }

    @Override
    public Building getBuildingByAdress(String address) {
        return null;
    }
}
