package com.empapp.repo.impl;

import com.empapp.factory.ConnectionFactory;
import com.empapp.repo.Employee;
import com.empapp.repo.EmployeeRepo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
//DAO= curd + conn
public class EmployeeRepoImpl implements EmployeeRepo {

    private Connection connection;
    public EmployeeRepoImpl(){
        connection= ConnectionFactory.getConnection();
    }
    @Override
    public List<Employee> getAll() {
        List<Employee> employees=new ArrayList<>();
        try {
            Statement stmt=connection.createStatement();
            ResultSet rs=stmt.executeQuery("select * from emp");
            while (rs.next()){
                employees
                        .add(new Employee(rs.getInt("id"),
                                rs.getString("name"),
                                rs.getInt("salary")));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employees;
    }

    @Override
    public Employee getById(int id) {
        Employee employee=null;
        try {
           PreparedStatement preparedStatement=connection
                    .prepareStatement("select * from emp where id=?");
            preparedStatement.setInt(1,4);

            ResultSet rs=preparedStatement.executeQuery();
            if (rs.next()){
               employee=new Employee(rs.getInt("id"),
                       rs.getString("name"),
                       rs.getInt("salary"));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employee;
    }
}
