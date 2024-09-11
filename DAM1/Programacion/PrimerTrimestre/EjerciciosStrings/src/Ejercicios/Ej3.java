package Ejercicios;

import java.util.Scanner;

public class Ej3 {

	/*
	 * Haz un programa que pida al usuario un texto y muestre sus caracteres en
	 * mayúsculas. Hacer este ejercicio sin emplear "toUpperCase()", sólo con lo que
	 * hemos visto de caracteres hasta el momento.
	 */
	public static void main(String[] args) {
		String cadena;
		Scanner entrada = new Scanner(System.in);
		// Separación entre la 'A' y la 'a' según la tabla Unicode.
		// Ver más abajo la explicación.
		int separacionMayusMinus = 'a' - 'A';

		System.out.print("Introduce una cadena en minúsculas: ");
		cadena = entrada.nextLine();

		// Los caracteres son en esencia números.
		// Podemos convertirlos en enteros con un "type cast" o "conversión de tipo".
		// Esto se hace poniendo paréntesis y el tipo deseado a la izquierda.
		// Ejemplo para obtener el número equivalente a la letra 'A':
		// int numLetraA = (int) 'A';

		// También al revés:
		// char letraA = (char) 65;
		// La 'A' es el 65 en la tabla Unicode:
		// https://www.rapidtables.com/code/text/unicode-characters.html

		// las caracteres también pueden usarse en operaciones:
		// char resultadoEsB = 'A' + 1;
		// "resultadoEsB será igual a la letra 'B', que es 66 (65 + 1).

		for (int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.charAt(i);

			// Comprobamos si es una letra minúscula.
			if (caracter >= 'a' && caracter <= 'z') {
				System.out.print((char) (caracter - separacionMayusMinus));
			} else {
				System.out.print(caracter);
			}

		}

	}

}
