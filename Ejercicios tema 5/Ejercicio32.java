/*
 * Ejercicio32.java
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


public class Ejercicio32 {
	
	public static void main (String[] args) {
		System.out.println("Introduce un numero entero positivo");
		long numero = Integer.parseInt(System.console().readLine());
		long aux = numero;
		long resultado = 0;
		System.out.print("numeros pares son:");
		while (numero > 0) {
			aux = numero%10;
			numero = numero/10;
			if (aux%2 == 0) {
				resultado = resultado + aux;
				System.out.print(aux+" ");
			}
		}
		System.out.println("la suma de todos los numero pares es:"+resultado);
	}
}

