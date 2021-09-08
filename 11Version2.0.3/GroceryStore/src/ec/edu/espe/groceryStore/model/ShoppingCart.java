/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.groceryStore.model;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

/**
 *
 * @author pc
 */
public class ShoppingCart {
    
    private DBCollection table;
    private DBCollection tableP;
    private DBCursor cursor = null;
    private BasicDBObject document = new BasicDBObject();
      
}
