package daw;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Monsty
 */
public abstract class Vehiculo {
    protected static float vehiculosCreados;
    protected static float kilometrosTotales;
    protected float kilometrosRecorridos;
    
    public static float KmTotal () {
        return kilometrosTotales;
    }
}



   class Coche extends Vehiculo {
        
        public Coche() {
            vehiculosCreados++;
        }
        
        public void Conducir (int KmH, int minutos) {
            kilometrosRecorridos = kilometrosRecorridos + KmH*((float)minutos/60);
            kilometrosTotales += kilometrosRecorridos;
        }
        
        public void QuemarRueda (int segundos) {
            kilometrosRecorridos += (float)segundos/10;
            kilometrosTotales += kilometrosRecorridos;
        }
        
        public float KmCoche () {
            return kilometrosRecorridos;
        }
    }

 class Bicicleta extends Vehiculo {
        
        public Bicicleta() {
            vehiculosCreados++;
        } 
        public void Pedalear (int pedaleadas) {
            kilometrosRecorridos += (float)pedaleadas/10;
            kilometrosTotales += kilometrosRecorridos;
            
        }
        public void Caballito (int segundos) {
            kilometrosRecorridos += (float)segundos/10;
            kilometrosTotales += kilometrosRecorridos;
        }
        public float KilometrosBici () {
            return kilometrosRecorridos;
        }
    }