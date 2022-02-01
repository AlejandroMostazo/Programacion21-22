/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12_13;

/**
 *
 * @author Monsty
 */
public abstract class Publicacion {
    private int ISBN;
    private String Titulo;
    private int AñoPublica;
    
    public Publicacion (int isbn, String titulo, int año) {
        this.ISBN = isbn;
        this.Titulo = titulo;
        this.AñoPublica = año;
    }
    
    public String toString () {
        String resul;
        resul = "ISBN: "+this.ISBN+", título: "+this.Titulo+", año de pulicación: "+this.AñoPublica;
        return resul;
    }
    
}
