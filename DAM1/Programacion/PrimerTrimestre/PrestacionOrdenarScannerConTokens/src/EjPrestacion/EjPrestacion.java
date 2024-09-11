package EjPrestacion;

import java.util.Scanner;

public class EjPrestacion {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int edad;
		double salario;

		System.out.print("Introduce tu edad: ");
		edad = entrada.nextInt();

		System.out.print("Introduce tu salario anual: ");
		salario = entrada.nextDouble();

		if (edad < 18) {
			System.out.println("Recibes el 40% de tu salario: " + salario * 0.4);
		} else {

			if (salario > 25000) {
				System.out.println("No recibes prestación.");
			} else {
				System.out.println("Recibes el 25% de tu salario: " + salario * 0.25);
			}

		}

	}

}
