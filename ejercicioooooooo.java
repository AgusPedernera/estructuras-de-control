/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosestructurasdecontrol;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class ejercicioooooooo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner( System.in );
        String palabra;
        System.out.printf( "Introduzca una palabra de 8 letras: " );
        palabra=teclado.nextLine();
         int n = palabra.length();
        if ( n == 8 )
        {
            System.out.printf( "CORRECTO!  :-) " );
        }
        else
        {
            System.out.printf( " INCORRECTO  >:(  " );
        }
    }
}
    
    

