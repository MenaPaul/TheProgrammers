/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.groseryStoreModel.model;

import java.util.ArrayList;

/**
 *
 * @author Paul Mena The Programmers ESPE-DCCO
 */
public class ShoppingCart {

    public ShoppingCart(int numberofproducts, float price) {
        this.numberofproducts = numberofproducts;
        this.price = price;
    }
    
    private int numberofproducts;
    private float price;
  private ArrayList<Bill> give = new ArrayList<>();
  


private void add(){
}
private void remove(){
}
private void count(){
}

    /**
     * @return the numberofproducts
     */
    public int getNumberofproducts() {
        return numberofproducts;
    }
    /**
     * @param numberofproducts the numberofproducts to set
     */
    public void setNumberofproducts(int numberofproducts) {
        this.numberofproducts = numberofproducts;
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
     * @return the give
     */
    public ArrayList<Bill> getGive() {
        return give;
    }

    /**
     * @param give the give to set
     */
    public void setGive(ArrayList<Bill> give) {
        this.give = give;
    }
    
}
