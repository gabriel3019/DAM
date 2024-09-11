package EjerciciosEx;

public class Local {
	public int aforo;
	public String listaIDs;

	public Local(int aforo) {
		this.aforo = aforo;
		// Si no hacemos esto "listaIDs" será "null".
		listaIDs = "";
	}

	public void entrar(String id) {

		// Si el ID es "4132A", por ejemplo, buscará "4132A;" por si "4132A" forma parte de otro ID.
		if (listaIDs.contains(id + ";")) {
			System.out.println("ERROR: el ID " + id + " ya está en la lista");
		} else {
			// Se añade el ID con ";" al final para separarlo del siguiente que venga.
			listaIDs += id + ";";
		}

	}

	public void salir(String id) {

		if (listaIDs.contains(id + ";")) {
			listaIDs.replace(id + ";", "");
		} else {
			System.out.println("ERROR: el ID " + id + " no está en la lista.");
		}

	}
}
