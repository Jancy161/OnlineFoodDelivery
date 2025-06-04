package com.examly.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/appdb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "examly";

    public static Connection getConnection() throws SQLException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        } catch(ClassNotFoundException e){
            throw new SQLException("Database driver not found", e);
        }
    }
}
