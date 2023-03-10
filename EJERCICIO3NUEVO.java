/*
Realizar un programa que solo permita introducir 
solo frases o palabras de 8 de largo. Si el usuario 
ingresa una frase o palabra de 8 de largo se deberá 
de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se debera imprimir “INCORRECTO”. 
Nota: investigar la funcion Lenght() en Java.

 */
package ejerciciosestructurasdecontrol;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class EJERCICIO3NUEVO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una grase de 8 caracteres");
        String frase = leer.next();
        
        if(frase.length() == 8){
            System.out.println("Es correcto");
} else {
            System.out.println("Es incorrecto");
}      	       
    }
    
}
