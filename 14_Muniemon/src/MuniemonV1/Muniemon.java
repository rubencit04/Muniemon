package MuniemonV1;

public class Muniemon {
	private String nombre;
	private	int vida;
	private int defensa;
	private	int ataque;
	private	Tipo tipo;
	
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
	
	
	
}
