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
public class Piramide {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        PiramideHueca PiramideEstandar = new PiramideHueca("Juan", 8, ">", "w", " ");
        System.out.println("Introduce la altura y el caracter");
      //  int altura = sc.nextInt();
      //  String caracter = sc.nextLine();
        PiramideHueca PiramidePersonalizada = new PiramideHueca("juanito", 10, "v", "*", " ");
        
        System.out.println(PiramideEstandar);
        PiramideEstandar.CambiaCaracter("o");
        System.out.println(PiramideEstandar);
        System.out.println(PiramidePersonalizada);
    }
}
