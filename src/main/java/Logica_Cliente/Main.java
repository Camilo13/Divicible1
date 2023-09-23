/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negicio.Divicible;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion de variables
        
       int Numero=0;
       
       //creacion de objetos
       Divicible  objdivicible =new Divicible ();
       
       //fijacion de objetos 
       Scanner scan=new Scanner (System.in);
       
       
      //pedir y fijar información
        System.out.println("digite su  numero ");
        Numero= scan.nextInt();
        
        //parametros
        if (Numero % 2==0){
            System.out.println("su numero es par ");
            
        }else{ 
            System.out.println("su numero no es par");
     }
        
        
    }
    
}
