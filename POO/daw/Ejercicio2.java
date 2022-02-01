package daw;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Monsty
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        Bicicleta bici = new Bicicleta();
        System.out.println(bici);
        Coche coche = new Coche();
        while (menu != 8) {
            System.out.println("1 Anda con la bicicleta");
            System.out.println("2 Haz el caballito con la bicicleta");
            System.out.println("3 Anda con el coche");
            System.out.println("4 Quema rueda con el coche");
            System.out.println("5 Ver kilometraje de la bicicleta");
            System.out.println("6 Ver kilometraje del coche");
            System.out.println("7 Ver kilometraje total");
            System.out.println("8 salir");
            System.out.print("Elige una opción (1-8): ");
           menu = sc.nextInt();
           switch (menu) {
               case 1:
                   System.out.println("Cuantas pedaleadas vas a dar: ");
                   bici.Pedalear(sc.nextInt());
                   System.out.println("Pedaleando ...");
                    try {
                        Thread.sleep(2000);
                    }
                    catch(InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
               break;
               case 2:
                   System.out.println("Cuantos segundos puedes hacer el caballito: ");
                   bici.Caballito(sc.nextInt());
                   System.out.println("Pedaleando ...");
                    try {
                        Thread.sleep(2000);
                    }
                    catch(InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
               break;
               case 3:
                   System.out.println("Cuantos minutos vas a conducir: ");
                   int minutos = sc.nextInt();
                   System.out.println("A cuantos Km/h vas a conducir: ");
                   int Kmh = sc.nextInt();
                   coche.Conducir(Kmh, minutos);
                   System.out.println("Conduciendo ...");
                    try {
                        Thread.sleep(1000+minutos*10);
                    }
                    catch(InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
               break;
               case 4:
                   System.out.println("Cuantos segundos vas a quemar rueda: ");
                   coche.QuemarRueda(sc.nextInt());
                   System.out.println("Quemando rueda ...");
                    try {
                        Thread.sleep(2000);
                    }
                    catch(InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
               break;
               case 5:
                   System.out.println("");
                   System.out.println("Los kilometros que ha recorrido bici son: ");
                   System.out.print( bici.KilometrosBici());
                   System.out.println("");
               break;
               case 6:
                   System.out.println("");
                   System.out.print("Los kilometros que ha recorrido coche son: ");
                   System.out.println(coche.KmCoche()); 
                   System.out.println("");
               break;
               case 7:
                   System.out.println("");
                   System.out.println("Los kilometros totales que se han hecho con todos los vehiculos son: ");
                   System.out.printf("%.3f", Vehiculo.KmTotal());
                   System.out.println("");
               break;
               case 8:
               
               break;
           }
            
        }
    }
}
