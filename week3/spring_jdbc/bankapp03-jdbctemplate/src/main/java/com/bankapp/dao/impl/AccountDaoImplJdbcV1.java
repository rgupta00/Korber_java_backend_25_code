//package com.bankapp.dao.impl;
//
//import com.bankapp.dao.Account;
//import com.bankapp.dao.AccountDao;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Repository;
//
//import javax.sql.DataSource;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.LinkedList;
//import java.util.List;
//
//@Repository(value = "jdbcAccountDao")
//public class AccountDaoImplJdbcV1 implements AccountDao {
//
//    private DataSource dataSource;
//
//    @Autowired
//    public AccountDaoImplJdbcV1(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }
//
//    @Override
//    public Account getById(int id) {
//       Account account=null;
//        Connection connection=null;
//        try{
//            connection=dataSource.getConnection();
//            PreparedStatement pstmt=connection.prepareStatement("select * from account where id=?");
//            pstmt.setInt(1, id);
//            ResultSet rs=pstmt.executeQuery();
//            if (rs.next()){
//               account= new Account(
//                        rs.getInt(1),
//                        rs.getString(2),
//                        rs.getDouble(3));
//            }
//
//        }catch (SQLException e){
//            e.printStackTrace();
//        }finally {
//            if(connection!=null){
//                try {
//                    connection.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return account;
//    }
//
//    @Override
//    public List<Account> getAllAccounts() {
//        List<Account> accounts=new LinkedList<>();
//        Connection connection=null;
//        try{
//             connection=dataSource.getConnection();
//            PreparedStatement pstmt=connection.prepareStatement("select * from account");
//            ResultSet rs=pstmt.executeQuery();
//            while (rs.next()){
//                accounts.add(new Account(
//                        rs.getInt(1),
//                        rs.getString(2),
//                        rs.getDouble(3)));}
//
//        }catch (SQLException e){
//            e.printStackTrace();
//        }finally {
//            if(connection!=null){
//                try {
//                    connection.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return accounts;
//    }
//
//    @Override
//    public void update(Account account) {
//        Connection connection=null;
//        try{
//            connection=dataSource.getConnection();
//            PreparedStatement pstmt=connection.prepareStatement
//                    ("update account set balance=? where id=?");
//
//            pstmt.setDouble(1, account.getBalance());
//            pstmt.setInt(2, account.getId());
//            pstmt.executeUpdate();
//
//
//        }catch (SQLException e){
//            e.printStackTrace();
//        }finally {
//            if(connection!=null){
//                try {
//                    connection.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//
//    @Override
//    public void delete(int id) {
//        Connection connection=null;
//        try{
//            connection=dataSource.getConnection();
//            PreparedStatement pstmt=connection.prepareStatement("delete from account where id=?");
//            pstmt.setInt(1, id);
//           pstmt.executeUpdate();
//
//
//        }catch (SQLException e){
//            e.printStackTrace();
//        }finally {
//            if(connection!=null){
//                try {
//                    connection.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//
//    @Override
//    public void addAccount(Account account) {
//        Connection connection=null;
//        try{
//            connection=dataSource.getConnection();
//            PreparedStatement pstmt=connection.prepareStatement
//                    ("insert into account(name,balance) values(?,?)");
//            pstmt.setString(1, account.getName());
//            pstmt.setDouble(2, account.getBalance());
//            pstmt.executeUpdate();
//
//
//        }catch (SQLException e){
//            e.printStackTrace();
//        }finally {
//            if(connection!=null){
//                try {
//                    connection.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//}
