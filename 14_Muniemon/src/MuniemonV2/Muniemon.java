package MuniemonV2;

public class Muniemon {
	private String nombre;
	private int vida;
	private int defensa;
	private int ataque;
	private Tipo tipo;

	public Muniemon() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Muniemon [nombre=" + nombre + ", vida=" + vida + ", defensa=" + defensa + ", ataque=" + ataque
				+ ", tipo=" + tipo + "]";
	}

	public void atacar(Muniemon muniemon) {
		int ataque = this.ataque;
		int vida = muniemon.vida;
		int defensa = muniemon.defensa;
		if (muniemon.vida <= 0 || this.vida <=0) {
			System.out.println("Uno de los dos ha muerto ya no pueden seguir luchando");
		} else {

			if (defensa != 0) {
				vida = vida - ataque + defensa;
				muniemon.vida = vida;
				System.out.println("Se le ha restado " + (ataque - defensa) + " a " + muniemon.getNombre());
			} else {
				vida = vida - ataque;
				muniemon.vida = vida;
				System.out.println("Se le ha restado " + (ataque - defensa) + " a " + muniemon.getNombre());
			}
			if (muniemon.vida <= 0) {
				muniemon.setVida(0);
			}

		}
		
	}

}
