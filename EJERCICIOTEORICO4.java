/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero 
se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".  
El programa deberá calcular y mostrar el resultado de la suma de los números 
leídos, pero si el número es negativo no debe sumarse. 
Nota: recordar el uso de la sentencia break.

 */
package ejerciciosestructurasdecontrol;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class EJERCICIOTEORICO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
       int aux = 0;
       int suma = 0;
       int num;
       
       do {
           System.out.println("Ingrese 20 numeros como maximo");
          num = leer.nextInt();
           aux++;
           if (num > 0)
           suma = suma + num;         
} while (num != 0 && aux < 20 && num > 0);
     
       if(num == 0){
          System.out.println("Se capturo el numero 0");
} else {
          System.out.println("Hay un numero negativo");
}      	  
        System.out.println("La suma de los numeros ingresados es " + suma);           
    }
    
}
