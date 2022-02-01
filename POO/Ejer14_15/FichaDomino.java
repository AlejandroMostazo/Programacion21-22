/*
 * Ejercicio 14
Implementa la clase FichaDomino. Una ficha de dominó tiene dos lados y en
cada lado hay un número del 1 al 6 o bien ningún número (blanco). Cuando se
crea una ficha, se proporcionan ambos valores. Dos fichas encajan si se pueden
colocar una al lado de la otra según el juego del dominó, por ejemplo, las fichas
[ 2 | 5 ] y [ 4 | 5 ] encajan porque se pueden colocar de la forma [ 2 | 5 ] [ 5 | 4
]. A continuación se proporciona el contenido del main y el resultado que debe
aparecer por pantalla.

Ejercicio 15
Utiliza la clase anterior para generar una secuencia de 8 fichas creadas de
forma aleatoria, que encajen bien y que estén bien colocadas según el juego
del dominó. No hay que controlar si se repiten o no las fichas.

 */
package Ejer14_15;
    
/**
 *
 * @author Monsty
 */
public class FichaDomino {
    private int num1;
    private int num2;
    
    public FichaDomino (int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public void voltea () {
        int aux = this.num1;
        this.num1 = this.num2;
        this.num2 = aux;
    }
    
    public boolean encaja (FichaDomino f) {
        boolean junta = false;
        if (this.num1 == f.num1 || this.num2 == f.num1 ) {
            junta = true;
        }
        if (!(junta)) {
            f.voltea();
        }
        if (this.num1 == f.num1 || this.num2 == f.num1 ) {
            junta = true;
        }
        return junta;
    }
    
    @Override
    public String toString () {
        String resultado;
        resultado = "["+this.num1+"|"+this.num2+"]";
        if (this.num1 == 0) {
             resultado = "[ |"+this.num2+"]";
        } else if (this.num2 == 0) {
            resultado = "["+this.num1+"| ]";
        }
        return resultado;
    }
    
}
