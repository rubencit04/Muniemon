package negocio;

import java.util.Random;
import java.util.Scanner;

import entidad.Muniemon;

public class Combate {
	private Muniemon m1;
	private Muniemon m2;
	
	public Combate(Muniemon m1, Muniemon m2) {
		super();
		this.m1 = m1;
		this.m2 = m2;
	}
	
	/**
	 * Metodo que realiza el combate entre dos muniemon por turnos
	 * @return el muniemon ganador
	 */
	public Muniemon empezar() {
		Muniemon primerMuniemon = determinarPrimerMuniemon(m1, m2);
		Muniemon segundoMuniemon = null;
		if(primerMuniemon == m1) {
			segundoMuniemon = m2;
		}else {
			segundoMuniemon = m1;
		}
		
		System.out.println("EMPIEZA EL GRAN COMBATE ENTRE MUNIEMONSSSSSS");
		int turno = 1;
		Scanner sc = new Scanner(System.in);
		boolean combateAcabado = false;
		Muniemon muniemonGanador = null;
		do {
			System.out.println("Primer muniemon: " + primerMuniemon);
			System.out.println("Segundo muniemon: " + segundoMuniemon);
			System.out.println("Turno: "  + turno++);
			combateAcabado = primerMuniemon.atacar(segundoMuniemon);
			if(!combateAcabado) {
				combateAcabado = segundoMuniemon.atacar(primerMuniemon);
				if(combateAcabado) {
					muniemonGanador = segundoMuniemon;
				}
			}else {
				muniemonGanador = primerMuniemon;
			}
			System.out.println("Pulse enter para continuar");
			sc.nextLine();
		}while(!combateAcabado);
		
		return muniemonGanador;
	}
	
	public Muniemon determinarPrimerMuniemon(Muniemon m1, Muniemon m2) {
		if(m1.getVelocidad() < m2.getVelocidad()) {
			return m2;
		}else if(m2.getVelocidad() < m1.getVelocidad()) {
			return m1;
		}else {
			Random rm = new Random();
			int nAleatorio = rm.nextInt(1, 10);
			if(nAleatorio <= 5) {
				return m1;
			}else {
				return m2;
			}
		}
	}
	
}
