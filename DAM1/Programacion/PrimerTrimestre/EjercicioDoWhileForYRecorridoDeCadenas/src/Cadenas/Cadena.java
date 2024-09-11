package Cadenas;

public class Cadena {

	public static void main(String[] args) {
		String cadena1 = "Hola mundo!";
		char c1 = cadena1.charAt(0);
		char c2 = cadena1.charAt(1);

		System.out.println(cadena1);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(cadena1.charAt(2));
		System.out.println("Hola mundo!".charAt(3));

		System.out.println("la cadena ocupa: " + cadena1.length());
		System.out.println(cadena1.charAt(10));

		for (int i = 0; i < cadena1.length(); i++) {
			System.out.print(cadena1.charAt(i) + " ");
		}

		for (int i = cadena1.length() - 1; i >= 0; i--) {
			System.out.print(cadena1.charAt(i) + " ");
		}

	}

}
