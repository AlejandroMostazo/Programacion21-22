/*
 * Ejercicio30.java
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


public class Ejercicio30 {
	
	public static void main (String[] args) {
		System.out.println("Introduce el dia de la semana");
		int iniciodia = Integer.parseInt(System.console().readLine());
		System.out.println("Introduce la hora del dia");
		int iniciohora = Integer.parseInt(System.console().readLine());
		System.out.println("Introduce el dia siguiente");
		int findia = Integer.parseInt(System.console().readLine());
		System.out.println("Introduce la hora siguiente del siguiente dia");
		int finhora = Integer.parseInt(System.console().readLine());
		int resultado = 0;
		
		while (iniciodia != findia) {
			 resultado++;
			 ++iniciodia;
			}
		int horas = iniciohora-finhora;
		if (horas < 0) {
			horas= horas * -1;
		}
		resultado = resultado*24 + horas;
		System.out.println(resultado);
		}
	}

