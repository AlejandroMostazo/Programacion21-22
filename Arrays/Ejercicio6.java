/*
 * Ejercicioo.java
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


public class Ejercicio6 {
	
	public static void main (String[] args) {
		int quince = 0;
		int[] numeros = new int[15];
		int aux = 0;
		while (quince < 15) {
			System.out.print("Introduce un numero hasta llegar a 15 llevas "+quince+" numeros:");
			int dato = Integer.parseInt(System.console().readLine());
			numeros[quince] = dato;
			quince++;
		}
		aux = numeros[14];
		for (int i = 14; i > 0; i--) {
			numeros[i] = numeros[i-1];
		}
		numeros[0] = aux;
		for (int i = 0; i < 15; i++) {
			System.out.print(numeros[i]+" ");
		}
	}
}

