/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.List;
import modal.Customer;

/**
 *
 * @author hoaiphat
 */
public interface CustomerDao {
    
    void create(Customer customer);
    
    void edit(Customer customer);
    
    void delete(int id);
    
    Customer getCustomer(int id);
    
    Customer getByUserName(String username);
    
    List<Customer> getAll();
    
    List<Customer> searchName(String name);
            
}
