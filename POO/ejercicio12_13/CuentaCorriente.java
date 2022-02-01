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
public class CuentaCorriente {
    private int [] NumCue = new int [8];
    private float SalInic;
    
    public CuentaCorriente (float salinic) {
        for (int i = 0; i < 8; i++) {
            this.NumCue[i] = (int)(Math.random()*10);
        }
        this.SalInic = salinic;
    }
    
    public CuentaCorriente () {
        for (int i = 0; i < 8; i++) {
            this.NumCue[i] = (int)(Math.random()*10);
        }
        this.SalInic = 0;
    }
    
    public void ingreso (float dinero) {
        this.SalInic += dinero;
    }
    
    public void cargo (float dinero) {
        this.SalInic += dinero;
    }
    
    public void transferencia (CuentaCorriente CC, float dinero) {
        this.SalInic -= dinero;
        CC.SalInic += dinero;
    }
    
    @Override
    public String toString () {
        String resul = "Número de cta: ";
        for (int i = 0; i < 8; i++) {
            resul += this.NumCue[i];
        }
        resul = " Saldo: "+this.SalInic+" €";
        return resul;
    }
    
}
