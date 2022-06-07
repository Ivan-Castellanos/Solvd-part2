package com.solvd.laba.dao;

import com.solvd.laba.tables.Animal;

import java.sql.SQLException;

public interface IAnimalDAO extends IBaseDAO<Animal> {

    Animal getByBreed(long id) throws SQLException;
}
