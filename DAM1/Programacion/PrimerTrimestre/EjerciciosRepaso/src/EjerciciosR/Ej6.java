package EjerciciosR;

import java.util.Scanner;

public class Ej6 {

	/*
	 * Haz un programa que pida al usuario una cadena y un car�cter de b�squeda.
	 * Despu�s mostrar� la cadena y, debajo de esta, pondr� una flecha (^) indicando
	 * la posici�n donde se encuentre el car�cter de b�squeda. Ejemplo: Introduce la
	 * cadena: aabcdwbfbasxa Introduce el car�cter: a
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
		System.out.print("Introduce un car�cter: ");
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
