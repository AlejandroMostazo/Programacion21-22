/*
 * Ejercicio65.java
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


public class Ejercicio65 {
	
	public static void main (String[] args) {
		System.out.println("Introduzca la altura ");
		int dato = Integer.parseInt(System.console().readLine());
		System.out.println("linea del palo ");
		int palo = Integer.parseInt(System.console().readLine());
		int incremento = 0;
		
		for (int altura = dato; altura > 0; altura--) {
			for (int espacios = altura - 1; espacios > 0; espacios--) {
				System.out.print(" ");
			}
				System.out.print("*");
			if (dato - altura +1  == palo) {
				for (int espacios = 1; espacios < incremento; espacios++) {
					System.out.print("*");
				}
			} else {
				for (int espacios = 1; espacios < incremento; espacios++) {
					System.out.print(" ");
				}
			}
			if (incremento > 0) {
				System.out.print("*\n");
			} else {
				System.out.print("\n");
			}
			incremento+=2;
		}
	}
}

