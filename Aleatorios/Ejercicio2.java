/*
 * Ejercicio2.java
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


public class Ejercicio2 {
	
	public static void main (String[] args) {
		String numero = "";
		String palo = "";
		
		int randpalo = (int)(Math.random()*3 +1);
		
		switch (randpalo) {
			case 1:
				palo = "picas";
			break;
			case 2:
				palo = "corazones";
			break;
			case 3:
				palo = "diamantes";
			break;
			case 4:
				palo = "tréboles";
			break;
		}
		
		int randnumero = (int)(Math.random()*12 +1);
		
		switch (randnumero) {
			case 1:
				numero = "A";
			break;
			case 11:
				numero = "J";
			break;
			case 12:
				numero = "Q";
			break;
			case 13:
				numero = "K";
			break;
			default:
				numero = String.valueOf(randnumero);
			break;
		}
		System.out.print("Te ha salido una carta, del palo: "+palo+" cuyo numero es: "+numero);
	}
}

