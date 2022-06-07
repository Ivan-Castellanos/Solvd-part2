package com.solvd.laba.dao;

import com.solvd.laba.tables.Breed;

import java.sql.SQLException;

public interface IBreedDAO extends IBaseDAO<Breed> {

    Breed getBySpecie(long id) throws SQLException;
}
