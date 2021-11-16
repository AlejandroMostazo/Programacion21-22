/*
 * Ejercicio18.java
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


public class Ejercicio18 {
	
	public static void main (String[] args) {
		int rojo = 0;
		int azul = 0;
		int verde = 0;
		int amarillo = 0;
		int violeta = 0;
		int naranja = 0;
		int contador = 1;
		int random = (int)(Math.random()*6+contador);
		
		while (rojo + azul + verde + amarillo + violeta + naranja < 3) {
			random = (int)(Math.random()*6+contador);
		switch (random) {
			
			case 1:
				if (rojo == 0) {
				System.out.print("rojo ");
				rojo = 1; }
			break;
			case 2:
				if (azul == 0) {
				System.out.print("azul ");
				azul = 1; }
			break;
			case 3:
				if (verde == 0) {
				System.out.print("verde ");
				verde = 1; }
			break;
			case 4:
				if (amarillo == 0) {
				System.out.print("amarillo ");
				amarillo = 1; }
			break;
			case 5:
				if (violeta == 0) {
				System.out.print("violeta ");
				violeta = 1; }
			break;
			case 6:
				if (naranja == 0) {
				System.out.print("naranja ");
				naranja = 1; }
			break;
		}
		}
	}
}

