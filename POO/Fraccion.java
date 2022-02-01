

/**
 *
 * @author Monsty
 */
public class Fraccion {
    private int numerador;
    private int denominador;
    
    public Fraccion (int numerador, int denominador) {
        this.numerador= numerador;
        this.denominador=denominador;
    }
    
     public void invierte () {
         int aux = this.numerador;
         this.numerador = this.denominador;
         this.denominador = aux;
    }
     
     public void simplifica () {
         int divide =2;
         while (divide <= numerador) {
             if (this.denominador%divide == 0 && this.numerador%divide == 0) {
                 this.denominador /= divide;
                 this.numerador /= divide;
                 divide = 1;
             }
             divide++;
         }
    }
    
     public void multiplca (Fraccion f) {
         this.numerador *= f.numerador;
         this.denominador *= f.denominador;
     }
     
     public String toString () {
         String resultado = "";
         resultado += this.numerador+"/"+this.denominador;
         return resultado;
     }
    
     public void divide (Fraccion f) {
           f.denominador *= this.numerador;
          f.numerador *= this.denominador;
         f.simplifica();
         this.denominador = f.numerador;
         this.numerador = f.denominador;
    }
    
}
