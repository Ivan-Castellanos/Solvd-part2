package com.solvd.laba.dao;

import java.sql.SQLException;
import java.util.List;

public interface IBaseDAO<T> {
    T getEntityById(long id) throws SQLException;

    List<T> viewTable() throws SQLException;

    void saveEntity(T entity) throws SQLException;

    void updateEntity(T entity) throws SQLException;

    void removeEntity(long id) throws SQLException;
}
