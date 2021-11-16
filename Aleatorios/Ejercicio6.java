/*
 * Ejercicio6.java
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
		int rand = (int)(Math.random()*100);
		int dato;
		for (int i = 5; i > 0; i--) {
			System.out.println("Introduzca el numero que puede estar entre el 0 y el 100 ");
			dato = Integer.parseInt(System.console().readLine());
			if (dato != rand) {
				System.out.println("Tienes "+(i-1)+" oportunidades más");
				if (dato > rand) {
					System.out.println(dato+" es mayor al numero secreoto");
				} else {
					System.out.println(dato+" es menor al numero secreoto");
				}
			} else {
				System.out.println(dato+" es igual al numero secreoto ");
			}
		}
		System.out.println("El numero secreto es: "+rand);

	}
}

