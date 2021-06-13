/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo2;

import java.util.ArrayList;

/**
 *
 * @author laptop
 */
public class EjemploArrayList {
    public static void main(String[] args) {
        
            //ArrayList
            //Ingresar los datos sin posicion
            ArrayList<String> array1 = new ArrayList();
            array1.add("Perro");
            array1.add("Gato");
            array1.add("Hamster");
            array1.add("Tortuga");
            //Ingresar los datos con posicion
            array1.add(0,"Zanahoria");
            array1.add(1,"Cebolla");
            array1.add(2,"Tomate");
            
            //recorrer
            for (int i = 0; i < array1.size(); i++) {
                System.out.println(array1.get(i));
            
        }
            System.out.println("///////---------------////////");
            
            for(String datos:array1){
                System.out.println(datos);
            }
            
             System.out.println("///////---------------////////");
            
                 




            //Obtener un dato
                        System.out.println("-------------------------------");
            System.out.println(array1.get(6));
            System.out.println(array1.get(5));
            System.out.println(array1.get(3));
            System.out.println("--------------------------------");
            //remove de un dato
            System.out.println("Elemento removido "+array1.remove("Tortuga"));
            
            
            //sustituir
            System.out.println(array1.set(0, "Rana"));
            System.out.println("-------------------------------");
            System.out.println(array1.get(0));
            
            //comprueba
            System.out.println(array1.contains("Tortuga"));
            System.out.println(array1.indexOf("Gato"));
            
            //verificar
            System.out.println(array1.isEmpty());
            
            //limpiar
            array1.clear();
            
            System.out.println("Tamaño: "+array1.size());
           
        
        
    }
    
}
