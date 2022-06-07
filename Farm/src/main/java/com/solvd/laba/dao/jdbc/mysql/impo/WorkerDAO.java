package com.solvd.laba.dao.jdbc.mysql.impo;

import com.solvd.laba.dao.IWorkerDAO;
import com.solvd.laba.tables.Worker;

import java.util.List;

public class WorkerDAO implements IWorkerDAO {
    @Override
    public Worker getEntityById(long id) {
        return null;
    }

    @Override
    public List<Worker> viewTable() {
        return null;
    }

    @Override
    public void saveEntity(Worker entity) {

    }

    @Override
    public void updateEntity(Worker entity) {

    }

    @Override
    public void removeEntity(long entity) {

    }
}
