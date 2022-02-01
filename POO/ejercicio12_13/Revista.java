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
public class Revista extends Publicacion{
    private int numero;
    
    public Revista (int isbn, String titulo, int año, int numero) {
        super(isbn, titulo, año);
        this.numero = numero;
    }
}
