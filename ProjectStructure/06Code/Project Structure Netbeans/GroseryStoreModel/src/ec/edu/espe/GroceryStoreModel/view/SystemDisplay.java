/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.GroceryStoreModel.view;

 


import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.groseryStoreModel.model.*;
import static ec.edu.espe.untils.Functions.Export;
import static ec.edu.espe.untils.Functions.UseInventory;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.util.Scanner;
/**
 *
 * @author Eduardo Mortensen The Programers
 */
public class SystemDisplay {

    public static void main(String[] args) throws IOException, FileNotFoundException, ParseException {

        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int opcion; //Guardaremos la opcion del usuario
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();

        while (!exit) {

            System.out.println("PRESS 1:INVENTORY");
            System.out.println("PRESS 2:SHOPPINGCART");
            System.out.println("PRESS 3: BYLLING SYSTEM");
            System.out.println("PRESS 4: EXIT");

            try {

                System.out.println("Choose one option");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        UseInventory();
                        break;

                    case 2:
                        System.out.println("");

                        break;
                    case 3:
                        System.out.println("");

                        break;
                    case 4:
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
    



