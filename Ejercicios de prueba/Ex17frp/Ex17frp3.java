/*Alejandro Mostazo Gamez
 * 08-11-21 
 * 
 * Implemente un programa que presente por pantalla el horario de acceso a internet de un router de
un ISP. Para cada día de la semana, se mostrará si hay acceso a internet o no durante cada una de las 24
horas. El programa solicitará interactivamente el día de la semana donde comienza el acceso a internet, la
hora a la que comenzar y cuántas horas se va a restringir el acceso. Las horas en las que se limitará el acceso
serán consecutivas. En caso de rebasarse el domingo, esas horas “se pierden”. Observe los ejemplos*/


public class Ex17frp3 {
	
	public static void main (String[] args) {
		System.out.println("Indique el día de la semana (en minúscula): ");
		String dia = System.console().readLine();
		System.out.println("Indique la hora de inicio (0-23): ");
		int inicio = Integer.parseInt(System.console().readLine());
		System.out.println("Indique el n.º de horas: ");
		int numhoras = Integer.parseInt(System.console().readLine());
		int resta = 0;;
		int suma = 0;
		
		System.out.println("┌───┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┐");
		System.out.println("│   │ 0│ 1│ 2│ 3│ 4│ 5│ 6│ 7│ 8│ 9│10│11│12│13│14│15│16│17│18│19│20│21│22│23│");
		System.out.println("├───┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┤");
		System.out.print("│ L ");
			for (int cuadrado = 0; cuadrado <= 23; cuadrado++) {
				if (dia.equals("lunes") && cuadrado >= inicio && suma < 24-inicio) {
					System.out.print("│ X");
					suma++;
				} else {
					System.out.print("│  ");
				}
				resta = numhoras - suma;
			}
			System.out.print("|\n");
		System.out.println("├───┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┤");
		System.out.print("| M ");
			for (int cuadrado = 0; cuadrado <= 23; cuadrado++) {
				if (resta != 0 && suma < 24) {
					System.out.print("│ X");
					suma++;
				} else {
					System.out.print("│  ");
				}
				if (dia.equals("martes") && cuadrado >= inicio && suma < 24-inicio) {
					System.out.print("│ X");
					suma++;
				} 
				resta = numhoras - suma;
			}
			System.out.print("|\n");
		System.out.println("├───┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┤");
		System.out.print("| X ");
		for (int cuadrado = 0; cuadrado <= 23; cuadrado++) {
				if (resta != 0 && suma < 24) {
					System.out.print("│ X");
					suma++;
				} else {
					System.out.print("│  ");
				}
				if (dia.equals("miercoles") && cuadrado >= inicio && cuadrado < 24-inicio) {
					System.out.print("│ X");
					suma++;
				} 
				resta = numhoras - suma;
			}
		
		System.out.println("├───┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┤");
		System.out.print("| J ");
		for (int cuadrado = 0; cuadrado <= 23; cuadrado++) {
				if (resta != 0 && suma < 24) {
					System.out.print("│ X");
					suma++;
				} else {
					System.out.print("│  ");
				}
				if (dia.equals("jueves") && cuadrado >= inicio && suma < 24-inicio) {
					System.out.print("│ X");
					suma++;
				} 
				resta = numhoras - suma;
			}
		
		System.out.println("├───┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┤");
		System.out.print("| V ");
		for (int cuadrado = 0; cuadrado <= 23; cuadrado++) {
				if (resta != 0 && suma < 24) {
					System.out.print("│ X");
					suma++;
				} else {
					System.out.print("│  ");
				}
				if (dia.equals("viernes") && cuadrado >= inicio && suma < 24-inicio) {
					System.out.print("│ X");
					suma++;
				} 
				resta = numhoras - suma;
			}
		System.out.println("├───┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┤");
		System.out.print("| S ");
		for (int cuadrado = 0; cuadrado <= 23; cuadrado++) {
				if (resta != 0 && suma < 24) {
					System.out.print("│ X");
					suma++;
				} else {
					System.out.print("│  ");
				}
				if (dia.equals("sabado") && cuadrado >= inicio && suma < 24-inicio) {
					System.out.print("│ X");
					suma++;
				} 
				resta = numhoras - suma;
			}
		
		System.out.println("├───┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┤");
		System.out.println("│ D |──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┤");
		
		
	}
}

