/*
 * Ejercicio28.java
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


public class Ejercicio28 {
	
	public static void main (String[] args) {
		System.out.print("Introduzca la longitud del array ");
		int dato = Integer.parseInt(System.console().readLine());
		
		int array [] = new int[dato];
		
		int arrayaux[] = new int[dato];
		int izq = 0;
		int der = dato-1;
		
		int impar = 0;
		
		
		for (int i = 0; i < dato; i++) {
			array[i] = (int)(Math.random()*201);
			System.out.print(array[i]+" ");
		}
		System.out.println();
		if (dato%2 != 0) {
			impar = (dato/2);
			arrayaux[impar] = array[dato-1];
		}
		
		for (int i = 0; i < dato-1; i = i+2){
			arrayaux[der] = array[i+1];
			der--;
			arrayaux[izq] = array[i];
			izq++;	
		}
		for (int i = 0; i < dato; i++) {
			System.out.print(arrayaux[i]+" ");
		}
	}
}

