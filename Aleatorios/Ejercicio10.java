/*
 * Ejercicio10.java
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


public class Ejercicio10 {
	
	public static void main (String[] args) {
		int longlinea = 0;
		int caracter = 0;
		String pintar = "";
		for (int i = 0; i < 10; i++) {
			longlinea = (int)(Math.random()*40 + 1);
			caracter = (int)(Math.random()*6+1);
			switch (caracter) {
				case 1:
					pintar = "*";
				break;
				case 2:
					pintar = "-";
				break;
				case 3:
					pintar = "=";
				break;
				case 4:
					pintar = "@";
				break;
				case 5:
					pintar = ".";
				break;
				case 6:
					pintar = "|";
				break;
			}
			for (int j = 0; j < longlinea; j++) {
				System.out.print(pintar);
			}
			System.out.println();
		}
	}
}

