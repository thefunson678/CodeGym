package com.example.finaltest.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseRepositoryConnectDB {
    private static final String jdbcUrl = "jdbc:mysql://localhost:3306/products";
    private static final String username = "root";
    private static final String password = "12345";
    private static Connection connection;

    public BaseRepositoryConnectDB() {
    }

    public static Connection getConnectToJavaDB(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(jdbcUrl,username,password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
