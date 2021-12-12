/*
 * Sumas.java
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


public class Sumas {
	
	public static void main (String[] args) {
		int array[][] = new int [5][6];
		
		for (int i = 0; i < 4; i++)	{
			for (int j = 0; j < 5; j++) {
				array[i][j] = (int)(Math.random()*100+1);
			}
		}
		
		for (int i = 0; i < 4; i++)	{
			for (int j = 0; j < 5; j++) {
				array[i][5] += array[i][j];
			}
		}


		for (int i = 0; i < 5; i++)	{
			for (int j = 0; j < 4; j++) {
				array[4][i] += array[j][i];
			}
		}
		
		for (int i = 0; i < 5; i++)	{
			for (int j = 0; j < 4; j++) {
				array[4][5] += array[i][j];
			}
		}
		
		
		for (int i = 0; i < 5; i++)	{
			for (int j = 0; j < 6; j++) {
				System.out.printf("%5d", array[i][j]);
			}
			System.out.println();
		}
		
		
		
		
	}
}

