/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

import java.util.Scanner;

/**
 *
 * @author Vinicio Guaman The Programers ESPE-DCCO
 */
public class ShoppingCart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantProdTotal = 5;
        int codProds[] = new int[]{100, 200, 300, 400, 500};
        String names [] = new String [] {"P_A","P_B","P_C","P_D","P_E"};
        int prices [] = new int []{150, 250, 350,450,550};
        
        Scanner teclado = new Scanner(System.in);
        
        int codProdCarrito[] = new int[10];
        int cantCarrito[] = new int[10];
        int subtCarrito[] = new int[10];
        
        int cantLineas = 0;
        
        int op;
        
        do{
            System.out.println("Menu de opciones");
            System.out.println("================");
            System.out.println("1 show products");
            System.out.println("2 mosrtrar carrito");
            System.out.println("3 agregar productos");
            System.out.println("4 salir");
            System.out.print("Enter the option you want");
            op = teclado.nextInt();
            
          switch (op){
              case 1: mostrarProductos(codProds, names, prices, cantProdTotal);
                  break;
              case 2: mostrarCarrito(codProds, names, prices,
                      codProdCarrito, cantCarrito, subtCarrito, cantLineas);
                  break;
              case 3: if(cantLineas < 9){
                  cantLineas = AgregarCarrito (codProds, names, prices,
                          codProdCarrito, cantCarrito, subtCarrito, cantLineas,
                          teclado);
              } else{
                  System.out.println("El carrito esta lleno");
              }
              break;
          }  
            
        }while (op !=4);
        int sumaTotal = mostrarCarrito(codProds, names, prices,
                      codProdCarrito, cantCarrito, subtCarrito, cantLineas);
        System.out.println("El total es: " + sumaTotal);
    }
    
public static void mostrarProductos (int[] cp, String[] np, int[] pp, int cant){
    int i;
    System.out.println();
    System.out.println("Lista de productos");
    System.out.println("================");
    for (i=0; i<cant; i++){
        System.out.println(cp[i] + "_" + np[i] + "_" + pp[i]);
    }
}

public static int mostrarCarrito (int[] cp, String[] np, int[] pp,
        int[] cp_linea, int[] cantLinea, int[] subt, int cantLineas){
    int i, suma = 0;
    System.out.println();
    System.out.println("Carrito de compras");
    System.out.println("================");
    for (i=0; i<cantLineas; i++){
        int h = buscarProd(cp_linea[i], cp);
        System.out.println(cp_linea[i] + " - " + np[h] + "_" + pp[h] 
                   + " - " + cantLinea[i] + " - " + subt[i]);
        suma = suma + subt[i];
    }
    return suma;
}

public static int buscarProd(int codBus, int[] productos){
    int posicion = -1;
    for (int i = 0; i<5; i++){
        if(codBus == productos[i]){
            posicion = i;
        }
    }
    return posicion;
}

public static int AgregarCarrito (int[] cp, String[] np, int[] pp,
        int[] cp_linea, int[] cantLinea, int[] subt, int cantLineas,
        Scanner teclado){
    
    System.out.print("Ingrese el codigo de producto que desea");
    int cod = teclado.nextInt();
    
    int posi = buscarProd(cod, cp);
    if (posi == -1){
        System.out.println("El producto no existe");
        return cantLineas;
    }
    
    System.out.print("Ingrese la cantidad que desea: ");
    int cant = teclado.nextInt();
    
    cp_linea[cantLineas] = cod;
    cantLinea[cantLineas] = cant;
    subt[cantLineas] = pp[posi] * cant;
    
    return (cantLineas + 1);    
}  
}
