package Ejercicios1al10;

import java.util.Scanner;

public class Ej4 {

	/*
	 * Haz un programa que pida a un usuario su fecha de cumpleaños (día, luego mes
	 * y luego año) y muestre la fecha con el mes en palabra. Ejemplo: si introduce
	 * 1, 2, 2001 mostraría "1 de febrero de 2001".
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int d, m, a;
		String nombreMes;

		System.out.print("Introduce el día, mes y año de tu nacimiento separados por espacios y en números: ");
		d = input.nextInt();
		m = input.nextInt();
		a = input.nextInt();

		switch (m) {
		case 1:
			nombreMes = "enero";
			break;
		case 2:
			nombreMes = "febrero";
			break;
		case 3:
			nombreMes = "marzo";
			break;
		case 4:
			nombreMes = "abril";
			break;
		case 5:
			nombreMes = "mayo";
			break;
		case 6:
			nombreMes = "junio";
			break;
		case 7:
			nombreMes = "julio";
			break;
		case 8:
			nombreMes = "agosto";
			break;
		case 9:
			nombreMes = "septiembre";
			break;
		case 10:
			nombreMes = "octubre";
			break;
		case 11:
			nombreMes = "noviembre";
			break;
		case 12:
			nombreMes = "diciembre";
			break;
		default:
			nombreMes = "?";
			System.out.println("ERROR: mes desconocido.");
		}

		System.out.println("Naciste el " + d + " de " + nombreMes + " del " + a);

	}

}
