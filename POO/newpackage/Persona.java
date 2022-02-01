/*
 * crear un programa que mantenga una base de datos de poblaciones
 * y personas que las habitan.
 * Clases:
PERSONA: DNI, nombre
Constructor: inicializa todos los atributos
toString

POBLACION: Nombre, Capacidad máxima de personas
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
 */
package newpackage;

/**
 *PERSONA: DNI, nombre
Constructor: inicializa todos los atributos
toString
 * @author Monsty
 */
public class Persona {
    private String DNI;
    private String Nombre;
    
    public Persona (String dni, String nombre) {
        this.DNI = dni;
        this.Nombre = nombre;
    }
    
    public Persona (String nombre) {
        String aux = "";
        char letra = (char)(Math.random()*(89-65)+65);
        for (int i = 0; i < 8; i++) {
            aux += (int)(Math.random()*9);
        }
        this.DNI = aux;
        this.DNI += letra;
        this.Nombre = nombre;
    }
    
    public String getDNI () {
        return this.DNI;
    }
    
    @Override
    public String toString () {
        String re = "DNI: "+this.DNI+" Nombre: "+this.Nombre;
        return re;
    }
    
}
