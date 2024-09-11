package Arrays;

import java.util.Scanner;

public class LeerArray {

	public static void main(String[] args) {
		int capacidad;
		int[] array;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce cuántos enteros: ");
		capacidad = sc.nextInt();

		array = new int[capacidad];

		// Bucle for para introducir los valores.
		for (int i = 0; i < array.length; i++) {
			System.out.print("Introduce la posición " + i + ": ");
			array[i] = sc.nextInt();
		}

		// Los dos for siguientes hacen lo mismo.
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}

		/*
		for (int entero : array) {
			System.out.println(entero + "  ");
		}
		*/

	}

}
