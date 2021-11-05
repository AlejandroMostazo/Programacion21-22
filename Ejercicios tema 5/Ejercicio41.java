/*
 * Ejercicio41.java
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


public class Ejercicio41 {
	
	public static void main (String[] args) {
		System.out.println("Introduce un numero");
		long introducir = Integer.parseInt(System.console().readLine());
		long calculo = introducir;
		long longitud = 0;
		int par = 0, impar = 0;
		while (calculo > 0) {
			longitud++;
			calculo = calculo/10;
		}
		for (int i = 0; i < longitud; i++) {
			calculo = introducir%10;
			introducir /= 10;
			if (calculo%2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("la cantidad de pares son: "+par);
		System.out.println("la cantidad de impares son: "+impar);
	}
}

