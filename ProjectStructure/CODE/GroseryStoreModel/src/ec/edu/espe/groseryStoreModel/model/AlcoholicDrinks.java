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
public class AlcoholicDrinks extends Inventory {

  
  private int id;
  private float price;
  private String type;
  private String brand;

    public AlcoholicDrinks(int id, float price, String type, String brand) {
        super(id, price, type, brand);
    }

   public String toString() {
        return "  Alcoholic Drinks{" + super.toString()+'}';
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the type
     */
    public String getType() {
        return type;
    }

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
     * @return the id
     */
    public int getId() {
        return id;
    }
    
   

 

  
    
}

    /**
     * @return the type
     */
    


