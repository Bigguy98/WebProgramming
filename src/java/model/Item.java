/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author vutha
 */
public class Item {
    private Integer id;
    private String name;
    private Long price;
    private String screen;
    private String selfieCamera;
    private String mainCamera;
    private String ram;
    private String rom;
    private String gpu;
    private String cpu;
    private String battery;
    private String os;
    private String sim;
    private String image;

    public Item() {
    }

    public Item(Integer id, String name, Long price, String screen, String selfieCamera, String mainCamera, String ram, String rom, String gpu, String cpu, String battery, String os, String sim, String image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.screen = screen;
        this.selfieCamera = selfieCamera;
        this.mainCamera = mainCamera;
        this.ram = ram;
        this.rom = rom;
        this.gpu = gpu;
        this.cpu = cpu;
        this.battery = battery;
        this.os = os;
        this.sim = sim;
        this.image = image;
    }

    public Long getPrice() {
        return price;
    }

    public Integer getId() {
        return id;
    }
    
    
    
    
}
