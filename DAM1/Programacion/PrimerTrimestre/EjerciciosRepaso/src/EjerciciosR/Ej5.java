package EjerciciosR;

import java.util.Scanner;

public class Ej5 {

	/*
	 * Haz un programa que pida al usuario dos elementos y nos diga el elemento
	 * resultante de mezclarlos. Los elementos pueden ser de tipo "agua", "fuego",
	 * "tierra", "aire" o "neutro". Si se juntan dos elementos del mismo tipo, el
	 * resultado es también otro elemento de ese tipo ("agua + agua = agua", por
	 * ejemplo). Si se juntan dos elementos opuestos, el resultado es "neutro". Los
	 * opuestos son: fuego-agua y tierra-aire. Si se junta el elemento "neutro" con
	 * cualquier otro "X", el resultado va a ser "X". El resto de combinaciones
	 * darán lugar a elementos compuestos, que son: "agua+tierra", "agua+aire",
	 * "fuego+tierra" y "fuego+aire".
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el primer elemento (agua, fuego, tierra, aire, neutro): ");
		String elem1 = scanner.nextLine().toLowerCase();

		System.out.print("Introduce el segundo elemento (agua, fuego, tierra, aire, neutro): ");
		String elem2 = scanner.nextLine().toLowerCase();

		String resultado = "";

		switch (elem1) {
		case "agua":
			switch (elem2) {
			case "agua":
				resultado = "agua";
				break;
			case "fuego":
				resultado = "neutro";
				break;
			case "tierra":
				resultado = "agua+tierra";
				break;
			case "aire":
				resultado = "agua+aire";
				break;
			case "neutro":
				resultado = "agua";
				break;
			default:
				resultado = "Error: elemento desconocido";
				break;
			}
			break;
		case "fuego":
			switch (elem2) {
			case "agua":
				resultado = "neutro";
				break;
			case "fuego":
				resultado = "fuego";
				break;
			case "tierra":
				resultado = "fuego+tierra";
				break;
			case "aire":
				resultado = "fuego+aire";
				break;
			case "neutro":
				resultado = "fuego";
				break;
			default:
				resultado = "Error: elemento desconocido";
				break;
			}
			break;
		case "tierra":
			switch (elem2) {
			case "agua":
				resultado = "agua+tierra";
				break;
			case "fuego":
				resultado = "fuego+tierra";
				break;
			case "tierra":
				resultado = "tierra";
				break;
			case "aire":
				resultado = "neutro";
				break;
			case "neutro":
				resultado = "tierra";
				break;
			default:
				resultado = "Error: elemento desconocido";
				break;
			}
			break;
		case "aire":
			switch (elem2) {
			case "agua":
				resultado = "agua+aire";
				break;
			case "fuego":
				resultado = "fuego+aire";
				break;
			case "tierra":
				resultado = "neutro";
				break;
			case "aire":
				resultado = "aire";
				break;
			case "neutro":
				resultado = "aire";
				break;
			default:
				resultado = "Error: elemento desconocido";
				break;
			}
			break;
		case "neutro":
			switch (elem2) {
			case "agua":
				resultado = "agua";
				break;
			case "fuego":
				resultado = "fuego";
				break;
			case "tierra":
				resultado = "tierra";
				break;
			case "aire":
				resultado = "aire";
				break;
			case "neutro":
				resultado = "neutro";
				break;
			default:
				resultado = "Error: elemento desconocido";
				break;
			}
			break;
		default:
			resultado = "Error: elemento desconocido";
			break;
		}

		System.out.println("El elemento resultante es: " + resultado);

	}

}
