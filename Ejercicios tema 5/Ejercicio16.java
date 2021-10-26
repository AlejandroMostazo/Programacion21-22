

public class Ejercicio16 {
	
	public static void main (String[] args) {
		System.out.println("Introduzca el numero que quieres saber si es primo: ");
		int boleano = 1;
		int i;
		int numero = Integer.parseInt(System.console().readLine());
		for (i = 2; i < numero; i++) {
			if ((numero % i) == 0) {
				boleano = 0;
			}
		}
		if (boleano == 1) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}
	}
}

