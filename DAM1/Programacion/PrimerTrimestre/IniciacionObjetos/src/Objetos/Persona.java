package Objetos;

public class Persona {
	// Atributos
	public String nombre;
	public String apellido1;
	public String apellido2;
	public boolean casado;
	public int edad;
	public boolean vivo;

	// Constructores
	public Persona(String nombre, String apellido1, String apellido2, boolean casado, int edad, boolean vivo) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.casado = casado;
		this.edad = edad;
		this.vivo = vivo;
	}

	public Persona() {

	}

	public Persona(String nombre, boolean casado, int edad) {
		this.nombre = nombre;
		this.casado = casado;
		this.edad = edad;
		// Las personas que se construyan con este, estarán vivas.
		vivo = true;
	}

	// Métodos.
	public String obtenerNombreCompleto() {
		return nombre + " " + apellido1 + " " + apellido2;
	}

	public void matar() {

		if (vivo == true) {
			System.out.println("Muerto");
			vivo = false;
		} else {
			System.out.println("No puedes matar a un muerto");
		}

	}

	public void revivir() {

		if (vivo == false) {
			System.out.println("Vivo!");
			vivo = true;
		} else {
			System.out.println("No puedes revivir a un vivo");
		}

	}

	public boolean esMayorDeEdad() {
		return edad >= 18;
	}
}
