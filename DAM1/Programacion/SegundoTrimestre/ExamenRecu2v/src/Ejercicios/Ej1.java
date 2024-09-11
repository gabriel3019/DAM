package Ejercicios;

public class Ej1 {

	/*
	 * Haz un programa que dado unidimensional de enteros escrito en codgio, muestre
	 * cuales de ellos cumplen la copndicion ser un numero primo, el programa debe
	 * recorrer el array y para cada elemento si la condicion se cumple debe mostrar
	 * Si de lo contrario mostrtar NO Array: 2 4 5 9 11 17
	 */
	public static void main(String[] args) {
		int[] numeros = {2, 4, 5, 9, 11, 17};  
		
		for (int numero : numeros) {
	            boolean esPrimo = true;
	            if (numero <= 1) {
	                esPrimo = false;
	            } else {
	                for (int i = 2; i <= Math.sqrt(numero); i++) {
	                    if (numero % i == 0) {
	                        esPrimo = false;
	                        break;
	                    }
	                }
	            }
	            if (esPrimo) {
	                System.out.println(numero + " - SI");
	            } else {
	                System.out.println(numero + " - NO");
	            }
	        }

	}

}
