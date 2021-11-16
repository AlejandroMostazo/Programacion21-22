/*
 * Ejercicio14.java
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


public class Ejercicio14 {
	
	public static void main (String[] args) {
		int minimo = 0;
		int maximo = 101;
		int intentos = 5;
		System.out.println("Introduce el numero que estas pensando ");
		int dato = Integer.parseInt(System.console().readLine());
		int comprueva = (int)(Math.random()*maximo+minimo);
		while (intentos > 0) {
			
			comprueva = (int)(Math.random()*(maximo - minimo)+minimo);
			if (comprueva > dato ) {
				maximo = comprueva;
	
				System.out.println("quedan: "+intentos+" intentos");
				System.out.println(comprueva);
			} else {
				minimo = comprueva;
				System.out.println("quedan: "+intentos+" intentos");
				System.out.println(comprueva);
			}
			if (comprueva == dato) {
				System.out.println("He acertado, tu numero es: "+comprueva);
				intentos = intentos - 5;
			}
			intentos--;
		}
		if (comprueva != dato) {
			System.out.println("Lo siento no he encontrado tu numero");
		}
	}
}

