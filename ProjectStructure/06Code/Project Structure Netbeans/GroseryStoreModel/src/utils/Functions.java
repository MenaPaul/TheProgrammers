/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

<<<<<<< HEAD
import java.util.Scanner;

=======
>>>>>>> d9cdcc19f63aaaff67cee7e7cf0ccd967ae96fc9
/**
 *
 * @author pc
 */
public class Functions {
<<<<<<< HEAD
     Scanner sn = new Scanner(System.in);
=======
    
>>>>>>> d9cdcc19f63aaaff67cee7e7cf0ccd967ae96fc9
    static  float ivaPercentage= 12.00F;
        public static float computeIva(float price){
    float ivaPrice;
    ivaPrice=price*ivaPercentage/100;
    return ivaPrice;
<<<<<<< HEAD
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
=======

}
       
>>>>>>> d9cdcc19f63aaaff67cee7e7cf0ccd967ae96fc9
}
