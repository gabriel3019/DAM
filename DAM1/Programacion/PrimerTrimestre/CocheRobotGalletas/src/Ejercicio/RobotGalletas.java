package Ejercicio;

public class RobotGalletas {
	public int galletasCrudas;
	public int galletasHorneadas;
	public int galletasEnvasadas;
	public int capacidadHorno;
	public double dinero;
	public double coste;

	public RobotGalletas(double coste) {
		this.coste = coste;
	}

	public void incrementar(int galletas) {
		galletasCrudas += galletas;
	}

	public void hornear(int galletas) {

		if (galletasCrudas >= galletas && capacidadHorno >= galletas) {
			galletasCrudas -= galletas;
			galletasHorneadas += galletas;
		}

	}

	public void envasar(int galletas) {

		if (galletasHorneadas >= galletas) {
			galletasHorneadas -= galletas;
			galletasEnvasadas += galletas;
		}

	}

	public void vender(int galletas) {

		if (galletas <= galletasEnvasadas) {
			galletasEnvasadas -= galletas;
			dinero += galletas * coste;
		}

}
}
