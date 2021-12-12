/*
 * Ejercicio15.java
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


public class Ejercicio15 {
	
	public static void main (String[] args) {
		int[] numeros = new int[10];
		int dato = 1;
		int contador = 0;
		boolean asignado = false;
		
		
		for (int i = 0; i < 10; i++) {
			numeros[i] = (int)(Math.random()*5);
		}
		
		System.out.println("┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
		System.out.println("│Mesa nº  │ 0  │ 1  │ 2  │ 3  │ 4  │ 5  │ 6  │ 7  │ 8  │ 9  │");
		System.out.println("├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
		System.out.print("│Ocupación│");
		for (int i = 0; i < 10; i++) {
			System.out.print("  "+numeros[i]+" |");
		}
		System.out.println();
		System.out.println("└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
		while (dato > 0) {
			System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
			dato = Integer.parseInt(System.console().readLine());
			asignado = false; 
			
			if (dato <= 4 && dato > 0) {
				contador=0;
				while (!asignado) {
					
					for (int i = 0; i < 10; i++) {
						if (numeros[i] == contador && !asignado) {
							if (numeros[i] + dato <= 4) {
								numeros[i] = numeros[i] + dato;
								asignado = true; 
							}
						}
					}
					if (contador <= 3) {
						contador++;
						if (asignado) {
							System.out.println("┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
							System.out.println("│Mesa nº  │ 0  │ 1  │ 2  │ 3  │ 4  │ 5  │ 6  │ 7  │ 8  │ 9  │");
							System.out.println("├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
							System.out.print("│Ocupación│");
							for (int i = 0; i < 10; i++) {
								System.out.print("  "+numeros[i]+" |");
							}
							System.out.println();
							System.out.println("└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
						}
						
					} else {
						asignado = true;
						System.out.print("No hay mesas disponibles");
					}
				}
			} else {
				
				System.out.println("Lo siento, no admitimos grupos de esa cantidad, haga grupos de 4 personas como máximo e intente de nuevo");
			}	
		}	
	}
}

