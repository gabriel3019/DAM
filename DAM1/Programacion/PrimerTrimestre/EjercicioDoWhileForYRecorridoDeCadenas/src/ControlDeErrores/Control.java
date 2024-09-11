package ControlDeErrores;

import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero;
		String nombre;

		do {
			System.out.print("Introduce un número: ");
			numero = input.nextInt();
			input.nextLine();

			if (numero < 0 || numero > 9) {
				System.out.println("ERROR: dato inválido.");
			}

		} while (numero < 0 || numero > 9);

		do {
			System.out.print("Introduce tu nombre: ");
			nombre = input.nextLine();

			if (nombre == "") {
				System.out.println("ERROR: nombre vacío.");
			}

		} while (nombre == "");

		System.out.println("El número introducido es " + numero + " y tu nombre es " + nombre);
		/*
		 * do { System.out.println(numero); numero--; } while (numero > 0);
		 */

		/*
		 * while (numero > 0) { System.out.println(numero); numero--; }
		 */

	}

}
