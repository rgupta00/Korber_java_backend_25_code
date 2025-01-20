package com.demo.jdbc;

import java.sql.*;
import java.util.Scanner;

public class SQLInjectionExStatement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter username");
        String username = scanner.next();
        System.out.println("enter password");
        String password = scanner.next();

        String query = "select * from tbluser where username='" + username + "' and password = '" + password + "'";
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/trainingdb",
                    "root", "root");
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                // Login Successful if match is found
                System.out.println("login is done");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                stmt.close();
                conn.close();
            } catch (Exception e) {
            }
        }
    }
}
