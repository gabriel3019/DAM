package Ejercicios;

public class Ej8 {

	/*
	 * Haz un programa que pida al usuario una cadena original y otra cadena de
	 * b�squeda. El programa deber� decir en qu� �ndice (posici�n) se encuentra la
	 * cadena de b�squeda dentro de la cadena original. Busca una operaci�n de las
	 * disponibles que te facilite esta tarea. Por ejemplo: si se introducen
	 * "mermelada" como cadena original y "la" como cadena de b�squeda, deber�
	 * mostrar "Encontrada en �ndice 5" (la letra ele est� en esa posici�n).
	 */
	public static void main(String[] args) {
		String cadena = "mermelada";
		String busqueda = "me";

		System.out.println(cadena.indexOf(busqueda));

	}

}
