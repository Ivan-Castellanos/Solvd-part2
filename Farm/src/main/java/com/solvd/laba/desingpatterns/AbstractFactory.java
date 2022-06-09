package com.solvd.laba.desingpatterns;

public class AbstractFactory {
    private static DaoFactory daoFactory = new DaoFactory();
    private static MybatisFactory myBatisFactory = new MybatisFactory();

    public static Object getFactory(String factory) {
        switch (factory.toLowerCase()) {
            case "dao":
                return daoFactory;
            case "mybatis":
                return myBatisFactory;
        }

        return null;
    }
}