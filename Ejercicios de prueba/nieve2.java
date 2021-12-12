/*
 * nieve2.java
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


public class nieve2 {
	
	public static void main (String[] args) {
		String array [][] = new String [23][60];
		
		int copo = 0;
		
		String arrayaux[][] = new String [23][60];
		
		for (int i = 0; i < 23; i++) {
			for (int j = 0; j < 60; j++){
				copo = (int)(Math.random()*15);
				if (copo == 1) {
					array[i][j] = "*";
				} else {
					array[i][j] = " ";
				}
				arrayaux[i][j] = " ";
			}
		}
		
		for (int i = 0; i < 23; i++) {
			for (int j = 0; j < 60; j++){
				arrayaux[0][j] = array[i][j];
			}
			for (int j = 0; j < 23; j++){
				for (int k = 0; k < 60; k++) {
					if (j == 10 && k == 20) {
						System.out.print("FELICES FIESTAS");
						k += 14;
					} else {
						System.out.print(arrayaux[j][k]);
					}
				}
			System.out.println();
			}
			
			for (int j = 22; j > 0; j--) {
				for (int k = 0; k < 60; k++) {
					arrayaux[j][k] = arrayaux[j-1][k];
				}
				
			}
			try {
				Thread.sleep(600);
			}catch(InterruptedException e){}
				System.out.print("\033[H\033[2J");
				System.out.flush();
			System.out.println("----------------------------------------");
			
		}
		
		
	}
}

