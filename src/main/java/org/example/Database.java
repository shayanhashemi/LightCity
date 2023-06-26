package org.example;

import org.example.models.User;
import javax.xml.crypto.Data;
import java.sql.*;

public class Database {

//    static final String JDBC_DRIVER = "com.h2.jdbc.Driver";
//    static final String StringJDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:h2:c:/data/Lightcity";
//    static final String DB_URL = "jdbc:mysql://localhost:3307/lightcity";

    // Database credentials
    static final String USER = "root";
    static final String PASS = "";


    private Connection conn;

    public Database() {
        try {
//            Class.forName(JDBC_DRIVER);
           Connection conn = DriverManager.getConnection( "jdbc:h2:c:/data/Lightcity", USER, PASS);
//           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/lightcity", USER, PASS);
            System.out.println("Connecting to database...");
//            createTables();
//            Statement stmt = conn.createStatement();
//            ResultSet userRS = stmt.executeQuery("SELECT * FROM users");
//
//            while (userRS.next()) {
//                String username = userRS.getString("username");
//                String pass = userRS.getString("password");
//                System.out.println(username);
//            }
//            userRS.close();
        } catch (Exception exp) {
            System.out.println("Database Exception : \n" + exp.toString());
            System.exit(0);
        }
    }
    //    Tables

    /**
     * Users
     */

    private void createTables() {
//        query example
        String query = "CREATE TABLE IF NOT EXISTS Users (username varchar(255) primary key ,password varchar(255));";
        try {
            Statement stmt = conn.createStatement();
           if(stmt.execute(query)){
               System.out.println("Table user created successfully");
           }else
               System.out.println("An error accord during operation");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public User loginGame(User user) {
        try {
            Statement stmt = conn.createStatement();
            String query = "";
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
//
                return user;
            }
        } catch (Exception exception) {
            return null;
        }
        return null;
    }

    public void registerGame(User user) {
        try {
            String query = "INSERT INTO Users (username, password) VALUES (?, ?);";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("User registered successfully");
            } else {
                System.out.println("Failed to register user");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
