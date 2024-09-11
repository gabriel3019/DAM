package ejordenar;

import java.util.Scanner;

public class EjercicioOrdenar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x, y, z;

		System.out.print("Introduce los 3 números (separados por espacios): ");
		x = entrada.nextInt();
		y = entrada.nextInt();
		z = entrada.nextInt();

		if (x < y) {

			if (x < z) {

				if (y < z) {
					System.out.println(x + " < " + y + " < " + z);
				} else {
					System.out.println(x + " < " + z + " < " + y);
				}

			} else {
				System.out.println(z + " < " + x + " < " + y);
			}

		} else {

			if (y < z) {

				if (x < z) {
					System.out.println(y + " < " + x + " < " + z);
				} else {
					System.out.println(y + " < " + z + " < " + x);
				}

			} else {
				System.out.println(z + " < " + y + " < " + x);
			}

		}

	}

}
