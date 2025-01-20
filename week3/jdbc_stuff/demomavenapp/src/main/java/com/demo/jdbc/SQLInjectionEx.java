package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SQLInjectionEx {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter username");
        String username = scanner.next();
        System.out.println("enter password");
        String password = scanner.next();
        String query = "select * from tbluser where username=? and password = ?";
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/trainingdb",
                    "root", "root");
            stmt = conn.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                // Login Successful if match is found
                System.out.println("found it");
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (Exception e) {
            }
        }
    }
}
