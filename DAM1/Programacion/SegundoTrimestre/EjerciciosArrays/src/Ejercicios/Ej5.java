package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ej5 {

	/*
	 * Implementa el siguiente juego: 1. Se genera un "tablero" (array de booleans)
	 * aleatorio (los valores de cada posición son "true" o "false" generados con
	 * "nextBoolean()" de "Random"). 2. El usuario hace una ronda: elige una
	 * posición y el boolean de dicha posición se invierte (de "true" pasa a "false"
	 * o al revés). 3. Luego, el ordenador le dice cuántos "trues" hay en el
	 * tablero. 4. Si todas las posiciones están a "true", termina el juego. Si no,
	 * se hace una nueva ronda.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = 10;
		boolean[] tab = new boolean[size];
		Random randGen = new Random();
		int pos;
		int contTrues = 0;

		// Se llena el array con booleans aleatorios.
		for (int i = 0; i < tab.length; i++) {
			tab[i] = randGen.nextBoolean();
		}

		// Bucle del juego.
		do {
			System.out.print("Introduce la ficha que quieres invertir (de 1 a " + size + "): ");
			pos = scanner.nextInt();

			// Como le hemos pedido la posiciÃ³n desde 1, hay que decrementar para que vaya
			// desde 0.
			pos--;

			// Si la posiciÃ³n es vÃ¡lida...
			if (pos >= 0 && pos < size) {
				// Invertir el valor del boolean.
				tab[pos] = !tab[pos];

				// Poner "contTrues" a 0.
				contTrues = 0;

				// Contar los trues.
				for (boolean b : tab) {

					if (b) {
						contTrues++;
					}

				}

				System.out.println("Hay " + contTrues + " fichas bien colocadas.");
			} else { // Si la posiciÃ³n no es vÃ¡lida...
				System.out.println("ERROR: posiciÃ³n no vÃ¡lida.");
			}

		} while (contTrues != size);

		System.out.println("Enhorabuena, todas las fichas estÃ¡n bien colocadas!");

	}

}
