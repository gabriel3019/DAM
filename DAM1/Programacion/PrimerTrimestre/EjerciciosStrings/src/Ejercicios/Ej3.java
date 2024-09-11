package Ejercicios;

import java.util.Scanner;

public class Ej3 {

	/*
	 * Haz un programa que pida al usuario un texto y muestre sus caracteres en
	 * may�sculas. Hacer este ejercicio sin emplear "toUpperCase()", s�lo con lo que
	 * hemos visto de caracteres hasta el momento.
	 */
	public static void main(String[] args) {
		String cadena;
		Scanner entrada = new Scanner(System.in);
		// Separaci�n entre la 'A' y la 'a' seg�n la tabla Unicode.
		// Ver m�s abajo la explicaci�n.
		int separacionMayusMinus = 'a' - 'A';

		System.out.print("Introduce una cadena en min�sculas: ");
		cadena = entrada.nextLine();

		// Los caracteres son en esencia n�meros.
		// Podemos convertirlos en enteros con un "type cast" o "conversi�n de tipo".
		// Esto se hace poniendo par�ntesis y el tipo deseado a la izquierda.
		// Ejemplo para obtener el n�mero equivalente a la letra 'A':
		// int numLetraA = (int) 'A';

		// Tambi�n al rev�s:
		// char letraA = (char) 65;
		// La 'A' es el 65 en la tabla Unicode:
		// https://www.rapidtables.com/code/text/unicode-characters.html

		// las caracteres tambi�n pueden usarse en operaciones:
		// char resultadoEsB = 'A' + 1;
		// "resultadoEsB ser� igual a la letra 'B', que es 66 (65 + 1).

		for (int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.charAt(i);

			// Comprobamos si es una letra min�scula.
			if (caracter >= 'a' && caracter <= 'z') {
				System.out.print((char) (caracter - separacionMayusMinus));
			} else {
				System.out.print(caracter);
			}

		}

	}

}
