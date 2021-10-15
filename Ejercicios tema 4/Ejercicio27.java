public class Ejercicio27 {
	
	public static void main (String[] args) {
		double r = 0, x;
		System.out.println("La tarta es de fresa, manzana o chocolate");
		String pregunta1 = System.console().readLine();
		System.out.println("¿La tarta lleva nata?");
		String pregunta3 = System.console().readLine();
		System.out.println("¿La tarta lleva nombre personalizado?");
		String pregunta4 = System.console().readLine();
		switch (pregunta1) {
			case "fresa":
				r = r + 16;
			break;
			case "manzana":
				r = r + 18;
			break;
			case "chocolate":
				System.out.println("Chocolate blanco o negro");
				String pregunta2 = System.console().readLine();
				if (pregunta2.equals("blanco")) {
					r = r + 15;
				} else {
					r = r + 14;
				}
			break;
		}
		switch (pregunta3) {
			case "si":
				r = r + 2.5;
			break;
		}
		switch (pregunta4) {
			case "si":
				r = r + 2.75;
			break;
		}
		System.out.println("La tarta que has pedido va a costar: "+r);
	}
}

