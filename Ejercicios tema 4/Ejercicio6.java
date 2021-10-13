public class Ejercicio6 {
	
	public static void main (String[] args) {
		System.out.println("Introduce la altura desde donde va a caer: ");
		double h = Integer.parseInt(System.console().readLine());
		double t = Math.sqrt((h*2) / 9.81);
		System.out.print("El tiempo en el que caerá el objeto es: "+t);
	}
}

