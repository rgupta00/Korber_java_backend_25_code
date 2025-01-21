package com.demo.jdbc;

import com.demo.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J_FetchingPerformance {
    public static void main(String[] args) throws SQLException {

        long start=System.currentTimeMillis();
        Connection conn= ConnectionFactory.getConnection();
        PreparedStatement stmt = conn. prepareStatement("select * from mytemp");
        stmt.setFetchSize(2000);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            rs.getString(1);
        }
        long end=System.currentTimeMillis();
        System.out.println("time taken:"+ (end-start)+ " ms");
    }

}
