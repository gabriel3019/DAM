package SwitchCase;

import java.util.Scanner;

public class Ejemplo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion;

		System.out.print("Selecciona una opci�n:\n" + "1. Opci�n 1\n" + "2. Opci�n 2\n" + "3. Opci�n 3\n" + ">> ");

		opcion = teclado.nextInt();

		/*
		 * if (opcion == 1) { System.out.println("Has seleccionado la 1."); } else if
		 * (opcion == 2) { System.out.println("Has seleccionado la 2."); } else if
		 * (opcion == 3) { System.out.println("Has seleccionado la 3."); } else {
		 * System.out.println("ERROR: opci�n desconocida."); }
		 */

		switch (opcion) {
		case 1:
			System.out.println("Has seleccionado la 1.");
			break;
		case 2:
			System.out.println("Has seleccionado la 2.");
			break;
		case 3:
			System.out.println("Has seleccionado la 3.");
			break;
		default:
			System.out.println("ERROR: opci�n desconocida.");
		}

	}

}
