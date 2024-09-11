package Bucle;

public class BucleWhile {

	public static void main(String[] args) {
		int contador = 1;

		// While (mientras)
		while (contador <= 10) {
			System.out.println("Vuelta " + contador);
			// contador = contador + 1;
			// contador += 1;
			contador++;
		}

		contador = 10;

		while (contador > 0) {
			System.out.println("Vuelta: " + contador);
			// contador = contador - 1;
			// contador -= 1;
			contador--;
		}

		contador = 0;

		// Contador empieza en 0 y llega a 10, pero solo pares.
		while (contador <= 10) {
			System.out.println("Vuelta " + contador);
			contador += 2;
		}

		System.out.println("FIN DEL PROGRAMA: valor de contador es " + contador);

	}

}
