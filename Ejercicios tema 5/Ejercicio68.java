/*
 * Ejercicio68.java
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


public class Ejercicio68 {
	
	public static void main (String[] args) {
		System.out.println("Introduzca numero ");
		int dato = Integer.parseInt(System.console().readLine());
		int calculo = dato;
		int modulo = 0;
		double numfin = 0;
		int longitud = 1;
		
		System.out.print("Dislocanco "+dato+" sale el numero: ");
		while (calculo > 0) {
			modulo = calculo%10;
			if (modulo%2 == 0) {
				modulo++;
			} else {
				modulo--;
			}
			numfin = numfin/10 + modulo;
			calculo /= 10;
			longitud*=10;
		}
		numfin = numfin * longitud/10;
		System.out.print((int)numfin);
	}
}

