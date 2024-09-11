package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ej3 {

	/*Hacer un programa que pida al usuario un número de filas y otro de columnas. Después, muestra una matriz de esas dimensiones con enteros aleatorios de 0 a 9 (incluidos).*/
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

        // Creamos una instancia de Random para generar números aleatorios
        Random random = new Random();

        // Rellenamos la matriz con números aleatorios del 0 al 9
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10); // Genera un número aleatorio entre 0 y 9
            }
        }

        // Mostramos la matriz
        System.out.println("Matriz generada:");
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
