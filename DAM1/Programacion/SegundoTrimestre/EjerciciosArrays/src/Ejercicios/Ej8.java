package Ejercicios;

import java.util.Arrays;

public class Ej8 {

	/*
	 * Hacer un programa que tenga un array de cadenas y las cambie todas a
	 * mayúsculas. Por ejemplo: si el array original es {"Pantera", "Cilantro",
	 * "Acueducto"}, el mismo array pasará a ser {"PANTERA", "CILANTRO",
	 * "ACUEDUCTO"}.
	 */
	public static void main(String[] args) {
		String[] cadenas = { "Pantera", "Cilantro", "Acueducto" };

		for (int i = 0; i < cadenas.length; i++) {
			cadenas[i] = cadenas[i].toUpperCase();
		}

		System.out.println(Arrays.toString(cadenas));

	}

}
