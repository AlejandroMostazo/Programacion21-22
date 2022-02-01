

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Monsty
 */
public class Ejercicio55 {
    public static void main(String[] args) {
        
        String array[] = {"casa","coche","sol","mesa","mesa","coche","ordenador","sol","CASA","CASA"};
        for (int i = 0; i < array.length; i++) {
            System.out.print(sinRepetir(array)[i]+" ");
        }
        
    }
    
    public static String[] sinRepetir(String[] s) {
        
        
        String arraysol [] = new String[s.length];
        int contador = 1;
        arraysol[0] = s[0];
        boolean encontrado = false;
        for (int i = 1; i < s.length; i++) {
            encontrado = false;
            for (int j = 0; j < contador; j++) {
                 if (s[i].equals(arraysol[j])) {
                     encontrado = true;
                     j = s.length;
                 }
            }
            if (!(encontrado)) {
                arraysol[contador]=s[i];
                contador++;
            }
           
        }
        return arraysol;
    }
}
