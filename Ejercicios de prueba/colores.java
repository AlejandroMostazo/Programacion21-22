/*
 * pedir 8 datos
 * 
 * array con colores conocios
 * 
 * comprobar si la palabra es un color o no y colocarlos en el array 3 ademas
 * de contar los que se colocan para saber cuantos faltan por coloar 
 * 
 * array2 con datos
 * 
 * array3 colocacion
 * 
 * detectar las palabras que no son colores 
 * 
 * introducir las palabras que no son colores a la array 3 
 * 
 * 
 */


public class colores {
	
	public static void main (String[] args) {
		
		int contar = 0;
		
		String array [] = new String [8];
		
		String array2 [] = new String [9];
		array2[0] = "verde";
		array2[1] = "rojo";
		array2[2] = "azul";
		array2[3] = "amarillo";
		array2[4] = "naranja";
		array2[5] = "rosa";
		array2[6] = "negro";
		array2[7] = "blanco";
		array2[8] = "morado";
		
		String array3 [] = new String [8];
		int comprobar = 0;
		
		for (int i = 0; i < 8; i++) {
			System.out.print("Introduzca una palabra: ");
			array[i] = System.console().readLine();
			for (int j = 0; j < 9; j++) {
				if (array[i].equals(array2[j]) && contar < 8 ) {
					array3[contar] = array[i];
					contar++;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < 8; i++) {
			comprobar = 0;
			for (int j = 0; j < contar; j++) {
				if (!(array[i].equals(array3[j])) && contar < 8) {
					comprobar++;
				}
			}
			if (comprobar == contar) {
					array3[contar] = array[i];
					contar++;
			}
		}
		
		for (int i = 0; i < 8; i++) {
			System.out.print(array3[i]+" ");
		}
		
	}
}

