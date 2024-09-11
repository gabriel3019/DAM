package modstatic;

public class Alumno {
	private final String nombre;
	private static String centro;
	
	public Alumno(String nombre, String centro) {
		this.nombre = nombre;
		Alumno.centro = centro;
	}

	public static String getCentro() {
		return centro;
	}

	public static void setCentro(String centro) {
		Alumno.centro = centro;
	}

	public String getNombre() {
		return nombre;
	}
}
