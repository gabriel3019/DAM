package Ejercicios1al10;

import java.util.Scanner;

public class Ej5 {

	/*
	 * Haz un programa que pida al usuario su año de nacimiento y le diremos si
	 * nación en año bisiesto o no. Un año bisiesto cumple la siguiente condición:
	 * es divisible entre 4 pero no es divisible entre 100, o bien es divisible
	 * entre 400.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year;

		System.out.print("Introduce un año: ");
		year = input.nextInt();

		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			System.out.println("El año " + year + " es bisiesto.");
		} else {
			System.out.println("El año " + year + " NO es bisiesto.");
		}

	}

}
