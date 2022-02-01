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
public class ProgramaHelado {
    public static void main(String[] args) {
        Helado MiPrimerHelado;
        Helado otrohelado = new Helado("Vainilla", 50);
        MiPrimerHelado = new Helado("fresa", 8, "azucar", "singluten", "novegano");
        
        System.out.println(MiPrimerHelado.Chupar());
        for (int i = MiPrimerHelado.CantidadHelado(); i > 0; i--) {
            MiPrimerHelado.Chupar();
           System.out.println(MiPrimerHelado.CantidadHelado());
           if (MiPrimerHelado.CantidadHelado() == 0) {
               System.out.println("No puede ser, te comiste el helado T_T");
           }
        }
        
        System.out.println(MiPrimerHelado);
        
        if (MiPrimerHelado.compare(otrohelado) > 0) {
            System.out.println("El primero es mayor");
        } else if (MiPrimerHelado.compare(otrohelado) == 0) {
            System.out.println("iguales");
        } else {
            System.out.println("El segundo es mayor");
        }
        
        System.out.println("Hasta el momento se han creado "+Helado.heladosCreados());
    }
}
