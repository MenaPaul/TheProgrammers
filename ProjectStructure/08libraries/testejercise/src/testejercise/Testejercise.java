/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testejercise;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author pc
 */
public class Testejercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        computeRentTax();
        
    }
  
  public static float percentage ;
     public static float basicFraction ;
     public static float basicFractionTax;
     public static float computeRentTax(){
        float amountToPay;
        float netIncome; 
        float deductibleExpenses;
        float taxBase;
         
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your net income");
    netIncome= sc.nextFloat();
    System.out.println("Enter your deductible expenses");
    deductibleExpenses = sc.nextFloat();
    taxBase = netIncome-deductibleExpenses;
   
 
    
    if (taxBase>=0 && taxBase<11212){
        percentage=0;
        basicFraction=0;
        basicFractionTax=0; 
        System.out.println("you don´t have to pay Rent Tax");
    }
    else if (taxBase>=11212 && taxBase<14285){
        percentage=5;
        basicFraction=11212;
        basicFractionTax=0;
      
    } 
    else if (taxBase>=14285 && taxBase<17854){
        percentage=10;
        basicFraction=14285;
        basicFractionTax=154;
      
    } 
    else if (taxBase>=17854 && taxBase<21442){
        percentage=12;
        basicFraction=17854;
        basicFractionTax=511;
    } 
    else if  (taxBase>=21442 && taxBase<42874 ){
        percentage=15;
        basicFraction=21442;
        basicFractionTax=941;
    } 
    else if  (taxBase>=42874 && taxBase<64297 ){
        percentage=20;
        basicFraction=42874;
        basicFractionTax=4156;
    }
    else if (taxBase>=64297 && taxBase<85729 ){
        percentage=25;
        basicFraction=64297;
        basicFractionTax=8440;
    }
    else if (taxBase>=85729 && taxBase<114288 ){
        percentage=30;
        basicFraction=85729;
        basicFractionTax=13798;
    }
    else  if (taxBase>=114288 && taxBase>114288 ){
        percentage=35;
        basicFraction=114288;
        basicFractionTax=22366;
    }
    float total;
        total =(taxBase-basicFraction)*percentage/100 + basicFractionTax ;
       System.out.println("you have to pay: "+total);
            return total;      
    }
    
}
     

    //find
  
