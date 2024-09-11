package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {

	/*
	 * Sobre un array en código, que el usuario vaya introduciendo dos posiciones y
	 * se intercambien sus valores (hasta que decida salir, por ejemplo si introduce
	 * un número negativo).
	 */
	public static void main(String[] args) {
		int[] numeros = {1, 6, 7, 0, 5, 1, 2};
		int pos1;
		int pos2;
		int aux;
		Scanner sc = new Scanner(System.in);

		do {
			// Mostramos el array inicial:
			System.out.println("ARRAY: " + Arrays.toString(numeros));
	
			System.out.print("Introduce la posición 1: ");
			pos1 = sc.nextInt();
			System.out.print("Introduce la posición 2: ");
			pos2 = sc.nextInt();

			if (pos1 >= 0 && pos2 >= 0) {
				// Elemento en pos1 se guarda en aux:
				aux = numeros[pos1];
				// Elemento en pos2 se guarda en pos1:
				numeros[pos1] = numeros[pos2];
				// Elemento en pos1 (que está en aux) se guarda en pos2:
				numeros[pos2] = aux;
			}
	
			// Mostramos el array final:
			System.out.println("ARRAY: " + Arrays.toString(numeros));
		} while (pos1 >= 0 && pos2 >= 0);

	}

}
