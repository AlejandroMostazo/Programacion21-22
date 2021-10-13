public class Ejercicio5 {
	
	public static void main (String[] args) {
		int a, b;
		double x;
		System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
		System.out.println("Por favor, introduzca el valor de a: ");
		a = Integer.parseInt(System.console().readLine());
		System.out.println("Ahora introduzca el valor de b: ");
		b = Integer.parseInt(System.console().readLine());
		x = (0 - b) / (double)a;
		System.out.println("x = "+x);
	}
}

