package punto;

public class Punto {
	public double x;
	public double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double calcularDistancia(Punto punto2) {
		// Raíz((x2 - x1)^2 + (y2 - y1)^2)
		return Math.sqrt(Math.pow(punto2.x - x, 2) + Math.pow(punto2.y - y, 2));
	}
}
