package com.solvd.laba.dao.jdbc.mysql.impo;

import com.solvd.laba.connection.ConnectionPool;
import com.solvd.laba.dao.IAnimalDAO;
import com.solvd.laba.tables.Animal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AnimalDAO implements IAnimalDAO {
    ConnectionPool connection = new ConnectionPool();


    @Override
    public Animal getEntityById(long id) throws SQLException {
        return null;
    }

    @Override
    public List<Animal> viewTable() throws SQLException {
        Connection c = connection.getConnection();
        List<Animal> animals = new ArrayList<>();
        String query = "Select * from Animal";
        try (PreparedStatement ps = c.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Animal animal = new Animal(rs.getInt("id"), rs.getInt("age"), rs.getInt("weight"));
                animals.add(animal);
            }
        } catch (SQLException e) {
            throw new SQLException(e);
        }
        return animals;
    }

    @Override
    public void saveEntity(Animal entity) throws SQLException {
        Connection c = connection.getConnection();
        String query = "INSERT INTO Animal (status, breed, building, objective, age, weight) VALUES (?,?,?,?,?,?)";
        try (PreparedStatement ps = c.prepareStatement(query)) {
            ps.setObject(1, entity.getStatus());
            ps.setObject(2, entity.getBreed());
            ps.setObject(3, entity.getBuilding());
            ps.setObject(4, entity.getObjective());
            ps.setInt(5, entity.getAge());
            ps.setInt(6, entity.getWeight());
            ps.executeUpdate();
            System.out.println("Animal: " + entity.getId() + " was saved in the database");
        } catch (SQLException e) {
            throw new SQLException(e);
        } finally {
            connection.releaseConnection(c);
        }
    }

    @Override
    public void updateEntity(Animal entity) {

    }

    @Override
    public void removeEntity(long entity) {

    }

    @Override
    public Animal getByBreed(long id) throws SQLException {
        Connection c = connection.getConnection();
        String query = "Select * from Animal join Breed on Animal.breed_id = Breed_id where Animal.id=?";
        try (PreparedStatement ps = c.prepareStatement(query)) {
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return new Animal(rs.getInt("ID"), rs.getInt("breed"));
        } catch (SQLException e) {
            throw new SQLException();
        } finally {
            connection.releaseConnection(c);
        }
    }
}