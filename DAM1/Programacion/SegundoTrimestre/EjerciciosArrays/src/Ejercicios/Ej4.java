package Ejercicios;

import java.util.Scanner;

public class Ej4 {

	/*
	 * Sobre un array en código, que el usuario introduzca un número a buscar y nos
	 * diga cuántos números por encima de éste existen dentro del array.
	 */
	public static void main(String[] args) {
		// Definimos el array con algunos números de ejemplo
        int[] array = {10, 15, 8, 23, 5, 17, 3, 20};
        
        // Creamos un Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitamos al usuario que introduzca un número
        System.out.print("Introduce un número: ");
        int number = scanner.nextInt();
        
        // Variable para contar cuántos números son mayores
        int count = 0;
        
        // Iteramos sobre el array y contamos los números mayores que el introducido
        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                count++;
            }
        }
        
        // Mostramos el resultado
        System.out.println("Hay " + count + " números mayores que " + number + " en el array.");
        
        // Cerramos el scanner
        scanner.close();

	}

}
