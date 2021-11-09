/*
 * Ejercicio63.java
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


public class Ejercicio63 {
	
	public static void main (String[] args) {
		System.out.println("Introduzca numero: ");
		int dato = Integer.parseInt(System.console().readLine());
		System.out.println("Introduzca numero 2º piramide: ");
		int segunda = Integer.parseInt(System.console().readLine());
		int incremento = 1;
		int incremento2 = 1;
		
		for (int altura = dato; altura > 0; altura--) {
			for (int espacio = altura - 1; espacio > 0; espacio--) {
				System.out.print(" ");
			}
			for (int pintar = 0; pintar < incremento; pintar++) {
				System.out.print("*");
			}
			System.out.print(" ");
			if (altura <= segunda) {
				for (int espacio = altura*2 -2; espacio >= 0; espacio--) {
					System.out.print(" ");
				}
				for (int pintar = 0; pintar < incremento2; pintar++) {
					System.out.print("*");
				}
				incremento2+=2;
			}
			incremento+=2;
			System.out.print("\n");
		}
	}
}

