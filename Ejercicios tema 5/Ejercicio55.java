/*
 * Ejercicio55.java
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


public class Ejercicio55 {
	
	public static void main (String[] args) {
		System.out.println("Introduzca numero: ");
		long dato = Integer.parseInt(System.console().readLine());
		long calculo = dato;
		double modulo;
		double aux = 0;
		double elevado = 0.1;
		
		while (calculo > 0) {
			elevado *= 10;
			calculo /= 10;
			if ( calculo != 0) {
				aux = aux/10 + calculo%10; 
			}
		}
		aux *= elevado/10;
		aux = aux + (dato%10) * elevado;
		System.out.print((int)aux);
	}
}

