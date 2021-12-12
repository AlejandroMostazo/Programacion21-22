/*
 * Ejercicio26.java
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


public class Ejercicio26 {
	
	public static void main (String[] args) {
		System.out.print("Introduzca la anchura de la tableta: ");
		int anchura = Integer.parseInt(System.console().readLine());
		System.out.print("Introduzca la altura de la tableta: ");
		int altura = Integer.parseInt(System.console().readLine());
		int bocado = 0;
		int filarandom = (int)(Math.random()*altura+1);
		
		if (filarandom == 1 || filarandom == altura) {
			bocado = (int)(Math.random()*anchura+1);
		} else {
			bocado = (int)(Math.random()*2+1);
		}
		
		for (int i = 1; i < altura+1; i++) {
			for (int j = 0; j < anchura; j++) {
				switch (bocado) {
					case 1:
					if ( j == 0 && i == filarandom) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
					break;
					case 2:
					if ( j == anchura-1 && i == filarandom) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
					break;
					default:
					if (bocado == j && filarandom == i) {
					System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				
			}
			System.out.println();
		}
	
	}
}

