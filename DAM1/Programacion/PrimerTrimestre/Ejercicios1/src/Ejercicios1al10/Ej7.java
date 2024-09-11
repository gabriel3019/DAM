package Ejercicios1al10;

import java.util.Scanner;

public class Ej7 {

	/*
	 * Haz un programa que pida al usuario un número y nos diga todos sus divisores.
	 * Un divisor es aquel que divide al número en partes iguales, dando un resto 0.
	 * Por ejemplo: si el número introducido es 8, sus divisores serán 1, 2, 4 y 8
	 * (1 y el propio número cuentan). Otro ejemplo: si el número introducido es 12,
	 * sus divisores serán 1, 2, 3, 4, 6 y 12.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		int div = 2;

		System.out.print("Introduce un número y te dirá sus divisores: ");
		number = input.nextInt();

		System.out.print(1);

		while (div <= number) {

			if (number % div == 0) {
				System.out.print(", " + div);
			}

			div++;
		}

	}

}
