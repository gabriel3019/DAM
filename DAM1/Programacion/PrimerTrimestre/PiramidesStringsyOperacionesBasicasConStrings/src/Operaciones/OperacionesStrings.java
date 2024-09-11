package Operaciones;

public class OperacionesStrings {

	public static void main(String[] args) {
		String cadena = "murciálago";
		String cadena2 = "0abeja";

		System.out.println(cadena.toUpperCase());
		System.out.println(cadena.substring(2));
		System.out.println(cadena.substring(2, 5));

		// Modifico la variable y ahora son mayúsculas.
		cadena = cadena.toUpperCase();

		System.out.println(cadena);
		System.out.println(cadena2);

		if (cadena.compareTo(cadena2) == 0) {
			System.out.println("Las cadenas son iguales.");
		} else if (cadena.compareTo(cadena2) > 0) {
			System.out.println(cadena + " va después que " + cadena2);
		} else {
			System.out.println(cadena + " va antes que " + cadena2);
		}

		if (cadena.contains("UR")) {
			System.out.println(cadena + " contiene UR");
		}

		if (cadena.startsWith("MU")) {
			System.out.println(cadena + " empieza por MU");
		}

	}

}
