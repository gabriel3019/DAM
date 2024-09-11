package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ej3 {

	/*
	 * Pedir al usuario una cantidad de elementos y se genera un array con esa
	 * capacidad lleno de números aleatorios. Después, se muestra la suma de todos
	 * los elementos.
	 */
	public static void main(String[] args) {
		// Crear una instancia de Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la cantidad de elementos
        System.out.print("Ingrese la cantidad de elementos: ");
        int cantidadElementos = scanner.nextInt();

        // Crear un array con la cantidad de elementos indicada por el usuario
        int[] numeros = new int[cantidadElementos];

        // Crear una instancia de Random para generar números aleatorios
        Random random = new Random();

        // Llenar el array con números aleatorios y calcular la suma
        int suma = 0;
        for (int i = 0; i < cantidadElementos; i++) {
            numeros[i] = random.nextInt(100); // Generar un número aleatorio entre 0 y 99
            suma += numeros[i];
        }

        // Mostrar la suma de todos los elementos
        System.out.println("La suma de todos los elementos es: " + suma);
        
        // Mostrar el array generado (opcional)
        System.out.print("Elementos del array: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Cerrar el scanner
        scanner.close();

	}

}
