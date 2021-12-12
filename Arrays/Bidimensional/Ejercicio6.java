/*
 * Ejercicio28.java
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


public class Ejercicio6 {
	
	public static void main (String[] args) {
		int array [][] = new int [6][10];
		String maximo = "";
		String minimo = "";
		int comprueba = 0;
		int comprueba2 = 1001;
		
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 10; j++) {
				array[i][j] = (int)(Math.random()*1001);
				
				for (int k = i-1; k >= 0; k--) {
					for (int l = j-1; l >=0; l--) {
						if (array[i][j] == array[k][l]) {
							array[i][j] = array[i][j]+1;
						}
					}
					if (array[i][j] > comprueba) {
						maximo = i+","+j;
						comprueba = array[i][j];
					} 
					if (comprueba2 > array[i][j]){
						minimo = i+", "+j;
						comprueba2 = array[i][j];
					}
				}
				
				
				System.out.printf("%5s", array[i][j]);
			}
			System.out.println();
		}
		System.out.print("el maximo es "+maximo+" y el minimo es "+minimo);
	}
}

