/*
 * Ejercicio1.java
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


public class Ejercicio1 {
	
	public static void main (String[] args) {
		
		System.out.print("Introduzca el número de filas:");
		int filas = Integer.parseInt(System.console().readLine());
		System.out.print("Introduzca el número de columnas:");
		int columnas = Integer.parseInt(System.console().readLine());
		
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if (i%2 != 0) {
					System.out.print(" █");
				} else {
					System.out.print("█ ");
				}
				
			}
			System.out.println();
		}
	}
}

