package EjerciciosR;

import java.util.Scanner;

public class Ej1 {

	/*
	 * Haz un programa que pida una cadena por teclado y nos diga si cumple este
	 * patr�n: L{4}D{2}$ Esto quiere decir: 4 letras may�sculas, dos d�gitos y un
	 * s�mbolo del d�lar.
	 */
	public static void main(String[] args) {
		// LLLLDD$
		Scanner scanner = new Scanner(System.in);
		String cadena;
		boolean flag = true;

		System.out.print("Introduce una cadena: ");
		cadena = scanner.nextLine();

		// Comprobar la longitud
		if (cadena.length() == 7) {

			// Comprobar las 4 may�sculas
			for (int i = 0; i < 4; i++) {

				// Si el caracter NO es una may�scula
				if (cadena.charAt(i) < 'A' || cadena.charAt(i) > 'Z') {
					flag = false;
				}

			}

			// Comprobar los 2 d�gitos
			for (int i = 4; i < 6; i++) {

				// Si el caracter NO es un d�gito
				if (cadena.charAt(i) < '0' || cadena.charAt(i) > '9') {
					flag = false;
				}

			}

			// Comprobar el d�lar
			if (cadena.charAt(6) != '$') {
				flag = false;
			}

			// Comprobar cadena en funci�n de la bandera
			if (flag) {
				System.out.println("Cadena correcta!");
			} else {
				System.out.println("ERROR: cadena incorrecta.");
			}

		} else {
			System.out.println("ERROR: cadena incorrecta.");
		}

	}

}
