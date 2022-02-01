/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Monsty
 */
public class Consulta {
    public static void main(String[] args) {
        Poblacion p1 = new Poblacion( "Malaga");
        Poblacion p2 = new Poblacion("Cordoba");
        p1.AnadirHabitante(new Persona("1234v", "pablo"));
        p1.AnadirHabitante(new Persona("Ale"));
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.Emigar("1234v", p2));
        System.out.println(p1);
        System.out.println(p2);
    }
}
