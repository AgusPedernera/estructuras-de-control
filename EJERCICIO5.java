/*
 * Escriba un programa en el cual se ingrese un valor limite positivo,
   y a continuacion solicite numeros al usuario hasta que la suma de los 
  numeros introducidos supere el limite inicial.

 */
package ejerciciosestructurasdecontrol;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class EJERCICIO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un valor limite");
        int limite = leer.nextInt();
        int suma = 0;
        do { System.out.println("Ingrese numeros");
        int num = leer.nextInt();

        suma= num+suma;
                
                } while (suma < limite);
    
        System.out.println("Se alcanzo el limite");
    }

}

