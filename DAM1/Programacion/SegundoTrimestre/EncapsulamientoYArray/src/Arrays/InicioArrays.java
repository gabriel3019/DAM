package Arrays;

public class InicioArrays {

	public static void main(String[] args) {
		// int - 1 entero
		// int[] - Muchos enteros en un array
		int[] arrayEnteros = { 3, 6, 10 };

		System.out.println("Primera posición: " + arrayEnteros[0]);
		System.out.println("Segunda posición: " + arrayEnteros[1]);
		System.out.println("Tercera posición: " + arrayEnteros[2]);

		arrayEnteros[2] = 4;

		System.out.println("Tercera posición: " + arrayEnteros[2]);

		// Crea un array con 5 posiciones.
		// Las posiciones tendr�n valor por defecto.
		// Como son "int", ceros.
		int[] arrayPorDefecto = new int[5];

		for (int i = 0; i < arrayPorDefecto.length; i++) {
			System.out.println("Array[" + i + "] >> " + arrayPorDefecto[i]);
		}

	}

}
