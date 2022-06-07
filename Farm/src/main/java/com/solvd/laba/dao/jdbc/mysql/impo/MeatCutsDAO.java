package com.solvd.laba.dao.jdbc.mysql.impo;

import com.solvd.laba.dao.IMeatCutsDAO;
import com.solvd.laba.tables.MeatCuts;

import java.sql.SQLException;
import java.util.List;

public class MeatCutsDAO implements IMeatCutsDAO {
    @Override
    public MeatCuts getEntityById(long id) {
        return null;
    }

    @Override
    public List<MeatCuts> viewTable() {
        return null;
    }

    @Override
    public void saveEntity(MeatCuts entity) {

    }

    @Override
    public void updateEntity(MeatCuts entity) {

    }

    @Override
    public void removeEntity(long entity) {

    }

    @Override
    public MeatCuts getBySpecie(long id) throws SQLException {
        return null;
    }
}
