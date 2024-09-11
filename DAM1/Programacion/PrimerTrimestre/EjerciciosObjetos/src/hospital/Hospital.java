package hospital;

public class Hospital {
	public String nombre;
	public int nPlantas;
	public int nMedicos;
	public String registro;

	public Hospital(String nombre, int nPlantas, int nMedicos) {
		this.nombre = nombre;
		this.nPlantas = nPlantas;
		this.nMedicos = nMedicos;
		registro = "";
	}

	public void registrarCita(String nombre, String fecha, String hora) {
		registro += nombre + " el " + fecha + " a las " + hora + ";";
	}
}
