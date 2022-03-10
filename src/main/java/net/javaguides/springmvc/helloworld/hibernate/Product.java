package net.javaguides.springmvc.helloworld.hibernate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {

    @Column(name="id")
    private int id;

    @Column(name="product_name")
    private String productName;

    @Column(name="description")
    private String description;

    @Column(name="wholesale_price")
    private int wholesalePrice;

    @Column(name="retail_price")
    private int retailPrice;

    @Column(name="wholesale_minimum")
    private int wholesaleMinimum;

    public Product() {
    }

    public Product(String productName, String description, int wholesalePrice, int retailPrice, int wholesaleMinimum) {
        this.productName = productName;
        this.description = description;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
        this.wholesaleMinimum = wholesaleMinimum;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", wholesalePrice=" + wholesalePrice +
                ", retailPrice=" + retailPrice +
                ", wholesaleMinimum=" + wholesaleMinimum +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(int wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(int retailPrice) {
        this.retailPrice = retailPrice;
    }

    public int getWholesaleMinimum() {
        return wholesaleMinimum;
    }

    public void setWholesaleMinimum(int wholesaleMinimum) {
        this.wholesaleMinimum = wholesaleMinimum;
    }
}
