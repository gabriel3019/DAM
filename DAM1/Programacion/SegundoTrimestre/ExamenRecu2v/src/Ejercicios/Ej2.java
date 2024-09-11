package Ejercicios;

public class Ej2 {

	/*Haz un programa que dado una matriz de strings escrito en codgio y que el resultado muestre el array sin vocales*/
	public static void main(String[] args) {
		 String[][] matriz = {
	                {"Pomelo", "Sol", "Acebo"},
	                {"Clave", "Universo", "Tijeras"},
	                {"Elefante", "luz", "Titanio"}
	        };

	       
	        for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz[i].length; j++) {
	                matriz[i][j] = matriz[i][j].replaceAll("[AEIOUaeiou]", "");
	            }
	        }

	        
	        for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz[i].length; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();
	        }
	}

}
