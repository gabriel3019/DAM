package Ejercicios1al10;

import java.util.Scanner;

public class Ej5 {

	/*
	 * Haz un programa que pida al usuario su a�o de nacimiento y le diremos si
	 * naci�n en a�o bisiesto o no. Un a�o bisiesto cumple la siguiente condici�n:
	 * es divisible entre 4 pero no es divisible entre 100, o bien es divisible
	 * entre 400.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year;

		System.out.print("Introduce un a�o: ");
		year = input.nextInt();

		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			System.out.println("El a�o " + year + " es bisiesto.");
		} else {
			System.out.println("El a�o " + year + " NO es bisiesto.");
		}

	}

}
