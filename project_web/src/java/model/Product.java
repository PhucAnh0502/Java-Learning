/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PHUCANH
 */
public class Product {
    private Supplier supplier;
    private Category category;
    private int id;
    private String title, description;
    private int price, compareAtPrice, quantity;
    private double saleRate;
    
    public Product(){
        
    }

    public Product(int id, String title, String description, int price, int compareAtPrice, int quantity) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.compareAtPrice = compareAtPrice;
        this.quantity = quantity;
        this.saleRate = (this.compareAtPrice - this.price) * 1.00 / this.compareAtPrice * 100;
    }
    
    public double getSaleRate(){
        return saleRate;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCompareAtPrice() {
        return compareAtPrice;
    }

    public void setCompareAtPrice(int compareAtPrice) {
        this.compareAtPrice = compareAtPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
