package com.demo.jdbc;

import com.demo.factory.ConnectionFactory;

import java.sql.*;

public class B_HelloWorldWithFactory {

    public static void main(String[] args) {

        Connection connection=null;
        try {
             connection= ConnectionFactory.getConnection();
             PreparedStatement pstmt=connection.prepareStatement("select * from emp");
            ResultSet rs=pstmt.executeQuery();
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