

public class Ejercicio15 {
	
	public static void main (String[] args) {
		int resultado = 1;
		System.out.println("Introduzca la base: ");
		int base = Integer.parseInt(System.console().readLine());
		System.out.println("Introduzca el exponente: ");
		int exponente = Integer.parseInt(System.console().readLine());
		
		for (int i = 1; i <= exponente; i++) {
			for (int y = 0; y < i; y++) {
				resultado = resultado * base;	
			}
			System.out.println(base+"^"+i+"="+resultado);
			resultado = 1;
			base = base + i;
		}
		
	}
}

