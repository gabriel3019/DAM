package fecha;

public class Fecha {
	public int dia;
	public int mes;
	public int año;

	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;

		// No es obligatorio, pero podríamos aprovechar el método en el constructor.
		if (!esValida()) {
			System.out.println("Fecha construida pero no es correcta.");
		}

	}

	public boolean esValida() {
		boolean valida = false;

		if (mes >= 1 && mes <= 12) {

			// Para enero, marzo, mayo y julio
			if (mes <= 7 && mes % 2 != 0 && dia >= 1 && dia <= 31) {
				valida = true;
				// Para agosto, octubre y diciembre
			} else if (mes >= 8 && mes % 2 == 0 && dia >= 1 && dia <= 31) {
				valida = true;
				// Para abril y junio
			} else if (mes >= 4 && mes <= 6 && mes % 2 == 0 && dia >= 1 && dia <= 30) {
				valida = true;
				// Para septiembre y noviembre
			} else if (mes >= 9 && mes % 2 != 0 && dia >= 1 && dia <= 30) {
				valida = true;
				// Para febrero
			} else {

				if (esBisiesto()) {

					if (dia >= 1 && dia <= 29) {
						valida = true;
					}

				} else {

					if (dia >= 1 && dia <= 28) {
						valida = true;
					}

				}

			}

		}

		return valida;
	}

	public boolean esBisiesto() {
		return año % 4 == 0 && año % 100 != 0 || año % 400 == 0;
	}

	public int contarDias() {
		int dias = 0;

		for (int i = 1; i < mes; i++) {

			// Para enero, marzo, mayo y julio
			if (i <= 7 && i % 2 != 0) {
				dias += 31;
				// Para agosto, octubre y diembre
			} else if (i >= 8 && i % 2 == 0) {
				dias += 31;
				// Para abril y junio
			} else if (i >= 4 && i <= 6 && i % 2 == 0) {
				dias += 30;
				// Para septiembre y noviembre
			} else if (i >= 9 && i % 2 != 0) {
				dias += 30;
				// Para febrero
			} else {

				if (esBisiesto()) {
					dias += 29;
				} else {
					dias += 28;
				}

			}

		}

		dias += dia;

		return dias;
	}

}
