package hospital;

public class mainHospital {

	public static void main(String[] args) {
		Hospital h1 = new Hospital("HOSPITAL 1", 4, 100);

		System.out.println("Registro: " + h1.registro);
		h1.registrarCita("Juan", "7 de enero de 2024", "10:30");
		System.out.println("Registro: " + h1.registro);
		h1.registrarCita("María", "8 de febrero de 2024", "10:45");
		System.out.println("Registro: " + h1.registro);

	}

}
