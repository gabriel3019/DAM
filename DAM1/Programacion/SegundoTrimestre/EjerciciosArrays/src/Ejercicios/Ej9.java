package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ej9 {

	/*
	 * Hacer un programa que pida al usuario una cadena y cree un array de cadenas
	 * mediante el método "split()" de la clase String. Por ejemplo: si tenemos la
	 * cadena "Hola qué tal?" en la variable "frase", al hacer "frase.split(" ")"
	 * nos devuelve un array de strings tal que {"Hola", "qué", "tal?"}, ya que usa
	 * el espacio como delimitador para trocear el string y poner cada subcadena en
	 * una posición independiente dentro de un array.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String frase;
		String[] palabras;

		System.out.print("Introduce una frase: ");
		frase = scanner.nextLine();

		palabras = frase.split(" ");

		System.out.println(Arrays.toString(palabras));
	}

}
