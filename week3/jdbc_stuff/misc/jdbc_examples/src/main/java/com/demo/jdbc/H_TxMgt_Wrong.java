package com.demo.jdbc;

import com.demo.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class H_TxMgt_Wrong {
    public static void main(String[] args) {

        Connection connection = ConnectionFactory.getConnection();

        try {
            connection = ConnectionFactory.getConnection();
            //by default jdbc is auto commit:

            // what is default value of auto-commit : true , hibernate :false

            PreparedStatement pstmt = connection
                    .prepareStatement("update account set amount=amount-10 where id=?");
            pstmt.setInt(1, 1);
            pstmt.executeUpdate();

            pstmt = connection.prepareStatement("update acount set amount=amount+10 where id=?");
            pstmt.setInt(1, 2);
            pstmt.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
