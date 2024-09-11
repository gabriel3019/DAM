package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {

	public static void main(String[] args) {
		Random randGen = new Random();
		Scanner scanner = new Scanner(System.in);
		// Generamos la opción de la máquina.
		int opcionUsuario, opcionOrdenador = randGen.nextInt(3);
		// 0 - Piedra
		// 1 - Papel
		// 2 - Tijeras

		// Pedimos al usuario su opción.
		System.out.print("Introduce la opción deseada (0, 1, 2 | piedra, papel, tijeras): ");
		opcionUsuario = scanner.nextInt();

		// Mostramos por consola la opción de la máquina.
		switch (opcionOrdenador) {
		case 0:
			System.out.println("La máquina selecciona PIEDRA");
			break;
		case 1:
			System.out.println("La máquina selecciona PAPEL");
			break;
		default:
			System.out.println("La máquina selecciona TIJERAS");
		}

		// Mostramos el resultado.
		if (opcionUsuario == opcionOrdenador) {
			System.out.println("EMPATE");
		} else if (
			opcionUsuario == 0 && opcionOrdenador == 2
			|| opcionUsuario == 1 && opcionOrdenador == 0
			|| opcionUsuario == 2 && opcionOrdenador == 1
		) {
			System.out.println("GANA EL USUARIO");
		} else {
			System.out.println("GANA LA máquina");
		}

	}

}
