package EjerciciosEx;

public class Balanza {
	public int platoIzq;
	public int platoDcho;

	public Balanza() {
		// Los dos platos se pondr�n a 0 por defecto.
	}

	public String calcularInclinacion() {
		String estado;

		if (platoIzq > platoDcho) {
			estado = "IZQUIERDA";
		} else if (platoDcho > platoIzq) {
			estado = "DERECHA";
		} else {
			estado = "EQUILIBRIO";
		}

		return estado;
	}

	public void equilibrar() {
		int total = 0;

		if (platoIzq != platoDcho) {
			total = platoIzq + platoDcho;
	
			// Los dos platos pesar�n lo mismo.
			// En impares, como son ints, la divisi�n se truncar�.
			platoIzq = platoDcho = total / 2;
		}

	}
}
