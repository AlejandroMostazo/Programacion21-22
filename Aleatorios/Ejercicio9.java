/*
 * Ejercicio9.java
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


public class Ejercicio9 {
	
	public static void main (String[] args) {
		int rand = 0;
		int contador= 0;
		while (rand !=24) {
		rand = (int)(Math.random()*100);
		System.out.println(rand);
		contador++;
		}
		System.out.println("han aparecido "+contador+" numeros antes de que aparezca el 24");
	}
}

