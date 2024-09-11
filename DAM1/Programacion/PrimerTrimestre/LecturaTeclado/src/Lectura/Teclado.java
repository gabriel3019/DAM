package Lectura;

import java.util.Scanner;

public class Teclado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double n1;
		double n2;
		char c1;
		char c2;

		System.out.print("Introduce el primer número: ");
		n1 = entrada.nextDouble();

		System.out.print("Introduce el segundo número: ");
		n2 = entrada.nextDouble();

		System.out.println("El número n1 > el número n2 da = " + (n1 > n2));
		System.out.println("El número n1 == el número n2 da = " + (n1 == n2));

		System.out.print("Introduce un carácter: ");
		c1 = (char) entrada.nextInt();

		System.out.print("Introduce otro carácter: ");
		c2 = (char) entrada.nextInt();

		System.out.println("Se ha leído el carácter: " + c1);
		System.out.println("Se ha leído el carácter: " + c2);
		System.out.println("c1 > c2? -> " + (c1 > c2));

	}

}
