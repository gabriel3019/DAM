package Ejercicios;

import java.util.Scanner;

public class Ej1 {

	/*Haz un programa que cuente cuÃ¡ntos nÃºmeros pares y cuÃ¡ntos nÃºmeros impares hay en un vector (array de una dimensiÃ³n) de enteros.*/
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

        // Contadores para números pares e impares
        int countPares = 0;
        int countImpares = 0;

        // Iteramos sobre el vector para contar los números pares e impares
        for (int i = 0; i < size; i++) {
            if (vector[i] % 2 == 0) {
                countPares++;
            } else {
                countImpares++;
            }
        }

        // Mostramos los resultados
        System.out.println("Cantidad de números pares: " + countPares);
        System.out.println("Cantidad de números impares: " + countImpares);

        // Cerramos el scanner
        scanner.close();	

	}

}
