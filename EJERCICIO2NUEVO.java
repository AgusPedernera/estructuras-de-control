/*
 Crear un programa que pida una frase y si esa frase es igual 
a “eureka” el programa pondrá un mensaje de Correcto, 
sino mostrará un mensaje de Incorrecto. 
Nota: investigar la función equals() en Java.

 */
package ejerciciosestructurasdecontrol;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class EJERCICIO2NUEVO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la contraseña");
        String frase = leer.next();
        if(frase.equalsIgnoreCase("eureka")){
            System.out.println("Es correcto");
} else {
            System.out.println("Es incorrecto");
}      	       
    }
    
}
