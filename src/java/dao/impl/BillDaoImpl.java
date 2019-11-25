/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.BillDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.JDBCConnection;
import model.Bill;

/**
 *
 * @author vutha
 */
public class BillDaoImpl extends JDBCConnection implements BillDAO{

    public BillDaoImpl() {
        super();
    }
    
    

    @Override
    public int createBill(Bill b) {
        try {
            String sql = "insert into bill(cartID,total,creation_time) values(?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, b.getCartId());
            ps.setLong(2, b.getTotal());
            ps.setDate(3, b.getCreationTime());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            return rs.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(BillDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
}
