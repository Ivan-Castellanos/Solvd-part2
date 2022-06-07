package com.solvd.laba.dao.jdbc.mysql.impo;

import com.solvd.laba.connection.ConnectionPool;
import com.solvd.laba.dao.IBreedDAO;
import com.solvd.laba.tables.Breed;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BreedDAO implements IBreedDAO {
    ConnectionPool conection = new ConnectionPool();

    @Override
    public Breed getEntityById(long id) {
        return null;
    }

    @Override
    public List<Breed> viewTable() throws SQLException {
        Connection c = conection.getConnection();
        List<Breed> breeds = new ArrayList<>();
        String query = "Select * from Breed";
        try (PreparedStatement ps = c.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Breed breed = new Breed(rs.getInt("id"));
                breeds.add(breed);
            }
        } catch (SQLException e) {
            throw new SQLException(e);
        }

        return breeds;
    }

    @Override
    public void saveEntity(Breed entity) {


    }

    @Override
    public void updateEntity(Breed entity) {

    }

    @Override
    public void removeEntity(long entity) {

    }

    @Override
    public Breed getBySpecie(long id) throws SQLException {
        return null;
    }
}
