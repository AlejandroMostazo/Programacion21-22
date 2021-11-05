/*
 * Ejercicio34.java
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


public class Ejercicio34 {
	
	public static void main (String[] args) {
		System.out.println("Introduce un numero");
		long numero = Integer.parseInt(System.console().readLine());
		System.out.println("Introduce otro numero");
		long numero2 = Integer.parseInt(System.console().readLine());
		long longitud = numero;
		int elevado = 1;
		int contador = 0;
		long mostar;
		long mostar2;
		int elevado2 = 1;
		while (longitud > 0) {
			longitud = longitud/10;
			elevado = elevado * 10;
			contador++;
		}
		elevado = elevado / 10;
		elevado2 = elevado;
		System.out.print("los numeros pares son: ");
		for (int i = 0; i < contador; i++) {
			mostar = numero/elevado;
			mostar = mostar % 10;
			if (mostar%2 == 0) {
				System.out.print(mostar+" ");
			} else {
				System.out.print("");
			}
			for (int j = 0; j < 1; j++) {
				mostar2 = numero2/elevado;
				mostar2 = mostar2 % 10;
				if (mostar2%2 == 0) {
					System.out.print(mostar2+" ");
				} else {
					System.out.print("");
				}
			}
			elevado = elevado/10;
		}
		System.out.print("\nlos numeros impares son: ");
		for (int i = 0; i < contador; i++) {
			mostar = numero/elevado2;
			mostar = mostar % 10;
			if (mostar%2 == 0) {
				System.out.print("");
			} else {
				System.out.print(mostar+" ");
			}
			for (int j = 0; j < 1; j++) {
				mostar2 = numero2/elevado2;
				mostar2 = mostar2 % 10;
				if (mostar2%2 == 0) {
					System.out.print("");
				} else {
					System.out.print(mostar2+" ");
				}
			}
			elevado2 = elevado2/10;
		}
	}
}

