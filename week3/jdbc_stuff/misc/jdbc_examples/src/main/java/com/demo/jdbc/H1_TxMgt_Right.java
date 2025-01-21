package com.demo.jdbc;

import com.demo.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class H1_TxMgt_Right {
    public static void main(String[] args) {

        Connection connection = ConnectionFactory.getConnection();

        try {
            connection = ConnectionFactory.getConnection();
            connection.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
            //by default jdbc is auto commit:
            connection.setAutoCommit(false);
            // what is default value of auto-commit : true , hibernate :false

            PreparedStatement pstmt = connection
                    .prepareStatement("update account set amount=amount-10 where id=?");
            pstmt.setInt(1, 1);
            pstmt.executeUpdate();

            pstmt = connection.prepareStatement("update acount set amount=amount+10 where id=?");
            pstmt.setInt(1, 2);
            pstmt.executeUpdate();

            connection.commit();

        } catch (SQLException e) {
            e.printStackTrace();
            if(connection!=null){
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }
}
