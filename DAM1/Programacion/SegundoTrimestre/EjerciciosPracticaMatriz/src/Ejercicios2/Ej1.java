package Ejercicios2;

import java.util.Scanner;

public class Ej1 {

	/*
	 * Haz un programa que cree una matriz a partir de una frase introducida por el
	 * usuario de la siguiente forma:
	 * 
	 * Cadena de ejemplo: "Esto es una cadena" Matriz resultante de chars: { {'E',
	 * 's', 't', 'o'}, {'e', 's'}, {'u', 'n', 'a'}, {'c', 'a', 'd', 'e', 'n', 'a'} }
	 * 
	 * La matriz tiene que crearse, es decir, no basta con que salga asÃ­ por
	 * consola, debe estar en una variable.
	 */
	public static void main(String[] args) {
		// Pedimos al usuario que introduzca una frase
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = scanner.nextLine();
        scanner.close();

        // Dividimos la frase en palabras
        String[] palabras = frase.split(" ");

        // Creamos la matriz con el número de palabras como filas máximo
        char[][] matriz = new char[palabras.length][];

        // Rellenamos la matriz con los caracteres de cada palabra
        for (int i = 0; i < palabras.length; i++) {
            matriz[i] = palabras[i].toCharArray();
        }

        // Mostramos la matriz resultante
        System.out.println("Matriz resultante de chars:");
        for (char[] fila : matriz) {
            for (char c : fila) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
	}

}
