package Ejercicios;

public class Ej7 {

	/*
	 * Busca informaci�n sobre las operaciones "replace()" y "replaceAll()".
	 * Util�zalas para lo siguiente: pedir al usuario una cadena y eliminar todas
	 * sus vocales. Luego mostrar el resutado. Por ejemplo: si se introduce
	 * "Cadena", saldr� "Cdn".
	 */
	public static void main(String[] args) {
		String cadena = "CadEnAAAAAAA";

		cadena = cadena.replaceAll("A", "");
		cadena = cadena.replaceAll("E", "");
		cadena = cadena.replaceAll("I", "");
		cadena = cadena.replaceAll("O", "");
		cadena = cadena.replaceAll("U", "");
		cadena = cadena.replaceAll("a", "");
		cadena = cadena.replaceAll("e", "");
		cadena = cadena.replaceAll("i", "");
		cadena = cadena.replaceAll("o", "");
		cadena = cadena.replaceAll("u", "");

		System.out.println(cadena);

	}

}
