package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private final String url = "jdbc:mysql://localhost:3306/testnew";
    private final String user = "root";
    private final String password = "12345678";
    private  Connection connection;

    public  Connection getConnection() {
        try {
            connection = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}

