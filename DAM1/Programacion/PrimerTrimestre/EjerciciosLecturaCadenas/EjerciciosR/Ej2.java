package EjerciciosR;

import java.util.Scanner;

/*Haz un programa que pida una cadena por teclado y nos diga si cumple este patrón: L{1,15}$D{1,2}
Esto quiere decir: de 1 (mínimo) a 15 letras (máximo) mayúsculas, un símbolo del dólar y de 1 (mínimo) a 2 (máximo) dígitos.*/
public class Ej2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena;
		boolean flag = true;

		System.out.println("Introduce una cadena: ");
		cadena = sc.nextLine();

		if (cadena.length() >= 3 && cadena.length() <= 18) {
			int posDolar = cadena.indexOf("$");

			if (posDolar == -1 || posDolar == 0 || posDolar == cadena.length() - 1) {
				flag = false;
			} else {
				String parte1 = cadena.substring(0, posDolar);
				String parte2 = cadena.substring(posDolar + 1);

				for (int i = 0; i < parte1.length(); i++) {
					if (parte1.charAt(i) < 'A' || parte1.charAt(i) > 'Z') {
						flag = false;
					}
				}

				for (int i = 0; i < parte2.length(); i++) {
					if (parte2.charAt(i) < '0' || parte2.charAt(i) > '9') {
						flag = false;
					}
				}
			}
		}

		if (flag) {
			System.out.println("CADENA CORRECTA");
		} else {
			System.out.println("CADENA INCORRECTA");
		}

	}

}
