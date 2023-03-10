/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” 
el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
Nota: investigar la función equals() en Java.

 */
package ejerciciosestructurasdecontrol;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class EJERCICIO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.next();

      if(frase.equals("eureka") || frase.equals("Eureka") || frase.equals("EUREKA")){
        System.out.println("Correcto");
     } else {
      System.out.println("Incorrecto");
    }      	        	

    }
    
}
