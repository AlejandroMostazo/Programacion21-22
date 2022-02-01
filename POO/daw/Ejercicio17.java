/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw;
import java.util.Scanner;
/**
 *
 * @author Monsty
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(BinarioDecimal(sc.nextLong()));
    }
    
    public static long BinarioDecimal (long x) {
       long aux = x;
       int len = 0;
       long decimal = 0;
               
       while (aux > 0) {
           aux /= 10;
           len++;
       }    
       if (x%10 == 1) {
           decimal = 1;
       }
       x /= 10;
            for (int i = 1; i < len; i++) {
                if (x%10 == 1) {
                    aux = Ejercicios1_14.potencia(2, i);
                    decimal = decimal + aux;
                }
                x /= 10;
            }
        return decimal;
    }
}
