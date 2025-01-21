package com.demo.jdbc;

import com.demo.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class F_GetById {

    public static void main(String[] args) {

        Connection connection=null;
        try {
             connection= ConnectionFactory.getConnection();

            PreparedStatement preparedStatement=connection
                    .prepareStatement("select * from emp where id=?");
            preparedStatement.setInt(1,4);

            ResultSet rs=preparedStatement.executeQuery();
            if (rs.next()){
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