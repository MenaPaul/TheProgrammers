/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.groseryStoreModel.model;

/**
 *
 * @author Paul Mena The Programmers ESPE-DCCO
 */
public class Pasta extends Inventory {

    public  Pasta(float weight,int id, float price, String type, String brand) {
        super(id, price, type, brand);
        this.weight=weight;
    }
@Override
 public String toString() {
        return " Jams {" + super.toString()+"weight=" + weight + '}';
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
ShoppingCart add;
    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }   

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }
    
    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    
    private String type;
    private String brand;
    private float price;
    private float weight;
    
    public void buy()
    {}

}