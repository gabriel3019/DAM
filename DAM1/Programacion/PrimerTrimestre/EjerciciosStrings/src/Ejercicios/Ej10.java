package Ejercicios;

public class Ej10 {

	/*
	 * Pedir al usuario un n�mero y mostrar una pir�mide de asteriscos con ese
	 * n�mero de base. Ejemplo: pir�mide de base 5:
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
