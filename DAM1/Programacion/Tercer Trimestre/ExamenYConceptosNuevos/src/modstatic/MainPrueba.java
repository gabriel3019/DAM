package modstatic;

import java.util.Scanner;

public class MainPrueba {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
			int n;
			System.out.print("Introduce un número: ");
			n = leerNumero();
		
	}
		public static int leerNumero() {
			return scanner.nextInt();
		}

	}

