package Ejercicios1al10;

import java.util.Scanner;

public class Ej3 {

	/*
	 * Haz un programa que pida al usuario 3 d�gitos binarios y muestre su valor en
	 * decimal. Por ejemplo, si introduce 1, 1 y 0, mostrar� 6.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int d2; // El m�s grande.
		int d1;
		int d0; // El m�s peque�o.

		System.out.print("Introduce 3 d�gitos binarios separados por espacio: ");
		d2 = input.nextInt();
		d1 = input.nextInt();
		d0 = input.nextInt();

		System.out.println("El n�mero " + d2 + d1 + d0 + " en decimal es " + (4 * d2 + 2 * d1 + d0));

	}

}
