package Ejercicio;

import java.util.Scanner;

public class Calculadora {

	// El programa pide al usuario 2 números y una operación.
	// Las operaciones posibles son suma, resta, multiplicación y división.
	// El programa, después, muestra el resultado de la operación
	// sobre los números introducidos.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1;
		int n2;
		String operacion;
		boolean seguir = true;

		while (seguir == true) {
			System.out.print("Introduce el número 1: ");
			n1 = scanner.nextInt();

			System.out.print("Introduce el número 2: ");
			n2 = scanner.nextInt();

			System.out.print("Selecciona una opción:\n" + "(+) Sumar\n" + "(-) Restar\n" + "(*) Multiplicar\n"
					+ "(/) División\n" + "(s) Salir\n" + ">> ");
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
				System.out.println("ERROR: operación desconocida.");
			}

		}

	}

}
