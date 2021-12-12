/*
 * usar 2 arrays 
 * 
 * llevar 2 contadores de posiciones uno para > 100 y otro de < 100 y 
 * usarlos para saber cual es la ultima posición del array original de donde se ha cogido el número
 * 
 * antes de utilizar esos 2 contadores tenemos que saber cuantos números hay de menores y de mayores
 * para que cuando nos quedemos sin menores o mayores se rellene con lo que queda.
 * 
 * para colocarlos, ir preguntado si es mayor o menor y si es mayor lo guardamos en una variable
 * y si es menor en otra.
 * 
 * 
 * 
 * 
 */


public class cien {
	
	public static void main (String[] args) {
		
		int mayor = 0;
		int menor = 0;
		
		int pequeño = 0;
		
		int array [] = new int [10];
		int menores [] = new int [10];
		int mayores [] = new int [10];
		int arrayaux [] = new int [10];
		
		for (int i = 0; i < 10; i++) {
			array[i] = (int)(Math.random()*201);
			System.out.print(array[i]+" ");
			if (array[i] <= 100) {
				menores[menor] = array[i];
				menor++;
			} else {
				mayores[mayor] = array[i];
				mayor++;
			}
		}
		int i = 0;
		int menorclocado = 0;
		int mayorclocado = 0;
		
		
		while (i < 10) {
			if (menorclocado < menor) {
				arrayaux[i] = menores[menorclocado];
				menorclocado++;
				i++;
			}
			if (mayorclocado < mayor) {
				arrayaux[i] = mayores[mayorclocado];
				mayorclocado++;
				i++;
			}
		}
		
		menor = 0;
		mayor = 1;
		
		
		
		System.out.println();
		for (int j = 0; j < 10; j++) {
			System.out.print(arrayaux[j]+" ");
		}
		
	}
}

