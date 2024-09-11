package Ejercicios;

public class Matrices {

	public static void main(String[] args) {
		int[][] matriz = {
				{1, 0, -2, 3},
				{0, 0, -2, -1},
				{-6, 0, -5, -3}
			};
			int contNegativos = 0;
			int contCeros = 0;
			
			for (int i = 0; i < matriz.length; i++) {

				for (int j = 0; j < matriz[i].length; j++) {

					// Si es negativo...
					if (matriz[i][j] < 0) {
						contNegativos++;
					}

					// Si es cero...
					if (matriz[i][j] == 0) {
						contCeros++;
					}

				}

				System.out.println("Fila " + i + ": " + contNegativos + " negativos");
				System.out.println("Fila " + i + ": " + contCeros + "ceros");
				contNegativos = 0; // Reseteamos el contador
				contCeros = 0; // Reseteamos el contador
			}

	}

}
