/*
 * Ejercicio8.java
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


public class Ejercicio8 {
	
	public static void main (String[] args) {
		int array [][] = new int[8][8];
		
		System.out.print("Introduzca la posición del alfil: ");
		String posicion = System.console().readLine();
		
		char fila = posicion.charAt(1);
		char columna = posicion.charAt(0);
		
		System.out.println("El álfil puede moverse a las siguientes posiciones: ");
		
		int ascifila = (int)fila - (int)'1';
		int ascicolum = (int)columna - (int)'a';
		
		int i = 0;
		System.out.println("linea abajo izquierda");
		while (ascicolum != 0 && ascifila != 0) {
			i++;
			ascicolum = ((int)columna - (int)'a') -i ;
			ascifila = ((int)fila - (int)'1') - i;
			System.out.print((char)(ascifila+'1')+""+(char)(ascicolum+'a')+" ");
			
		}
		System.out.println();
		System.out.println("linea abajo derecha");
		i = 0;
		ascifila = (int)fila - (int)'1';
		ascicolum = (int)columna - (int)'a';
		while (ascicolum != 7 && ascifila !=0) {
			i++;
			ascicolum = ((int)columna - (int)'a') + i ;
			ascifila = ((int)fila - (int)'1') - i;
			System.out.print((char)(ascicolum+'a')+""+(char)(ascifila+'1')+" ");
			
		}
		System.out.println();
		System.out.println("linea arriba derecha");
		i = 0;
		ascifila = (int)fila - (int)'1';
		ascicolum = (int)columna - (int)'a';
		while (ascicolum != 7 && ascifila !=7) {
			i++;
			ascicolum = ((int)columna - (int)'a') + i ;
			ascifila = ((int)fila - (int)'1') + i;
			System.out.print((char)(ascicolum+'a')+""+(char)(ascifila+'1')+" ");
			
		}
		System.out.println();
		System.out.println("linea arriba izquierda");
		i = 0;
		ascifila = (int)fila - (int)'1';
		ascicolum = (int)columna - (int)'a';
		while (ascicolum != 0 && ascifila !=7) {
			i++;
			ascicolum = ((int)columna - (int)'a') - i ;
			ascifila = ((int)fila - (int)'1') + i;
			System.out.print((char)(ascicolum+'a')+""+(char)(ascifila+'1')+" ");
			
		}
		
	}
}

