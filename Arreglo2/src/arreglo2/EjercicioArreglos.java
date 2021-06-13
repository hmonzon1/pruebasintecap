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
public class EjercicioArreglos {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        int numeros[][]= new int[6][6];
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println("Ingrese un numero es posicion de"
                        + " la fila:  "+i+"  y la columna "+j);
                numeros[i][j] = lector.nextInt();
                
            }
            
        } 
        System.out.println("----------------");
        System.out.println("Imprimiendo la Matriz");
        System.out.println("Matriz de 6 X 6");
        System.out.println("----------------");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(numeros[i][j]+" , ");
                
            }
            System.out.println(" ");
            
        }
    }
    
}
