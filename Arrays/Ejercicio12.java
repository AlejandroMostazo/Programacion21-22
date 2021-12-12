/*
 * Ejercicio12.java
 * 
 * Copyright 2021 usuario <usuario@usuario>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class Ejercicio12 {
	
	public static void main (String[] args) {
		int diez = 0; 
		int[] numeros = new int[10];
		int auxini = 0;
		int aux = 0;
		
		while (diez < 10) {
			System.out.print("Introduce un numero hasta llegar a 10 llevas "+diez+" numeros:");
			int dato = Integer.parseInt(System.console().readLine());
			numeros[diez] = dato;
			diez++;
			
		}
		System.out.print("Introduce el inicio");
		int inicio = Integer.parseInt(System.console().readLine());
		System.out.print("Introduce el final:");
		int fin = Integer.parseInt(System.console().readLine());
		if (inicio < fin && inicio < 10 && inicio > -1 && fin < 10 && fin > -1) {
			aux = numeros[9];
			auxini = numeros[inicio];
			for (int i = 9; i > 0; i--){
				
				if (i < inicio+1 || i > fin-1) {
					numeros[i] = numeros[i-1];
				} 		
			}
			numeros[0] = aux;
			numeros[fin] = auxini;
						
		} else {
			System.out.print("El inicio no puede ser mayor al final o ha introducido ");
		}
		for (int i = 0; i < 10; i++){
			System.out.print(numeros[i]+" ");
		}
	}
}

