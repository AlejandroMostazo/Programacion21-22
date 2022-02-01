/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobiliario;

/**
 *
 * @author Monsty
 */
public class Armario extends Mueble implements Modificable {
    private int numPuertas;
    
    public Armario (Materiales m, int p, String c, int NP) {
        super(m, p, c);
        this.numPuertas = NP;
    }
     public String toString() {
        String resultado = "Armario: \n";
        resultado += super.toString();
        resultado += "Numero de puertas: "+this.numPuertas+"\n";
        return resultado;
    }
    
       public void duplicar() {
        this.numPuertas *= 2;
    }
     
}
