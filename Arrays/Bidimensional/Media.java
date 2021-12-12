/*
 * Medio.java
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


public class Media {
	
	public static void main (String[] args) {
		final int FILAS = 8;
		final int COLUMNAS = 8;
		int array[][] = new int [FILAS][COLUMNAS];
		int arraymedia[][] = new int [FILAS][COLUMNAS];
		int contador = 0;
		
		
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				array[i][j] = (int)(Math.random()*201);
				System.out.printf("%4d", array[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				
				for (int k = i-1; k <= i+1; k++) {
					for (int l = j-1; l <= j+1; l++) {
						if (k >= 0 && k < FILAS && l >=0 && l < COLUMNAS) {
							arraymedia[i][j] = arraymedia[i][j] + array[k][l];
							contador++;
						}
					}
				}
				arraymedia[i][j] = arraymedia[i][j] / contador;
				contador = 0;
				System.out.printf("%4d", arraymedia[i][j]);
			}
			System.out.println();
		}
	}
}

