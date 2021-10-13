public class Ejercicio12 {
	
	public static void main (String[] args) {
		String opcion;
		int resultado = 0;
		System.out.println("Elige una de las opciones");
		System.out.println("¿Que es la CPU?");
		System.out.println("A) Es un componente del pc que hace opereciones");
		System.out.println("B) Es un periférico");
		System.out.println("B) Es una ardilla que vive dento del pc");
		opcion = System.console().readLine();
		if (opcion == "A") {
			resultado = resultado + 1;
		}
	}
}

