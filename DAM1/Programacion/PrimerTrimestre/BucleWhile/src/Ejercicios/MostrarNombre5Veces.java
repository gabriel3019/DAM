package Ejercicios;

import java.util.Scanner;

public class MostrarNombre5Veces {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cont = 1;
		String nombre;

		System.out.print("Introduce tu nombre: ");
		nombre = entrada.nextLine();

		while (cont <= 5) {
			System.out.println(nombre);
			cont++;
		}

	}

}
