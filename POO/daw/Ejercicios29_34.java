/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw;

/**
 *
 * @author Monsty
 */
public class Ejercicios29_34 {
    public static void main(String[] args) {
        int array[][] = GenArrayBi(5, 5, 90, 1);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.println("Coordenadas");
        int coordenada[] = CoordenadasArray(array, 3);
        for (int i = 0; i < coordenada.length; i++) {
            System.out.print(coordenada[i]+" ");
        }
        
        System.out.println("");
        int Filarray[] = FilaArrayBi(array, 2);
        for (int i = 0; i < array.length; i++) {
            System.out.print(Filarray[i]+" ");
        }
        
        System.out.println("");
        int Columarray[] = ColumnaArrayBi(array, 2);
        for (int i = 0; i < Columarray.length; i++) {
            System.out.print(Columarray[i]+" ");
        }
    
    public static boolean SillaBi (int array[][]) {
        boolean silla = false;
        if (CoordenadasArray(array)) {
            
        }
        return silla;
    }
        
    
    public static int[] CoordenadasArray (int array[][], int numero) {
        int Coordenadas[] = new int [2];
         boolean encontrado = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == numero) {
                   Coordenadas[0] = i;
                   Coordenadas[1] = j;
                   encontrado = true;
                }
            }
        }
        if (!(encontrado)) {
            Coordenadas[0] = -1;
            Coordenadas[1] = -1;
        }
        return Coordenadas;
    }
    
    public static int[] ColumnaArrayBi (int array[][], int columnas) {
        int columna [] = new int [array[0].length];
        for (int i = 0; i < array[0].length; i++) {
            columna[i]=array[i][columnas];
        }
        return columna;
    }
        
    public static int[][] GenArrayBi (int filas, int columnas, int max, int min) {
        int array[][] = new int [filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                array[i][j] = (int)(Math.random()*(max-min))+min;
            } 
        }
        return array;
    }
    
     public static int[] FilaArrayBi (int array[][], int filas) {
         int fila [] = new int [array.length];
         for (int i = 0; i < array.length; i++) {
             fila[i] = array[filas][i];
         }
         return fila;
     }
}
