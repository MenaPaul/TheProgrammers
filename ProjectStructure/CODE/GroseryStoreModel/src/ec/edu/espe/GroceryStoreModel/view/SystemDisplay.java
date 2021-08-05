/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.GroceryStoreModel.view;

 



import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import ec.edu.espe.groseryStoreModel.model.*;

import static ec.edu.espe.untils.Functions.Export;
import static ec.edu.espe.untils.Functions.UseInventory;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;

import java.util.Scanner;
import java.util.Set;
import utils.Functions;

/**
 *
 * @author Eduardo Mortensen The Programers
 */
public class SystemDisplay {

    public static void main(String[] args) throws IOException, FileNotFoundException, ParseException {

        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        float price;
        float seasonDiscount;
        int opcion; //Guardaremos la opcion del usuario
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        
        
 
        
            
        
          
 
            
        while (!exit) {
            
            System.out.println("PRESS 1:VIEW INVENTORY");
            System.out.println("PRESS 2:VIEW IVA");
            System.out.println("PRESS 3: VIEW TOTAL PRICE");
            System.out.println("PRESS 4: VIEW SEASON DISCOUNTS");
            System.out.println("PRESS 5: VIEW TOTAL PRICE WITH SEASON DISCOUNTS");
            System.out.println("PRESS 6: VIEW TOTAL PRICE WITH STUFF DISCOUNTS");
            System.out.println("PRESS 11: EXIT"); 
            
            try {
                
            System.out.println("Choose one option");
            opcion = sn.nextInt();

                switch (opcion) {
                    
                    case 8:
                        break;
                    case 9:
                        break;
                    case 10:
                        break;
                    case 11:
                        System.out.println("THANK YOU FOR USING OUR STORE, HAVE A NICE DAY!!");
                        exit = true;
                        break;  
                    default:
                        System.out.println("you haven´t choosed any option, please try again");
                }
            } catch (InputMismatchException e) {
                sn.next();
            }
        }

        Export();
        
    }

    
}
    



