/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.groseryStoreModel.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author pc
 */
public class Costumer {
   private String name;
   private String email;
   private String phone;
   private String adress;
   private String id;
   private String description;
   private ArrayList<Products> products= new ArrayList <>();
   private Date buyDate;
   private int productsAmount;

    

    public Costumer(String name, String email, String phone, String adress, String id, String description, int productsAmount) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.adress = adress;
        this.id = id;
        this.description = description;
        this.productsAmount = productsAmount;
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Costumer(String name, String email, String phone, String adress, String id, String description, int productsAmount, LocalDateTime buyDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

  

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the products
     */
    public ArrayList<Products> getProducts() {
        return products;
    }

    /**
     * @param products the products to set
     */
    public void setProducts(ArrayList<Products> products) {
        this.products = products;
    }

    /**
     * @return the buyDate
     */
    public Date getBuyDate() {
        return buyDate;
    }

    /**
     * @param buyDate the buyDate to set
     */
    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    /**
     * @return the productsAmount
     */
    public int getProductsAmount() {
        return productsAmount;
    }

    /**
     * @param productsAmount the productsAmount to set
     */
    public void setProductsAmount(int productsAmount) {
        this.productsAmount = productsAmount;
    }
} 
