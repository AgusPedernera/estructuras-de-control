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
public class nuevo8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la medida del cuadrado: ");
        int n = leer.nextInt();
        
        for(int i = 0; i < n; i++ ){
            for(int x = 0; x< n ; x++){
                if(i>0 && i<n-1 && x>0 && x<n-1){
                System.out.print("   ");
                }else{
                    System.out.print(" * ");
                    }
            }
            System.out.print("\n");
            
        }
       
    
  }
    
}
