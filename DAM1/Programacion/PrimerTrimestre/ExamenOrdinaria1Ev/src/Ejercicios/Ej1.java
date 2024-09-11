package Ejercicios;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		String cadena;
		Boolean flag = true;
		int indiceSimb;
		int indiceDolar;
		String parte1;
		String parte2;
		String parte3;
		int contadorCero = 0;
		
		System.out.println("Introduce una cadena: ");
		cadena = entrada.nextLine();
		
		
	if(cadena.length() >= 6) {
		indiceSimb = cadena.indexOf("[/-+]");
		indiceDolar = cadena.indexOf("$");
		
		if(indiceSimb >= 2 && indiceSimb <= cadena.length() - 6) {
			parte1 = cadena.substring(0, indiceSimb);
			parte2 = cadena.substring(indiceSimb, indiceDolar);
			parte3 = cadena.substring(indiceDolar);
			
			if(parte1.length() > 2 || parte2.length() > 4 || parte3.length() > 1) {
				flag = false;
			}
			
			for (int i = 0; i < parte1.length(); i++) {
				if (parte1.charAt(i) < 'A' || parte1.charAt(i) > 'Z') {
					flag = false;
				}
			}
			
			for (int i = 0; i < parte2.length(); i++) {
				if (parte2.charAt(i) < '0' || parte2.charAt(i) > '9') {
					flag = false;
				}
			}
			
			for (int j = 0; j < parte2.length(); j++) {
				if(parte2.charAt(j) == '0') {
					contadorCero++;
				}
			}
			
			for (int i = 0; i < parte3.length(); i++) {
				if(parte3.charAt(i) != contadorCero) {
					flag = false;
				}
			}
			
			
		}
	} else {
		flag = false;
	}
		
	if (flag) {
		System.out.println("La cadena esta correcta: " + cadena);
	} else {
		System.out.println("Error");
	}
		
		

	}

}
