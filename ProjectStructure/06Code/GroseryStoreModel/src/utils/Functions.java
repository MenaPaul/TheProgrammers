/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;


import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Functions {
     Scanner sn = new Scanner(System.in);
    
    static  float ivaPercentage= 12.00F;
    static float discountUsed = 8.00F;
    
    public static float computeIva(float price){
    float ivaPrice;
    ivaPrice=price*ivaPercentage/100;
    return ivaPrice;
}   
        
    public static float computeTotalprice(float price){
    float totalPrice;
    totalPrice=price+ price*ivaPercentage/100;
    return totalPrice;
    }
       
    public static float computeSeasonDiscount(float price, float seasonDiscount ) {
    float seasonPrice;
    seasonPrice=price*seasonDiscount/100;
    return seasonPrice;
    }  
     
    public static float computeTotalPriceWithSeasonDiscount(float price, float seasonDiscount ) {
    float totalSeasonPrice;
    totalSeasonPrice=price-price*seasonDiscount/100;
    return totalSeasonPrice;
     }  
    
    public static float computeDiscountUsed(float price){
        float totalDiscountUsed;
        totalDiscountUsed = price - price * discountUsed / 100;
        return totalDiscountUsed;
    }


}
       


