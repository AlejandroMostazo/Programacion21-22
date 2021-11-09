/*
 * Ejercicio50.java
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


public class Ejercicio50 {
	
	public static void main (String[] args) {
		System.out.println("Introduce la altura");
		int altura = Integer.parseInt(System.console().readLine());
		System.out.println("Introduce los espacios entre numeros");
		int espacios = Integer.parseInt(System.console().readLine());
		
		System.out.print("*");
		for (int j =0; j<2; j++) {
			
		for (int i =0; i < espacios; i++) {
				System.out.print(" ");
			}
			for (int k =0; k<5; k++) {
				System.out.print("*");
			}
		}
		System.out.print("\n");
		System.out.print("*");
		for (int i =0; i < espacios; i++) {
				System.out.print(" ");
			}
			for (int k =0; k<2; k++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
			
		
		System.out.print("*");
		for (int j =0; j<2; j++) {
			for (int i =0; i < espacios; i++) {
				System.out.print(" ");
			}
			for (int k =0; k<5; k++) {
				System.out.print("*");
			}
		}
		System.out.print("\n");
		for (int l =0; l<altura/2-1; l++) {
			System.out.print("*");
			for (int j =0; j<2; j++) {
				for (int i =0; i < espacios; i++) {
					System.out.print(" ");
				}
				for (int i =0; i < 4; i++) {
					System.out.print(" ");
				}
				for (int k =0; k<1; k++) {
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
		System.out.print("*");
		for (int j =0; j<2; j++) {
			for (int i =0; i < espacios; i++) {
				System.out.print(" ");
			}
			for (int k =0; k<5; k++) {
				System.out.print("*");
			}
		}
		System.out.print("\n");
	}
}

