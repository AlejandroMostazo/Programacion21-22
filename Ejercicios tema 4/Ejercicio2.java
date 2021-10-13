public class Ejercicio2 {
	
	public static void main (String[] args) {
		System.out.println("Introzca la hora. utilizando solo un numero");
		int hora = 0;
		hora = Integer.parseInt (System.console().readLine());
		if (hora <= 12 && hora >= 6) {
			System.out.print("Buenos dias Sir");
		} else {
			if (hora >= 13 && hora <= 20) {
				System.out.print("Buenas tardes Sir");
			}
			 else {
				if (hora <=5) {
				System.out.print("Buenas Noches Sir");
				}
			}
		}
	}
}

