package Arrays;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {

	public static void main(String[] args) {
		int capacidad;
		int[] array;
		Random randomGen = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce cuántos enteros: ");
		capacidad = sc.nextInt();

		array = new int[capacidad];

		for (int i = 0; i < array.length; i++) {
			// Genera un random de 0 a 9 (10 sin incluir).
			array[i] = randomGen.nextInt(10);
		}

		for (int e : array) {
			System.out.print(e + "  ");
		}

	}

}
