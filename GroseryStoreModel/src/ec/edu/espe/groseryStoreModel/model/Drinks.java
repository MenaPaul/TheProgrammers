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

public class Drinks {
   private String type;
   private String brand;
   private float volume;
   private int amountofproducts;
   private float price;

    public Drinks(String id, float parseFloat, float parseFloat0, String color, float parseFloat1, String model) {
       //To change body of generated methods, choose Tools | Templates.
    }

    public Drinks(Drinks brand, Drinks type, Drinks price, Drinks volume, Drinks amountofproducts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Drinks(String id, float parseFloat, String color, float parseFloat0, String model, float parseFloat1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     @Override
    public String toString() {
        return "Drinks{" + "type=" + getType() + ", brand=" + getBrand() + ", volume=" + getVolume() + ", amountperunit=" + getAmountofproducts() + ", price=" + getPrice() + '}';
    }

    public Drinks(String type, String brand, float volume ,int amountofproducts ,float price ) {
        this.type = type;
        this.brand = brand;
        this.volume = volume;
        this.amountofproducts = amountofproducts;
        this.price = price;
    }
    
    public Drinks() {
        this.type = "no type";
        this.brand = "no brand";
        this.volume=0;
        this.amountofproducts=0;
        this.price=0;
    }
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
private ShopCart add;
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
     * @return the volume
     */
    public float getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(float volume) {
        this.volume = volume;
    }

    /**
     * @return the amountperunit
     */
  

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

 public void buy()
   {}

    public void add(Drinks drinks2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the amountofproducts
     */
    public int getAmountofproducts() {
        return amountofproducts;
    }

    /**
     * @param amountofproducts the amountofproducts to set
     */
    public void setAmountofproducts(int amountofproducts) {
        this.amountofproducts = amountofproducts;
    }

    /**
     * @return the add
     */
    public ShopCart getAdd() {
        return add;
    }

    /**
     * @param add the add to set
     */
    public void setAdd(ShopCart add) {
        this.add = add;
    }
}
