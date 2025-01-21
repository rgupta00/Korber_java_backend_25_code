package com.empapp.dao.impl;

import com.empapp.dao.Employee;
import com.empapp.dao.EmployeeDao;
import com.empapp.exceptions.DaoException;
import com.empapp.exceptions.HIbernateException;
import com.empapp.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class EmployeeDaoHibImpl implements EmployeeDao {
    private Connection connection;

    public EmployeeDaoHibImpl() {
        connection= ConnectionFactory.getConnection();
    }
    @Override
    public List<Employee> allEmp() {
        System.out.println("-----------using hibernate------------");
        List<Employee> employees=new LinkedList<>();
        try {
           if(1==1){
               throw  new HIbernateException("some hib ex");
           }
        } catch (HIbernateException e) {
            throw new DaoException("some dao ex while using hibernate", e);
        }
        return employees;
    }

    @Override
    public Employee getEmpById(int id) {
        Employee employee=null;
        try {
            PreparedStatement preparedStatement=connection
                    .prepareStatement("select * from emp where id=?");
            preparedStatement.setInt(1,id);

            ResultSet rs=preparedStatement.executeQuery();
            if (rs.next()){
                employee=new Employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("salary")) ;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employee;
    }

    @Override
    public Employee addEmp(Employee employee) {
        try {
            PreparedStatement preparedStatement=connection
                    .prepareStatement("insert into emp(name, salary) values(?,?)");

            preparedStatement.setString(1,employee.getName());
            preparedStatement.setInt(2,employee.getSalary());

           preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employee;
    }

    @Override
    public void updateEmp(int id, Employee employee) {
        try {
           PreparedStatement preparedStatement=connection
                    .prepareStatement("update emp set salary=? where id=?");
            preparedStatement.setInt(1,employee.getSalary());
            preparedStatement.setInt(2,id);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteEmp(int id) {
        try {
            PreparedStatement preparedStatement=connection
                    .prepareStatement("delete from emp where id=?");
            preparedStatement.setInt(1,id);

           preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
