package EjerciciosEx;

public class Linterna {
	public boolean encendida;
	// 0 - apagada
	// 1 - nivel 1
	// 2 - nivel 2
	public int nivel;
	public int carga;

	public Linterna(int carga) {
		this.carga = carga;
		// "nivel" y "encendida" comienzan por defecto en "0" y "false";
	}

	public void cargar(int cargasExtra) {
		carga += cargasExtra;
	}

	public void apagar() {

		if (encendida) {
			encendida = false;
			nivel = 0;
		} else {
			System.out.println("Ya estaba apagada...");
		}

	}

	public void encender(int n) {

		if (!encendida) {

			if (n != 1 && n != 2) {
				System.out.println("El nivel solicitado no es correcto...");
			} else {

				if (n == 1) {
					carga--;
				} else {
					carga -= 2;
				}

				encendida = true;
				nivel = n;
			}

		} else {
			System.out.println("Ya estaba encendida...");
		}

	}
}
