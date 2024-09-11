package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	/*
	 * Haz un programa que pida una cadena a un usuario, y nos diga si es un codigo
	 * de proyecto correcto. Los codigos validos en este programa cumplen el
	 * siguiente formato: LETRA1-DIGITOS-LETRA2. Siempre tine que haber 1 letra,
	 * seguida de digitos y otra letra final. La primera letra tiene que ser "A"
	 * (fase alfa), "B"(fase beta), "C2"(fase final).Luego tinene que ir de 3 a
	 * varios digitos, de los cuales 2 son el ID y el resto son el ID del
	 * proyecto.La segunda letra tiene que ser una "P"(en proceso que es para las
	 * fases alfa y beta, exclusivamente) o "F" (finalizado, que es para la fase
	 * final exclusivamente).De aquellos codigos correctos, el programa nos dira un
	 * mensaje informativo como el siguiente ejemplo: si el codigo es "B-128839-P"
	 * que es correcto, escribira "El proyecto 8839 del grupo 12 esta en fase beta",
	 * SI el codifo fuera "B-128839-F", estaría mal
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String cadena = "";
		boolean flag = true;
		String ID = "";
		String Proyecto = "";
		String Fase = "";

		System.out.println("Introduce una cadena: ");
		cadena = scanner.nextLine();

		String[] partes = cadena.split("-");

		if (partes.length == 3) {
			if (partes[0].equals("A") || partes[0].equals("B") || partes[0].equals("C")) {
				if (partes[0].equals("A") || partes[0].equals("B")) {
					if (!partes[2].equals("P")) {
						flag = false;
					}
				} else {
					if (!partes[2].equals("F")) {
						flag = false;
					}

				}
				
			} else {
				flag = false;
			}

			if (partes[1].length() >= 3) {
				for (int i = 0; i < partes[1].length(); i++) {
					if (partes[1].charAt(i) < '0' || partes[1].charAt(i) > '9') {
						flag = false;
					}
				}

				ID = partes[1].substring(0, 2);
				Proyecto = partes[1].substring(2);

				for (int i = 0; i < ID.length(); i++) {
					if (ID.charAt(i) < '0' || ID.charAt(i) > '9') {
						flag = false;
					}
				}

				for (int i = 0; i < Proyecto.length(); i++) {
					if (Proyecto.charAt(i) < '0' || Proyecto.charAt(i) > '9') {
						flag = false;
					}
				}
			}

			if (partes[0].equals("A")) {
				Fase = "Fase alfa";
			} else {
				if (partes[0].equals("B")) {
				Fase = "Fase Beta";
				}   
			}
			
			
			
			

		} else {
			flag = false;
		}

		if (flag) {
			System.out.println("El proyecto " + Proyecto + " del grupo " + ID + " esta en fase " + Fase);
		} else {
			System.out.println("Error");
		}

	}
}
