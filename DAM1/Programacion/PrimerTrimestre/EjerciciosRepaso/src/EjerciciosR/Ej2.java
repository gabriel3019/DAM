package EjerciciosR;

import java.util.Scanner;

public class Ej2 {

	/*
	 * Haz un programa que pida una cadena por teclado y nos diga si cumple este
	 * patrón: L{1,15}$D{1,2} Esto quiere decir: de 1 (mínimo) a 15 letras (máximo)
	 * mayúsculas, un símbolo del dólar y de 1 (mínimo) a 2 (máximo) dígitos.
	 */
	public static void main(String[] args) {
		// L .. L (15) $ (1) D .. D (2)
		// L$D (3)
		// LLLLLLLLLLLLLLL$DD (18)
		Scanner scanner = new Scanner(System.in);
		String cadena;
		String parte1;
		String parte2;
		boolean flag = true;
		int indiceDolar;

		System.out.print("Introduce una cadena: ");
		cadena = scanner.nextLine();

		if (cadena.length() >= 3 && cadena.length() <= 18) {
			indiceDolar = cadena.indexOf("$");

			// Dolar está entre la segunda posición (1) y la penúltima (length - 2)
			if (indiceDolar >= 1 && indiceDolar <= cadena.length() - 2) {
				// A la izquierda del dólar
				parte1 = cadena.substring(0, indiceDolar);
				// A la derecha del dólar
				parte2 = cadena.substring(indiceDolar + 1);

				// Si se superan los máximos de letras o de dígitos
				if (parte1.length() > 15 || parte2.length() > 2) {
					flag = false;
				}

				// Comprobar las mayúsculas
				for (int i = 0; i < parte1.length(); i++) {

					// Si el caracter NO es una mayúscula
					if (parte1.charAt(i) < 'A' || parte1.charAt(i) > 'Z') {
						flag = false;
					}

				}

				// Comprobar los dígitos
				for (int i = 0; i < parte2.length(); i++) {

					// Si el caracter NO es una mayúscula
					if (parte2.charAt(i) < '0' || parte2.charAt(i) > '9') {
						flag = false;
					}

				}

				// Comprobar cadena en función de la bandera
				if (flag) {
					System.out.println("Cadena correcta!");
				} else {
					System.out.println("ERROR: cadena incorrecta.");
				}

			} else {
				System.out.println("ERROR: cadena incorrecta.");
			}

		} else {
			System.out.println("ERROR: cadena incorrecta.");
		}

	}

}
