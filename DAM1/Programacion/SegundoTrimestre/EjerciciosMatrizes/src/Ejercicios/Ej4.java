package Ejercicios;

import java.util.Scanner;

public class Ej4 {

	/*
	 * Hacer un programa que pida al usuario un número de filas y otro de columnas.
	 * Después, va pidiendo los valores a poner en cada posición (el usuario rellena
	 * la matriz con sus valores). Luego, muestra la matriz para verificar que está
	 * bien.
	 */
	public static void main(String[] args) {
		// Creamos un Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que introduzca el número de filas y columnas
        System.out.print("Introduce el número de filas: ");
        int rows = scanner.nextInt();

        System.out.print("Introduce el número de columnas: ");
        int cols = scanner.nextInt();

        // Creamos una matriz con las dimensiones especificadas
        int[][] matrix = new int[rows][cols];

        // Solicitamos al usuario que introduzca los valores para cada posición de la matriz
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Introduce el valor para la posición (" + i + ", " + j + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Mostramos la matriz para verificar que está bien
        System.out.println("Matriz ingresada:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Cerramos el scanner
        scanner.close();

	}

}
