/*
 * reyes.java
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


public class reyes {
	
	public static void main (String[] args) {
		
		
		System.out.print("Introduzca la cantidad de reyes totales: ");
		int total = Integer.parseInt(System.console().readLine());
		
		String nombres [] = new String [total];
		int contador = 1;
		
		
		System.out.println("Introduzca el nombre del un rey: ");
		for (int i = 0; i < total; i++) {
			nombres[i] = System.console().readLine();
		}
		
		System.out.println();
		
		for (int i = 0; i < total; i++) {
			contador = 1;
			for (int j = 0; j < i; j++) {
				if (nombres[i].equals(nombres[j])) {
					contador++;
				}
			}
			System.out.println(nombres[i]+" "+contador+"º");
		}
		
		
	}
}

