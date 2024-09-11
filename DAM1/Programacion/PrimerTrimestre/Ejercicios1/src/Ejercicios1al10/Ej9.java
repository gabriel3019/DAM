package Ejercicios1al10;

import java.util.Scanner;

public class Ej9 {

	/*
	 * Haz un programa que pida al usuario un número y muestre sus dígitos separados
	 * por guiones. Por ejemplo: si introduce 203, mostraría "2-0-3". Para ello, ten
	 * en cuenta que el operador del módulo/resto (%) usado entre 10 nos da el
	 * número de la derecha, así como si usamos el cociente (/) entre 10 nos da el
	 * número de la izquierda. Explicación: 203 % 10 da 3, miestras que 203 / 10 da
	 * 20 (separamos el 20 del 3). Se puede repetir esto luego sobre el 20, de tal
	 * forma que se obtienen 2 y 0, habiendo separado por completo los dígitos del
	 * número. Si se usan otros números múltiplos de 10 (100, 1000, 10000...) se
	 * obtiene el mismo resultado pero la partición será distinta.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number, numCopy;

		System.out.print("Introduce un número: ");
		number = input.nextInt();
		numCopy = number;
		String numDesglosado = "";

		while (numCopy >= 10) {
			numDesglosado = "-" + (numCopy % 10) + numDesglosado;
			numCopy /= 10;
		}

		numDesglosado = numCopy + numDesglosado;

		System.out.println("El número " + number + " desglosado es: " + numDesglosado);
	}

}
