/*
 * Ejercicio62.java
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


public class Ejercicio62 {
	
	public static void main (String[] args) {
		System.out.println("Introduzca numero: ");
		int dato = Integer.parseInt(System.console().readLine());
		int noafortunado = 0;
		int afortunado = 0;
		int modulo = 0;
		
		while (dato > 0) {
			modulo = dato %10;
			dato /= 10;
			if (modulo == 3 || modulo == 7 || modulo == 8 || modulo == 9) {
				afortunado++;
			} else {
				noafortunado++;
			}
		}
		if (afortunado > noafortunado) {
			System.out.println("Su número es afortunado enhorabuena!!");
		} else {
			System.out.println("Lo siento Su número no es afortunado :3");
		}
	}
}

