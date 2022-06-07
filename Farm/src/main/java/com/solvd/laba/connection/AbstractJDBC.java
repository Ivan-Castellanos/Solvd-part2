package com.solvd.laba.connection;

import java.sql.SQLException;

public class AbstractJDBC {
    private static ConnectionPool cp;

    static {
        try {
            cp = ConnectionPool.getInstance();
        } catch (SQLException e) {
            e.getMessage();
        }
    }

    public static ConnectionPool getCp() {
        return cp;
    }

    public static void setCp(ConnectionPool Cp) {
        cp = Cp;
    }
}
