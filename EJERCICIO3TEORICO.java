/*
 Escriba un programa que valide si una nota está entre 0 y 10, 
sino está entre 0 y 10 la nota se pedirá de nuevo hasta 
que la nota sea correcta.

 */
package ejerciciosestructurasdecontrol;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class EJERCICIO3TEORICO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
        
       System.out.println("Ingrese una nota, entre 0 y 10");
        int nota = leer.nextInt();
        while (nota <= 0 || nota >= 10) {
            System.out.println("La nota no es correcta, ingrese nuevamente");
            nota= leer.nextInt();  
}

  System.out.println("la nota es correcta");      
    }
    
}
