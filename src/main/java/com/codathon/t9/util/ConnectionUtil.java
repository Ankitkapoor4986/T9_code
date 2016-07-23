package com.codathon.t9.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by ankit on 23/7/16.
 */
public class ConnectionUtil {

    public static final String JDBC_MYSQL_LOCALHOST = "jdbc:mysql://localhost:3306/";
    public static final String ROOT_USERNAME_AND_PASSWORD = "root";
    public static final String T9_DB ="T9";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    JDBC_MYSQL_LOCALHOST.concat(T9_DB),
                    ROOT_USERNAME_AND_PASSWORD,
                    ROOT_USERNAME_AND_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
