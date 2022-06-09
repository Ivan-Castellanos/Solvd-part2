package com.solvd.laba.mybatis;

import com.solvd.laba.dao.IAnimalDAO;
import com.solvd.laba.desingpatterns.MybatisFactory;
import com.solvd.laba.tables.Animal;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;

public class MybatisRunner {
    private static final Logger LOGGER = LogManager.getLogger();
    private static SqlSession factory = MybatisFactory.getSession();

    public static void main(String[] args) throws SQLException {
        IAnimalDAO animalmapper = factory.getMapper(IAnimalDAO.class);
        Animal animal = animalmapper.getEntityById(1);
    }
}
