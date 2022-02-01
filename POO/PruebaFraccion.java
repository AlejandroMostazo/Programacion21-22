/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Monsty
 */
public class PruebaFraccion {
    public static void main(String[] args) {
        Fraccion f = new Fraccion(3, 10);
        Fraccion f1 = new Fraccion(2, 5);
        System.out.println(f+" : "+f1);
        f.divide(f1);
        System.out.println(f);
    }
}
