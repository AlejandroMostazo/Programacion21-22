/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer14_15;

/**
 *
 * @author Monsty
 */
public class PruebaDomino {
    public static void main(String[] args) {
        FichaDomino f1 = new FichaDomino(6, 1);
        FichaDomino f2 = new FichaDomino(5, 1);
        FichaDomino f3 = new FichaDomino(6, 2);
        FichaDomino f4 = new FichaDomino(0, 3);
        
        System.out.println(f1.encaja(f4));
        System.out.println(f4);
        int v1 = (int)(Math.random()*7);
        int v2 = (int)(Math.random()*7);
        FichaDomino array [] = new FichaDomino[8];
        for (int i = 0; i < 8; i++) {
            array[i] = new FichaDomino(v1, v2);
            System.out.print(array[i]);
            v1 = v2;
            v2 = (int)(Math.random()*7);
        }
    }
}
