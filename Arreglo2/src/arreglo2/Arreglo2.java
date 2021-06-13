/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo2;

/**
 *
 * @author laptop
 */
public class Arreglo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       /* //tipo nombre                 Filas y columnas
        String frutas [][]= new String[2][4];
        frutas[0][0]="mango";
        frutas[0][1]="pera";
        frutas[0][2]="manzana";
        frutas[0][3]="melon";
        //segunda fila
        frutas[1][0]="sandia";
        frutas[1][1]="banano";
        frutas[1][2]="guayaba";
        frutas[1][3]="melocoton";
        
        System.out.println(frutas[1][1]);
        
        
        int edades[][] = new int[2][2];
        edades[0][0]= 5;
        edades[0][1]= 4;
        
        edades[1][0]= 3;
        edades[1][1]= 2;
        
        System.out.println(edades[1][0]);
        
        System.out.println("");
        System.out.println("EJERCICIO");
        System.out.println("Elaborar 3 matrices");
        System.out.println("");
        System.out.println("Una de tipo String de 4X4");
        String meses [][]= new String[4][4];
        meses[0][0]="Enero";
        meses[0][1]="Febrero";
        meses[0][2]="Marzo";
        meses[0][3]="Abril";
        //segunda fila
        meses[1][0]="Mayo";
        meses[1][1]="Junio";
        meses[1][2]="Julio";
        meses[1][3]="Agosto";
        //tercera fila
        meses[2][0]="Septiembre";
        meses[2][1]="Octubre";
        meses[2][2]="Noviembre";
        meses[2][3]="Diciembre";
        //cuarta fila
        meses[3][0]="January";
        meses[3][1]="Februayr";
        meses[3][2]="March";
        meses[3][3]="April";
        
        System.out.println(meses[0][0]);
        System.out.println(meses[3][0]);
        System.out.println(meses[2][2]);
        
        System.out.println("");
        System.out.println("------------------");
        System.out.println("Una de tipo char de 5 x 3");
        char consonantes [][]= new char[5][3];
        consonantes[0][0] = 's';
        consonantes[0][1] = 'k';
        consonantes[0][2] = 'l';
        //segunda fila
        consonantes[1][0] = 'j';
        consonantes[1][1] = 'm';
        consonantes[1][2] = 'n';
        //tercera fila
        consonantes[2][0] = 'o';
        consonantes[2][1] = 'i';
        consonantes[2][2] = 'r';
        //cuarta fila
        consonantes[3][0] = 'f';
        consonantes[3][1] = 'w';
        consonantes[3][2] = 'v';
        //quinta fila
        consonantes[4][0] = 'c';
        consonantes[4][1] = 'x';
        consonantes[4][2] = 'y';
        
        
        System.out.println(consonantes[0][0]);
        System.out.println(consonantes[3][0]);
        System.out.println(consonantes[4][2]);
        
        System.out.println("");
        System.out.println("-----------------------");
        System.out.println("Una de tipo int de 3 x 7");*/
        
        int numeros[][]= new int[3][7];
        numeros[0][0]= 1;
        numeros[0][1]= 2;
        numeros[0][2]= 3;
        numeros[0][3]= 4;
        numeros[0][4]= 5;
        numeros[0][5]= 6;
        numeros[0][6]= 7;
        //segunda fila
        numeros[1][0]= 8;
        numeros[1][1]= 9;
        numeros[1][2]= 10;
        numeros[1][3]= 11;
        numeros[1][4]= 12;
        numeros[1][5]= 13;
        numeros[1][6]= 14;
        //tercera fila
        numeros[2][0]= 15;
        numeros[2][1]= 16;
        numeros[2][2]= 17;
        numeros[2][3]= 18;
        numeros[2][4]= 19;
        numeros[2][5]= 20;
        numeros[2][6]= 21;
        
        /*System.out.println(numeros[0][6]);
        System.out.println(numeros[1][6]);
        System.out.println(numeros[2][6]);*/
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(numeros[i][j]+" ");
                
            }
            System.out.println(" ");
        }
    }
    
}
