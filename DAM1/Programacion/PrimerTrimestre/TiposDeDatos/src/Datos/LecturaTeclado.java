package Datos;

import java.util.Scanner;

public class LecturaTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lectura = new Scanner(System.in);
		int numero;

		System.out.print("Introduce un n�mero: ");
		numero = lectura.nextInt();

		System.out.println("Has introducido el n�mero " + 2 * numero);

	}

}
