/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.GroceryStoreModel.view;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import com.google.gson.Gson;
import ec.edu.espe.groseryStoreModel.model.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.Scanner;

/**
 *
 * @author Eduardo Mortensen The Programers
 */
public class SystemDisplay {

    public static void main(String[] args) throws IOException {

        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int opcion; //Guardaremos la opcion del usuario

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
        List<Inventory> inventory = new ArrayList<Inventory>();
        inventory.add(new Inventory("01", "3.25", "Soda", "Fanta", "35"));

        ExportCSV(inventory);

    }

    public static void ExportCSV(List<Inventory> inventory) {
        String fileOutput = "Inventory.csv";
        boolean exists = new File(fileOutput).exists();

        if (exists) {
            File InventoryFile = new File(fileOutput);
            InventoryFile.delete();
        }
        try {
            CsvWriter outputCSV = new CsvWriter(new FileWriter(fileOutput, true), ',');

            outputCSV.write("id");
            outputCSV.write("Price");
            outputCSV.write("Type");
            outputCSV.write("Brand");
            outputCSV.write("Amount of products in stock");

            outputCSV.endRecord();

            for (Inventory inventories : inventory) {
                outputCSV.write(inventories.getId());
                outputCSV.write(inventories.getPrice());
                outputCSV.write(inventories.getType());
                outputCSV.write(inventories.getBrand());
                outputCSV.write(inventories.getAmountofproductsinstock());
                outputCSV.endRecord(); //Stop writting the file

            }

            outputCSV.close(); //Close

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void UseInventory() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER ONE OPTION");
        System.out.println("PRESS 1: to add a product");
        System.out.println("PRESS 2: to search a product");
        System.out.println("PRESS 3: to read the list of products");
        int option = sc.nextInt();
        if (option == 1) {
           WriteCsv();
        }
        if (option == 2) {
            searchCSV();
        }
        if (option == 3) {
            readCSV();
        }
    }

    public static void readCSV() throws FileNotFoundException, IOException {
        try {
            ArrayList<Inventory> inventory = new ArrayList<Inventory>();
            System.out.println("read data from CSV");
            CsvReader readInventory = new CsvReader("Inventory.csv");
            readInventory.readHeaders();
            while (readInventory.readRecord()) {
                String id = readInventory.get(0);
                String price = readInventory.get(1);
                String type = readInventory.get(2);
                String brand = readInventory.get(3);
                String amountofproductsinstock = readInventory.get(4);

                inventory.add(new Inventory(id, price, type, brand, amountofproductsinstock));
            }
            readInventory.close();

            for (Inventory InventoryArray : inventory) {
                System.out.println(InventoryArray.getId() + ","
                        + InventoryArray.getPrice() + "," + InventoryArray.getType() + ","
                        + InventoryArray.getBrand());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static int totalline;
    static int totalcoincidences;

    public static void searchCSV() {
        File archivo = new File("C:\\Users\\pc\\OneDrive\\Escritorio\\The Programers\\GroseryStoreModel\\Inventory.csv");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the id");
        String word = keyboard.nextLine();
        System.out.println("");
        Searchword(archivo, word);
    }

    public static void Searchword(File archivo, String word) {
        try {
            if (archivo.exists()) {
                BufferedReader readArchivo = new BufferedReader(new FileReader(archivo));

                String readedline;

                while ((readedline = readArchivo.readLine()) != null) {
                    totalline = totalline + 1;

                    String[] words = readedline.split(" ");
                    for (int i = 0; i < words.length; i++) {
                        if (words[i].equals(words)) {
                            System.out.println(readedline);
                            System.out.println("In the line:" + totalline + "we have not found that word" + totalcoincidences);
                            System.out.println("");
                        }

                    }
                }
            }
            System.out.println("At the end was found this word" + word + "," + totalcoincidences + "times in this file");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void WriteCsv (){
 try 
          {    
               BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                FileWriter fw=new FileWriter("Inventory.csv", true); 
                 System.out.println("Write the price");
                String id = br.readLine();
                System.out.println("Write the brand");
                String price = br.readLine();
                System.out.println("Write the type");
                String type = br.readLine();
                System.out.println("Write the volume");
                 String brand = br.readLine();
                fw.write( id );
                fw.write( "," );
                fw.write(price);
                fw.write( "," );
                fw.write(type);
                fw.write(",");
                fw.write(brand);
                fw.close();    
          }
          catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
    }    

}



