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
public class Mobiliario {
    public static void main(String[] args) {
        //Mueble miMueble = new Mueble("madera", 12,"marron");
        Mesa miMesa = new Mesa(Materiales.CRISTAL, 5, "verde", 4);
        Armario miArmario = new Armario(Materiales.METAL, 100, "blanco", 2);
        
        //System.out.println(miMueble);
        System.out.println(miMesa);
        System.out.println(miArmario);
        
        Mesa conjunto [] = new Mesa[10];
        
        for (int i = 0; i < 10; i++) {
            conjunto[i] = new Mesa(Materiales.PVC, 1+i, "amarillo"+i, 13+i);
            System.out.println(conjunto[i]);
        }
        
        Modificable objetoModificable = new Armario(Materiales.CRISTAL, 100, "blanco", 2);
        Modificable objetoModificable1 = new Mesa(Materiales.MADERA, 23, "verde", 33);
        
        // Como es unn objeto de tipo Modificable solo estan disponibles los metodos 
        //de ese tipo
        objetoModificable.duplicar();
        // Para usar los metodos de la otra clase se debe hacer un casting
        ((Armario)objetoModificable).toString();
        
        Mueble [] misMuebles = new Mueble[4];
        misMuebles[0] = miMesa;
        misMuebles[1] = miArmario;
        misMuebles[2] = new Mesa(Materiales.PVC, 23, "rojo", 30);

    }
}
