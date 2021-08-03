/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author pc
 */
public class Functions {
    
    static  float ivaPercentage= 12.00F;
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
}
