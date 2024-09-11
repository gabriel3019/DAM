package Datos;

public class tipos {

	public static void main(String[] args) {
		// Esto es un comentario.
		/*
		 * Esto es un comentario.
		 */
		int entero = 10; // 32 bits de memoria
		long enteroGrande = 10000000000L; // 64 bits.
		float decimales = 3.14f; // 32 bits.
		double decimalesGrande = 3.14; // 64 bits.
		short enteroCorto = 4; // 16 bits.
		byte enteroByte = 127; // 8 bits.
		// Mejor usar "int" para enteros y "double" para decimales.
		char simbolo = 'A'; // 16 bits.
		boolean verdadero = true;
		boolean falso = false;

		System.out.println("El valor de enteroByte es " + enteroByte);

		int suma = enteroCorto + enteroByte;

		System.out.println("El resultado de la suma es " + suma);
		System.out.println("El resultado de la suma es " + enteroByte + enteroCorto);
		System.out.println("El resultado de la suma es " + (enteroByte + enteroCorto));
		System.out.println("El resultado de la multiplicación es " + enteroCorto * enteroByte);
		System.out.println("El resultado de la división es " + enteroByte / enteroCorto);
		// Si los numeros son enteros, el resultado quita los decimales.
		// Si alguno de los numeros es float/double, saldran decimales.
		System.out.println("El resultado de la división es " + enteroByte / decimalesGrande);
		System.out.println("El resultado del resto es " + enteroByte % enteroCorto);

		boolean b1 = true;
		boolean b2 = !b1; // NEGACION: b2 vale false (!true).
		boolean b3 = 9 < 2; // MENOR QUE: b3 vale false.
		boolean b4 = !!b1; // true.
		// < > <= >= == !=
		boolean b5 = 'B' != 'b'; // true
		// AND -> si los dos valen true, el resultado es true, y si no false.
		// OR -> si uno de los dos vale true, el resultado es true, y si no false.
		// AND -> &&
		// OR -> ||
		boolean b6 = 9 < 10 && 9 != 8; // true.
		boolean b7 = 9 < 8 || 9 != 8; // true.
		boolean b8 = 9 > 2 && 7 != 7 || !true; // false

		System.out.println(b7);
		System.out.println(b8);

	}

}
