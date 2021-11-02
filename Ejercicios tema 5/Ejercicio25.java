/*
 * Ejercicio25.java
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


public class Ejercicio25 {
	
	public static void main (String[] args) {
		int dato = Integer.parseInt(System.console().readLine());
		int change = dato;
		int longitud = 0;
		while (change != 0) {
			change = change/10;
			longitud++;
		}
		change = dato;
		for (int i = 0; i<longitud; i++) {
			change = dato % 10;
			System.out.print(change);
			dato = dato / 10;
		}
	}
}

