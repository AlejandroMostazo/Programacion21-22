

public class Ejercicio59 {
	
	public static void main (String[] args) {
		System.out.println("Introduzca numero: ");
		int dato = Integer.parseInt(System.console().readLine());
		int decremento = dato- 3;
		int altura = 0;
		
		for (int espacio = decremento; espacio > 0; espacio--) {
				System.out.print(" ");
		}
		System.out.print("*\n");
		for (altura = 0; altura < dato - 3; altura++) {
			for (int espacio = decremento; espacio > 0; espacio--) {
				System.out.print(" ");
			}
			decremento--;
			System.out.print("^");
			for (int dentro = altura*2; dentro > 1; dentro--) {
				System.out.print(" ");
			}
			if (altura > 0) {
				System.out.print("^\n");
			} else {
				System.out.print("\n");
			}
		}
		for (int pintar = 0; pintar < altura*2 + 1; pintar++) {
				System.out.print("^");
		}
		System.out.print("\n");
		for (int espacio = dato-3; espacio > 0; espacio--) {
				System.out.print(" ");
		}
		System.out.print("Y");
	}
}

