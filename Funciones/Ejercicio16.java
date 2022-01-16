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
public class Ejercicio16 {
    public static void main(String[] args) {
       for (int i = 1; i < 99999; i++) {
            if(Ejercicios1_14.esCapicua(i)) {
                System.out.println(i);
            }
        }
    }  
}
