/*Alejandro Mostazo Gamez
 * 08-11-21 
 * 
 * Implemente un programa que dibuje por pantalla una “pirámide rellena porosa” hacia abajo. El
programa solicitará al usuario la altura y el carácter con el que dibujar la pirámide. La porosidad de la pirámide
consiste en que se pinta un carácter de relleno sí y otro no. El borde inferior también es poroso. Observe los
ejemplos.*/


public class Ex17frp2 {
	
	public static void main (String[] args) {
		System.out.print("Introduzca la altura de la pirámide: ");
		int altura = Integer.parseInt(System.console().readLine());
		System.out.print("Introduzca el carácter de relleno: ");
		String caracter = System.console().readLine();
		int decremento = altura;
		
		for (int i = 0; i < altura; i++) {
			for (int espacios = i; espacios > 0; espacios--) {
				System.out.print(" ");
			}
			for (int j = decremento; j > 0; j--) {
				System.out.print(caracter+" ");
			}
			System.out.print("\n");
			decremento--;
		}
		
	}
}

