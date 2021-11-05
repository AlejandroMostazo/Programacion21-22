/*
 * Ejercicio39.java
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


public class Ejercicio39 {
	
	public static void main (String[] args) {
		System.out.println("Introduce un numero");
		long introducir = Integer.parseInt(System.console().readLine());
		long incremento = 2;
		long calculo = 1;
		for (int i = 1; i <= introducir; i++) {
			for (int j = 1; j < incremento; j++) {
				calculo *= j;
			}
			System.out.println(i+"! = "+calculo);
			calculo = 1;
			incremento++;
		}
	}
}

