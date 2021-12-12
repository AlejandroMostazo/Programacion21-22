/*
 * Pececitos.java
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


public class Pececito {
	
	public static void main (String[] args) {
		int cantidad = (int)(Math.random()*5+1);
		int contador = 0;
		
		boolean encontrado = false;
		
		System.out.print("Introduzca la altura de la pecera: ");
		int filas = Integer.parseInt(System.console().readLine());
		System.out.print("Introduzca la anchura de la pecera: ");
		int columnas = Integer.parseInt(System.console().readLine());
		
		int array [] = new int [cantidad];
		String pecera [][] = new String [filas][columnas];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*(columnas*filas-filas*2-columnas*2)+1);
			for (int j = 0; j < i-1; j++) {
				if (array[j] == array[i]) {
					array[i]++;
				}
			}
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		for (int i = 0; i < columnas; i++) {
			pecera[0][i] = "-";
			pecera[filas-1][i] = "-";
		}
		for (int i = 0; i < filas; i++) {
			pecera[i][0] = "|";
			pecera[i][columnas-1] = "|";
		}
		
		for(int i = 1; i < filas-1; i++) {
			for(int j = 1; j < columnas-1; j++) {
				contador++;
				encontrado = false;
				for (int k = 0; k < array.length; k++) {
					if (contador == array[k]) {
						encontrado = true;
					} 
				}
				if (encontrado) {
					pecera[i][j] = "&";
				} else {
					pecera[i][j] = " ";
				}
			}
		}
		
		for(int i = 0; i < filas; i++) {
			for(int j = 0; j < columnas; j++) {
				System.out.print(pecera[i][j]);
			}
			System.out.println();
		}
		
		
	}
}

