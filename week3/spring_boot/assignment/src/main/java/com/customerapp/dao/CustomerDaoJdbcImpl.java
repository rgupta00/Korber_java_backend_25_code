package com.customerapp.dao;

import com.customerapp.factory.ConnectionFactory;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class CustomerDaoJdbcImpl implements CustomerDao {

    private Connection connection;

    public CustomerDaoJdbcImpl() {

        connection= ConnectionFactory.getConnection();
    }

    @Override
    public List<Customer> allCust()  {
        System.out.println("-----------using jdbc------------");
        List<Customer> customer=new LinkedList<>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs=stmt.executeQuery("select * from customer");
            while (rs.next()){
                customer.add(new Customer(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("address"),
                        rs.getLong("phoneNumber")));
            };

        }

        catch (SQLException e) {
            throw new RuntimeException(e);// ex wrapping and rethrowing!
        }
        return customer;
    }

    @Override
    public Customer getCustById(int id) {
        Customer customer=null;
        try {
            PreparedStatement preparedStatement=connection
                    .prepareStatement("select * from customer where id=?");
            preparedStatement.setInt(1,id);

            ResultSet rs=preparedStatement.executeQuery();
            if (rs.next()){
                customer=new Customer(
                        rs.getInt("id"),
                        rs.getString("name"),
                                rs.getString("address"),
                                rs.getLong("phoneNumber"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return customer;
    }

    @Override
    public Customer addCust(Customer customer) {
        try {
            PreparedStatement prepareStatement =
                    connection.prepareStatement
                            ("insert into customer(name, address, phoneNumber) values(?,?,?)",
                                    Statement.RETURN_GENERATED_KEYS);
            prepareStatement.setString(1, customer.getName());
            prepareStatement.setString(2, customer.getAddress());
            prepareStatement.setLong(3, customer.getPhoneNumber());

            prepareStatement.executeUpdate();

            ResultSet rs = prepareStatement.getGeneratedKeys();
            if (rs.next()) {
                customer.setId(rs.getInt(1));
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return customer;
    }
}
