package Estrcuturas;

import java.util.Scanner;

public class ParEImpar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x;

		System.out.print("Introduce un valor para 'x': ");
		x = entrada.nextInt();

		if (x % 2 == 0) {
			System.out.println(x + " es par");
		} else {
			System.out.println(x + " es impar");
		}

		System.out.println("Fin del programa");
	}
}
