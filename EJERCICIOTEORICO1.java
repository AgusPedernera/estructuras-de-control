/*
Implementar un programa que le pida dos números enteros al usuario 
y determine si ambos o alguno de ellos es mayor a 25.

 */
package ejerciciosestructurasdecontrol;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class EJERCICIOTEORICO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese un numero");
        int num1= leer.nextInt();
        System.out.println("ingrese otro numero");
        int num2 = leer.nextInt();
        if (num1>25 || num2>25) {
            System.out.println("Alguno de los numeros es mayor a 25");

} else {
            System.out.println("Ninguno de los numeros ingresados es mayor a 25");
}      	    

        
    }
    
}
