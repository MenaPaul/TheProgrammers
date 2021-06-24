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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
        inventory.add(new Inventory(" 01 " , " 3.25 " , " Drinks " , " Fanta "));

        ExportCSV(inventory);

    }

    public static void ExportCSV(List<Inventory> inventory) {
        String fileOutput = "Inventory.txt";
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

            outputCSV.endRecord();

            for (Inventory inventories : inventory) {
                outputCSV.write(inventories.getId());
                outputCSV.write(inventories.getPrice());
                outputCSV.write(inventories.getType());
                outputCSV.write(inventories.getBrand());
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
           Write();
        }
        if (option == 2) {
            search();
        }
        if (option == 3) {
            read();
        }
        if(option==4){
        }
    }

    public static void read() throws FileNotFoundException, IOException {
        try {
            ArrayList<Inventory> inventory = new ArrayList<Inventory>();
            System.out.println("read data from CSV");
            CsvReader readInventory = new CsvReader("C:\\\\Users\\\\pc\\\\OneDrive\\\\Escritorio\\\\The Programers\\\\GroseryStoreModel\\\\Inventory.txt");
            readInventory.readHeaders();
            while (readInventory.readRecord()) {
                String id = readInventory.get(0);
                String price = readInventory.get(1);
                String type = readInventory.get(2);
                String brand = readInventory.get(3);

                inventory.add(new Inventory(id, price, type, brand));
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

    public static void search() {
        File InventoryFile = new File("C:\\Users\\pc\\OneDrive\\Escritorio\\The Programers\\GroseryStoreModel\\Inventory.txt");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the id");
        String word = keyboard.nextLine();
        System.out.println("");
        Searchword(InventoryFile, word);
    }

    public static void Searchword(File InventoryFile , String word) {
        try {
            if (InventoryFile.exists()) {
                BufferedReader readInventory = new BufferedReader(new FileReader(InventoryFile));

                String readedline;

                while ((readedline = readInventory.readLine()) != null) {
                    totalline = totalline + 1;

                    String[] words = readedline.split(" ");
                    for (int i = 0; i < words.length; i++) {
                        if (words[i].equals(word)) {
                            System.out.println(readedline);
                            System.out.println("");
                        }

                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void Write(){
 try 
          {    
               BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                FileWriter fw=new FileWriter("Inventory.txt", true); 
                 System.out.println("Enter Id");
                String id = br.readLine();
                System.out.println("Enter price");
                String price = br.readLine();
                System.out.println("Enter type");
                String type = br.readLine();
                System.out.println("Enter brand");
                 String brand = br.readLine();
                fw.write(System.getProperty( "line.separator" ));
                fw.write( id );
                fw.write( " , " );
                fw.write(price);
                fw.write( " , " );
                fw.write(type);
                fw.write(" , ");
                fw.write(brand);
                fw.write(System.getProperty( "line.separator" ));
                fw.close();    
          }
          catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
    }  
   
}



