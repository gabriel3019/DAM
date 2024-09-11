package Ejercicios;

public class Departamento {
	public String nombre;
	public int nEmpleadosTotales;
	public int nEmpleadosOcupados;
	public String nombreEJefe;
	public int nTareasSinAsignar;
	public int tAsignadas;
	public int tFinalizadas;
	
	public Departamento(String nombre, int nEmpleadosTotales, int nEmpleadosOcupados, String nombreEJefe,
			int nTareasSinAsignar, int tAsignadas, int tFinalizadas) {
		this.nombre = nombre;
		this.nEmpleadosTotales = 0;
		this.nEmpleadosOcupados = 0;
		this.nombreEJefe = nombreEJefe;
		this.nTareasSinAsignar = 0;
		this.tAsignadas = 0;
		this.tFinalizadas = 0;
	}
	
	public void contratarPersonal(int cantidad) {
		if(cantidad > 0) {
			nEmpleadosTotales += cantidad;
		}
	}
	
	public void despedirTrabajadores(int cantidad) {
		if(cantidad > 0) {
			nEmpleadosTotales -= cantidad;
		}
	}
	
	public void tareasNuevas(int cantidad) {
		if(cantidad > 0) {
			nTareasSinAsignar += cantidad;
		}
	}
	
	public void asignarTareas(int cantidad) {
		boolean flag = true;
		if(nTareasSinAsignar > 0) {
			tAsignadas += cantidad;
			if(nEmpleadosOcupados != tAsignadas) {
				flag = false;
			}
		}
	}
	
	
	public void finalizarTareas() {
		if(tAsignadas == 0) {
			tFinalizadas++;
		}
	}

	
}
