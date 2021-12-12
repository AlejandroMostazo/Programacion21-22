/*
 * Ejercicio19.java
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


public class Ejercicio19 {
	
	public static void main (String[] args) {
		int numeros[] = new int[11];
		int dato = 0;
		
		for (int i = 0; i < 11; i++) {
			numeros[i] = (int)(Math.random()*201);
			System.out.print(numeros[i]+" ");
		}
		System.out.println();
		
		System.out.print("Numero a introducir: ");
		dato = Integer.parseInt(System.console().readLine());
		System.out.print("Posición donde se quiere insertar: ");
		int posicion = Integer.parseInt(System.console().readLine());
		
		for (int i = 10; i > posicion; i--) {
			numeros[i] = numeros[i-1];
		}
		numeros[posicion] = dato;
		for (int i = 0; i < 11; i++) {
			System.out.print(numeros[i]+" ");
		}
		
	}
}

