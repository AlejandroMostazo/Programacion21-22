/*
 * untitled.java
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


public class untitled {
	
	public static void main (String[] args) {
		int array [] = new int [20];
		int contador = 19;
		int primos = 0;
		int aux = 0;
		boolean encontrado = true;
		
		for (int i = 0; i <= contador; i++) {
			array[i] = (int)(Math.random()*201);
			if (array[i]%2 != 0) {
				array[contador] = array[i];
				contador--;
				i--;
			}
		}
		
		for (int i = 0; i < 20; i++) {
			encontrado = true;
			for (int j = 2; j < array[i]; j++) {
				if (array[i]%j == 0) {
					encontrado = false;
				}
			}
			if (encontrado) {
				aux = array[i];
				
				for (int j = i; j > primos; j--) {
					array[j] = array[j-1];
				}
				array[primos] = aux;
				primos++;
			}
		}
		
		for(int i = 0; i < 20; i++) {
			System.out.print(array[i]+" ");
		}
		
	}
}

