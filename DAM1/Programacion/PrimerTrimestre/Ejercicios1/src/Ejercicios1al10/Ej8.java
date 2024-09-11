package Ejercicios1al10;

import java.util.Scanner;

public class Ej8 {

	/*
	 * Haz un programa que pida al usuario un número y nos diga si es primo o no. Un
	 * número primo es aquel que tiene solo dos divisores (véase el ejercicio
	 * anterior): 1 y él mismo. Por ejemplo, éstos son algunos números primos: 2, 3,
	 * 5, 7, 11, 13, 17, 19, 23, 29, 31, 37...
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number, div = 2;
		boolean esPrimo = true;

		System.out.print("Introduce un número: ");
		number = input.nextInt();

		while (div < number && esPrimo == true) {

			if (number % div == 0) {
				esPrimo = false;
			}

			div++;
		}

		if (esPrimo) {
			System.out.println("El número " + number + " es primo.");
		} else {
			System.out.println("El número " + number + " NO es primo.");
		}

	}

}
