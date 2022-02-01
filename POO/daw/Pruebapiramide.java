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
public class Pruebapiramide {
    public static void main(String[] args) {
    String resultado = "";
    int altura = 7;
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < i; j++) {
                resultado += " ";
            }
            for (int j = altura-1-i; j > 0; j--) {
                if (j < altura-1-i && j > 1 && i > 0) {
                    resultado += "  ";
                } else {
                     resultado += "*";
                }
                
            }
            resultado += "\n";
        }
      
        System.out.println(resultado);
  }  
}
