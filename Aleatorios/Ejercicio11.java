/*
 * Ejercicio11.java
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


public class Ejercicio11 {
	
	public static void main (String[] args) {
		int nota = 0;
		int suspenso = 0;
		int suficiente = 0;
		int bien = 0;
		int notable = 0;
		int sobresaliente = 0;
		for (int i = 0; i < 20; i++) {
			nota = (int)(Math.random()*10);
			switch(nota) {
				case 0: 
				case 1: 
				case 2:
				case 3: 
				case 4:
					System.out.println("Suspenso");
					suspenso++;
					
				break;
				case 5:
					System.out.println("Suficiente");
					suficiente++;
				break;
				case 6:
					System.out.println("Bien");
					bien++;
				break;
				case 7:
				case 8:
					System.out.println("Notable");
					notable++;
				break;
				case 9:
				case 10:
					System.out.println("Sobresaliente");
					sobresaliente++;
				break;
			}
		}
		System.out.println("N suspensos "+suspenso+"\nN suficientes "+suficiente+"\nN bien "+bien+"\nN notable "+notable+"\nN sobresaliente "+sobresaliente);
	}
}

