package Ejercicios;

public class Ej8 {

	/*Hacer un programa que, partiendo de una matriz escrita en código, devuelva dos arrays unidimensionales: uno con la suma total de cada fila y otro con la suma total de cada columna.*/
	public static void main(String[] args) {
		 // Definimos una matriz de ejemplo
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Obtenemos la cantidad de filas y columnas de la matriz
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Creamos arrays para almacenar la suma total de cada fila y columna
        int[] rowSums = new int[rows];
        int[] colSums = new int[cols];

        // Calculamos la suma total de cada fila y columna
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rowSums[i] += matrix[i][j]; // Sumamos los elementos de la fila i
                colSums[j] += matrix[i][j]; // Sumamos los elementos de la columna j
            }
        }

        // Mostramos los resultados
        System.out.println("Suma total de cada fila:");
        for (int i = 0; i < rows; i++) {
            System.out.println("Fila " + i + ": " + rowSums[i]);
        }

        System.out.println("\nSuma total de cada columna:");
        for (int j = 0; j < cols; j++) {
            System.out.println("Columna " + j + ": " + colSums[j]);
        }

	}

}
