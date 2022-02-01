
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author Monsty
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*String name = sc.nextLine();*/
        
        System.out.println(Primo1A1000());
    }
    
    public static String Primo1A1000() {
        boolean primo = false;
        int x = 4;
        String resultado = "3";
        while (x < 1000) {
            primo = true;
            x++;
            for (int i = 2; i < x-1; i++) {
                if (x%i == 0) {
                    primo = false;
                }
            }
            if (primo) {
                resultado = resultado+", "+x;
            }  
        }
        return resultado;
    }
}
