package com.demo.jdbc;

import com.demo.factory.ConnectionFactory;

import java.sql.*;

public class K_MetaDataEx {

    public static void main(String[] args) {

        Connection connection=null;
        try {
             connection= ConnectionFactory.getConnection();
             PreparedStatement pstmt=connection.prepareStatement("select * from emp");


            ResultSet rs=pstmt.executeQuery();
            ResultSetMetaData rsMeta=rs.getMetaData();
            System.out.println("No of column:"+rsMeta.getColumnCount());


            DatabaseMetaData dbmd=connection.getMetaData();

            System.out.println("Driver Name: "+dbmd.getDriverName());
            System.out.println("Driver Version: "+dbmd.getDriverVersion());
            System.out.println("UserName: "+dbmd.getUserName());
            System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());
            System.out.println
                    ("Database Product Version: "+dbmd.getDatabaseProductVersion());

            for(int i=1;i<=rsMeta.getColumnCount();i++){
                System.out.println(rsMeta.getColumnClassName(i)+": "+rsMeta.getColumnName(i));
            }

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