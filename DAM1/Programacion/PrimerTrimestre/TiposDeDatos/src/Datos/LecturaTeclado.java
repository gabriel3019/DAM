package Datos;

import java.util.Scanner;

public class LecturaTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lectura = new Scanner(System.in);
		int numero;

		System.out.print("Introduce un número: ");
		numero = lectura.nextInt();

		System.out.println("Has introducido el número " + 2 * numero);

	}

}
