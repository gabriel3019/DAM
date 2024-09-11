package Ejercicios;

public class Ej10 {

	/*
	 * Pedir al usuario un número y mostrar una pirámide de asteriscos con ese
	 * número de base. Ejemplo: pirámide de base 5:
	 */
	public static void main(String[] args) {
		int base = 5;
		int espacios = base;

		for (int i = 1; i <= base; i++) {
			System.out.print(" ".repeat(espacios));
			System.out.println("* ".repeat(i));
			espacios--;
		}


	}

}
