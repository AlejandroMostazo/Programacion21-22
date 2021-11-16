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


public class Ejercicio3 {
	
	public static void main (String[] args) {
		String numero = "";
		String palo = "";
		
		int randpalo = (int)(Math.random()*3 +1);
		
		switch (randpalo) {
			case 1:
				palo = "oros";
			break;
			case 2:
				palo = "bastos";
			break;
			case 3:
				palo = "espadas";
			break;
			case 4:
				palo = "copas";
			break;
		}
		
		int randnumero = (int)(Math.random()*11 +1);
		
		switch (randnumero) {
			case 10:
				numero = "sota";
			break;
			case 11:
				numero = "caballo";
			break;
			case 12:
				numero = "rey";
			break;
			default:
				numero = String.valueOf(randnumero);
			break;
		}
		System.out.print("Te ha salido una carta, del palo: "+palo+" cuyo numero es: "+numero);
	}
}

