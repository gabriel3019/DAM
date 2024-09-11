package Ejercicio;

import java.util.Scanner;

public class MainCoche {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String matricula;
		int plazas;
		int ruedas;
		String modelo;
		String marca;
		double deposito;
		coche coche;

		System.out.print("Introduce la matr�cula: ");
		matricula = scanner.nextLine();
		System.out.print("Introduce la marca: ");
		marca = scanner.nextLine();
		System.out.print("Introduce el modelo: ");
		modelo = scanner.nextLine();
		System.out.print("Introduce las ruedas: ");
		ruedas = scanner.nextInt();
		System.out.print("Introduce las plazas: ");
		plazas = scanner.nextInt();
		System.out.print("Introduce el dep�sito: ");
		deposito = scanner.nextDouble();

		coche = new coche(matricula, plazas, ruedas, modelo, marca, deposito);

		System.out.println("Dep�sito inicial: " + coche.deposito);
		coche.repostar(5);
		System.out.println("Dep�sito tras repostar: " + coche.deposito);
		coche.moverse(100);
		System.out.println("Dep�sito tras moverse: " + coche.deposito);

	}

}
