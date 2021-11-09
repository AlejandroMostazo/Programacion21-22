/*
 * Ejercicio49.java
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


public class Ejercicio49 {
	
	public static void main (String[] args) {
		System.out.println("Introduce un numero");
		boolean normal = true;
		int contador = 1;
		int max = 0;
		int min = 999;
		int media = 0;
		int dato;
		
		while (normal) {
			
			dato = Integer.parseInt(System.console().readLine());
			normal = false;
			for (int i = 2; i < dato; i++) {
				if (dato%i == 0) {
					normal = true;
				} 
			}
			if (normal) {
				contador++;
				if (dato > max) {
					max = dato;
				} 
				if (dato < min) {
					min = dato;
				} 
				media = (media + dato);
			}
		}
		contador--;
		media /= contador;
		System.out.println("Ha introducido "+contador);
		System.out.println("sindo el mas alto "+max);
		System.out.println("y el mas pequeño "+min);
		System.out.println("la media es "+media);
	}
}

