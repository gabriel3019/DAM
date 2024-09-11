package ExamenA;

import java.util.Arrays;

public class Ej1 {

	public static void main(String[] args) {
		int[] array = { 2, 4, 5, 10, 1 };

		System.out.println(Arrays.toString(array));

		// Va hasta la penúltima posición
		for (int i = 0; i < array.length - 1; i++) {

			if (array[i] == array[i + 1] / 2) {
				System.out.print("Sí ");
			} else {
				System.out.print("NO ");
			}

		}

		// La última posición
		if (array[array.length - 1] == array[0] / 2) {
			System.out.print("Sí ");
		} else {
			System.out.print("NO ");
		}

	}

}
