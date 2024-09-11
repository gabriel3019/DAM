package Ejercicio9;

public class Ej9 {

	public static void main(String[] args) {
		int x = 203;
		String cifras = "";

		while (x != 0) {

			if (cifras == "") {
				cifras = x % 10 + cifras;
			} else {
				cifras = x % 10 + "-" + cifras;
			}

			System.out.println(cifras);
			// System.out.println(x / 10);

			x = x / 10;
		}

	}

}
