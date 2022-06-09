package com.solvd.laba.dao.jdbc.mysql.impo;

import com.solvd.laba.connection.ConnectionPool;
import com.solvd.laba.dao.IItemDAO;
import com.solvd.laba.tables.Item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemDAO implements IItemDAO {
    ConnectionPool connection = new ConnectionPool();

    @Override
    public Item getEntityById(long id) throws SQLException {
        Connection c = connection.getConnection();
        String query = "Select * from building WHERE id = ?";
        try (PreparedStatement ps = c.prepareStatement(query)) {
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return new Item(rs.getInt("id"), rs.getInt("kg"));
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    @Override
    public List<Item> viewTable() throws SQLException {
        Connection c = connection.getConnection();
        List<Item> items = new ArrayList<>();
        String query = "Select * from item";
        try (PreparedStatement ps = c.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Item item = new Item(rs.getInt("id"), rs.getInt("kg"));
                items.add(item);
            }
        } catch (SQLException e) {
            throw new SQLException(e);
        }
        return items;
    }

    @Override
    public void saveEntity(Item entity) {

    }

    @Override
    public void updateEntity(Item entity) {

    }

    @Override
    public void removeEntity(long id) throws SQLException {
        Connection c = connection.getConnection();
        String query = "Delete from item where ID = ?";
        try (PreparedStatement ps = c.prepareStatement(query);) {
            ps.setLong(1, id);
            ps.executeUpdate();
            System.out.println("Item: " + id + " was deleted from the database");
        } catch (SQLException e) {
            throw new SQLException();
        } finally {
            connection.releaseConnection(c);
        }
    }

    @Override
    public Item getByKg(int kg) {
        return null;
    }
}
