/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *POBLACION: Nombre, Capacidad máxima de personas
constructor: inicializa el monbre; la capacidad maxima 
    inicial es 10 e inicialmente no hay nadie
toString: devuelve el nombre de la poblacion y los nombres 
    y dnis de susu habitantes
BuscarPersona: a partir de un DNI, nos dara la persona
AñadirHabitantes: si hay sitio, se añade al habitante que se para 
    por parámetro.
Habitantes: devuelve el numero de habitantes que hay
SitiosLibres: devuelve el nº de sitios libres en la poblacion.
Emigar: A partir de un DNI y de una poblacion que se pasa como argumento,
    se pasa al habitante cuyo dni esté en la población argumento a la población 
    que recibe el método.
 * @author Monsty
 */
public class Poblacion {
    private  String Nombre;
    private int poblacionActual;
    private Persona Habitantes[];
    private int CapacidadMax =10;
   
    public Poblacion (String nombre) {
        this.Nombre = nombre;
        Habitantes = new Persona[CapacidadMax];
        this.poblacionActual = 0;
    }
    
    public boolean AnadirHabitante (Persona p) {
        boolean anadir = false;
        if (this.poblacionActual < CapacidadMax) {
            this.Habitantes[poblacionActual] = p;
            this.poblacionActual++;
            anadir = true;
        }
        return anadir;
    }
    
    public boolean EliminarHabitante (Persona p) {
       boolean encontrado = false;
       int j = 0;
        for (int i = 0; i < poblacionActual; i++) {
            if (Habitantes[i].getDNI().equals(p.getDNI())) {
                encontrado = true;
                break;
            }
            j++;
        }
        if (encontrado) {
            for (int i = j; i < poblacionActual -1; i++) {
                this.Habitantes[i] = this.Habitantes[i+1];
            }
            this.Habitantes[poblacionActual] = null;
        }
        if (this.Habitantes[poblacionActual] == null) {
            this.poblacionActual--;
            return true;
        }
        return false;
    }
    
    public int numHabitantes () {
        return this.poblacionActual;
    }
    
    public int SitiosLibres () {
        return this.CapacidadMax - this.poblacionActual;
    }
    
    public Persona BuscarPersona (String dni) {
        Persona p = null;
        for (int i = 0; i < this.poblacionActual-1; i++) {
            if ((this.Habitantes[i].getDNI()).equals(dni)) {
                p = this.Habitantes[i];
            }
        }
        return p;
    }
    
    
    public boolean Emigar (String dni, Poblacion p) {
        if (!(BuscarPersona(dni).equals(null)) && this.SitiosLibres() > 0) {
            p.AnadirHabitante(BuscarPersona(dni));
            EliminarHabitante(BuscarPersona(dni));
            return true;
        }
        return false;
    }
    
    @Override
    public String toString () {
        String re = "";
        re += this.Nombre + "\n";
        for (int i = 0; i < poblacionActual; i++) {
            re += Habitantes[i]+"\n";
        }
        return re;
    }
    
}
