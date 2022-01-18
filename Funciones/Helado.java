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
public class Helado {
    private String Sabor;
    private int Volumen;
    private boolean azucar;
    private boolean gluten;
    private boolean vegano;
    
     public Helado() {
      this("chocolate", 10);
    }
    
    
    public Helado(String sabor, int volumen) {
        this.Sabor = sabor;
        this.Volumen = volumen;
        this.azucar = true;
        this.gluten = true;
        this.vegano = false;
    }
    
     public Helado(String sabor, int volumen, String a, String g, String v) {
        this(sabor, volumen);
         if (a.equals("azucar")) {
            this.azucar = true; 
         } else {
             this.azucar = false;
         }
         if (g.equals("singluten")) {
             this.gluten = false;
         } else {
             this.gluten = true;
         }
         if (v.equals("vegano")) {
             this.vegano = true;
         } else {
             this.vegano = false;
         }
        
    }
    
     public int Cantidad () {
         return this.Volumen;
     }
     
    public void PonerSabor (int x){
        switch (x) {
            case 1: 
                this.Sabor = "Manzana";
            break;
            case 2:
                this.Sabor = "Melocoton";
            break;
            case 3:
                this.Sabor = "Fresa";
             break;
             default:
                 this.Sabor = "Chocolate";
              break;
        }
    }

    public boolean Chupar () {
        if (this.Volumen > 0) {
            this.Volumen--;
            return true;
        }
        return false;
    }
    
    public int CantidadHelado () {
        return this.Volumen;
    }
    
    public String toString () {
        String resultado = "";
        resultado += "Sabor: "+this.Sabor+"\n";
        resultado += "Volumen: "+this.Volumen+"\n";
        if (!azucar) {
            resultado += "Azucar: "+this.azucar+" ";
        }
        if (!gluten) {
            resultado += "Gluten: "+this.gluten+" ";
        }
        if (vegano) {
            resultado += "Vegano: "+this.vegano+" ";
        }
        return resultado;
    }
    
    public int compare (Helado h) {
        if (this.Volumen == h.Volumen) {
            return 0;
        }
        if (this.Volumen < h.Volumen) {
            return -1;
        }
        return 1;
    }
    
}
