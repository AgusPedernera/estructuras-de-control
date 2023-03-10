/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e 
imprima el número ingresado seguido de tantos asteriscos como indique su valor. 
Por ejemplo:
5 *****
3 ***
11 ***********
2 **

 */
package ejerciciosestructurasdecontrol;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class EJERCICIOTEORICO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       int num1;
      
       for (int i=0; i<4; i++) {
           System.out.println(" ");
           System.out.println("ingrese un numero");
           num1= leer.nextInt();
         for (int j = 0 ;j < num1; j++) {
          System.out.print("*" );
          
          
        
        
}
 
}

    }

}
