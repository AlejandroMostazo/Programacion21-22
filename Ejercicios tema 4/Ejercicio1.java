public class Ejercicio1 {
	
	public static void main (String[] args) {
		System.out.println("Introduce el día de la semana (con la primera letra en mayuscula)");
		String dia = System.console().readLine();
		switch (dia) {
			case "Lunes":
				System.out.println("Lenguaje de Marcas");
				break;
			case "Martes":
				System.out.println("Entornos de Desarrollo");
				break;
			case "Miercoles":
				System.out.println("Entornos de Desarrollo");
				break;
			case "Jueves":
				System.out.println("Lenguaje de Marcas");
				break;
			case "Viernes":
				System.out.println("Formación y orientacion Laboral");
				break;
			default: 
				System.out.print("No existe ese día o lo has escrito en minuscula");
		}	
	}
}

