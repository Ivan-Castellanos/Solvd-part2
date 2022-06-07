package com.solvd.laba.dao.jdbc.mysql.impo;

import com.solvd.laba.dao.ITicketDAO;
import com.solvd.laba.tables.Ticket;

import java.util.List;

public class TicketDAO implements ITicketDAO {
    @Override
    public Ticket getEntityById(long id) {
        return null;
    }

    @Override
    public List<Ticket> viewTable() {
        return null;
    }

    @Override
    public void saveEntity(Ticket entity) {

    }

    @Override
    public void updateEntity(Ticket entity) {

    }

    @Override
    public void removeEntity(long entity) {

    }
}
