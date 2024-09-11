package Ejercicios2;

public class Ej2 {

	/*Haz un programa con dos matrices de enteros en cÃ³digo que compruebe si son iguales.*/
	public static void main(String[] args) {
		 // Definimos las matrices de enteros
        int[][] matriz1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matriz2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Comprobamos si las matrices son iguales
        boolean sonIguales = true;
        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
            sonIguales = false;
        } else {
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1[0].length; j++) {
                    if (matriz1[i][j] != matriz2[i][j]) {
                        sonIguales = false;
                        break;
                    }
                }
                if (!sonIguales) {
                    break;
                }
            }
        }

        // Imprimimos el resultado
        if (sonIguales) {
            System.out.println("Las matrices son iguales.");
        } else {
            System.out.println("Las matrices no son iguales.");
        }

	}

}
