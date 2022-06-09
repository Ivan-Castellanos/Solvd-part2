package com.solvd.laba.desingpatterns;

import com.mysql.cj.xdevapi.SessionFactory;
import com.solvd.laba.dao.IBaseDAO;
import com.solvd.laba.dao.jdbc.mysql.impo.AnimalDAO;
import org.apache.ibatis.session.SqlSession;

public class MybatisFactory extends AbstractFactory {
    private static SessionFactory factory = new SessionFactory();
    private static SqlSession session;

    public static SqlSession getSession() {
        return session;
    }

    public IBaseDAO<?> getMapper(String mapper) {
        switch (mapper.toLowerCase()) {
            case "animal":
                AnimalDAO userMapper = session.getMapper(AnimalDAO.class);
                return userMapper;
        }
        return null;
    }
}