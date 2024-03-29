/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.ItemDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.JDBCConnection;
import model.Item;

/**
 *
 * @author vutha
 */
public class ItemDaoImpl extends JDBCConnection implements ItemDAO{

    public ItemDaoImpl() {
        super();
    }
    
    

    @Override
    public int create(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Item> getAll() {
        List<Item> items = new ArrayList<>();
        try {
            Statement statement = conn.createStatement();
            String sql = "select * from item";
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()) {
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                Long price  = rs.getLong("price");
                String screen = rs.getString("screen");
                String selfieCamera = rs.getString("selfiecamera");
                String mainCamera = rs.getString("maincamera");
                String ram = rs.getString("ram");
                String rom = rs.getString("rom");
                String cpu = rs.getString("cpu");
                String gpu = rs.getString("gpu");
                String battery = rs.getString("battery");
                String os = rs.getString("os");
                String sim = rs.getString("sim");
                String image = rs.getString("image");
                
                Item item = new Item(id, name, price, screen, selfieCamera, mainCamera, ram, rom, gpu, cpu, battery, os, sim, image);
                items.add(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ItemDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return items;
    }

    @Override
    public Item getItemById(Integer itemId) {
        try {
            String sql = "select * from item where id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, itemId);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                Long price  = rs.getLong("price");
                String screen = rs.getString("screen");
                String selfieCamera = rs.getString("selfiecamera");
                String mainCamera = rs.getString("maincamera");
                String ram = rs.getString("ram");
                String rom = rs.getString("rom");
                String cpu = rs.getString("cpu");
                String gpu = rs.getString("gpu");
                String battery = rs.getString("battery");
                String os = rs.getString("os");
                String sim = rs.getString("sim");
                String image = rs.getString("image");
                
                Item item = new Item(id, name, price, screen, selfieCamera, mainCamera, ram, rom, gpu, cpu, battery, os, sim, image);
                return item;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ItemDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<Item> getAllPagination(Integer limit, Integer offset) {
        List<Item> items = new ArrayList<>();
        try {
            
            String sql = "select * from item limit ? offset ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, limit);
            ps.setInt(2, offset);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                Long price  = rs.getLong("price");
                String screen = rs.getString("screen");
                String selfieCamera = rs.getString("selfiecamera");
                String mainCamera = rs.getString("maincamera");
                String ram = rs.getString("ram");
                String rom = rs.getString("rom");
                String cpu = rs.getString("cpu");
                String gpu = rs.getString("gpu");
                String battery = rs.getString("battery");
                String os = rs.getString("os");
                String sim = rs.getString("sim");
                String image = rs.getString("image");
                
                Item item = new Item(id, name, price, screen, selfieCamera, mainCamera, ram, rom, gpu, cpu, battery, os, sim, image);
                items.add(item);          
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ItemDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return items;
    }

    @Override
    public int countAll() {
        int count = 0;
        try {
            String sql = "select count(*) from item";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()) {
                count = rs.getInt(1);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ItemDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
    
}
