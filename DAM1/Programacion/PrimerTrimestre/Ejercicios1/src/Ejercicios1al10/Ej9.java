package Ejercicios1al10;

import java.util.Scanner;

public class Ej9 {

	/*
	 * Haz un programa que pida al usuario un n�mero y muestre sus d�gitos separados
	 * por guiones. Por ejemplo: si introduce 203, mostrar�a "2-0-3". Para ello, ten
	 * en cuenta que el operador del m�dulo/resto (%) usado entre 10 nos da el
	 * n�mero de la derecha, as� como si usamos el cociente (/) entre 10 nos da el
	 * n�mero de la izquierda. Explicaci�n: 203 % 10 da 3, miestras que 203 / 10 da
	 * 20 (separamos el 20 del 3). Se puede repetir esto luego sobre el 20, de tal
	 * forma que se obtienen 2 y 0, habiendo separado por completo los d�gitos del
	 * n�mero. Si se usan otros n�meros m�ltiplos de 10 (100, 1000, 10000...) se
	 * obtiene el mismo resultado pero la partici�n ser� distinta.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number, numCopy;

		System.out.print("Introduce un n�mero: ");
		number = input.nextInt();
		numCopy = number;
		String numDesglosado = "";

		while (numCopy >= 10) {
			numDesglosado = "-" + (numCopy % 10) + numDesglosado;
			numCopy /= 10;
		}

		numDesglosado = numCopy + numDesglosado;

		System.out.println("El n�mero " + number + " desglosado es: " + numDesglosado);
	}

}
