package Tokens;

import java.util.Scanner;

public class TokenScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1, n2, n3;
		int entero;
		double doble;
		boolean booleano;

		/*
		System.out.print("Introduce los 3 números: ");
		n1 = scanner.nextInt();
		n2 = scanner.nextInt();
		n3 = scanner.nextInt();

		System.out.println("Números leídos: " + n1 + ", " + n2 + ", " + n3);
		*/

		System.out.print("Introduce un entero, un double y un boolean: ");
		entero = scanner.nextInt();
		doble = scanner.nextDouble();
		booleano = scanner.nextBoolean();

		System.out.println("Valores leídos: " + entero + ", " + doble + ", " + booleano);

	}

}
