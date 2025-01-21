package com.demo.jdbc;
import  java.sql.*;
public class A_HelloWorld {
    //hello world of jdbc, hard coding the properties
    // (change is the only constant in life)
    public static void main(String[] args) {
        //hello world of jdbc
        //load the driver
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver is loaded");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        //create the connection object
        Connection connection=null;
        try {
             connection=DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/trainingdb","root","root");
           //Statement vs prepareStatement(faster) vs callablestatement(store procedure)
            Statement stmt=connection.createStatement();
            ResultSet rs=stmt.executeQuery("select * from emp");
            while (rs.next()){
                System.out.println(rs.getInt("id")+" "+
                        rs.getString("name")+" "+rs.getInt("salary"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if (connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}