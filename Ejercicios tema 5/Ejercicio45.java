public class Ejercicio45 {
	
	public static void main (String[] args) {
		System.out.println("Introduce un numero");
		int introducir = Integer.parseInt(System.console().readLine());
		System.out.println("Introduce la posicion que se desa cortar");
		int cortar = Integer.parseInt(System.console().readLine());
		System.out.println("Introduce el numero a insertar");
		int insertar = Integer.parseInt(System.console().readLine());
		int calculo = introducir;
		int longitud = 0;
		int elevado=1;
		
		while (calculo > 0) {
			calculo /= 10;
			longitud++;
		}
		for (int i = 0; i <= longitud-cortar; i++) {
			elevado *= 10;
		}
		calculo = introducir/elevado;
		longitud = introducir%(elevado/10);
		
		System.out.println(calculo+""+insertar+""+longitud);
	}
}
