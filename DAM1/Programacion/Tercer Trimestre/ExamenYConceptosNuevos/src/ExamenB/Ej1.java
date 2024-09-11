package ExamenB;

import java.util.Arrays;

public class Ej1 {

	public static void main(String[] args) {
		int[] array = { 2, 4, 5, 4, 4 };

		System.out.println(Arrays.toString(array));

		// La primera posición
		if (array[1] == array[array.length - 1]) {
			System.out.print("Sí ");
		} else {
			System.out.print("NO ");
		}

		// Va desde la segunda hasta la penúltima posición
		for (int i = 1; i <= array.length - 2; i++) {

			if (array[i + 1] == array[i - 1]) {
				System.out.print("Si ");
			} else {
				System.out.print("NO ");
			}

		}

		// La última posición
		if (array[array.length - 2] == array[0]) {
			System.out.print("Si ");
		} else {
			System.out.print("NO ");
		}

	}

}
