package Ejercicios1al10;

import java.util.Scanner;

public class Ej10 {

	/*
	 * Haz un programa que simule una cuenta bancaria y los ingresos/extracciones de
	 * dinero llevados a cabo sobre �sta. El usuario comienza con 0 euros y se le da
	 * la opci�n de "ingresar", "retirar" o "salir". Cuando el usuario ingresa
	 * dinero, indica la cantidad y se a�ade al saldo de la cuenta. Si quiere
	 * retirar, se le pide la cantidad y, si es viable (se ha podido pasar del saldo
	 * disponible), se extrae de la cuenta. Cuando quiera salir, el programa
	 * termina. Entre cada movimiento realizado se ve siempre el saldo actualizado.
	 * Ejemplo de consola: Saldo disponible: 0 �Qu� deseas hacer? 1 - Ingresar 2 -
	 * Retirar 3 - Salir >> 1
	 * 
	 * �Cu�nto quieres ingresar? >> 200
	 * 
	 * Saldo disponible: 200 �Qu� deseas hacer? 1 - Ingresar 2 - Retirar 3 - Salir
	 * >> 2
	 * 
	 * �Cu�nto quieres retirar? >> 400 Lo siento, saldo insuficiente.
	 * 
	 * Saldo disponible: 200 �Qu� deseas hacer? 1 - Ingresar 2 - Retirar 3 - Salir
	 * >> 2
	 * 
	 * �Cu�nto quieres retirar? >> 150
	 * 
	 * Saldo disponible: 50 �Qu� deseas hacer? 1 - Ingresar 2 - Retirar 3 - Salir >>
	 * 3
	 * 
	 * Hasta pronto!
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int opcion = 0;
		double saldo = 0, cantidad;

		while (opcion != 3) {
			System.out.print(
					"Saldo actual: " + saldo + "\nIntroduce una opci�n:\n1. Ingresar\n2. Retirar\n3. Salir\n>> ");
			opcion = input.nextInt();

			switch (opcion) {
			case 1:
				System.out.print("\nTeclee la cantidad a ingresar: ");
				cantidad = input.nextDouble();

				saldo += cantidad;

				// Salto de l�nea para que el men� quede separado
				System.out.println();
				break;
			case 2:
				System.out.print("\nTeclee la cantidad a retirar: ");
				cantidad = input.nextDouble();

				if (cantidad <= saldo) {
					saldo -= cantidad;
				} else {
					System.out.println("Lo siento, saldo insuficiente.");
				}

				// Salto de l�nea para que el men� quede separado
				System.out.println();
				break;
			case 3:
				System.out.println("\nHasta pronto!");
				break;
			default:
				System.out.println("ERROR: opci�n desconocida.");
			}

		}
	}

}
