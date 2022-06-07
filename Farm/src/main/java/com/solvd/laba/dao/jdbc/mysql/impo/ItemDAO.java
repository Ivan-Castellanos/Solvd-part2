package com.solvd.laba.dao.jdbc.mysql.impo;

import com.solvd.laba.dao.IItemDAO;
import com.solvd.laba.tables.Item;

import java.util.List;

public class ItemDAO implements IItemDAO {
    @Override
    public Item getEntityById(long id) {
        return null;
    }

    @Override
    public List<Item> viewTable() {
        return null;
    }

    @Override
    public void saveEntity(Item entity) {

    }

    @Override
    public void updateEntity(Item entity) {

    }

    @Override
    public void removeEntity(long entity) {

    }

    @Override
    public Item getByKg(int kg) {
        return null;
    }
}
