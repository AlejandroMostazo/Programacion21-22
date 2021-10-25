public class Ejercicio12 {
	
	public static void main (String[] args) {
		System.out.println("Introduce la cantidad de numeros que quieres obtener de figonachie");
		int n = Integer.parseInt(System.console().readLine());
		int segundo = 1;
		int primero = 0;
		int rs;
		System.out.println(primero);
		for (int i = 0; i < n; i++) {
			System.out.println(segundo);
			rs = primero + segundo;
			primero = segundo;
			segundo = rs;
		}
	}
}

