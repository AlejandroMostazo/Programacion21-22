/*
 * Ejercicio9.java
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


public class Ejercicio9 {
	
	public static void main (String[] args) {
		final int FILAS = 12;
		final int COLUMNAS = 12;
		
		int aux1 = 0;
		int aux2 = 0;
		
		int array [][] = new int[FILAS][COLUMNAS];
		
		for (int i = 0; i<FILAS; i++) {
			for (int j = 0; j<COLUMNAS; j++) {
				array[i][j] = (int)(Math.random()*101);
				System.out.printf("%4s", array[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		
		for (int i = 0; i < FILAS/2; i++) {
			aux1 = array[i][COLUMNAS-1-i];
			for (int j = COLUMNAS-1-i; j > 0+i; j--) {
				array[i][j] = array[i][j-1];
			}
			
			aux2 = array[FILAS-1-i][COLUMNAS-1-i];
			for (int j = FILAS-1-i; j > 1+i; j--) {
				array[j][COLUMNAS-1-i] = array[j-1][COLUMNAS-1-i];
			}
			array[i+1][COLUMNAS-1-i] = aux1;
			
			aux1 = array[FILAS-1-i][i];
			for (int j = i; j < COLUMNAS-2-i; j++) {
				array[FILAS-1-i][j] = array[FILAS-1-i][j+1];
			}
			array[FILAS-1-i][COLUMNAS-2-i] = aux2;
			
			for (int j = i; j < FILAS-2-i; j++) {
				array[j][i] = array[j+1][i];
			}
			array[FILAS-2-i][i] = aux1;
		}
		
		
		
		for (int i = 0; i<FILAS; i++) {
			for (int j = 0; j<COLUMNAS; j++) {
				System.out.printf("%4s", array[i][j]);
			}
			System.out.println();
		}
	}
}

