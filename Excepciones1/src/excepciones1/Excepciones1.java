/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones1;

import java.util.Scanner;

/**
 *
 * @author Ezq
 */
public class Excepciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner scan = new Scanner (System.in);
       
        int t=0;
        boolean repeticion = true;
        
        
      do{
       
            System.out.println("Ingrese el tamaño del arreglo: ");
        
        try{
        
            t = scan.nextInt();
            int [] arreglo = new int [t]; 
           
            for(int i=0; i<t; i++){
            System.out.println("Ingrese numero en la posicion " + (i+1));
            arreglo[i]= scan.nextInt();
             
           }
            System.out.println("Ingrese de qué posicion quiere ver el dato: ");
            t= scan.nextInt();
            repeticion= false; 
            System.out.println("Elemento en la posición " + t + ": " + arreglo[t-1]);
            break; 
        
    }catch(Exception e){
            scan.nextLine(); 
            System.out.println("Ingresa un numero !");
        
        }
        
      }while(repeticion);
        
        
        
    
    
    }
    
}
    

