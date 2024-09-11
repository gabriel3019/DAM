package Ejercicios;

import java.util.Scanner;

public class SumaAcumulada {

	// Pedir al usuario 10 números por teclado y mostrar
	// la suma de todos ellos.

	// SPOILER: solución más abajo.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numLeido;
		int sumaAcumulada = 0;
		int contador = 1;

		while (contador <= 10) {
			System.out.print("Introduce un número: ");
			numLeido = teclado.nextInt();
			sumaAcumulada += numLeido;
			// Las dos de arriba pueden sustituirse por:
			// sumaAcumulada += teclado.nextInt();
			contador++;
		}

		System.out.println("Suma acumulada = " + sumaAcumulada);

	}

}
