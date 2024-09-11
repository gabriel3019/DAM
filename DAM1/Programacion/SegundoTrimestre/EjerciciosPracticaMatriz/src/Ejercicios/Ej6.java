package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ej6 {

	/*Haz un programa que pida al usuario las dimensiones de una matriz (2D) y cree dicha matriz con elementos char aleatorios que sean vocales mayÃºsculas (A, E, I, O, U).*/
	public static void main(String[] args) {
		// Creamos un Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario las dimensiones de la matriz
        System.out.print("Introduce el número de filas: ");
        int filas = scanner.nextInt();

        System.out.print("Introduce el número de columnas: ");
        int columnas = scanner.nextInt();

        // Creamos la matriz con las dimensiones especificadas
        char[][] matriz = new char[filas][columnas];

        // Creamos una instancia de Random para generar valores aleatorios
        Random random = new Random();

        // Rellenamos la matriz con vocales mayúsculas aleatorias
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                char vocal = "AEIOU".charAt(random.nextInt(5)); // Obtenemos una vocal aleatoria
                matriz[i][j] = vocal;
            }
        }

        // Mostramos la matriz
        System.out.println("Matriz generada:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Cerramos el scanner
        scanner.close();

	}

}
