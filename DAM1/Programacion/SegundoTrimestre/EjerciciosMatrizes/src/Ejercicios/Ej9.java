package Ejercicios;

import java.util.Scanner;

public class Ej9 {

	/*
	 * Hacer un programa que genere 12 matrices, cada una con un mes del año, de tal
	 * manera que se muestre un calendario completo de días. Utiliza printf() para
	 * dar formato a las presentaciones de las matrices y el calendario debe
	 * recibir, por parte del usuario, en qué día de la semana cae el 1 de enero,
	 * así como el año. Para saber si el año es bisiesto, este es el cálculo
	 */
	public static void main(String[] args) {
		// Creamos un Scanner para obtener la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		// Solicitamos al usuario el año y el día de la semana en que cae el 1 de enero
		System.out.print("Introduce el año: ");
		int year = scanner.nextInt();

		System.out.print(
				"Introduce el día de la semana en que cae el 1 de enero (0 para domingo, 1 para lunes, ..., 6 para sábado): ");
		int dayOfWeek = scanner.nextInt();

		// Comprobamos si el año es bisiesto
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		// Definimos los días en cada mes del año (teniendo en cuenta si es bisiesto)
		int[] daysInMonth = { 31, (isLeapYear ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// Definimos los nombres de los meses
		String[] monthNames = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		// Imprimimos el calendario
		for (int month = 0; month < 12; month++) {
			// Imprimimos el nombre del mes
			System.out.println(monthNames[month]);
			System.out.println("Dom Lun Mar Mie Jue Vie Sab");

			// Calculamos el día de la semana para el primer día del mes
			int firstDayOfMonth = (dayOfWeek + 1) % 7;

			// Imprimimos espacios en blanco para alinear el primer día del mes
			for (int i = 0; i < firstDayOfMonth; i++) {
				System.out.print("    ");
			}

			// Imprimimos los días del mes
			for (int day = 1; day <= daysInMonth[month]; day++) {
				System.out.printf("%3d ", day);
				if ((firstDayOfMonth + day) % 7 == 0) {
					System.out.println(); // Salto de línea cada vez que sea domingo
				}
			}

			System.out.println(); // Salto de línea al final del mes
			System.out.println();

			// Calculamos el día de la semana para el primer día del siguiente mes
			dayOfWeek = (dayOfWeek + daysInMonth[month]) % 7;
		}

		// Cerramos el scanner
		scanner.close();

	}

}
