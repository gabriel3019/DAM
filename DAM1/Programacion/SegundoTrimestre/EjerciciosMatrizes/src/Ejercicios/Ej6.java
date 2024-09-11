package Ejercicios;

import java.util.Scanner;

public class Ej6 {

	/*Hacer un programa que genere una matriz como esta (se pide al usuario el tamaño, siendo siempre cuadrado y de lado impar). Intenta que sea lo más óptimo que puedas:*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lado;
		int[][] matriz;
		long t0, tf;

		System.out.print("Introduce el lado de la matriz: ");
		lado = sc.nextInt();

		t0 = System.nanoTime();
		
		matriz = new int[lado][lado];

		for (int i = 0; i < matriz.length; i++) {
			int j = lado - i - 1;
			
			matriz[i][i] = 1; // diagonal izq.
			matriz[i][j] = 1; // diagonal dcha.
			matriz[i][lado/2] = 1; // columna del centro
		}
		
		for (int i = 0; i < lado; i++) {
			matriz[lado/2][i] = 1; // fila del centro
		}
		
		for (int[] fila : matriz) {
			
			for (int elemento : fila) {
				System.out.print(elemento + " ");
			}
			
			System.out.println();
		}

		tf = System.nanoTime();
		
		System.out.println("Tiempo: " + (tf - t0)/1000000 + " milisegundos");

	}

}
