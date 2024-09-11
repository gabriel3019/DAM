package Ejercicio;

public class coche {
	public String matricula;
	public int plazas;
	public int ruedas;
	public String modelo;
	public String marca;
	public double deposito;

	public coche(String matricula, int plazas, int ruedas, String modelo, String marca, double deposito) {
		this.matricula = matricula;
		this.plazas = plazas;
		this.ruedas = ruedas;
		this.modelo = modelo;
		this.marca = marca;
		this.deposito = deposito;
	}

	public void pitar() {
		System.out.println("PIIIIIIIII");
	}

	public void repostar(double cantidad) {

		if (cantidad > 0) {
			deposito += cantidad;
		}

	}

	// 0.05 l/km
	public void moverse(double km) {
		double consumido = km * 0.05;

		if (consumido <= deposito) {
			System.out.println("Desplazando...");
			deposito -= consumido;
		}
	}
}
