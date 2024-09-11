package DatosPersona;

import java.util.Scanner;

//Primero el programa pide el nombre de la persona.
//Luego, pide la edad.
//Después, pide la altura.
//Por último, pide el estado civil (soltero/casado).
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

		System.out.print("Cuál es tu nombre? >> ");
		nombre = scanner.nextLine();

		System.out.print("cuál es tu edad? >> ");
		edad = scanner.nextInt();

		System.out.print("cuál es tu altura? >> ");
		altura = scanner.nextDouble();

		System.out.print("Cuál es tu estado [T/F]? >> ");
		estaCasado = scanner.nextBoolean();

		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad +" años");
		System.out.println("Altura: " + altura + " metros");
		System.out.println("Casado?: " + estaCasado);
	}

}
