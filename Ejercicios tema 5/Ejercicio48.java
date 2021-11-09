/*
 * Ejercicio48.java
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


public class Ejercicio48 {
	
	public static void main (String[] args) {
		System.out.println("Introduce un numero");
		long dato = Integer.parseInt(System.console().readLine());
		long calculo = dato/10;
		long elevado = 1;
		long elevadoaux;
		long longitud = 0;
		int suma = 0;
		
		while (calculo > 0) {
			calculo /= 10;
			longitud++;
			elevado *= 10;
		}
		elevadoaux=elevado;
		System.out.print("Los numeros que aparecen son ");
		for (int i = 0; i <= longitud; i++) {
			
				while (suma <= 10) {
				if (elevadoaux == 0) {
					suma++;
					elevadoaux = elevado;
				}
				calculo = dato/elevadoaux;
				calculo %= 10;
				
				if (calculo != suma) {
					elevadoaux /=10;
					
				} else {
					System.out.print(calculo);
					elevadoaux /=10;
					suma++;
				}
			}
		}
		suma=0;
		System.out.print("\nLos numeros que NOO aparecen son ");
		for (int i = 0; i < longitud; i++) {
				while (suma < 10) {
				if (elevadoaux == 0) {
					System.out.print(suma);
					suma++;
					elevadoaux = elevado;
				}
				calculo = dato/elevadoaux;
				calculo %= 10;
				
				if (calculo != suma) {
					elevadoaux /=10;
				} else {
					
					elevadoaux /=10;
					suma++;
				}
			}
		}
	}
}

