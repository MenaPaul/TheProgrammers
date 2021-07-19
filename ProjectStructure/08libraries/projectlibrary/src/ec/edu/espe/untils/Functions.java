/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.untils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileWriter; 
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Functions {
    public static void UseInventory() throws IOException, FileNotFoundException, java.text.ParseException {
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
        }
        if (option == 3) {
            read();
        }
        if(option==4){
        }
    }
public static void read() throws FileNotFoundException, IOException, java.text.ParseException{
		
	JSONParser parser = new JSONParser();
		
		try{
			Object obj = parser.parse(new FileReader("C:\\Users\\pc\\OneDrive\\Escritorio\\The Programers\\TheProgrammers\\ProjectStructure\\08libraries\\projectlibrary\\Inventory.json"));
			 
			JSONObject jsonObject = (JSONObject) obj;
			
	 
			// recorrer arreglo
			JSONArray leng= (JSONArray) jsonObject.get("id, price, type");
			System.out.println("id, price, type:");
			Iterator iterator =leng.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			
		}catch(Exception ex){
			System.err.println("Error: "+ex.toString());
		}finally{
			
		}
}
    static int totalline;
    static int totalcoincidences;

     public static void Export() {
        String fileOutput = "C:\\\\Users\\\\pc\\\\OneDrive\\\\Escritorio\\\\The Programers\\\\TheProgrammers\\\\ProjectStructure\\\\08libraries\\\\projectlibrary\\\\Inventory.json";
        boolean exists = new File(fileOutput).exists();

        if (exists) {
            File InventoryFile = new File(fileOutput);
            InventoryFile.delete();
        }
        }
    
    public static void Write(){
        Scanner sc = new Scanner(System.in);
    JSONObject obj = new JSONObject();
    String id;
    String type;
    String price;
                        
        System.out.println("Enter the id:");
        id=sc.next();
        System.out.println("Enter the price:");
        price=sc.next();
        System.out.println("Enter the type:");
        type=sc.next();
	 
		JSONArray list = new JSONArray();
		list.add(id);
		list.add(price);
                list.add(type);
	 
		obj.put("id, price, type", list);
		
		try{
			FileWriter file = new FileWriter("C:\\Users\\pc\\OneDrive\\Escritorio\\The Programers\\TheProgrammers\\ProjectStructure\\08libraries\\projectlibrary\\Inventory.json");
			file.write(obj.toJSONString());
			file.flush();
			file.close();
			
			
		}catch(Exception ex){
			System.out.println("Error: "+ex.toString());
		}
		finally{
			System.out.print(obj);
		}
	
    }

    private static void find() {
        Scanner sc = new Scanner(System.in);
    JSONObject obj = new JSONObject();
    String id;
        System.out.println("Enter the id:");
        id=sc.next();
        JSONArray list = new JSONArray();
    }
   
}



