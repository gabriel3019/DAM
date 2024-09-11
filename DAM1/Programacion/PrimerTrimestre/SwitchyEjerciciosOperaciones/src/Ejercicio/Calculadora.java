package Ejercicio;

import java.util.Scanner;

public class Calculadora {

	// El programa pide al usuario 2 n�meros y una operaci�n.
	// Las operaciones posibles son suma, resta, multiplicaci�n y divisi�n.
	// El programa, despu�s, muestra el resultado de la operaci�n
	// sobre los n�meros introducidos.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1;
		int n2;
		String operacion;
		boolean seguir = true;

		while (seguir == true) {
			System.out.print("Introduce el n�mero 1: ");
			n1 = scanner.nextInt();

			System.out.print("Introduce el n�mero 2: ");
			n2 = scanner.nextInt();

			System.out.print("Selecciona una opci�n:\n" + "(+) Sumar\n" + "(-) Restar\n" + "(*) Multiplicar\n"
					+ "(/) Divisi�n\n" + "(s) Salir\n" + ">> ");
			operacion = scanner.next();

			switch (operacion) {
			case "+":
				System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
				break;
			case "-":
				System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
				break;
			case "*":
				System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
				break;
			case "/":
				System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
				break;
			case "s":
				System.out.println("Fin de la calculadora.");
				seguir = false;
				break;
			default:
				System.out.println("ERROR: operaci�n desconocida.");
			}

		}

	}

}
