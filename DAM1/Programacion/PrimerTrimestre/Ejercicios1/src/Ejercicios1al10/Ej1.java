package Ejercicios1al10;

import java.util.Scanner;

public class Ej1 {

	/*
	 * Haz un programa que pida al usuario un n�mero y diga si est� en el rango
	 * [0,100] o no. Por ejemplo: 0, 5, 97, 44 y 100 est�n en el rango [0,100], pero
	 * -31, 903, 101, -14 y 322 no lo est�n.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;

		System.out.print("Introduce un n�mero en el rango [0,100]: ");
		number = input.nextInt();

		if (number >= 0 && number <= 100) {
			System.out.println("El n�mero " + number + " est� en el rango [0,100].");
		} else {
			System.out.println("El n�mero " + number + " NO est� en el rango [0,100].");
		}
	}

}
