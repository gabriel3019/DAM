package DatosPersona;

import java.util.Scanner;

//Primero el programa pide el nombre de la persona.
//Luego, pide la edad.
//Despu�s, pide la altura.
//Por �ltimo, pide el estado civil (soltero/casado).
//
//Nombre: ?
//Edad: ?
//Altura: ?
//Estado: ?
public class Persona {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nombre;
		int edad;
		double altura;
		boolean estaCasado;

		System.out.print("Cu�l es tu nombre? >> ");
		nombre = scanner.nextLine();

		System.out.print("cu�l es tu edad? >> ");
		edad = scanner.nextInt();

		System.out.print("cu�l es tu altura? >> ");
		altura = scanner.nextDouble();

		System.out.print("Cu�l es tu estado [T/F]? >> ");
		estaCasado = scanner.nextBoolean();

		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad +" a�os");
		System.out.println("Altura: " + altura + " metros");
		System.out.println("Casado?: " + estaCasado);
	}

}
