package org.example;

import java.util.Date;
public class Product {
    private long id;
    private String name;
    private String description;
    private float price;
    private Date createAt;

    private ECategory eCategory;


    public Product() {
    }

    public Product(long id, String name, String description, float price, Date createAt, ECategory eCategory) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.createAt = createAt;
        this.eCategory = eCategory;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public ECategory geteCategory() {
        return eCategory;
    }

    public void seteCategory(ECategory eCategory) {
        this.eCategory = eCategory;
    }
    public String toString(){
        return getId()+","+getName()+","+getDescription()+","+getPrice()+","+DateUtils.format(this.createAt)+","+geteCategory();
    }
}
