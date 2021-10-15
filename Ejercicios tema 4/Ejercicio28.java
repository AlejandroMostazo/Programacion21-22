public class Ejercicio28 {
	
	public static void main (String[] args) {
    System.out.println("Que ha escogido el jugador 1: ");
		String jugador1 = System.console().readLine();
    System.out.println("Que ha escogido el jugador 2: ");
    String jugador2 = System.console().readLine();
    if (jugador1.equals(jugador2)) {
      System.out.println("Habeis empatado");
    } else {
        if (jugador1.equals("piedra") && jugador2.equals("tijeras") || jugador1.equals("papel") && jugador2.equals("piedra") || jugador1.equals("tijeras") && jugador2.equals("papel") || jugador1.equals("papel") && jugador2.equals("piedra")) {
        System.out.println("El ganador es el jugador 1");
      } else {
        System.out.println("El ganador es el jugador 2");
      }
    }
	}
}
