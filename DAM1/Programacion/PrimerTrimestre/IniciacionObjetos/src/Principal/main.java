package Principal;

import Objetos.Persona;

public class main {

	public static void main(String[] args) {
		// Se crea la primera persona.
		// "new" estamos llamando al constructor de la clase.
		// "Persona()" es el constructor por defecto.
		Persona persona1 = new Persona("Pepe", "García", "Sanz", true, 34, true);
		Persona persona2 = new Persona();
		Persona persona3 = new Persona("María", false, 20);

		System.out.println("Nombre: " + persona1.nombre);
		System.out.println("Apellido1: " + persona1.apellido1);
		System.out.println("Edad: " + persona1.edad + " años");

		System.out.println("----------------------");

		System.out.println("Nombre: " + persona2.nombre);
		System.out.println("Apellido1: " + persona2.apellido1);
		System.out.println("Apellido2: " + persona2.apellido2);
		System.out.println("Casado?: " + persona2.casado);
		System.out.println("Edad: " + persona2.edad);

		System.out.println("----------------------");

		System.out.println(persona3.vivo);

		System.out.println("----------------------");

		System.out.println(persona1.obtenerNombreCompleto());
		persona1.matar();
		persona1.matar();

	}

}
