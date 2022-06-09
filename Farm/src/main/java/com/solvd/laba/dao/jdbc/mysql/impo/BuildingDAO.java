package com.solvd.laba.dao.jdbc.mysql.impo;

import com.solvd.laba.connection.ConnectionPool;
import com.solvd.laba.dao.IBuildingDAO;
import com.solvd.laba.tables.Building;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BuildingDAO implements IBuildingDAO {

    ConnectionPool connection = new ConnectionPool();

    @Override
    public Building getEntityById(long id) throws SQLException {
        Connection c = connection.getConnection();
        String query = "Select * from building WHERE id = ?";
        try (PreparedStatement ps = c.prepareStatement(query)) {
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return new Building(rs.getInt("id"), rs.getString("name"));
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    @Override
    public List<Building> viewTable() throws SQLException {
        Connection c = connection.getConnection();
        List<Building> buildings = new ArrayList<>();
        String query = "Select * from building";
        try (PreparedStatement ps = c.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Building building = new Building(rs.getInt("id"), rs.getString("name"));
                buildings.add(building);
            }
        } catch (SQLException e) {
            throw new SQLException(e);
        }
        return buildings;
    }

    @Override
    public void saveEntity(Building entity) throws SQLException {
        Connection c = connection.getConnection();
        String query = "INSERT INTO building (id, name, animal_capacity,mts2,address,address_number,email) VALUES (?,?,?,?,?,?,?)";
        try (PreparedStatement ps = c.prepareStatement(query)) {
            ps.setObject(1, entity.getId());
            ps.setObject(2, entity.getName());
            ps.setObject(3, entity.getAnimal_capacity());
            ps.setObject(4, entity.getMt2());
            ps.setObject(5, entity.getAddress());
            ps.setObject(6, entity.getAddress_number());
            ps.executeUpdate();
            System.out.println("Building: " + entity.getId() + " was saved in the database");
        } catch (SQLException e) {
            throw new SQLException(e);
        } finally {
            connection.releaseConnection(c);
        }
    }

    @Override
    public void updateEntity(Building entity) {

    }

    @Override
    public void removeEntity(long id) throws SQLException {
        Connection c = connection.getConnection();
        String query = "Delete from building where ID = ?";
        try (PreparedStatement ps = c.prepareStatement(query);) {
            ps.setLong(1, id);
            ps.executeUpdate();
            System.out.println("Building: " + id + " was deleted from the database");
        } catch (SQLException e) {
            throw new SQLException();
        } finally {
            connection.releaseConnection(c);
        }
    }

    @Override
    public Building getBuildingByAdress(String address) {
        return null;
    }
}
