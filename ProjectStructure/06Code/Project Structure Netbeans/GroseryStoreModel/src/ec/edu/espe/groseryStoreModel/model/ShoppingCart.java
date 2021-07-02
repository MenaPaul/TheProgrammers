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
    public int numberofproducts;
    public float price;
  ArrayList<Bill> give = new ArrayList<>();
  
public  Pasta pasta(){
  return new Pasta();
  }
public  Appetizers appetizers(){
  return new Appetizers();
}
public  Drinks drinks(){
  return new Drinks();
}
public  Meats meats(){
  return new Meats();
}
public  NutsandSeeds nutandseeds(){
  return new NutsandSeeds();
}
public  Oils oils (){
  return new Oils();
}

public  Sales sales(){
  return new Sales();
}

public Cereals cereals  (){
  return new Cereals();
}



public Frozen frozen  (){
  return new Frozen();
}

public Jams jams (){
  return new Jams();
}

public DairyAndEggs dairyAndEggs  (){
  return new DairyAndEggs();
}

public Seasoning seasoning  (){
  return new Seasoning();
}

public FruitsAndVegetables  fruitsAndVegetables (){
  return new FruitsAndVegetables();
}

public Confectionery confectionery  (){
  return new Confectionery();
}

public  FishAndSeafood fishAndSeafood(){
  return new FishAndSeafood();
}

public Sauces sauces  (){
  return new Sauces();
}

public AlcoholicDrinks alcoholicDrinkss  (){
  return new AlcoholicDrinks();
}


private void add(){
}
private void remove(){
}
private void count(){
}
    
}
