package Ejercicios;

import java.util.Scanner;

public class Ej1 {

	/*
	 * Sobre un array en código, que el usuario introduzca un número a buscar y nos
	 * diga la/s posición/es donde está dicho número. Si no está, comunica un error
	 * "número no encontrado".
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int buscado;
		int[] numeros = {9, 1, 4, 5, 1, 7, 8, 0};
		boolean encontrado = false;

		// Se pide el número a buscar.
		System.out.print("Introduzca el número deseado: ");
		buscado = sc.nextInt();

		// for() que recupera el array.
		for (int i = 0; i < numeros.length; i++) {

			// Si el elemento en la posición "i" es el buscado...
			if (numeros[i] == buscado) {
				// Cambia la bandera "encontrado" a "true".
				encontrado = true;
				// Muestra la posición.
				System.out.println("El número se encuentra en la posición " + i);
			}

		}

		// Si la bandera vale false...
		if (!encontrado) {
			// Mensaje de error.
			System.out.println("ERROR: ese número no está en el array");
		}


	}

}
