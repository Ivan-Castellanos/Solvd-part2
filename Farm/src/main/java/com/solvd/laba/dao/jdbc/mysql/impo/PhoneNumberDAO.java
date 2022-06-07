package com.solvd.laba.dao.jdbc.mysql.impo;

import com.solvd.laba.dao.IPhoneNumberDAO;
import com.solvd.laba.tables.PhoneNumbers;

import java.util.List;

public class PhoneNumberDAO implements IPhoneNumberDAO {
    @Override
    public PhoneNumbers getEntityById(long id) {
        return null;
    }

    @Override
    public List<PhoneNumbers> viewTable() {
        return null;
    }

    @Override
    public void saveEntity(PhoneNumbers entity) {

    }

    @Override
    public void updateEntity(PhoneNumbers entity) {

    }

    @Override
    public void removeEntity(long entity) {

    }
}
