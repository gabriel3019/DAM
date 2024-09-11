package EjerciciosEx;

import java.util.Random;

public class Dado {
	public int nCaras;
	public int puntos;

	public Dado(int nCaras) {
		this.nCaras = nCaras;
	}

	public int lanzar() {
		Random rand = new Random();

		// nCaras + 1 es porque no se incluye ese número
		// [1, nCaras + 1)
		return rand.nextInt(1, nCaras + 1);
	}

	public void apostar(int numero, int apuesta) {

		if (numero == lanzar()) {
			System.out.println("Has ganado!");
			puntos += apuesta;
		} else {
			System.out.println("Has perdido...");
			puntos -= apuesta / 2;
		}

	}
}
