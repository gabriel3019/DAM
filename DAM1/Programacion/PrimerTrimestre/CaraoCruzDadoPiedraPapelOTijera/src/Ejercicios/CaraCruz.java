package Ejercicios;

import java.util.Random;

public class CaraCruz {

	public static void main(String[] args) {
		Random randGen = new Random();

		System.out.println("Se lanza la moneda...");

		if (randGen.nextBoolean() == true) {
			System.out.println("Ha salido cara.");
		} else {
			System.out.println("Ha salido cruz.");
		}

	}

}
