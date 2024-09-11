package EjerciciosR;

import java.util.Scanner;

public class Ej4 {

	/*
	 * Haz un programa pida una cadena y vaya mostrándola conforme se borran sus
	 * caracteres de los bordes. Ejemplo: si la cadena es "Prueba", saldrá: Prueba
	 * rueb ue FIN
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String cadena;
		int i1, i2;

		System.out.print("Introduce una cadena: ");
		cadena = scanner.nextLine();

		i1 = 0;
		i2 = cadena.length() - 1;

		while (i1 <= i2) {
			System.out.println(cadena.substring(i1, i2 + 1));
			i1++;
			i2--;
		}
	}

}
