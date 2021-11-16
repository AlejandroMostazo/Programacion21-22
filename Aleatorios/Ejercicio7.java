/*
 * Ejercicio7.java
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


public class Ejercicio7 {
	
	public static void main (String[] args) {
		for (int i = 1; i < 16; i++) {
			for (int j = 0; j < 3; j++) {
				int rand = (int)(Math.random()*2+1);
				if (rand == 1) {
					System.out.print("X X "+2+" ");
				} else {
					System.out.print(1+" X X ");
				}
				System.out.print(" ");
			}
			System.out.println(" ");
			if (i%3 == 0) {
				System.out.println("");
			}
		}
	}
}

