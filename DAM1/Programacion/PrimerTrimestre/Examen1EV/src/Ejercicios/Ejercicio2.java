package Ejercicios;

public class Ejercicio2 {
	private int roscas;
	private int resistencias;
	private int cristales;
	private double ingresos;
	private double gastos;
	private double costoRosca;
	private double costoResistencia;
	private double costoCristal;
	private double precioVenta;
	
	public Ejercicio2(int roscas, int resistencias, int cristales, double ingresos, double gastos, double costoRosca,
			double costoResistencia, double costoCristal, double precioVenta) {
		this.roscas = 0;
		this.resistencias = 0;
		this.cristales = 0;
		this.ingresos = 0;
		this.gastos = 0;
		this.costoRosca = costoRosca;
		this.costoResistencia = costoResistencia;
		this.costoCristal = costoCristal;
		this.precioVenta = precioVenta;
	}
	

    public void comprarComponentes(int roscas, int resistencias, int cristales) {
        this.roscas += roscas;
        this.resistencias += resistencias;
        this.cristales += cristales;
        this.gastos += roscas * costoRosca + resistencias * costoResistencia + cristales * costoCristal;
    }

    public boolean crearYVenderBombillas(int cantidad) {
        if (roscas >= cantidad && resistencias >= cantidad && cristales >= cantidad) {
            roscas -= cantidad;
            resistencias -= cantidad;
            cristales -= cantidad;
            ingresos += cantidad * precioVenta;
            return true;
        } else {
            return false;
        }
    }

    public void mostrarEstado() {
        System.out.println("Componentes disponibles:");
        System.out.println("Roscas: " + roscas);
        System.out.println("Resistencias: " + resistencias);
        System.out.println("Cristales: " + cristales);
        System.out.println("Ingresos: " + ingresos);
        System.out.println("Gastos: " + gastos);
        System.out.println("Beneficio: " + (ingresos - gastos));
    }

}
