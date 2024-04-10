package entidad;

public class Muniemon {
	private String nombre;
	private int vida;
	private int ataque;
	private int defensa;
	private TipoMuniemon tipo;
	private int velocidad;
	private final double PORCENTAJE_INCREMENTO_DAÑO = 0.5;
		
	public Muniemon(String nombre, int vida, int ataque, int defensa, TipoMuniemon tipo, int velocidad) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		this.tipo = tipo;
		this.velocidad = velocidad;
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
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public TipoMuniemon getTipo() {
		return tipo;
	}
	public void setTipo(TipoMuniemon tipo) {
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
		return "Muniemon [nombre=" + nombre + ", vida=" + vida + ", ataque=" + ataque + ", defensa=" + defensa
				+ ", tipo=" + tipo + ", velocidad=" + velocidad + "]";
	}
	
	/**
	 * Método en el cual este muniemon ataca a otro muniemon pasado por parámetro
	 * Solo atacará cuando este muniemon su vida sea superior a 0. Cuando un muniemon
	 * ataque a otro le restará una vida igual al ataque del muniemon pasado por parámetro,
	 * pero antes, se le restará el ataque del muniemon a la defensa del muniemon pasado
	 * por parametro. Solamente se restará la vida cuando el daño resultante (de restar
	 * el ataque a la defensa) sea mayor que 0. Hay tipos de muniemon mas fuertes contra 
	 * otros tipos, un tipo más fuerte contra otro se representa con que el daño sea un 
	 * 50% más:
	 * <ul>
		<li>La planta es fuerte contra el agua</li>
		<li>El agua es fuerte contra el fuego</li>
		<li>El fuego es fuerte contra planta</li>
		</ul>
	 * 
	 * Además el método imprimirá por pantalla cuando el muniemon a atacará a otro muniemon
	 * (con los nombres de los correspondientes muniemons) o cuando no atacará (su vida sera
	 * menor o igual que 0)
	 * @param m el muniemon que será atacado
	 * @return <b>true</b> en caso de que este muniemon mate al muniemon pasado por parámetro
	 * (un muniemon muere cuando su vida sea menor o igual que 0, patatero) o <b>false</b> en 
	 * caso de que no lo mate.
	 */
	public boolean atacar(Muniemon m) {
		if(this.vida > 0) {
			System.out.println("El muniemon " + this.nombre + " va a atacar a " + m.nombre);
			int danio = calcularDanio(m);
			if(danio > 0) {
				m.vida -= danio;//m.vida = m.vida - danio;
				System.out.println("El muniemon " + this.nombre + " va a hacer un daño de "
						+ danio + " a " + m.nombre);
				if(m.vida <= 0) {
					return true;
				}
			}
		}else {
			System.out.println("El muniemon " + this.nombre + " no puede atacar");
		}
		
		return false;
	}
	private int calcularDanio(Muniemon m) {
		double danio = this.ataque - m.defensa;
		
		switch (this.tipo) {
		case AGUA:
			if(m.tipo == TipoMuniemon.FUEGO) {
				danio += danio*PORCENTAJE_INCREMENTO_DAÑO;
			}
			break;
		case FUEGO:
			if(m.tipo == TipoMuniemon.PLANTA) {
				danio += danio*PORCENTAJE_INCREMENTO_DAÑO;
			}
			break;
		case PLANTA:
			if(m.tipo == TipoMuniemon.AGUA) {
				danio += danio*PORCENTAJE_INCREMENTO_DAÑO;
			}
			break;
		default:
			break;
		}
		
		return (int)danio;
	}

}
