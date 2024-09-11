package EjerciciosEx;

public class Local {
	public int aforo;
	public String listaIDs;

	public Local(int aforo) {
		this.aforo = aforo;
		// Si no hacemos esto "listaIDs" ser� "null".
		listaIDs = "";
	}

	public void entrar(String id) {

		// Si el ID es "4132A", por ejemplo, buscar� "4132A;" por si "4132A" forma parte de otro ID.
		if (listaIDs.contains(id + ";")) {
			System.out.println("ERROR: el ID " + id + " ya est� en la lista");
		} else {
			// Se a�ade el ID con ";" al final para separarlo del siguiente que venga.
			listaIDs += id + ";";
		}

	}

	public void salir(String id) {

		if (listaIDs.contains(id + ";")) {
			listaIDs.replace(id + ";", "");
		} else {
			System.out.println("ERROR: el ID " + id + " no est� en la lista.");
		}

	}
}
