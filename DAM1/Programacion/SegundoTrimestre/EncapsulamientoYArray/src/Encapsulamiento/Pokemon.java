package Encapsulamiento;

public class Pokemon {
	public String name;
	public TipoPokemon type;
	public int level;
	private int hp;

	public Pokemon(String name, TipoPokemon type, int level, int hp) {
		this.name = name;
		this.type = type;
		this.level = level;
		//this.hp = hp;
		setHp(hp); // SIRVE PARA QUE HAGA LA COMPROBACION DIRECTAMENTE
	}

	public Pokemon() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TipoPokemon getType() {
		return type;
	}

	public void setType(TipoPokemon type) {
		this.type = type;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	// GETTER - Metodo que retorna el valor del atributo privado
	public int getHp() {
		return hp;
	}
	
	// SETTER - Metodo que cambia el valor del atributo privado
	public void setHp(int hp) {
		
		if (hp >= 0) {
			this.hp = hp;
		}
		
	}
}
