/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw;
import java.util.Scanner;
/**
 *
 * @author Monsty
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Binario -> decimal");
        System.out.println(Ejercicio17.BinarioDecimal(sc.nextLong()));
        
        System.out.println("Decimal -> Binario");
        System.out.println(Ejercicio18.DecimalBin(sc.nextLong()));
        
        System.out.println("Decimal -> hexadecimal");
        System.out.println(decimalAHexadecimal(sc.nextInt()));  
        
        System.out.println("Decimal -> octal");
        System.out.println(decimalAOctal(sc.nextInt()));  
        
        System.out.println("Binario -> hexadecimal");
        int decimal = Math.toIntExact(Ejercicio17.BinarioDecimal(sc.nextLong()));
        System.out.println(decimalAHexadecimal(decimal));
        
        System.out.println("Binario -> octal");
        long decimallong = Ejercicio17.BinarioDecimal(sc.nextLong());
        System.out.println(decimalAOctal(decimallong));        
        
        System.out.println("hexadecimal -> Decimal");
        System.out.println(HexadecimalADecimal(sc.next())); 
        
        System.out.println("hexadecimal -> Binario");
        System.out.println(Ejercicio18.DecimalBin(HexadecimalADecimal(sc.next())));
        
        System.out.println("hexadecimal -> octal");
        System.out.println(decimalAOctal(HexadecimalADecimal(sc.next())));
              
        System.out.println("octal -> Decimal");
        System.out.println(OctalADecimal(sc.nextLong()));
         
        System.out.println("octal -> Binario");
        System.out.println(Ejercicio18.DecimalBin(OctalADecimal(sc.nextLong())));        
        System.out.println("octal -> Hexadecimal");
        System.out.println(decimalAHexadecimal(OctalADecimal(sc.nextLong())));
    }
    
    public static  long OctalADecimal (long octal) {
        long decimal = 0;
        int contador = 0;
        while (octal > 0) {
            long aux = octal%10;
            decimal = decimal + aux * Ejercicios1_14.potencia(8, contador);
            octal /=10;
            contador++;
        }
        
        
        return decimal;
    }
    
    public static  long HexadecimalADecimal (String hexadecimal) {
        long decimal = 0;
        int exponente = hexadecimal.length()-1;
        String caracteres = "0123456789abcdef";
        for (int i = 0; i < hexadecimal.length(); i++) {
            for (int j = 0; j < caracteres.length(); j++) {
                if (caracteres.charAt(j) == hexadecimal.charAt(i)) {
                    decimal = decimal + j*(Ejercicios1_14.potencia(16,exponente));
                }
            }
            exponente--;
            
        }
        return decimal;
    }
    
     public static long decimalAOctal(long decimal) {
        long octal = 0;
        long elevado = 1;
        long caracteres[] = {0, 1, 2, 3, 4, 5, 6, 7};
        while (decimal > 0) {
            int aux = Math.toIntExact(decimal) % 8;
            octal = caracteres[aux]*elevado + octal;
            decimal /= 8;
            elevado*=10;
        }
        return octal;
    }
    
    public static String decimalAHexadecimal(long decimal) {
    String hexadecimal = "";
    String caracteres = "0123456789abcdef";
    while (decimal > 0) {
        long aux = decimal % 16;
        hexadecimal = caracteres.charAt(Math.toIntExact(aux)) + hexadecimal;
        decimal /= 16;
    }
    return hexadecimal;
}
}
