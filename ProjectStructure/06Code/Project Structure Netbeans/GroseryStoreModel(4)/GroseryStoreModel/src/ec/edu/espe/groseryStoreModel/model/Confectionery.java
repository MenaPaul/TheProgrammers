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
public class Confectionery extends Inventory {

    public Confectionery(int id, float price, String type, String brand) {
        super(id, price, type, brand);
    }

    
 public String toString(){
      return "Confectionery{" + super.toString()+"weight=" + '}';
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
    
    
    private String type;
    private String brand;
    private int id;
    private float price;
    
    
    public void buy()
    {}

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}
