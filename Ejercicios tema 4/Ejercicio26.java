public class Ejercicio26 {
	
	public static void main (String[] args) {
		double r, aux;
		System.out.println("Introduzca cuantas personas van a comprar entradas:");
		int p = Integer.parseInt(System.console().readLine());
		System.out.println("Introduzca el día de la semana en el que están comprando:");
		String dia = System.console().readLine();
		System.out.println("¿Perteneces al clup?(y/n)");
		String descuento = System.console().readLine();
		switch (dia) {
			case "Miercoles":
				r = p * 5;
				if (descuento.equals("y")) {
					r = (9 * r) / 10;
				}	
				System.out.println("El precio total de las entradas será: "+r);
			break;
			case "Jueves":
				if (p%2 == 0) {
					r = (double)(p/2) * 11;
				} else {
					r = (double)(p/2) * 11;
					r = r + 8;
				}
				if (descuento.equals("y")) {
					r = (9 * r) / 10;
				}
				System.out.println("El precio total de las entradas será: "+r);
			break;
			default:
				r = p * 8;
				if (descuento.equals("y")) {
					r = (9 * r) / 10;
				}
				System.out.println("El precio total de las entradas será: "+r);
		}
	}
}

