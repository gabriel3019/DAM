package Ejercicios;

import java.util.Scanner;

public class Ej2 {
	/*Haz un programa que comience con un vector (1D) de enteros y vaya mostrando dicho vector en la consola con decrementos hasta que todos los elementos valgan 0. Ejemplo:

	{1, 4, 2, 2}
	{0, 3, 1, 1}
	{0, 2, 0, 0}
	{0, 1, 0, 0}

	{0, 0, 0, 0}
	 */
	public static void main(String[] args) {
		 // Creamos un Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario el tamaño del vector y los valores de los elementos
        System.out.print("Introduce el tamaño del vector: ");
        int size = scanner.nextInt();

        int[] vector = new int[size];

        System.out.println("Introduce los elementos del vector:");
        for (int i = 0; i < size; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        // Mostramos el vector inicial
        for (int i = 0; i < size; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();

        // Decrementamos los elementos del vector hasta que todos sean cero
        boolean allZeros = false;
        while (!allZeros) {
            allZeros = true;
            for (int i = 0; i < size; i++) {
                if (vector[i] > 0) {
                    vector[i]--;
                    allZeros = false;
                }
            }
            // Mostramos el vector después de cada decremento
            for (int i = 0; i < size; i++) {
                System.out.print(vector[i] + " ");
            }
            System.out.println();
        }

        // Cerramos el scanner
        scanner.close();

	}

}
