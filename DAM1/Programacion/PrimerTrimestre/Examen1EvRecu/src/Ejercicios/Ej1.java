package Ejercicios;

import java.util.Scanner;

public class Ej1 {

	/* LETRA1-DIGITOS-LETRA2 */
	/* B-128839-P */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String cadena;
		boolean flag = true;
		String id;
		String idProyecto;
		int comilla = 0;
		String A = "Alfa";
		String B = "Beta";
		String C = "Final";

		System.out.println("Introduce una cadena: ");
		cadena = entrada.nextLine();

		if (cadena.length() >= 1 && cadena.length() <= 8) {
			comilla = cadena.indexOf("-");
		}

		if (comilla >= 1 && comilla <= 8) {
			id = cadena.substring(comilla, 2);
			idProyecto = cadena.substring(+1, comilla);
		}

		if (cadena.length() >= 0 && cadena.length() <= 9) {

		}

	}

}
