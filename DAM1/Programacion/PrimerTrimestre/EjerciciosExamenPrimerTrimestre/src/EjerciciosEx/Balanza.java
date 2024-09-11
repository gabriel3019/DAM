package EjerciciosEx;

public class Balanza {
	public int platoIzq;
	public int platoDcho;

	public Balanza() {
		// Los dos platos se pondrán a 0 por defecto.
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
	
			// Los dos platos pesarán lo mismo.
			// En impares, como son ints, la división se truncará.
			platoIzq = platoDcho = total / 2;
		}

	}
}
