public class Ejercicio11 {
	
	public static void main (String[] args) {
		int horas;
		int minutos;
		int resultado;
		System.out.println("Intoduce la hora");
		horas = Integer.parseInt(System.console().readLine());
		System.out.println("RIntroduce los minutos");
		minutos = Integer.parseInt(System.console().readLine());
		resultado = (horas * 60) + minutos;
		resultado = 1440 - resultado;
		System.out.print("Faltan "+resultado+" minutos para las 00:00");
	}
}

