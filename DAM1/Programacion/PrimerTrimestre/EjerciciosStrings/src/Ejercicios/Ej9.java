package Ejercicios;

public class Ej9 {

	/*
	 * Mejorar el ejercicio 8 para que busque todos los índices donde se encuentre
	 * la cadena de búsqueda (puede estar repetida). Por ejemplo: si se introducen
	 * "mermelada" como cadena original y "me" como cadena de búsqueda, deberá
	 * mostrar "Encontrada en índices: 0 y 3".
	 */
	public static void main(String[] args) {
		String cadena = "mermeladaaa";
		String busqueda = "aa";

		for (int i = 0; i < cadena.length(); i++) {
			// "mermelada", "ermelada", "rmelada" ... "a"
			String subcadena = cadena.substring(i);
			int index = subcadena.indexOf(busqueda);

			if (index >= 0) {
				System.out.println(index + i);
				i += index;
			}

		}

	}

}
