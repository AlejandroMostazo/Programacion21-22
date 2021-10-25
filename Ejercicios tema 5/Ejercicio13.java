public class Ejercicio13 {
	
	public static void main (String[] args) {
		int n;
		int negativo = 0;
		int positivo = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduzca un numero: ");
			n = Integer.parseInt(System.console().readLine());
			if (n <= -1) {
				negativo++;
			} else {
				positivo++;
			}
		}
		System.out.print("la cantidad de negativos es:"+negativo + "y el numero de positivos es: "+positivo);
	}
}

