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

public class Drinks extends Inventory {
   private String type;
   private String brand;
   private float volume;
   private float price;

    public Drinks(float volume, int id, float price, String type, String brand) {
        super(id, price, type, brand);
        this.volume=volume;
    }
    @Override
 public String toString() {
        return "Drinks{" + super.toString()+"volume=" + volume + '}';
    }
  
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
private ShoppingCart add;
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

    /**
     * @return the add
     */
    public ShoppingCart getAdd() {
        return add;
    }

    /**
     * @param add the add to set
     */
    public void setAdd(ShoppingCart add) {
        this.add = add;
    }
}
