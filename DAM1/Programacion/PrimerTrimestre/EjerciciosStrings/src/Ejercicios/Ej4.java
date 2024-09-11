package Ejercicios;

import java.util.Scanner;

public class Ej4 {

	/*
	 * Haz un programa que pida al usuario un texto y dos �ndices (dos n�meros que
	 * indiquen posiciones dentro de la cadena). Despu�s, muestra la subcadena del
	 * texto. Por ejemplo: si se introducen "Prueba", "2" y "4", se mostrar� "ueb".
	 * Hacer este ejercicio sin emplear "substring()", s�lo con lo que hemos visto
	 * de caracteres hasta el momento.
	 */
	public static void main(String[] args) {
		String cadena;
		Scanner entrada = new Scanner(System.in);
		// inicial
		int indice0;
		// final
		int indice1;

		System.out.print("Introduce una cadena: ");
		cadena = entrada.nextLine();

		System.out.print("Introduce el primer �ndice: ");
		indice0 = entrada.nextInt();

		System.out.print("Introduce el segundo �ndice: ");
		indice1 = entrada.nextInt();

		for (int i = indice0; i <= indice1; i++) {
			System.out.print(cadena.charAt(i));
		}

	}

}
