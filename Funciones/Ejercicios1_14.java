package daw;
import java.util.Formatter;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Monsty
 */
public class Ejercicios1_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce 2 números para poner numeros detrás del primero");
        System.out.println(pegaPorDetras(sc.nextLong(), sc.nextInt()));
        
        System.out.println("Introduce 2 números para quitarle n numeros por delante al primero");
        System.out.println(quitaPorDelante(sc.nextLong(), sc.nextInt()));
        
        System.out.println("Introduce 2 números para quitarle n numeros por detras al primero");
        System.out.println(quitaPorDetras(sc.nextLong(), sc.nextInt()));
        
        System.out.println("Introduce 2 numeros, siendo 2º la posición que se desea");
        System.out.println(NumeroPosicion(sc.nextLong(), sc.nextInt()));
        
        System.out.println("Introduce un número para darle la vuelta");
        System.out.println(volteaNum(sc.nextLong()));
        
        System.out.println("Introduce un número para saber su longitud");
        System.out.println(CantDigit(sc.nextLong()));
        
        System.out.println("Introduce un número para aberiguar si es capicúa");
        System.out.println(esCapicua(sc.nextLong()));
       
        System.out.println("Introduce un número para aberiguar si es primo");
        System.out.println(esPrimo(sc.nextLong()));
       
        System.out.println("Introduce un número para aberiguar su primo mas cercano");
        PrimoCercano(sc.nextLong());
        
        System.out.println("Introduce un número para pegarle otro por delante");
        pegaPorDelante(sc.nextLong());
        
        System.out.println("Introduce una base y un exponente para saber la potencia");
        System.out.println(potencia(sc.nextLong(), sc.nextLong()));
    }
    
    public static long pegaPorDetras(long x, long y) {
        long aux = y;
        int len = 1;
        while (aux > 0) {            
            aux /= 10;
            len *= 10;
        }
        x = x*len + y;
        
        return x;
    }
    
    public static long quitaPorDelante (long x, int posicion) {
         long aux = x;
         int len = 0;
         long vol = 1;
         while (aux > 0) {             
             aux /= 10;
             vol *= 10;
         }
         for (int i = 0; i < posicion; i++) {
            vol /= 10;
          }
          x %= vol;
         return x;
     }
    
     public static long quitaPorDetras (long x, int posicion) {
         
         while (posicion > 0) {             
             x /= 10;
             posicion--;
         }
         return x;
     }
    
     public static long NumeroPosicion (long x, int posicion) {
        long aux = x;
        long vol = 1;
        int len = 0;
        while (aux > 0) {
            aux /= 10;
            vol *= 10;
            len++;
        }
        vol /= 10;
        if (posicion <= -1 || posicion >= len) {
             System.out.println("no existe esa posicion");
        } else {
        
            len -= posicion;

             for (int i = 0; i < posicion; i++) {
                 vol /= 10;
             }
             x = x/vol;
             x %= 10;
             return x;

        }
         return 0;
     }
    
    public static Formatter volteaNum (long x) {
        Formatter fmt = new Formatter();
        long aux = x;
        long vol = 0;
        int len = 0;
        while (aux > 0) {
            vol = vol * 10 + aux%10;
            aux /= 10;
            len++;
        }
        String ceros = "%0"+len+"d";
       fmt.format(ceros, vol);
        return fmt;
    }
    
    public static long CantDigit (long x) {
        long aux = x;
        int len = 0;
        while (aux > 0) {
            aux /= 10;
            len++;
        } 
        
        return len;
    }
    
    public static long potencia (long base, long exponente) {
        
        long x = 1;
        for (int i = 0; i < exponente; i++) {
            x *= base;
        }
          
        return x;
    }
    
    public static long pegaPorDelante(long x) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Introduce un número a pegar por delante");
        long y = sc.nextLong();
        long longitud = 1;
        long aux = x;
        while (aux > 0) {
            longitud *= 10;
            aux /= 10;
        }
        
        System.out.println(y*longitud+x);
        return x;
    }
    
    public static long PrimoCercano(long x) {
        boolean primo = false;
        
        while (!primo) {
            primo = true;
            x++;
            for (int i = 2; i < x-1; i++) {
                if (x%i == 0) {
                    primo = false;
                }
            }
        }
          System.out.println("El siguiente numero primo es: "+x);
        return x;
    }
    
    public static boolean esPrimo(long x) {
        
        boolean primo = true;
        for (int i = 2; i < x-1; i++) {
            if (x%i == 0) {
                primo = false;
            }
        }

        return primo;
    }
    
    public static boolean esCapicua(long x) {
        boolean igual = false;
        long  aux = 0;
        aux = x;
        int longitud = 0;
        long elevado = 1;
        
        while (aux > 0) {
            aux /= 10;
            longitud++;
            elevado *= 10;
        }
        elevado /= 10;
        longitud /= 2;
        for (int i = 0; i < longitud; i++) {
            if ((x/elevado)%10 == x%10) {
                igual = true;
           } else {
                igual = false;
                break;
            }
          elevado /= 100;
          x /= 10;
        } 
      return igual;
    }
}
