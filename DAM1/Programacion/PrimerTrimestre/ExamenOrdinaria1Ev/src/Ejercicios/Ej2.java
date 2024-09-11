package Ejercicios;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce una cadena: ");
		String cadena = teclado.nextLine();

		// Verificar el formato
		if (cadena.matches("[A-Z]{1,2}[^A-Za-z0-9].*[0-9]{4,}.*\\$.*")) {
			System.out.println("La cadena cumple con el formato especificado.");
		} else {
			System.out.println("La cadena NO cumple con el formato especificado.");
		}

	}

}
