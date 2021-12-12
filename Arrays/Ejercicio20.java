/*
 * Ejercicio20.java
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


public class Ejercicio20 {
	
	public static void main (String[] args) {
		System.out.print("Introduzca el número total de nombres de reyes: ");
		int dato = Integer.parseInt(System.console().readLine());
		String array [] = new String[dato];
		int contador = 0;
		int numrey = 0;
		System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");
		
		String rey = "";
		
		for (int i = 0; i < dato; i++) {
			rey = System.console().readLine();
			array[i] = rey;
		}
		System.out.println();
		
		
		for (int i = 0; i < dato; i++) {
			numrey = 1;
			for (int j = 0; j < contador; j++) {
				if (array[i].equals(array[j])) {
					numrey++;
				}
			}
			contador++;
			System.out.println(array[i]+" "+numrey+"º");
		}
		
	}
}

