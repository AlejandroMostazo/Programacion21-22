/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw;
import java.awt.event.TextListener;
import java.util.Scanner;
/**
 *
 * @author Monsty
 */
public class Ejercicio20_28 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
          System.out.println("tamaño de array");
         int tamaño = sc.nextInt();
         System.out.println("numero aleatorio min");
        int min = sc.nextInt();
         System.out.println("numero aleatorio max");
         int max = sc.nextInt();
        int array[] = generaArrayInt(tamaño, max, min);
        for (int i = 0; i < tamaño; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int arrayvolteada[] = VolteaArray(array);
        System.out.println("volteada");
        for (int i = 0; i < tamaño; i++) {
             System.out.print(arrayvolteada[i]+" ");
        }
        System.out.println();
        int arrayrotada[] = RotaDerArray(array, sc.nextInt());
        System.out.println("array rotada");
        for (int i = 0; i < tamaño; i++) {
             System.out.print(arrayrotada[i]+" ");
        }
        System.out.println();
        int arrayrotadaiz[] = RotaIzquierdaArray(array);
        System.out.println("array rotada izq");
        for (int i = 0; i < tamaño; i++) {
             System.out.print(arrayrotadaiz[i]+" ");
        }
        System.out.println();
        System.out.println("El menor es: "+MinArray(array));
        System.out.println("El mayor es: "+MaxArray(array));
        System.out.println("la media es: "+MediaArray(array));
        System.out.println("Introduce un numero para saber si esta dentro del array");
        System.out.println("¿Esta dentro de la array? "+ExisEnArray(array, sc.nextInt()));
        System.out.println("Introduce un numero para saber su posicion en el array");
        System.out.println("su posicion es: "+PosicionEnArray(array, sc.nextInt()));
    }
   
    public static int[] RotaIzquierdaArray (int array[]) {
        int arrayrotadaiz [] = new int [array.length];
        int aux = array[0];
        for (int i = 0; i < array.length-1; i++) {
            arrayrotadaiz[i] = array[i+1];
        }
        arrayrotadaiz[array.length-1] = aux;
        return arrayrotadaiz;
    }
    
    public static int[] RotaDerArray (int array[], int posiciones) {
        int arrayrotada [] = new int [array.length];
        int aux = array[array.length-posiciones];
        for (int i = array.length-posiciones; i > 0; i -= posiciones) {
            if (i-posiciones >= 0) {
               arrayrotada[i] = array[i-posiciones]; 
            }
        }
        if (array.length%posiciones == 0) {
            arrayrotada[0] = aux;
        } else {
            arrayrotada[posiciones-1] = aux;
        }
        
        return arrayrotada;
    }
    
    public static int[] VolteaArray (int array[]) {
        int volteado [] = new int [array.length];
        int contador = 0;
        for (int i = array.length-1; i >= 0; i--) {
            volteado[contador] = array[i];
            contador++;
        }
        return volteado;
    }
    
    public static int PosicionEnArray (int array[], int numero) {
        int posicion = 0;
        for (int i = 0; i < array.length; i++) {
            if (numero == array[i]) {
                posicion=i;
            }
        }
        return posicion;
    }
    
    public static boolean ExisEnArray (int array[], int numero) {
        boolean Exist = false;
        for (int i = 0; i < array.length; i++) {
            if (numero == array[i]) {
                Exist=true;
            }
        }
        return Exist;
    }
    
    public static int[] generaArrayInt (int tamaño, int max, int min) {
        int array[] = new int [tamaño];
        for (int i = 0; i < tamaño; i++) {
            array[i] = (int)(Math.random()*(max-min))+min;
        }
        
        return array;
    }    
    
    public static int MinArray (int array[]) {
        int min = 9999;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
                
        return min;
    }
    
     public static int MaxArray (int array[]) {
         int max = 0;
         for (int i = 0; i < array.length; i++) {
             if (max < array[i]) {
                 max = array[i];
             }
         }
         
         return max;
     }
     
     public static int MediaArray (int array[]) {
         int media = 0;
         
         for (int i = 0; i < array.length; i++) {
             media = media + array[i];
         }
         media /= array.length;
         return media;
     }
}
