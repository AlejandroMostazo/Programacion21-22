/*
 * Ejercicio35.java
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


public class Ejercicio35 {
	
	public static void main (String[] args) {
		System.out.println("Introduce la altura");
		int pintar = Integer.parseInt(System.console().readLine());
		int interior = pintar -2;
		int espacios = 0;
		for (int i = 0; i < pintar/2; i++) {
			for (int j = 0; j < espacios; j++) {
				System.out.print(" ");
			}
			espacios++;
			System.out.print("*");
			for (int k = 0; k < interior; k++) {
				System.out.print(" ");
			}
			interior-= 2;
			System.out.print("*\n");
		}
		for (int i = 0; i < pintar/2; i++) {
			System.out.print(" ");
			
		}
		System.out.print("*\n");
		for (int i = 0; i < pintar/2; i++) {
			for (int j = 0; j < espacios-1; j++) {
				System.out.print(" ");
			}
			espacios--;
			System.out.print("*");
			for (int k = 0; k < interior+2; k++) {
				System.out.print(" ");
			}
				System.out.print("*\n");
			interior+= 2;
		}
	}
}

