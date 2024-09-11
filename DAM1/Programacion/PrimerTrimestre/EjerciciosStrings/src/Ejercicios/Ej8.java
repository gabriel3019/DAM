package Ejercicios;

public class Ej8 {

	/*
	 * Haz un programa que pida al usuario una cadena original y otra cadena de
	 * búsqueda. El programa deberá decir en qué índice (posición) se encuentra la
	 * cadena de búsqueda dentro de la cadena original. Busca una operación de las
	 * disponibles que te facilite esta tarea. Por ejemplo: si se introducen
	 * "mermelada" como cadena original y "la" como cadena de búsqueda, deberá
	 * mostrar "Encontrada en índice 5" (la letra ele está en esa posición).
	 */
	public static void main(String[] args) {
		String cadena = "mermelada";
		String busqueda = "me";

		System.out.println(cadena.indexOf(busqueda));

	}

}
