/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ezq
 */
public class Excepciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        boolean repeticion = true; 
        int num;
        int den;
        
        do{
        try{
        System.out.println("Ingrese los numeros para efectuar la división: ");
        System.out.println("Numerador: ");
        num = scan.nextInt(); 
        System.out.println("Denominador: ");
        den = scan.nextInt();
        
        double resultado = num/den; 
       
        System.out.println("El resultado de la división es: " + resultado);
          repeticion = false; 
        }catch(InputMismatchException inputMismatchException){
        scan.nextLine();
            System.out.println("Debes introducir números. Intenta de nuevo ! ");
    }catch(ArithmeticException arithmeticException){
        //  scan.nextLine();
            System.out.println("El denominador debe ser diferente de cero. Intenta de nuevo !");
    
    }
    
        
        
    }while(repeticion);
    
        }
    
}


    
   
    
    


