package Ejemplo;

public class Random {

	public static void main(String[] args) {
		// Genera n�mero de 0 a 10 inclusive.
		System.out.println(Math.round(Math.random() * 10));

		// Esto es un generador de valores aleatorios.
		Random randGen = new Random();

		// Genera un n�mero aleatorio entre 3 (incluido) y 12 (sin incluir)
		System.out.println(randGen.nex tInt(3, 12));

		// Genera un boolean aleatorio (true/false)
		System.out.println(randGen.nextBoolean());

	}

}
