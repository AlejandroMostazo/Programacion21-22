/*
 * Ejercicio64.java
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


public class Ejercicio64 {
	
	public static void main (String[] args) {
		int dato = 0;
		int alto = 1;
		int permuta = 6;
		
		while (dato != 4) {
			
			for (int anchura = permuta; anchura > 0; anchura--) {
				System.out.print("*");
			}
			System.out.print("\n");
			for (int i = 0; i < alto; i++) {
				System.out.print("*");
				for (int espacios = permuta -2; espacios > 0; espacios--) {
					System.out.print(" ");
				}
				System.out.print("*\n");
			}
			for (int anchura = permuta; anchura > 0; anchura--) {
				System.out.print("*");
			}
			System.out.println("");
			
			System.out.println("1 aumenta el tamaño en altura \n2 lo disminuye\n3 cambia la orientación\n4 Salir programa: ");
			dato = Integer.parseInt(System.console().readLine());
			switch (dato) {
				case 1:
					alto++;
				break;
				case 2:
					if (alto >1 0) {
						alto--;
					}
				break;
				case 3:
					if (permuta == 6) {
						permuta = alto + 2;
						alto = 6;
					} else {
						alto = permuta - 2;
						permuta = 6;
					}
				break;
			}
			
			
		}
	}
}

