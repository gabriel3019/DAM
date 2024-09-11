package Ejercicios;

public class Ej4 {

	/*
	 * Haz un programa que tenga una matriz (array bidimensional) de doubles,
	 * inicializada directamente en el cÃ³digo, y cree un vector (1D) de doubles con
	 * la media de cada fila. Ejemplo:
	 * 
	 * matriz = { {1, 2, 3, 0}, {1, 1, 1, 0}, {2, ,1, 2, 0}, }
	 * 
	 * array medias -> {1.5, 0.75, 1.25}
	 */
	public static void main(String[] args) {
		 // Definimos la matriz de doubles
        double[][] matriz = {
            {1, 2, 3, 0},
            {1, 1, 1, 0},
            {2, 1, 2, 0}
        };

        // Creamos un vector (1D) de doubles para almacenar las medias de cada fila
        double[] medias = new double[matriz.length];

        // Calculamos la media de cada fila y la almacenamos en el vector
        for (int i = 0; i < matriz.length; i++) {
            double sum = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sum += matriz[i][j];
            }
            medias[i] = sum / matriz[i].length;
        }

        // Mostramos el vector de medias
        System.out.print("Vector de medias: {");
        for (int i = 0; i < medias.length; i++) {
            System.out.print(medias[i]);
            if (i < medias.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

	}

}
