package Lectura;

import java.util.Scanner;

public class Teclado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double n1;
		double n2;
		char c1;
		char c2;

		System.out.print("Introduce el primer n�mero: ");
		n1 = entrada.nextDouble();

		System.out.print("Introduce el segundo n�mero: ");
		n2 = entrada.nextDouble();

		System.out.println("El n�mero n1 > el n�mero n2 da = " + (n1 > n2));
		System.out.println("El n�mero n1 == el n�mero n2 da = " + (n1 == n2));

		System.out.print("Introduce un car�cter: ");
		c1 = (char) entrada.nextInt();

		System.out.print("Introduce otro car�cter: ");
		c2 = (char) entrada.nextInt();

		System.out.println("Se ha le�do el car�cter: " + c1);
		System.out.println("Se ha le�do el car�cter: " + c2);
		System.out.println("c1 > c2? -> " + (c1 > c2));

	}

}
