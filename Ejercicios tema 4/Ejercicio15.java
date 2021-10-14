public class Ejercicio15 {
	
	public static void main (String[] args) {
		String sinbolo;
		System.out.println("Escribe el caracter que desees:");
		sinbolo = System.console().readLine();
		System.out.printf("%6s",sinbolo+"\n");
		System.out.printf("%7s",sinbolo+sinbolo+sinbolo+"\n");
		System.out.printf("%8s",sinbolo+sinbolo+sinbolo+sinbolo+sinbolo+"\n");
		System.out.printf("%9s",sinbolo+sinbolo+sinbolo+sinbolo+sinbolo+sinbolo+sinbolo+"\n");
		System.out.print(sinbolo+sinbolo+sinbolo+sinbolo+sinbolo+sinbolo+sinbolo+sinbolo+sinbolo+"\n");
	}
}

