package com.solvd.laba.dao;

import com.solvd.laba.tables.Building;

public interface IBuildingDAO extends IBaseDAO<Building> {

    Building getBuildingByAdress(String address);
}
