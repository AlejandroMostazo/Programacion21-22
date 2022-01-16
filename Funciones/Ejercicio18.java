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
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(DecimalBin(sc.nextLong()));
    }
    public static long DecimalBin (long x) {
        long binario = 0;
        long aux = 0;
        int exp = 0;
        while (x!=0) {            
            aux = x%2;
            binario = binario + aux * Ejercicios1_14.potencia(10, exp);
            exp++;
            x /= 2;
        }
        return binario;
    }
     
}
