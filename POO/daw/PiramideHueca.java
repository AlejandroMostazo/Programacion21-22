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
public class PiramideHueca {
    private String nombre;
    private int altura;
    private String CaracterB;
    private String CaracterR;
    private String Orientacion;
    
    public PiramideHueca (String nombre, int altura) {
        this.nombre = nombre;
        this.altura = altura;
        this.CaracterB = "*";
        this.CaracterR = " ";
        this.Orientacion = "^";
    }
    
    public PiramideHueca (String nombre, int altura, String orientacion) {
        this(nombre, altura);
        this.CaracterB = "*";
        this.CaracterR = " ";
        this.Orientacion = orientacion;
    }
    
    public PiramideHueca (String nombre, int altura, String orientacion, String borde) {
        this(nombre, altura, orientacion);
        this.CaracterB = borde;
        this.CaracterR = " ";
    }
    
     public PiramideHueca (String nombre, int altura, String orientacion, String borde, String relleno) {
        this(nombre, altura, orientacion, borde);
        this.CaracterR = relleno;
    }
    
    public void CambiaCaracter (String caracter) {
        this.CaracterB = caracter;
    }
    
    public void CambiaAltura (int A) {
        if (A < 0) {
          this.altura = 0;  
        } else {
           this.altura = A;
        }
    }
    
   
    public String toString () {
        String resultado = "";
        switch (this.Orientacion) {
            case "^":
                for (int i = 0; i < (altura-1)*CaracterB.length(); i++) {
                    resultado += CaracterR;
                }
                resultado += this.CaracterB+"\n";
                for (int i = 1; i < (altura-1); i++) {
                    for (int j = 0; j < (altura-1-i)*CaracterB.length(); j++) {
                        resultado += CaracterR;
                    }
                    resultado += this.CaracterB;
                    for (int j = 0; j < (i*2-1)*CaracterB.length(); j++) {
                          resultado += CaracterR;  
                    }
                    resultado += this.CaracterB+"\n";
                }
                for (int i = 0; i < altura*2-1; i++) {
                    resultado += this.CaracterB;
                }
                resultado += "\n"; 
            break;
            case ">":
                if (this.altura%2 == 0) {
                   for (int i = 1; i < (this.altura/2)+1; i++) {
                    for (int j = 0; j < i; j++) {
                        if (j > 0 && j < i-1) {
                            resultado += this.CaracterR;
                        } else {
                            resultado += this.CaracterB;
                        }
                    } 
                    resultado += "\n";
                   }
                    for (int i = this.altura/2; i > 0; i--) {
                     for (int j = i; j > 0; j--) {
                         if (j < i && j > 1) {
                            resultado += this.CaracterR;
                        } else {
                            resultado += this.CaracterB;
                        }
                    } 
                    resultado += "\n";
                   } 
                } else {
                    for (int i = 1; i < (this.altura+1)/2; i++) {
                        for (int j = 0; j < i; j++) {
                            if (j > 0 && j < i-1) {
                            resultado += this.CaracterR;
                            } else {
                                resultado += this.CaracterB;
                            }
                        } 
                        resultado += "\n";
                       }
                      for (int i = (this.altura/2)+1; i > 0; i--) {
                        for (int j = i; j > 0; j--) {
                             if (j < i && j > 1) {
                            resultado += this.CaracterR;
                            } else {
                                resultado += this.CaracterB;
                            }
                        } 
                        resultado += "\n";
                       }
                }
            break;
            case "<":
            for (int i = 0; i < (altura/2)+1; i++) {
                for (int j = 0; j < (altura/2)-i; j++) {
                    resultado += " ";
                }
                for (int j = 0; j < i+1; j++) {
                    if (j > 0 && j < i) {
                        resultado += this.CaracterR;
                    } else {
                        resultado += this.CaracterB;
                    }

                }
                 resultado += "\n";
            }
            for (int i = 0; i < altura/2; i++) {
                for (int j = 0; j < i+1; j++) {
                    resultado += " ";
                }
                for (int j = 0; j < (altura/2)-i; j++) {
                    if (j > 0 && j < (altura/2)-i-1) {
                        resultado += this.CaracterR;
                    } else {
                        resultado += this.CaracterB;
                    }
                }
                 resultado += "\n";
            }
            break;
            case "v":
              for (int i = 0; i < altura; i++) {
                for (int j = 0; j < i; j++) {
                    resultado += " ";
                }
                for (int j = (altura-i)*2-1; j > 0; j--) {
                    if (j < ((altura-i)*2-1) && j > 1 && i > 0) {
                        resultado += this.CaracterR;
                    } else {
                         resultado += this.CaracterB;
                    }

                }
                resultado += "\n";
            }  
            break;
        }
        return resultado; 
    }
}
