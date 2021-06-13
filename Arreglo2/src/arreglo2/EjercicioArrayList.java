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
public class EjercicioArrayList {
    public static void main(String[] args) {
        
        ArrayList<String> lista = new ArrayList();
        lista.add(0,"Audifonos");
        lista.add(1,"Microfono");
        lista.add(2,"USB tarjeta de memoria");
        lista.add(3,"laptop");
        lista.add(4,"Teclado");
        lista.add(5,"mouse");
        lista.add(6,"mouspad");
        lista.add(7,"tablet");
        lista.add(8,"celular");
        lista.add(9,"disco duro");
        
        
        System.out.println("El tamaño del arrayList es de: "+lista.size());
        System.out.println("------------------------------------------------");
        System.out.println("Obteniendo valores 3,6 y 9");
        System.out.println(lista.get(3));
        System.out.println(lista.get(6));
        System.out.println(lista.get(9));
        
        System.out.println("-------------------------------------------------");
        System.out.println("Comprobando el ultimo dato");
        System.out.println(lista.contains("disco duro"));
       
        System.out.println("--------------------------------------------------");
        System.out.println("Removiendo un elemento");
        System.out.println("Elemento removido "+lista.remove("tablet"));
        
        System.out.println("--------------------------------------------------");
        System.out.println(lista.set(7,"uno"));
        System.out.println(lista.get(7));
        
        System.out.println("---------------------------------------------------");
        System.out.println("Imprimiento el listado");
        for (String inf : lista) {
            System.out.println(inf);
            
        }
        System.out.println("----------------------------------------------------");
        
        System.out.println("");
        System.out.println("---------------------------------------------------");
        System.out.println("Segundo ArrayList");
        ArrayList<String> instrumentos = new ArrayList<>();
        instrumentos.add(0,"Piano");
        instrumentos.add(1,"Bateria");
        instrumentos.add(2,"Flauta");
        instrumentos.add(3,"Bajo");
        instrumentos.add(4,"Guitarra");
        instrumentos.add(5,"Violin");
        instrumentos.add(6,"Acordeon");
        instrumentos.add(7,"Arpa");
        instrumentos.add(8,"Marimba");
        instrumentos.add(9,"Trompeta");
        
        System.out.println("El tamaño del arrayList es de: "+instrumentos.size());
        System.out.println("------------------------------------------------");
        System.out.println("Obteniendo valores 3,6 y 9");
        System.out.println(instrumentos.get(3));
        System.out.println(instrumentos.get(6));
        System.out.println(instrumentos.get(9));
        
        System.out.println("-------------------------------------------------");
        System.out.println("Comprobando el ultimo dato");
        System.out.println(instrumentos.contains("Trompeta"));
       
        System.out.println("--------------------------------------------------");
        System.out.println("Removiendo un elemento");
        System.out.println("Elemento removido "+instrumentos.remove("Marimba"));
        
        System.out.println("--------------------------------------------------");
        System.out.println(instrumentos.set(8,"uno"));
        System.out.println(instrumentos.get(8));
        
        System.out.println("--------------------------------------------------");
        System.out.println("");
        System.out.println("Imprimiento el ArrayList instumentos");
        for (String instrumento : instrumentos) {
            System.out.println(instrumento);
            
        }
        
        
    }
    
}
