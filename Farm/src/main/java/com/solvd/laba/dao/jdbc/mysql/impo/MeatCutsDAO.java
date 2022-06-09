package com.solvd.laba.dao.jdbc.mysql.impo;

import com.solvd.laba.connection.ConnectionPool;
import com.solvd.laba.dao.IMeatCutsDAO;
import com.solvd.laba.tables.MeatCuts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MeatCutsDAO implements IMeatCutsDAO {
    ConnectionPool connection = new ConnectionPool();

    @Override
    public MeatCuts getEntityById(long id) throws SQLException {
        Connection c = connection.getConnection();
        String query = "Select * from meat_cut WHERE id = ?";
        try (PreparedStatement ps = c.prepareStatement(query)) {
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return new MeatCuts(rs.getInt("id"), rs.getInt("specie_id"), rs.getString("cut_name"), rs.getInt("price_per_kg"));
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    @Override
    public List<MeatCuts> viewTable() throws SQLException {
        Connection c = connection.getConnection();
        List<MeatCuts> meat_cuts = new ArrayList<>();
        String query = "Select * from meat_cuts";
        try (PreparedStatement ps = c.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MeatCuts meat_cut = new MeatCuts(rs.getInt("id"), rs.getInt("specie_id"), rs.getString("cut_name"), rs.getInt("price_per_kg"));
                meat_cuts.add(meat_cut);
            }
        } catch (SQLException e) {
            throw new SQLException(e);
        }
        return meat_cuts;
    }

    @Override
    public void saveEntity(MeatCuts entity) {

    }

    @Override
    public void updateEntity(MeatCuts entity) {

    }

    @Override
    public void removeEntity(long id) throws SQLException {
        Connection c = connection.getConnection();
        String query = "Delete from meat_cut where ID = ?";
        try (PreparedStatement ps = c.prepareStatement(query);) {
            ps.setLong(1, id);
            ps.executeUpdate();
            System.out.println("Meat cut: " + id + " was deleted from the database");
        } catch (SQLException e) {
            throw new SQLException();
        } finally {
            connection.releaseConnection(c);
        }
    }

    @Override
    public MeatCuts getBySpecie(long id) throws SQLException {
        return null;
    }
}
