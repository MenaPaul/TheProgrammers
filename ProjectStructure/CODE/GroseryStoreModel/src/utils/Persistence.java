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
public interface Persistence {
    public void create(String date, String table);
    public String read(String table);
    public String find (String searchString, String table);
    public boolean update(String searchString, String data, String table);
    public boolean delete(String searchString, String table);

    @Override
    public String toString();

    @Override
    public boolean equals(Object o);

    @Override
    public int hashCode();
    
}
