public class Ejercicio7 {
	
	public static void main (String[] args) {
		System.out.println("Resultado de primera nota:");
		double x = Integer.parseInt(System.console().readLine());
		System.out.println("Resultado de segunda nota:");
		double y = Integer.parseInt(System.console().readLine());
		System.out.println("Resultado de tercera nota:");
		double z = Integer.parseInt(System.console().readLine());
		double resultado = ( x + y + z) / 3;
		System.out.print("Resultado "+resultado);
	}
}

