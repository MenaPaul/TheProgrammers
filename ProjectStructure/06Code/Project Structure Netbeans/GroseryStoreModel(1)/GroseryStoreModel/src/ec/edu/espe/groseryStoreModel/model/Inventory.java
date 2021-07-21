/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.groseryStoreModel.model;

import java.util.ArrayList;

/**
 *
 * @author Eduardo Mortensen The Programers
 */
public abstract class Inventory {
  private int id;
  private float price;
  private String type;
  private String brand;
  
ArrayList<AlcoholicDrinks> alcoholicDrinks = new ArrayList<>();
ArrayList<Appetizers> appetizers = new ArrayList<>();
ArrayList<Cereals>cereals=new ArrayList<>();
ArrayList<Confectionery>confectionery=new ArrayList<>();
ArrayList<DairyAndEggs>dairyAndEggs = new ArrayList<>();
ArrayList<Drinks>drinks=new ArrayList<>();
ArrayList<FishAndSeafood> fishAndSeafood = new ArrayList<>();
ArrayList<Frozen>frozen=new ArrayList<>();
ArrayList<FruitsAndVegetables>FruitsAndVegetables=new ArrayList<>();
ArrayList<Jams>jams = new ArrayList<>();
ArrayList<Meats>meats=new ArrayList<>();
ArrayList<NutsandSeeds>nutsandSeeds=new ArrayList<>();
ArrayList<Oils>oils  = new ArrayList<>();
ArrayList<Pasta>pasta=new ArrayList<>();
ArrayList<Sauces>sauces=new ArrayList<>();



  
    public Inventory(int id, float price,String type ,String brand) {
        this.id=id;
        this.price=price;
        this.type = type;
        this.brand=brand;
        
       
    }
  public String toString() {
      
        return "Inventory{" + "id=" + id + ", price=" + price + "type=" + type + "brand=" + brand +'}';
    }
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
     * @return the amountofproductsinstock
     */
   

    void add(Inventory inventories) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
