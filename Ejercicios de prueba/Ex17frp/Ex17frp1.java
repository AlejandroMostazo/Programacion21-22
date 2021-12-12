
/*Alejandro Mostazo Gamez
 * 08-11-21
 * 
 * Implemente un programa que calcule el número de latidos del corazón de una persona durante el
transcurso de varios años. Al usuario se le solicitará interactivamente el tiempo transcurrido, expresado en
años, y el ritmo cardíaco medio durante todos esos años, medido en latidos por minuto. No es necesario
considerar los años bisiestos, se considera que todos los años tienen 365 días.*/

public class Ex17frp1 {
	
	public static void main (String[] args) {
		System.out.print("Introduzca su ritmo cardíaco medio en pulsaciones por minuto: ");
		int pulsaciones = Integer.parseInt(System.console().readLine());
		System.out.print("Introduzca el tiempo en años: ");
		int años = Integer.parseInt(System.console().readLine());
		
		int calculo = 0;
		
		calculo = pulsaciones * (años * 525600);		
		
		
		System.out.println("En ese tiempo, su corazón habrá latido "+calculo+" veces.");
	}
}

