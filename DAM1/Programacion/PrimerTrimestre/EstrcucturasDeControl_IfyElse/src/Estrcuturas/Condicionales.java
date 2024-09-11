package Estrcuturas;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x;

		System.out.print("Introduce un valor para 'x': ");
		x = entrada.nextInt();

		// if -> true
		// else -> false
		if (x < 20) {
			System.out.println("La variable es menor que 20.");
		} else {
			System.out.println("La variable es mayor o igual que 20.");
		}

		System.out.println("Fin del programa");

	}

}
