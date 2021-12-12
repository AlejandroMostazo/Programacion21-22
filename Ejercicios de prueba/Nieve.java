/*
 * Nieve.java
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


public class Nieve {
	
	public static void main (String[] args) {
		final int FILAS = 23;
		final int COLUMS = 60;
		int copo = 0;
		String array [][] = new String [FILAS][COLUMS];
		String arrayaux [][] = new String [FILAS][COLUMS];
		
		for (int k = 0; k < FILAS; k++) {
			for (int l = 0; l < COLUMS; l++) {
				arrayaux[k][l] = " ";
			}
		}
		
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMS; j++) {
				copo = (int)(Math.random()*15);
				if (copo == 1) {
					array[FILAS-1-i][j] = "*";
				} else {
					array[FILAS-1-i][j] = " ";
				}
			}
		}
		
		for (int total = 0; total < FILAS; total++) {
			for (int i = 0; i < COLUMS; i++){
				arrayaux[0][i] = array[total][i];
			}
			for (int i = 0; i < FILAS ; i++) {
				for (int j = 0; j < COLUMS; j++) {
					if (i == 12 && j == 23) {
						System.out.print("FELICES FIESTAS");
						
					} else {
						System.out.print(arrayaux[i][j]);
					}
				}
				System.out.println();
			}
			for (int i = FILAS-1; i > 0 ; i--) {
				for (int j = 0; j < COLUMS; j++) {
					arrayaux[i][j] = arrayaux[i-1][j];
				}
			}
			System.out.println("----------------------------");
			 try {
            Thread.sleep(600);
        }catch(InterruptedException e){}
			System.out.print("\033[H\033[2J");
			System.out.flush();
		}
		
		
		
	}
}

