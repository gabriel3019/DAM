package Ejercicios2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej3 {

	/*
	 * Haz un programa que cree un array vectorial (una dimensiÃ³n) de enteros de
	 * una longitud X (que se adapte a cualquier longitud) con nÃºmeros aleatorios
	 * de 1 a X (incluidos). Si el array estÃ¡ ordenado de menor a mayor, fin del
	 * programa. Si no, entonces vuelve a generar otro de nuevo.
	 * 
	 * Ejemplo de salida por consola:
	 * 
	 * Arrays de 3 elementos (nÃºmeros de 1 a 3) Array generado 1: [1, 3, 1] Array
	 * generado 1: [1, 2, 1] Array generado 1: [1, 3, 2] Array generado 1: [2, 1, 3]
	 * Array generado 1: [1, 2, 2] (ordenado) FIN
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.print("Introduce la longitud del array: ");
		int longitud = scanner.nextInt();

		// Creamos un array de enteros de longitud especificada
		int[] array = new int[longitud];

		boolean ordenado = false;
		while (!ordenado) {
			// Generamos números aleatorios de 1 a longitud y llenamos el array
			for (int i = 0; i < longitud; i++) {
				array[i] = random.nextInt(longitud) + 1;
			}

			// Comprobamos si el array está ordenado
			ordenado = true;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					ordenado = false;
					break;
				}
			}

			// Imprimimos el array generado
			System.out.println("Array generado: " + Arrays.toString(array));
		}

		System.out.println("FIN");
		scanner.close();

	}

}
