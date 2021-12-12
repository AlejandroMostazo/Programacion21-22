/*
 * Ejercicio17.java
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


public class Ejercicio17 {
	
	public static void main (String[] args) {
		int numeros[] = new int[10];
		boolean iguales = false;
		int dato = 0;
		
		for (int i = 0; i < 10; i++) {
			numeros[i] = (int)(Math.random()*201);
		}
		System.out.println();
		System.out.println("┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
		System.out.println("│ 0  │ 1  │ 2  │ 3  │ 4  │ 5  │ 6  │ 7  │ 8  │ 9  │");
		System.out.println("┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
		for (int i = 0; i < 10; i++) {
			System.out.printf("|%4s", numeros[i]+" ");
		}
		System.out.println();
		System.out.println("┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
		
		while (!iguales) {
			System.out.print("Introduce un numero de la array: ");
			dato = Integer.parseInt(System.console().readLine());
		
			for (int i = 0; i < 10; i++) {
				if (numeros[i] == dato) {
					iguales = true;
				}
			}	
		}
		
		while(numeros[0] != dato) {
			int aux = numeros[9];
			for (int i = 9; i > 0; i--) {
				numeros[i] = numeros[i-1];
			}
			numeros[0] = aux;
		}
		for (int i = 0; i < 10; i++) {
			System.out.printf(numeros[i]+" ");
		}
	}
}

