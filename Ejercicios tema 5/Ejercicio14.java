
public class Ejercicio14 {
	
	public static void main (String[] args) {
		int resultado = 1;
		System.out.println("Introduzca la base: ");
		int base = Integer.parseInt(System.console().readLine());
		System.out.println("Introduzca el exponente: ");
		int exponente = Integer.parseInt(System.console().readLine());
		
		for (int i = 0; i < exponente; i++) {
			resultado = resultado * base;
		}
		System.out.println(base+"^"+exponente+"="+resultado);
	}
}

