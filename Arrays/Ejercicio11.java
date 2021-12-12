/*
 * Ejercicioo.java
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
		int quince = 0;
		int[] numeros = new int[10];
		int aux = 0;
		int permu = 0;
		int contador = 0;
		boolean bolean = false;
		
		while (quince < 10) {
			System.out.print("Introduce un numero hasta llegar a 15 llevas "+quince+" numeros:");
			int dato = Integer.parseInt(System.console().readLine());
			numeros[quince] = dato;
			quince++;
			
		}
		for (int i = 0; i < 10; i++) {
			
			bolean = true;
			for (int j = 2; j < numeros[i]; j++) {
				aux = numeros[i];
				if (aux%j == 0) {
					bolean = false;
				}
			}
			if (bolean) {
				System.out.println("Es primo"+numeros[i]);
				permu = numeros[contador];
				numeros[contador] = numeros[i];
				for (int k = i; k > contador; k--) {
					numeros[k] = numeros[k-1];
				}
				if (numeros[contador] != numeros[i]) {
					numeros[contador+1] = permu;
					
				} else {
					numeros[i] = permu;
				}
				contador++;
			} else {
				System.out.println("No es primo");
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(numeros[i]+" ");
		}
	}
}

