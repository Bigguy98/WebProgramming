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

    @Override
    public void create(Customer customer) {
        Connection con=super.getConnect();
        try {
            String Sql="INSERT INTO customer(name,age,address,username,password,role)"
                + "VALUES(?,?,?,?,?,?)";
            
            PreparedStatement statement= con.prepareStatement(Sql, Statement.RETURN_GENERATED_KEYS);
            
            statement.setString(1, customer.getName());
            statement.setInt(2, customer.getAge());
            statement.setString(3, customer.getAddress());
            statement.setString(4, customer.getUsername());
            statement.setString(5, customer.getPassword());
            statement.setString(6, customer.getRole());
            
            statement.executeQuery();
            
            ResultSet genResultSet = statement.getGeneratedKeys();
            if(genResultSet.next()){
                int id = genResultSet.getInt(1);
                customer.setId(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(CustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
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
    public Customer getByUserName(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
