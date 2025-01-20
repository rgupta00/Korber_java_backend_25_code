package com.demo.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//factory of connection
public class ConnectionFactory {
    private static Connection connection=null;

    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver is loaded");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        try {
            connection= DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/trainingdb",
                            "root","root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
