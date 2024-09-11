package EjerciciosR;

import java.util.Scanner;

public class Ej1 {

	/*
	 * Haz un programa que pida una cadena por teclado y nos diga si cumple este
	 * patrón: L{4}D{2}$ Esto quiere decir: 4 letras mayúsculas, dos dígitos y un
	 * símbolo del dólar.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena;
		boolean flag = true;
		
		System.out.println("Introduce una cadena: ");
		cadena = sc.nextLine();
		
		if(cadena.length() == 7) {
		
		for (int i = 0; i < 4; i++) {
			if(cadena.charAt(i) < 'A' || cadena.charAt(i) > 'Z') {
				flag = false;
			}
		}
		
		for (int i = 4; i < 6; i++) {
			if(cadena.charAt(i) < '0' || cadena.charAt(i) > '9') {
				flag = false;
			}
			
		}
		
	
			if(cadena.charAt(6) != '$') {
				flag = false;
			}
			
		}
		
		if(flag) {
			System.out.println("La cadena escrita es correcta");
		} else {
			System.out.println("La cadena es incorrecta");
		}
			
		

	}

}
