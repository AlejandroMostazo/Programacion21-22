/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Monsty
 */
public class PruebaTiempo {
    public static void main(String[] args) {
        Tiempo t = new Tiempo(4, 20, 30);
        System.out.println(t);
        t.suma(2, 54, 50);
        System.out.println(t);
        t.resta(1, 30, 155);
        System.out.println(t);
    }
}
