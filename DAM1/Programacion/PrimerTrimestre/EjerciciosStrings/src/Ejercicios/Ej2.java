package Ejercicios;

import java.util.Scanner;

public class Ej2 {

	/*
	 * Haz un programa que pida al usuario un texto y muestre cuántas vocales tiene.
	 * Las vocales pueden ser mayúsculas o minúsculas. Por ejemplo: si el string es
	 * "CadEnA", mostrará "CadEnA tiene 3 vocales".
	 */
	public static void main(String[] args) {
		String cadena;
		Scanner entrada = new Scanner(System.in);
		int contVocales = 0;

		System.out.print("Introduce una cadena: ");
		cadena = entrada.nextLine();

		for (int i = 0; i < cadena.length(); i++) {
			char letra = cadena.charAt(i);

			if (
				letra == 'A'
				|| letra == 'E'
				|| letra == 'I'
				|| letra == 'O'
				|| letra == 'U'
				|| letra == 'a'
				|| letra == 'e'
				|| letra == 'i'
				|| letra == 'o'
				|| letra == 'u'
			) {
				System.out.println("Vocal detectada");
				contVocales++;
			}

		}

		System.out.println("Hay " + contVocales + " vocales");

	}

}
