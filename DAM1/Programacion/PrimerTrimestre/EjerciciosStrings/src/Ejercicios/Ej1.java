package Ejercicios;

import java.util.Scanner;

public class Ej1 {

	/*
	 * Haz un programa que pida al usuario un texto y muestre sus caracteres
	 * separados por guiones. Por ejemplo: si el string es "HOLA", saldría
	 * "H-O-L-A".
	 */
	public static void main(String[] args) {
		// Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un texto
        System.out.print("Ingresa un texto: ");
        String texto = scanner.nextLine();

        // Inicializar una cadena vacía para almacenar el resultado
        String resultado = "";

        // Iterar sobre los caracteres del texto
        for (int i = 0; i < texto.length(); i++) {
            resultado += texto.charAt(i);
            // Agregar un guión después de cada carácter, excepto el último
            if (i < texto.length() - 1) {
                resultado += '-';
            }
        }

        // Mostrar el resultado
        System.out.println(resultado);

        // Cerrar el scanner
        scanner.close();

	}

}
