package com.solvd.laba.dao;

import com.solvd.laba.tables.MeatCuts;

import java.sql.SQLException;

public interface IMeatCutsDAO extends IBaseDAO<MeatCuts> {

    MeatCuts getBySpecie(long id) throws SQLException;
}
