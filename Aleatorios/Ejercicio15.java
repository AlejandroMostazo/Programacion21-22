/*
 * Ejercicio15.java
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


public class Ejercicio15 {
	
	public static void main (String[] args) {
		int longitud = (int)((Math.random()*7+1)*4);
		System.out.println(longitud);
		int primero = (int)(Math.random()*7+1);
		String escribe = " ";
		switch (primero) {
				case 1:
					escribe = "do ";
				break;
				case 2:
					escribe = "re ";
				break;
				case 3:
					escribe = "mi ";
				break;
				case 4:
					escribe = "fa ";
				break;
				case 5:
					escribe = "sol ";
				break;
				case 6:
					escribe = "la ";
				break;
				case 7:
					escribe = "si ";
				break;
			}
		System.out.print(escribe);
		
		for (int i = 1; i < longitud-1; i++) {
			if (i%4 == 0) {
				System.out.print("| ");
			}
			int nota = (int)(Math.random()*7+1);
			switch (nota) {
				case 1:
					System.out.print("do ");
				break;
				case 2:
					System.out.print("re ");
				break;
				case 3:
					System.out.print("mi ");
				break;
				case 4:
					System.out.print("fa ");
				break;
				case 5:
					System.out.print("sol ");
				break;
				case 6:
					System.out.print("la ");
				break;
				case 7:
					System.out.print("si ");
				break;
			}
		}
		
		System.out.print(escribe+"||");
	}
}

