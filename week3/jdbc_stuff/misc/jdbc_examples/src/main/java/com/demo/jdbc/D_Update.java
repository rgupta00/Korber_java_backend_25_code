package com.demo.jdbc;

import com.demo.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class D_Update {

    public static void main(String[] args) {

        Connection connection=null;
        try {
             connection= ConnectionFactory.getConnection();

            PreparedStatement preparedStatement=connection
                    .prepareStatement("update emp set salary=? where id=?");
            preparedStatement.setInt(1,120000);
            preparedStatement.setInt(2,7);

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