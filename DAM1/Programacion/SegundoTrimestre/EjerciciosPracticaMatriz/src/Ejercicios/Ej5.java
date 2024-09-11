package Ejercicios;

public class Ej5 {

	/*
	 * Haz un programa que tenga una matriz (array 2D) de booleans, inicializada
	 * directamente en el cÃ³digo, y cree un vector (1D) de booleans con el cÃ¡lculo
	 * && de cada columna. Ejemplo:
	 * 
	 * matriz = { {true, false, false, true}, {true, true, true, true}, {false,
	 * true, false, true}, }
	 * 
	 * array && -> {false, false, false, true}
	 */
	public static void main(String[] args) {
		  // Definimos la matriz de booleanos
        boolean[][] matriz = {
            {true, false, false, true},
            {true, true, true, true},
            {false, true, false, true}
        };

        // Creamos un vector (1D) de booleanos para almacenar los resultados del AND de cada columna
        boolean[] resultadoAND = new boolean[matriz[0].length];

        // Calculamos el AND de cada columna y lo almacenamos en el vector
        for (int j = 0; j < matriz[0].length; j++) {
            boolean columnaAND = true;
            for (int i = 0; i < matriz.length; i++) {
                columnaAND = columnaAND && matriz[i][j];
            }
            resultadoAND[j] = columnaAND;
        }

        // Mostramos el vector de resultados del AND de cada columna
        System.out.print("Vector de resultados del AND de cada columna: {");
        for (int i = 0; i < resultadoAND.length; i++) {
            System.out.print(resultadoAND[i]);
            if (i < resultadoAND.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

	}

}
