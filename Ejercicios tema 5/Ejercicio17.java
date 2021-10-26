/*
 * Ejercicio17.java
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


public class Ejercicio17 {
	
	public static void main (String[] args) {
		System.out.println("Introduzca el numero que quieres saber los siguientes 100 ");
		int n = Integer.parseInt(System.console().readLine());
		while (n < 0) {
				System.out.println("Introduzca el numero que quieres saber si es primo: ");
				n = Integer.parseInt(System.console().readLine());
		}
		for (int i = 0; i < 100; i++) {
					n = n + 1;
					System.out.println(n);
				}
		
	}
}

