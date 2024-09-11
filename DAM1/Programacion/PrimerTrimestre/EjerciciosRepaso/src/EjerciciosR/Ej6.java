package EjerciciosR;

import java.util.Scanner;

public class Ej6 {

	/*
	 * Haz un programa que pida al usuario una cadena y un carácter de búsqueda.
	 * Después mostrará la cadena y, debajo de esta, pondrá una flecha (^) indicando
	 * la posición donde se encuentre el carácter de búsqueda. Ejemplo: Introduce la
	 * cadena: aabcdwbfbasxa Introduce el carácter: a
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// LLLLDD$
		Scanner scanner = new Scanner(System.in);
		String cadena;
		String flechas = "";
		char caracter;

		System.out.print("Introduce una cadena: ");
		cadena = scanner.nextLine();
		System.out.print("Introduce un carácter: ");
		caracter = scanner.nextLine().charAt(0);

		for (int i = 0; i < cadena.length(); i++) {

			if (cadena.charAt(i) == caracter) {
				flechas += "^";
			} else {
				flechas += " ";
			}

		}

		System.out.println(cadena + "\n" + flechas);
	}

}
