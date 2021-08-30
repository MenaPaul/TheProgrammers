/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.groceryStore.model;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import utils.Functions;

/**
 *
 * @author Eduardo Mortensen The Programers
 */
public class Invoice {

    private static Invoice instance;
    private float taxPercentage;
    private DB db;
    private DBCollection table;
    private DBCollection tableP;
    private DBCursor cursor = null;
    private BasicDBObject document = new BasicDBObject();

    private Invoice() {
        taxPercentage = 12.0F;
    }
    

    public static Invoice getInstance() {
        if (instance == null) {
            instance = new Invoice();
        }
        return instance;

    }

    public float computeSalesTotal(float amount) {
        float ivaValue;
        float totalTax;

        ivaValue = Functions.computeIva(amount);
        totalTax = Functions.computeTotalPrice(amount);

        return totalTax;
    }
    public float computeIva(float amount){
        float ivaAmount;
        ivaAmount = Functions.computeIva(amount);
        
        return ivaAmount;
    }
    
    public float getTaxPercentage(){
        
        return taxPercentage;
        
    }
    

    public DB getDb() {
        return db;
    }

    public void setDb(DB db) {
        this.db = db;
    }

    public DBCollection getTable() {
        return table;
    }

    public void setTable(DBCollection table) {
        this.table = table;
    }

    public DBCursor getCursor() {
        return cursor;
    }

    public void setCursor(DBCursor cursor) {
        this.cursor = cursor;
    }

    public BasicDBObject getDocument() {
        return document;
    }

    public void setDocument(BasicDBObject document) {
        this.document = document;
    }

    public DBCollection getTableP() {
        return tableP;
    }

    public void setTableP(DBCollection tableP) {
        this.tableP = tableP;
    }
}
