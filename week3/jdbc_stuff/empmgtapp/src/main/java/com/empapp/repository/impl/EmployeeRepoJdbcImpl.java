package com.empapp.repository.impl;

import com.empapp.factory.ConnectionFactory;
import com.empapp.repository.Employee;
import com.empapp.repository.EmployeeRepo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
//DAO= crud op+ connection object
public class EmployeeRepoJdbcImpl implements EmployeeRepo {

    private Connection connection;

    public EmployeeRepoJdbcImpl() {
        this.connection = ConnectionFactory.getConnection();
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> employees=new ArrayList<>();
        try {
            connection= ConnectionFactory.getConnection();
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
        }finally {
            if (connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return employees;
    }

    @Override
    public Employee findById(int id) {
        Employee employee=null;
        try {
            connection= ConnectionFactory.getConnection();

            PreparedStatement preparedStatement=connection
                    .prepareStatement("select * from emp where id=?");
            preparedStatement.setInt(1,id);

            ResultSet rs=preparedStatement.executeQuery();
            if (rs.next()){
                employee=new Employee(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("salary"));
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
        return employee;
    }

    @Override
    public Employee save(Employee employee) {
        try {
            connection= ConnectionFactory.getConnection();
            PreparedStatement preparedStatement=connection
                    .prepareStatement("insert into emp(name, salary) values(?,?)");

            preparedStatement.setString(1,employee.getName());
            preparedStatement.setInt(2,employee.getSalary());
             preparedStatement.executeUpdate();
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
        return employee;
    }

    @Override
    public void deleteById(int id) {
        try {
            connection= ConnectionFactory.getConnection();

            PreparedStatement preparedStatement=connection
                    .prepareStatement("delete from emp where id=?");
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();

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

    @Override
    public void update(int id, Employee employee) {
        try {
            connection= ConnectionFactory.getConnection();

            PreparedStatement preparedStatement=connection
                    .prepareStatement("update emp set salary=? where id=?");
            preparedStatement.setInt(1,employee.getSalary());
            preparedStatement.setInt(2,id);

            int noOfRecordEffected= preparedStatement.executeUpdate();

            System.out.println(noOfRecordEffected);

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
