package com.demo.jdbc;

import com.demo.factory.ConnectionFactory;

import java.sql.*;

public class C_Insert {

    public static void main(String[] args) {

        Connection connection=null;
        try {
             connection= ConnectionFactory.getConnection();
            PreparedStatement preparedStatement=connection
                    .prepareStatement("insert into emp(name, salary) values(?,?)");

            preparedStatement.setString(1,"umesh");
            preparedStatement.setInt(2,90000);

           int noOfRecordEffected= preparedStatement.executeUpdate();

            System.out.println(noOfRecordEffected);

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