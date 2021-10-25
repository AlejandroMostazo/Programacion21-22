public class Ejercicio11 {
	
	public static void main (String[] args) {
		System.out.println("Introduce el numero que quieres calcular");
		int numero = Integer.parseInt(System.console().readLine());
		for (int i = numero; i < numero + 5; i++) {
			System.out.printf("%4d %6d %8d \n", i, i*i, i*i*i);
		}
	}
}

