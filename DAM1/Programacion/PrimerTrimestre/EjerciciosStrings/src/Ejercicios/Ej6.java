package Ejercicios;

import java.util.Scanner;

public class Ej6 {

	/*
	 * Hacer un programa que pida una cadena y la muestre en espejo. Por ejemplo: si
	 * el usuario introduce "manos", deberá mostrar "manossonam".
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena;
		String cadenaInvertida = "";

		System.out.print("Introduce la cadena: ");
		cadena = sc.nextLine();
		
		// MANOS
		// MANOSSONAM

		for (int i = cadena.length() - 1; i >= 0; i--) {
			cadenaInvertida += cadena.charAt(i);
		}

		System.out.println(cadena + cadenaInvertida);

	}

}
