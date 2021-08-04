/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.groceryStore.controller;

import ec.edu.espe.GroceryStoreModel.view.FrmCostumer;
import ec.edu.espe.groseryStoreModel.model.Costumer;
import ec.edu.espe.groseryStoreModel.model.Products;
import java.util.ArrayList;
import static sun.net.www.http.HttpClient.New;
import utils.DBManager;
import utils.Persistence;

/**
 *
 * @author pc
 */
public class CostumerController {
   private Costumer costumer;
   private FrmCostumer frmCostumer = new FrmCostumer();
   private Persistence dataManager = new DBManager();
   
   private ArrayList<Products> products= new ArrayList<>();

    public CostumerController(Costumer costumer,  FrmCostumer frmCostumer, ArrayList<Products> products) {
        this.costumer = costumer;
        this.frmCostumer=frmCostumer;
        this.products=products;
    }
   
   public void addCostumer(Costumer costumer){
   //TODO read contacts(list)from database
   //TODO add tp database
   //usinf the utils class
   String costumerJson="()";
   dataManager.create(costumerJson, "costumer");
   }
   
   public ArrayList<Costumer> readCostumers(){
   ArrayList<Costumer>costumers = new ArrayList<>();
   //TODO read contacts from database
   //TODO use the utils class
   Costumer costumer = new Costumer("Carlos Sanchez", "carlosS@hotmail", "0986756754","Eloy Alfaro y Amazonas ", "1766789996", "",4);
   costumers.add(costumer);
   costumer = new Costumer("Carlos Sanchez", "carlosS@hotmail", "0986756754","Eloy Alfaro y Amazonas ", "1766789996", "",4);
   return costumers;
   }
   

   //ArrayList<Contact> findContact(String Name)
   //ArrayList<Contact> findContact(String Email)
   //ArrayList<Contact> findContact(String Email)
    /**
     * @return the costumer
     */
    public Costumer getCostumer() {
        return costumer;
    }

    /**
     * @param costumer the costumer to set
     */
    public void setCostumer(Costumer costumer) {
        this.costumer = costumer;
    }

    /**
     * @return the frmCostumer
     */
    public FrmCostumer getFrmCostumer() {
        return frmCostumer;
    }

    /**
     * @param frmCostumer the frmCostumer to set
     */
    public void setFrmCostumer(FrmCostumer frmCostumer) {
        this.frmCostumer = frmCostumer;
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
   
}


