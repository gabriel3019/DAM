package Ejercicios1al10;

import java.util.Scanner;

public class Ej6 {

	/*
	 * Haz un programa que pida al usuario dos números y muestre la multiplicación
	 * desarrollada como suma de ambas formas. Por ejemplo: si introduce 4 y 6, por
	 * consola saldrá: 6 + 6 + 6 + 6 4 + 4 + 4 + 4 + 4 + 4
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2, cont = 2;

		System.out.print("Introduce dos números separados por espacio: ");
		n1 = input.nextInt();
		n2 = input.nextInt();

		// Primero mostramos el número sin símbolos "+".
		System.out.print(n1);

		// Ahora el bucle empezando con "cont = 2" porque el anterior "syso" ya cuenta
		// como 1 vez.
		while (cont <= n2) {
			System.out.print(" + " + n1);
			cont++;
		}

		// Reiniciamos el contador a 2 y hacemos el caso contrario.
		cont = 2;

		System.out.print("\n" + n2);

		// Ahora el bucle empezando con "cont = 2" porque el anterior "syso" ya cuenta
		// como 1 vez.
		while (cont <= n1) {
			System.out.print(" + " + n2);
			cont++;
		}

	}

}
