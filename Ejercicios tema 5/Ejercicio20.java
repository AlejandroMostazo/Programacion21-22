
public class Ejercicio20 {
	
	public static void main (String[] args) {
		System.out.println("Introduzca el tamaño de la piramide, un numero ");
		int tamaño = Integer.parseInt(System.console().readLine());
		int tamañofin = tamaño *2 - 1;
		int espacios = tamaño - 1;
		int espaciosint = tamaño - espacios;
		System.out.println("Introduzca el caracter de construccion ");
		String caracter = System.console().readLine();
		for (int i = 1; i < tamaño; i++) {
				System.out.print(" ");
		}
		System.out.println(caracter);
		while (tamaño != 2) {
			for (int i = 1; i < espacios; i++) {
				System.out.print(" ");
			}
			System.out.print(caracter);
			for (int i = 1; i < espaciosint*2; i++) {
				System.out.print(" ");
			}
			System.out.println(caracter);
			tamaño--;
			espacios--;
			espaciosint++;
		}
		for (int i = 0; i < tamañofin; i++) {
				
				System.out.print(caracter);
			}
	}
}

