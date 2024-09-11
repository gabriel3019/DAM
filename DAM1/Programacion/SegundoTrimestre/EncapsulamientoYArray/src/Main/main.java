package Main;

import java.util.Scanner;

import Encapsulamiento.Pokemon;
import Encapsulamiento.TipoPokemon;

public class main {

	public static void main(String[] args) {
		Pokemon pokemon1 = new Pokemon("Charmander", TipoPokemon.FUEGO, 1, 100);
		Pokemon pokemon2 = new Pokemon("Pikachu", TipoPokemon.ELECTRICO, 10, 300);
		Pokemon pokemon3 = new Pokemon();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce el nombre: ");
		pokemon3.setName(scanner.nextLine());

		System.out.println("Introduce el tipo: ");

		switch(scanner.nextLine().toUpperCase()) {
		case "FUEGO":
			pokemon3.setType(TipoPokemon.FUEGO);
			break;
		case "AGUA":
			pokemon3.setType(TipoPokemon.AGUA);
			break;
		case "ELECTRICO":
			pokemon3.setType(TipoPokemon.ELECTRICO);
			break;
		case "TIERRA":
			pokemon3.setType(TipoPokemon.TIERRA);
			break;
		default:
			System.out.println("ERROR: tipo desconocido.");
		}

		System.out.println("Introduce el nivel: ");
		pokemon3.setLevel(scanner.nextInt());

		System.out.println("Introduce los puntos de vida: ");
		pokemon3.setHp(scanner.nextInt());

		System.out.println(
			"POKEMON CREADO:\n"
			+ "- Nombre: " + pokemon3.getName()
			+ "\n- Tipo: " + pokemon3.getType()
			+ "\n- Nivel: " + pokemon3.getLevel()
			+ "\n- HP: " + pokemon3.getHp()
		);

	}

}
