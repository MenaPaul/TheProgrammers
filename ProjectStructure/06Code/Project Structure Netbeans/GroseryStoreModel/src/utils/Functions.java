/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

<<<<<<< HEAD

import java.util.Scanner;

=======
<<<<<<< HEAD
import java.util.Scanner;

=======
>>>>>>> d9cdcc19f63aaaff67cee7e7cf0ccd967ae96fc9
>>>>>>> 61e75f751f044037f34df0412225ab598405843f
/**
 *
 * @author pc
 */
public class Functions {
<<<<<<< HEAD
     Scanner sn = new Scanner(System.in);
=======
<<<<<<< HEAD
     Scanner sn = new Scanner(System.in);
=======
>>>>>>> 61e75f751f044037f34df0412225ab598405843f
    
>>>>>>> d9cdcc19f63aaaff67cee7e7cf0ccd967ae96fc9
    static  float ivaPercentage= 12.00F;
    
    public static float computeIva(float price){
    float ivaPrice;
    ivaPrice=price*ivaPercentage/100;
    return ivaPrice;
<<<<<<< HEAD
}   
        
    public static float computeTotalprice(float price){
=======
<<<<<<< HEAD
}
        
        public static float computeTotalprice(float price){
>>>>>>> 61e75f751f044037f34df0412225ab598405843f
    float totalPrice;
    totalPrice=price+ price*ivaPercentage/100;
    return totalPrice;
    }
<<<<<<< HEAD
       
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


}
       


=======
        
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
>>>>>>> 61e75f751f044037f34df0412225ab598405843f
