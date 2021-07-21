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
public class Cereals extends Inventory {

   
    
    private float weight;
    
   {}   

    public Cereals(float weight,int id, float price, String type, String brand) {
        super(id, price, type, brand);
        this.weight=weight;
    }
    public String toString(){
      return "Cereals{" + super.toString()+"weight=" + getWeight() + '}';
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
}
