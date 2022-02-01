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
public class Libro extends Publicacion implements Prestable {
    private boolean Prestado;
    
    public Libro (int isbn, String titulo, int año) {
        super(isbn, titulo, año);
        this.Prestado = false;
    }

    @Override
    public void presta() {
        if (!(estaPrestado())) {
          this.Prestado = true;  
        } else {
            System.out.println("Lo siento, ese libro ya está prestado");
        }
    }

    @Override
    public void devuelve() {
        this.Prestado = false;
    }

    @Override
    public boolean estaPrestado() {
        return this.Prestado;
    }

    @Override
    public String toString() {
        String resul = super.toString();
        resul += " ("+((estaPrestado())?"prestado":"no prestado")+")";
        return resul; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
