package Ejercicios;

import java.util.Scanner;

public class Ej1 {

	/*
	 * Hacer un programa que tenga una matriz definida en el código y pida al
	 * usuario una fila y una columna. Después, muestra el elemento en la posición
	 * indicada. Si la matriz no tiene esa posición (índices fuera de rango), se
	 * muestra un mensaje de error
	 */
	public static void main(String[] args) {
		 // Definimos una matriz de ejemplo
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Creamos un Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que introduzca la fila y la columna
        System.out.print("Introduce el número de fila: ");
        int row = scanner.nextInt();

        System.out.print("Introduce el número de columna: ");
        int col = scanner.nextInt();

        // Verificamos si la fila y la columna están dentro de los límites de la matriz
        if (row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length) {
            // Si los índices son válidos, mostramos el elemento en la posición indicada
            System.out.println("El elemento en la posición (" + row + ", " + col + ") es: " + matrix[row][col]);
        } else {
            // Si los índices están fuera de rango, mostramos un mensaje de error
            System.out.println("Error: La posición indicada está fuera de los límites de la matriz.");
        }

        // Cerramos el scanner
        scanner.close();

	}

}
