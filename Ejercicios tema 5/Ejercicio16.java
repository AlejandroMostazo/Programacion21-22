

public class Ejercicio16 {
	
	public static void main (String[] args) {
		System.out.println("Introduzca el numero que quieres saber si es primo: ");
		int r;
		boolean boleano;
		int numero = Integer.parseInt(System.console().readLine());
		for (int i = 2; i > numero; i++) {
			r = numero % i;
			if (r == 0) {
				boleano = false;
			}
		}
		if (boleano) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}
	}
}

