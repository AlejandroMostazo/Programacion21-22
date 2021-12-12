/*
 * Valles.java
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


public class Valles {
	
	public static void main (String[] args) {
		System.out.print("Introduzca las filas: ");
		int filas = Integer.parseInt(System.console().readLine());
		System.out.print("Introduzca las columnas: ");
		int columnas = Integer.parseInt(System.console().readLine());
		
		System.out.print("Introduzca maximo aleatorio ");
		int max = Integer.parseInt(System.console().readLine());
		
		System.out.print("Introduzca minimo aleatorio: ");
		int min = Integer.parseInt(System.console().readLine());
		
		int array [][] = new int [filas][columnas];
		
 		String arrayaux [][] = new String [filas][columnas];
 		
 		int valle = 1000;
 		int pico = 0;
 		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				array[i][j] = (int)(Math.random()*(max-min)-min);
				System.out.printf("%4s", array[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				valle = 1000;
				pico = 0;
				for (int k = i-1; k <= i+1; k++) {
					for (int l = j-1; l <= j+1; l++) {
						if (k >= 0 && k < filas && l >= 0 && l < columnas) {
							if (array[k][l] < valle) {
								valle = array[k][l];
							}
							if (array[k][l] > pico) {
								pico = array[k][l];
							}
						}
					}
				}
				if (array[i][j] == valle) {
					arrayaux[i][j] = "V";
				} else if (array[i][j] == pico) {
					arrayaux[i][j] = "^";
				} else {
					arrayaux[i][j] = " ";
				}
			}
		}
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.printf("%4s", arrayaux[i][j]);
			}
			System.out.println();
		}
		
	}
}

