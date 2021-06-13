/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo2;

import java.util.Scanner;

/**
 *
 * @author laptop
 */
public class Arreglo3 {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        int num [][]=new int[3][5];
        
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Ingrese el caracter en posicion "+i+" ,"+j);
                num[i][j]=lector.nextInt();
                
                
                
            }
            
           
                
                
            }
            for (int i = 0; i < num.length; i++) {
                for (int j = 0; j < 5; j++) { 
                    System.out.print(num[i][j]+" ");
                    
                }
                System.out.println(" ");
            
        
            }
            
        /*String[] nombres = new String[6];
        nombres[0] = "Pedro";
        nombres[1] = "Karla";
        nombres[2] = "Alan";
        nombres[3] = "María";
        nombres[4] = "Elan";
        nombres[5] = "Juan";
        nombres[6] = "Enrique";
        System.out.println(nombres[6]);*/
       /* Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero");
        num = sc.nextInt();
        while (num != 0) {
            if (num > 0) {
                System.out.println("POSITIVO");
            } else {
                System.out.println("NEGATIVO");
            }
        }
          System.out.println("Fin del WHILE");*/
      
        }
    }
    

