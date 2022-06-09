package com.solvd.laba.dao.jdbc.mysql.impo;

import com.solvd.laba.connection.ConnectionPool;
import com.solvd.laba.dao.ICityDAO;
import com.solvd.laba.tables.City;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CityDAO implements ICityDAO {
    ConnectionPool connection = new ConnectionPool();

    @Override
    public City getEntityById(long id) throws SQLException {
        Connection c = connection.getConnection();
        String query = "Select * from city WHERE id = ?";
        try (PreparedStatement ps = c.prepareStatement(query)) {
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return new City(rs.getInt("id"), rs.getString("city_name"));
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    @Override
    public List<City> viewTable() throws SQLException {
        Connection c = connection.getConnection();
        List<City> cities = new ArrayList<>();
        String query = "Select * from city";
        try (PreparedStatement ps = c.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                City city = new City(rs.getInt("id"), rs.getString("name"));
                cities.add(city);
            }
        } catch (SQLException e) {
            throw new SQLException(e);
        }
        return cities;
    }

    @Override
    public void saveEntity(City entity) throws SQLException {
        Connection c = connection.getConnection();
        String query = "INSERT INTO city (id, name) VALUES (?,?)";
        try (PreparedStatement ps = c.prepareStatement(query)) {
            ps.setObject(1, entity.getId());
            ps.setObject(2, entity.getName());
            ps.executeUpdate();
            System.out.println("City: " + entity.getName() + " was saved in the database");
        } catch (SQLException e) {
            throw new SQLException(e);
        } finally {
            connection.releaseConnection(c);
        }

    }

    @Override
    public void updateEntity(City entity) {

    }

    @Override
    public void removeEntity(long id) throws SQLException {
        Connection c = connection.getConnection();
        String query = "Delete from city where ID = ?";
        try (PreparedStatement ps = c.prepareStatement(query);) {
            ps.setLong(1, id);
            ps.executeUpdate();
            System.out.println("City: " + id + " was deleted from the database");
        } catch (SQLException e) {
            throw new SQLException();
        } finally {
            connection.releaseConnection(c);
        }
    }
}
