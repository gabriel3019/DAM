package Ejercicios;

import java.util.Scanner;

public class Ej5 {

	/*
	 * Hacer un programa que genere una matriz como esta (se pide al usuario el
	 * tamaño, siendo siempre cuadrado). Intenta que sea lo más óptimo que puedas:
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lado;
		int[][] matriz;

		System.out.print("Introduce el lado de la matriz: ");
		lado = sc.nextInt();

		matriz = new int[lado][lado];

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j <= i; j++) {
				matriz[i][j] = 1;
			}

		}
		
		for (int[] fila : matriz) {
			
			for (int elemento : fila) {
				System.out.print(elemento);
			}
			
			System.out.println();
		}

	}

}
