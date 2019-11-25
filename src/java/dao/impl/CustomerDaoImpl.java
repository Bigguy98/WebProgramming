/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.CustomerDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;
import jdbc.JDBCConnection;
/**
 *
 * @author hoaiphat
 */
public class CustomerDaoImpl extends JDBCConnection implements CustomerDAO{

    public CustomerDaoImpl() {
        super();
    }
    
    
    

    @Override
    public int create(Customer customer) {       
        try {
            String Sql="INSERT INTO customer(name,age,address,username,password)"
                + "VALUES(?,?,?,?,?)";
            
            PreparedStatement statement= conn.prepareStatement(Sql, Statement.RETURN_GENERATED_KEYS);
            
            statement.setString(1, customer.getName());
            statement.setInt(2, customer.getAge());
            statement.setString(3, customer.getAddress());
            statement.setString(4, customer.getUsername());
            statement.setString(5, customer.getPassword());
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
            if(rs.next()){
                return rs.getInt(1);            
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }     
        return 0;
    }

    @Override
    public void edit(Customer customer) {
   
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer getCustomer(int customerId) {
        try {
            String sql = "select * from customer where id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, customerId);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String address = rs.getString("address");
                Integer age = rs.getInt("age");
                Customer c = new Customer(id, name, age, address, username, password);
                return c;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return null;
    }

    @Override
    public Customer getByUserName(String keyword) {
        try {
            String sql = "select * from customer where username = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, keyword);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String address = rs.getString("address");
                Integer age = rs.getInt("age");
                Customer c = new Customer(id, name, age, address, username, password);
                return c;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return null;
    }

    @Override
    public List<Customer> getAll() {
        List<Customer> customers = new ArrayList<>();
        try {
            String sql = "select * from customer";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()) {
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String address = rs.getString("address");
                Integer age = rs.getInt("age");
                Customer c = new Customer(id, name, age, address, username, password);
                customers.add(c);
            } 
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customers;
    }

    @Override
    public List<Customer> searchName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
