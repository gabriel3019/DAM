package Strings;

import java.util.Scanner;

public class strings {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String texto = "Hola";
		String texto2 = "!!!!";

		System.out.println("Valor del string: " + texto);
		System.out.println(texto + texto2);

		String textoLeido;

		System.out.print("Introduce un texto: ");
		textoLeido = entrada.nextLine();

		System.out.println("El texto introducido es: " + textoLeido);

	}

}
