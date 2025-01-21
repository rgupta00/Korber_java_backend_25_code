package com.demo.jdbc;

import com.demo.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class I_BulkInsertion {
    public static void main(String[] args) {
        Connection connection=null;
       try{
            connection = ConnectionFactory.getConnection();
           PreparedStatement pstmt = connection
                   .prepareStatement("insert into mytemp(name) values (?)");

           connection.setAutoCommit(false);

           for (long i = 0; i < 10000; i++) {
               pstmt.setString(1, "foo:" + i);
               pstmt.addBatch();
               if (i % 200 == 0) {
                   pstmt.executeBatch();
               }
           }
           connection.commit();
       }catch (SQLException e){
           try {
               connection.rollback();
           } catch (SQLException ex) {
               throw new RuntimeException(ex);
           }
       }


        //if something bad happens:


    }
}
