/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.CustomerDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modal.Customer;
import jdbc.JDBCConnection;
/**
 *
 * @author hoaiphat
 */
public class CustomerDaoImpl extends JDBCConnection implements CustomerDao{

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
    public Customer getCustomer(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> searchName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
