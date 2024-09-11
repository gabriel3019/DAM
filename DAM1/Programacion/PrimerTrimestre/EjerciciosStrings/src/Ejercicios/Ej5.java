package Ejercicios;

import java.util.Scanner;

public class Ej5 {

	/*
	 * Hacer un programa que pida al usuario una cadena y compruebe si es un
	 * palíndromo. Un palíndromo es aquel texto que se lee igual de izquierda a
	 * derecha que de derecha a izquierda. Por ejemplo: ojo, ala, acurruca, hannah,
	 * rayar, 11211...
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena;
		int j;
		boolean flag = true;

		System.out.print("Introduce la cadena: ");
		cadena = sc.nextLine();

		j = cadena.length() - 1;

		for (int i = 0; i < j && flag == true; i++) {

			if (cadena.charAt(i) != cadena.charAt(j)) {
				flag = false;
			}

			j--;
		}

		if (flag == true) {
			System.out.println("Es un palíndromo.");
		} else {
			System.out.println("No es un palíndromo.");
		}
	}

}
