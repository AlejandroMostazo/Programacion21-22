public class Ejercicio4 {
	
	public static void main (String[] args) {
		System.out.println("Por favor, introduzca el número de horas trabajadas durante la semana:");
		int horas = Integer.parseInt(System.console().readLine());
		int resultado;
		if (horas <= 40) {
			resultado = horas * 12;
		} else {
			resultado = (horas - 40) * 16;
			resultado = resultado + (40 * 12);
		}
		System.out.println("El sueldo semanal que le corresponde es de: "+resultado+"€");
	}
}
