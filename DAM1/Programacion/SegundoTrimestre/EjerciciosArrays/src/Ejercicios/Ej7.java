package Ejercicios;

public class Ej7 {

	/*Hacer un programa que tenga un array (escrito en código) y nos diga cuántos números pares y cuántos impares hay.*/
	public static void main(String[] args) {
		int[] nums = {6, 0, 5, 1};
		int contPares = 0;
		int contImparas = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 == 0) {
				contPares++;
			} else {
				contImparas++;
			}

		}

		System.out.println("Hay " + contPares + " pares y " + contImparas + " impares.");

	}

}
