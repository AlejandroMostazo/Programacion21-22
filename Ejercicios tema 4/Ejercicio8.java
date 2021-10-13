public class Ejercicio8 {
	
	public static void main (String[] args) {
		System.out.println("Resultado de primera nota:");
		double x = Float.parseFloat(System.console().readLine());
		System.out.println("Resultado de segunda nota:");
		double y = Float.parseFloat(System.console().readLine());
		System.out.println("Resultado de tercera nota:");
		double z = Float.parseFloat(System.console().readLine());
		double resultado = ( x + y + z) / 3;
		System.out.println("Resultado "+resultado);
		if (resultado < 5 && resultado > 0) {
			System.out.print("Insuficiente");
		} else {
			if (resultado < 6) {
				System.out.print("Suficiente");
			} else {
				if (resultado < 7) {
					System.out.print("Bien");
				} else {
					if (resultado < 8.5) {
						System.out.print("Notable");
					} else {
						System.out.print("Sobresaliente");
					}
				}
			}
		}
	}
}
