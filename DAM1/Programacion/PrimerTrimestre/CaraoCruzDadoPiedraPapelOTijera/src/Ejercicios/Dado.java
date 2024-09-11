package Ejercicios;

import java.util.Random;

public class Dado {

	public static void main(String[] args) {
		Random randGen = new Random();

		System.out.println("Lanzando el dado...");
		// Del 1 al 6 (incluidos). El 7 sin incluir.
		System.out.println("Ha salido el número " + randGen.nextInt(1, 7));

	}

}
