/*
 * Ejercicio60.java
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


public class Ejercicio60 {
	
	public static void main (String[] args) {
		System.out.println("Introduzca numero: ");
		int dato = Integer.parseInt(System.console().readLine());
		
		for (int i = 0; i < dato - 2; i++) {
			for (int k = 0; k < 3; k++) {
				System.out.print("*");
			}
			for (int k = 0; k < 5; k++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 3; k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		for (int i = 0; i < 2; i++) {
			for (int k = 0; k < 6; k++) {
				System.out.print("*");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 6; k++) {
				System.out.print("*");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		
	}
}

