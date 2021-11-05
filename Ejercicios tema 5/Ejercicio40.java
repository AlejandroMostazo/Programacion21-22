/*
 * Ejercicio40.java
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


public class Ejercicio40 {
	
	public static void main (String[] args) {
		System.out.println("Introduce un numero");
		int introducir = Integer.parseInt(System.console().readLine());
		int interior = 0;
		int espacios = introducir/2; 
		for (int i = 0; i < introducir/2; i++) {
			for (int j = espacios; j > 0; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int k = 1; k < interior; k++) {
				System.out.print(" ");
			}
			if (interior != 0) {
				System.out.print("*\n");
			} else {
				System.out.print("\n");
			}
			interior+=2;
			espacios--;
		}
		espacios = 0;
		interior = introducir - 2;
		for (int i = 0; i < introducir/2 + 1; i++) {
			for (int j = 0; j < espacios; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int k = 0; k < interior; k++) {
				System.out.print(" ");
			}
			if (interior > 0) {
				System.out.print("*\n");
			} else {
				System.out.print("\n");
			}
			interior-= 2;
			espacios++;
		}
	}
}

