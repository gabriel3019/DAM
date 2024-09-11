package Ejercicios;

import java.util.Arrays;

public class Ej12 {

	/*
	 * Hacer un programa que calcule para un array de alturas humanas (doubles o
	 * floats, escrito en código), calcule la altura media y luego cree un array de
	 * booleans de la misma longitud, indicando con un "true" si la altura de cada
	 * posición es igual o mayor a la media, así como con un "false" si está por
	 * debajo.
	 */
	public static void main(String[] args) {
		double[] alturas = {1.6, 1.8, 1.7, 1.75, 1.65};
		boolean[] verificaciones = new boolean[alturas.length];
		double media = 0;

		for (double altura : alturas) {
			media += altura;
		}

		media /= alturas.length;

		System.out.println("La altura media es: " + media);

		for (int i = 0; i < alturas.length; i++) {

			// Si la altura en esa posición supera o iguala a la media...
			if (alturas[i] >= media) {
				// Se cambia la bandera de esa posición a true.
				verificaciones[i] = true;
			}

		}

		System.out.println(Arrays.toString(verificaciones));

	}

}
