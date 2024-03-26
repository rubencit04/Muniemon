package MuniemonV3;

import java.util.ArrayList;

public class Muniemon {
	private String nombre;
	private int vida;
	private int defensa;
	private int ataque;
	private Tipo tipo;
	private int velocidad;

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

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return "Muniemon [nombre=" + nombre + ", vida=" + vida + ", defensa=" + defensa + ", ataque=" + ataque
				+ ", tipo=" + tipo + "]";
	}

	public void atacar(Muniemon muniemon) {
		int ataque = 0;
		int vida = 0;
		int defensa = 0;
		if (getVelocidad() >= muniemon.getVelocidad()) {
			ataque = this.ataque;
			vida = muniemon.vida;
			defensa = muniemon.defensa;
		} else {
			ataque = muniemon.ataque;
			vida = this.vida;
			defensa = this.defensa;
		}

		if (getTipo().equals(tipo.PLANTA) || muniemon.getTipo().equals(tipo.PLANTA)) {
			if (getTipo().equals(tipo.AGUA) || muniemon.getTipo().equals(tipo.AGUA)) {
				ataque = (int) (ataque * 0.50);
			}
		} else if (getTipo().equals(tipo.AGUA) || muniemon.getTipo().equals(tipo.AGUA)) {
			if (getTipo().equals(tipo.FUEGO) || muniemon.getTipo().equals(tipo.FUEGO)) {
				ataque = (int) (ataque * 0.50);
			}
		} else if (getTipo().equals(tipo.FUEGO) || muniemon.getTipo().equals(tipo.FUEGO)) {
			if (getTipo().equals(tipo.PLANTA) || muniemon.getTipo().equals(tipo.PLANTA)) {
				ataque = (int) (ataque * 0.50);
			}
		}

		if (defensa != 0) {
			vida = vida - ataque + defensa;
			muniemon.vida = vida;
		} else {
			vida = vida - ataque;
			muniemon.vida = vida;
		}
		System.out.println("Se le ha restado " + (ataque - defensa) + " a " + muniemon.getNombre());

		if (muniemon.vida <= 0) {
			muniemon.setVida(0);
		}

	}

}
