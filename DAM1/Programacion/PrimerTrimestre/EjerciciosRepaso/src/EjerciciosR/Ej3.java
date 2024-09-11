package EjerciciosR;

import java.util.Scanner;

public class Ej3 {

	/*
	 * Haz un programa que pida dos números por teclado y nos diga cuáles son sus
	 * divisores comunes. Por ejemplo: si se introducen 6 y 24, hay que probar a
	 * dividirlos entre 1, 2, 3... así hasta el 6, ya que es el más pequeño de los
	 * dos. En este caso, saldrían 1, 2, 3, 4 y 6.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1, n2, min;

		System.out.print("Introduce n1: ");
		n1 = scanner.nextInt();
		System.out.print("Introduce n2: ");
		n2 = scanner.nextInt();

		min = Math.min(n1, n2);

		for (int i = 1; i <= min; i++) {

			if (n1 % i == 0 && n2 % i == 0) {
				System.out.print(i + " ");
			}

		}

	}

}
