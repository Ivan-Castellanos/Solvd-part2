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
    ConnectionPool connection = new ConnectionPool();

    @Override
    public Breed getEntityById(long id) throws SQLException {
        Connection c = connection.getConnection();
        String query = "Select * from breed WHERE id = ?";
        try (PreparedStatement ps = c.prepareStatement(query)) {
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return new Breed(rs.getInt("id"), rs.getInt("specie_id"), rs.getString("breed_name"));
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    @Override
    public List<Breed> viewTable() throws SQLException {
        Connection c = connection.getConnection();
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
    public void saveEntity(Breed entity) throws SQLException {
        Connection c = connection.getConnection();
        String query = "INSERT INTO breed (id, specie_id, breed_name) VALUES (?,?,?)";
        try (PreparedStatement ps = c.prepareStatement(query)) {
            ps.setObject(1, entity.getId());
            ps.setObject(2, entity.getSpecie().getId());
            ps.setObject(3, entity.getBreed_name());
            ps.executeUpdate();
            System.out.println("Breed: " + entity.getId() + " was saved in the database");
        } catch (SQLException e) {
            throw new SQLException(e);
        } finally {
            connection.releaseConnection(c);
        }

    }

    @Override
    public void updateEntity(Breed entity) {

    }

    @Override
    public void removeEntity(long id) throws SQLException {
        Connection c = connection.getConnection();
        String query = "Delete from breed where ID = ?";
        try (PreparedStatement ps = c.prepareStatement(query);) {
            ps.setLong(1, id);
            ps.executeUpdate();
            System.out.println("Breed: " + id + " was deleted from the database");
        } catch (SQLException e) {
            throw new SQLException();
        } finally {
            connection.releaseConnection(c);
        }
    }

    @Override
    public Breed getBySpecie(long id) throws SQLException {
        return null;
    }
}
