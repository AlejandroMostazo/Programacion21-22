/*Alejandro Mostazo Gamez
 * 08-11-21 
 * 
 * Escribe un programa que traduzca cada uno de los números de un PIN de varios dígitos introducido
por el usuario a su correspondiente palabra.*/

public class Ex17frp4 {
	
	public static void main (String[] args) {
		System.out.println("Introduzca num largo positivo ");
		long dato = Integer.parseInt(System.console().readLine());
		long calculo = dato;
		String mostrar;
		long aux = 0;
		long modulo = 0;
		
		while (calculo > 0)	{
			aux = aux * 10 + calculo%10;
			calculo /= 10;

		}
		calculo = aux;
			while (calculo > 0)	{
				modulo = calculo%10;
						switch ((int)modulo) {
							case 0:
								System.out.print("cero ");
							break;
							case 1:
								System.out.print("uno ");

							break;
							case 2:
								System.out.print("dos ");

							break;
							case 3:
								System.out.print("tres ");

							break;
							case 4:
								System.out.print("cuatro ");

							break;
							case 5:
								System.out.print("cinco ");

							break;
							case 6:
								System.out.print("seis ");

							break;
							case 7:
								System.out.print("siete ");

							break;
							case 8:
								System.out.print("ocho ");
							break;
							case 9:
								System.out.print("nueve ");
							break;		
					}
			calculo /= 10;
		}
	}
}

