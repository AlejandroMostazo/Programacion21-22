/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Monsty
 */
public class Tiempo {
    private int hora;
    private int minutos;
    private int segundos;
    
    public Tiempo (int h, int m, int s) {
        this.hora = h;
        this.minutos = m;
        this.segundos = s;
    }
    
    public void suma (int h, int m, int s) {
        this.hora += h;
        this.minutos += m;
        this.segundos +=s;
        while (this.segundos>= 60 || this.minutos>= 60 ) {            
           if (this.segundos>= 60) {
                this.minutos++;
                this.segundos -= 60;
            }
            if (this.minutos>= 60) {
                this.hora++;
                this.minutos -= 60;
            } 
        }
    }
    
   public void resta (int h, int m, int s) {
      
       int Segundos = h*3600 + m*60 + s;
       int Original = this.hora*3600 + this.minutos*60 + this.segundos;
       
       Original -= Segundos;
       
       if (Original < 0 ) {
           this.hora = 0;
           this.minutos = 0;
           this.segundos = 0;
       }
       
       this.hora = Original /3600;
       Original %= 3600;
       this.minutos = Original/60; 
       Original %= 60;
       this.segundos = Original;
       
    }
    
   public String toString () {
       String resultado = "";
       resultado += this.hora+"h "+this.minutos+"m "+this.segundos+"s";
       return resultado;
   }
   
}
