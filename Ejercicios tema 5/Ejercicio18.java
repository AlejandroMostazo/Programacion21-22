/*
 * Ejercicio18.java
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


public class Ejercicio18 {
	
	public static void main (String[] args) {
		System.out.println("Introduzca un numero ");
		int n1 = Integer.parseInt(System.console().readLine());
		System.out.println("Introduzca intoduzca otro numero ");
		int n2 = Integer.parseInt(System.console().readLine());
		if ( n2 < n1) {
			System.out.println("Se calculan los numeros entre "+n2+" hasta "+n1+" de 7 en 7");
			for (int i = n2; i < n1; i = i + 7) {
			System.out.println(n2);
			n2 = n2 + 7;
			}
			
		} else {
			System.out.println("Se calculan los numeros entre "+n1+" hasta "+n2+" de 7 en 7");
			for (int i = n1; i < n2; i = i + 7) {
				System.out.println(n1);
				n1 = n1 + 7;
				
			} 
			
		}
	}
}
