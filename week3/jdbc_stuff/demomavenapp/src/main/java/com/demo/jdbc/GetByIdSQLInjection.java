package com.demo.jdbc;

import com.demo.factory.ConnectionFactory;

import java.sql.*;

public class GetByIdSQLInjection {

    public static void main(String[] args) {

        Connection connection=null;
        try {
             connection= ConnectionFactory.getConnection();
            Statement stmt=connection.createStatement();
//            String name="1=1";
//            ResultSet rs=stmt.executeQuery("select * from emp where name='"+name+"'");
//
            PreparedStatement preparedStatement=connection
                    .prepareStatement("select * from emp where name=?");
            preparedStatement.setString(1,"raj or 1=1");

            ResultSet rs=preparedStatement.executeQuery();
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