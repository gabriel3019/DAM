package fecha;

public class mainFecha {

	public static void main(String[] args) {
		Fecha f1 = new Fecha(28, 2, 2023);
		Fecha f2 = new Fecha(29, 2, 2024);
		Fecha f3 = new Fecha(1, 2, 2024);

		System.out.println("Es v�lida? >> " + f1.esValida());
		System.out.println("Han pasado " + f1.contarDias() + " d�as");
		System.out.println("Es v�lida? >> " + f2.esValida());
		System.out.println("Han pasado " + f2.contarDias() + " d�as");
		System.out.println("Es v�lida? >> " + f3.esValida());

	}

}
