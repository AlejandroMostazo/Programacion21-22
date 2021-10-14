public class Ejercicio19 {
	
	public static void main (String[] args) {
		int n, x = 0;
		System.out.println("Introduce los numeros que quieras");
		n = Integer.parseInt(System.console().readLine());
		while (n != 0) {
			n = n/10;
			x = 1 + x;
		}
		System.out.print("El número de dígitos introducidos son:"+x);
	}
}

