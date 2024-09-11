package Ejercicios2;

public class Ej4 {

	/*
	 * Haz un programa que, dado un array de enteros en cÃ³digo, nos diga si es puro
	 * o no en cuanto a paridad.
	 * 
	 * Un array es de paridad pura cuando los elementos en posiciÃ³n par son pares y
	 * los elementos en posiciÃ³n impar son impares.
	 */
	public static void main(String[] args) {
		// Array de enteros definido en el código
        int[] array = {2, 5, 6, 9, 12, 15};

        // Verificamos si el array es de paridad pura
        boolean esPuro = true;
        for (int i = 0; i < array.length; i++) {
            // Si la posición es par, el elemento debe ser par
            if (i % 2 == 0 && array[i] % 2 != 0) {
                esPuro = false;
                break;
            }
            // Si la posición es impar, el elemento debe ser impar
            if (i % 2 != 0 && array[i] % 2 == 0) {
                esPuro = false;
                break;
            }
        }

        // Imprimimos el resultado
        if (esPuro) {
            System.out.println("El array es de paridad pura.");
        } else {
            System.out.println("El array no es de paridad pura.");
        }

	}

}
