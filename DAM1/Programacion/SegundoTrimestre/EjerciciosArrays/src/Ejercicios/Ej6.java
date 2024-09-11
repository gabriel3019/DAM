package Ejercicios;

import java.util.Arrays;

public class Ej6 {

	/*
	 * Hacer un programa que tenga dos arrays (escritos en código) de la misma
	 * longitud y los sume en un tercer array. Las sumas entre arrays se llevan a
	 * cabo posición a posición. De esta manera, el array {A, B, C ... } sumado con
	 * el array {a, b, c ... } daría como resultado el array {A+a, B+b, C+c ... }.
	 */
	public static void main(String[] args) {
		int[] nums1 = {6, 0, 5, 1};
		int[] nums2 = {4, 10, 5, 9};
		int[] numsSuma = new int[nums1.length];

		for (int i = 0; i < numsSuma.length; i++) {
			numsSuma[i] = nums1[i] + nums2[i];
		}

		System.out.println(Arrays.toString(numsSuma));

	}

}
