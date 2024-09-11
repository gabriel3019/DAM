package Ejercicios;

public class Ej7 {

	/*Hacer un programa que sume dos matrices (ya escritas en el código) y devuelva la matriz resultante. Las sumas se hacen celda a celda: cómo sumar matrices.*/
	public static void main(String[] args) {
		  // Definimos dos matrices de ejemplo con las mismas dimensiones
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Verificamos que las matrices tengan las mismas dimensiones
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("Las matrices deben tener las mismas dimensiones para ser sumadas.");
            return;
        }

        // Creamos una matriz para almacenar el resultado
        int[][] resultMatrix = new int[matrix1.length][matrix1[0].length];

        // Sumamos las matrices celda a celda
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Mostramos la matriz resultante
        System.out.println("Matriz resultante de la suma:");
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

	}

}
