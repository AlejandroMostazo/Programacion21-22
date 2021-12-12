/*
 * Puente.java
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


public class Puente {
	
	public static void main (String[] args) {
		
		System.out.print("Introduzca las filas: ");
		int longitud = Integer.parseInt(System.console().readLine());
		int persona = 0;
		int contador = 0;
		
		
		System.out.print("  ");
		for (int x = longitud-4; x > 0; x--) {
			persona = (int)(Math.random()*3);
			if (persona == 2) {
				System.out.print("&");
			} else {
				System.out.print(" ");
			}
			
		}
		System.out.println();
		System.out.print("  ");
		for (int x = longitud-4; x > 0; x--) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 2; i > 0; i--) {
			
			for (int j = i-1; j > 0; j--) {
				System.out.print(" ");
			}
				System.out.print("*");
			for (int j = 0; j < contador+longitud-4; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
			
			contador+=2;
		}
	}
}

