/*
 * Ejercicio37.java
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


public class Ejercicio37 {
	
	public static void main (String[] args) {
		System.out.println("Introduce un numero");
		int introducir = Integer.parseInt(System.console().readLine());
		int divide = introducir / 10;
		int elevado = 1;
		int longitud = 0;
		int calculo;
		while (divide > 0) {
			divide /= 10;
			elevado *= 10;
			longitud++;
		}
		for (int i = 0; i <= longitud; i++) {
			calculo = introducir/elevado;
			calculo %= 10;
			elevado /= 10;
			for (int j = 0; j<calculo; j++) {
				System.out.print("|");
			}
			if (i != longitud) {
				System.out.print("-");
			}
			
		}
	}
}

