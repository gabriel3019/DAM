package EjerciciosR;

import java.util.Scanner;

public class Ej2 {

	/*
	 * Haz un programa que pida una cadena por teclado y nos diga si cumple este
	 * patr�n: L{1,15}$D{1,2} Esto quiere decir: de 1 (m�nimo) a 15 letras (m�ximo)
	 * may�sculas, un s�mbolo del d�lar y de 1 (m�nimo) a 2 (m�ximo) d�gitos.
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

			// Dolar est� entre la segunda posici�n (1) y la pen�ltima (length - 2)
			if (indiceDolar >= 1 && indiceDolar <= cadena.length() - 2) {
				// A la izquierda del d�lar
				parte1 = cadena.substring(0, indiceDolar);
				// A la derecha del d�lar
				parte2 = cadena.substring(indiceDolar + 1);

				// Si se superan los m�ximos de letras o de d�gitos
				if (parte1.length() > 15 || parte2.length() > 2) {
					flag = false;
				}

				// Comprobar las may�sculas
				for (int i = 0; i < parte1.length(); i++) {

					// Si el caracter NO es una may�scula
					if (parte1.charAt(i) < 'A' || parte1.charAt(i) > 'Z') {
						flag = false;
					}

				}

				// Comprobar los d�gitos
				for (int i = 0; i < parte2.length(); i++) {

					// Si el caracter NO es una may�scula
					if (parte2.charAt(i) < '0' || parte2.charAt(i) > '9') {
						flag = false;
					}

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

		} else {
			System.out.println("ERROR: cadena incorrecta.");
		}

	}

}
