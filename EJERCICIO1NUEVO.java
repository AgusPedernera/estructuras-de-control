/*
 Crear un programa que dado un número determine si es par o impar.

 */
package ejerciciosestructurasdecontrol;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class EJERCICIO1NUEVO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        if(num % 2 ==0){
            System.out.println("Es un numero par");
} else {
            System.out.println("Es un numero impar");
}      	       
    }
    
}
