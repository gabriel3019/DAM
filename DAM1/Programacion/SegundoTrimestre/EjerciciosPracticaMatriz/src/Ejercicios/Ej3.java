package Ejercicios;

import java.util.Scanner;

public class Ej3 {

	/*
	 * Haz un programa que pida al usuario una cadena. Luego, crea un vector (1D) de
	 * strings a partir de esa cadena usando el sÃ­mbolo '-' como delimitador de
	 * elementos. DespuÃ©s, elimina de cada string la letra 'A' o 'a' y muestra el
	 * vector resultante. Ejemplo:
	 * 
	 * "Esta-es-una-CADENA" -> {"Esta", "es", "una", "CADENA"} -> {"Est", "es",
	 * "un", "CDEN"}
	 */
	public static void main(String[] args) {
		   // Creamos un Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario una cadena
        System.out.print("Introduce una cadena con el símbolo '-' como delimitador: ");
        String input = scanner.nextLine();

        // Creamos un vector (1D) de strings a partir de la cadena usando el '-' como delimitador
        String[] vector = input.split("-");

        // Eliminamos la letra 'A' o 'a' de cada string en el vector
        for (int i = 0; i < vector.length; i++) {
            vector[i] = vector[i].replace("A", "").replace("a", "");
        }

        // Mostramos el vector resultante
        System.out.print("Vector resultante: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            if (i < vector.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Cerramos el scanner
        scanner.close();

	}

}
