package main;

import objetos.Producto;

public class main {

	public static void main(String[] args) {
		Producto prod1 = new Producto("Chocolate", -1, 300, 5192254);
		Producto prod2 = new Producto();

		System.out.println(prod1.nombre);
		System.out.println(prod1.precio);
		System.out.println(prod2.nombre);

		System.out.println(prod1.obtenerPrecioRebajado(20));
		prod1.reponer(100);
		System.out.println(prod1.stock);

		if (prod1.hayStock()) {
			System.out.println("Hay stock del producto 1");
		} else {
			System.out.println("No hay stock del producto 1");
		}
	}

}
