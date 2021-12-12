/*
 * Caballo.java
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


public class Caballo {
	
	public static void main (String[] args) {
		int tablero[][] = new int[8][8];
		
		System.out.print("Introduzca la posición: ");
		String posicion = System.console().readLine();
		
		System.out.println("Los posibles movimientos del caballo son: ");
		
		char fila = posicion.charAt(1);
		char columna = posicion.charAt(0);
		
		int ascifila = (int)fila - (int)'1';
		int ascicolum = (int)columna - (int)'a';
			
			
		if (ascifila-2 >= 0) {
			System.out.print("abajo: ");
			if (ascicolum-1 >= 0) {
				System.out.print((char)(ascifila-2+'1')+""+(char)(ascicolum-1+'a')+" ");
			}
			if (ascicolum+1 < 8) {
				System.out.print((char)(ascifila+'1'-2)+""+(char)(ascicolum+1+'a')+" ");
			}
			System.out.println();
		}
		
		if (ascifila+2 < 8) {
			System.out.print("arriba: ");
			if (ascicolum-1 >= 0) {
				System.out.print((char)(ascifila+2+'1')+""+(char)(ascicolum-1+'a')+" ");
			}
			if (ascicolum+1 < 8) {
				System.out.print((char)(ascifila+'1'+2)+""+(char)(ascicolum+1+'a')+" ");
			}
			System.out.println();
		}
		
		if (ascicolum+2 < 8) {
			System.out.print("derecha: ");
			if (ascifila >= 0) {
				System.out.print((char)(ascifila+'1'-1)+""+(char)(ascicolum+2+'a')+" ");
			}
			if (ascifila < 8) {
				System.out.print((char)(ascifila+1+'1')+""+(char)(ascicolum+2+'a')+" ");
			}
			System.out.println();
		}
		
		if (ascicolum-2 >= 0) {
			System.out.print("Izquierda: ");
			if (ascifila >= 0) {
				System.out.print((char)(ascifila+'1'-1)+""+(char)(ascicolum-2+'a')+" ");
			}
			if (ascifila < 8) {
				System.out.print((char)(ascifila+1+'1')+""+(char)(ascicolum-2+'a')+" ");
			}
			System.out.println();
		}
			
		
	}
}

