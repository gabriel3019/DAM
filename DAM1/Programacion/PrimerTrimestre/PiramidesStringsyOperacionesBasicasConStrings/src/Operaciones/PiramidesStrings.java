package Operaciones;

import java.util.Scanner;

public class PiramidesStrings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String texto;
		String palabraPiramide = "";

		System.out.print("Introduce una cadena: ");
		texto = in.nextLine();

		for (int i = 0; i < texto.length(); i++) {
			palabraPiramide += texto.charAt(i);
			System.out.println(palabraPiramide);
		}

	}

}
