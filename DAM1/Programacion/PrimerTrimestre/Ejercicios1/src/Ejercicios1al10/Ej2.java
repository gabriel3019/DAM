package Ejercicios1al10;

import java.util.Scanner;

public class Ej2 {

	/*
	 * Haz un programa que pida al usuario el radio de una circunferencia y nos
	 * muestre su longitud, así como el área del círculo que abarca. Puedes buscar
	 * en Google las fórmulas para su obtención.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radio;

		System.out.print("Introduce un radio: ");
		radio = input.nextDouble();

		System.out.println("La circunferencia de radio " + radio + " es igual a " + (2 * 3.14 * radio));
		System.out.println("El círculo de radio " + radio + " es igual a " + (3.14 * radio * radio));

	}

}
