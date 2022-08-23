package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static Connection conn;
    private static Util instance = null;

    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/testnew";
            String password = "12345678";
            String user = "root";
            conn = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static Util getInstance() {
        if (null == instance) {
            instance = new Util();
        }
        return instance;
    }
}
