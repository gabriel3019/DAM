package EjerciciosEx;

public class Heladeria {
	public int depositoVainilla;
	public int depositoChocolate;
	public int depositoFresa;
	public int depositoNata;
	public int capacidadMax;
	public double costeBola;
	public int mlBola;
	public int ventas;
	public double dinero;

	public Heladeria(int depositoVainilla, int depositoChocolate, int depositoFresa, int depositoNata, int capacidadMax,
			double costeBola, int mlBola) {
		this.depositoVainilla = depositoVainilla;
		this.depositoChocolate = depositoChocolate;
		this.depositoFresa = depositoFresa;
		this.depositoNata = depositoNata;
		this.capacidadMax = capacidadMax;
		this.costeBola = costeBola;
		this.mlBola = mlBola;
	}

	public void recargar(String sabor, int cantidad) {

		switch (sabor.toUpperCase()) {
		case "VAINILLA":

			if (depositoVainilla + cantidad > capacidadMax) {
				depositoVainilla = capacidadMax;
			} else {
				depositoVainilla += cantidad;
			}

			break;
		case "CHOCOLATE":

			if (depositoChocolate + cantidad > capacidadMax) {
				depositoChocolate = capacidadMax;
			} else {
				depositoChocolate += cantidad;
			}

			break;
		case "NATA":

			if (depositoNata + cantidad > capacidadMax) {
				depositoNata = capacidadMax;
			} else {
				depositoNata += cantidad;
			}

			break;
		case "FRESA":

			if (depositoFresa + cantidad > capacidadMax) {
				depositoFresa = capacidadMax;
			} else {
				depositoFresa += cantidad;
			}

			break;
		default:
			System.out.println("Depósito desconocido.");
		}

	}

	public void vender(String sabor, int nBolas) {

		switch (sabor.toUpperCase()) {
		case "VAINILLA":

			if (nBolas * mlBola <= depositoVainilla) {

				// 1 bola
				if (nBolas == 1) {
					dinero += costeBola;
				// 2 bolas
				} else if (nBolas == 2) {
					dinero += 2 * costeBola * 0.9;
				// 3 bolas o más
				} else {
					dinero += nBolas * costeBola * 0.8;
				}

				ventas++;
				depositoVainilla -= nBolas * mlBola;
			}

			break;
		case "CHOCOLATE":

			if (nBolas * mlBola <= depositoChocolate) {

				// 1 bola
				if (nBolas == 1) {
					dinero += costeBola;
				// 2 bolas
				} else if (nBolas == 2) {
					dinero += 2 * costeBola * 0.9;
				// 3 bolas o más
				} else {
					dinero += nBolas * costeBola * 0.8;
				}

				ventas++;
				depositoChocolate -= nBolas * mlBola;
			}

			break;
		case "NATA":

			if (nBolas * mlBola <= depositoNata) {

				// 1 bola
				if (nBolas == 1) {
					dinero += costeBola;
				// 2 bolas
				} else if (nBolas == 2) {
					dinero += 2 * costeBola * 0.9;
				// 3 bolas o más
				} else {
					dinero += nBolas * costeBola * 0.8;
				}

				ventas++;
				depositoNata -= nBolas * mlBola;
			}

			break;
		case "FRESA":

			if (nBolas * mlBola <= depositoFresa) {

				// 1 bola
				if (nBolas == 1) {
					dinero += costeBola;
				// 2 bolas
				} else if (nBolas == 2) {
					dinero += 2 * costeBola * 0.9;
				// 3 bolas o más
				} else {
					dinero += nBolas * costeBola * 0.8;
				}

				ventas++;
				depositoFresa -= nBolas * mlBola;
			}

			break;
		default:
			System.out.println("Sabor desconocido.");
		}

	}

}
