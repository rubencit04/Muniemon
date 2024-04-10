package main;

import java.util.ArrayList;
import java.util.Scanner;

import entidad.Muniemon;
import entidad.TipoMuniemon;
import negocio.Combate;

public class MainMuniemon {
	
	private static Scanner sc = null;
	private static ArrayList<Muniemon> listaMuniemons;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenidos al MUNIEMON");
		System.out.println("-----------------------");
		System.out.println("");
		listaMuniemons = new ArrayList<>();
		sc = new Scanner(System.in);
		int opcion = 0;
		
		do {
			opcion = mostrarMenu();
			switch (opcion) {
			case 1:
				crearMuniemon();
				break;
			case 2:
				mostrarMuniemons();
				break;
			case 3:
				iniciarCombate();
				break;
			default:
				break;
			}
		}while(opcion != 4);
	}

	private static void iniciarCombate() {
		if(listaMuniemons.size() == 2) {
			Combate c = new Combate(listaMuniemons.get(0), listaMuniemons.get(1));
			Muniemon muniemonGanador = c.empezar();
			System.out.println("El muniemon ganador es: " + muniemonGanador.getNombre());
		}else {
			System.out.println("Se necesitan 2 muniemons para iniciar el combate");
		}
	}

	private static void mostrarMuniemons() {
		System.out.println(listaMuniemons);		
	}

	private static void crearMuniemon() {
		if(listaMuniemons.size() < 2) {
			System.out.println("Introduzca los datos el muniemon");	
			System.out.println("Introduzca el nombre");	
			String nombre = sc.nextLine();
			System.out.println("Introduzca la vida");	
			int vida = recogerEntero();
			System.out.println("Introduzca el ataque");
			int ataque = recogerEntero();
			System.out.println("Introduzca la defensa");
			int defensa = recogerEntero();
			System.out.println("Introduzca la velocidad");
			int velocidad = recogerEntero();
			TipoMuniemon tipo = escogerTipoMuniemon();
			Muniemon m = new Muniemon(nombre, vida, ataque, defensa, tipo, velocidad);
			listaMuniemons.add(m);
			System.out.println("Muniemon creado :)");
		}else {
			System.out.println("La lista de muniemons esta llena");
		}
		
	}

	private static TipoMuniemon escogerTipoMuniemon() {
		System.out.println("Escoja el tipo de muniemon");
		int contador = 0;
		for(TipoMuniemon tm : TipoMuniemon.values()) {
			System.out.println(contador++ +"-" + tm);
		}
		int opcion = recogerEntero();
		TipoMuniemon tm = TipoMuniemon.values()[opcion];
		return tm;
	}

	private static int mostrarMenu() {
		System.out.println("Introduzca una opcion:");
		System.out.println("1- Dar de alta muniemon");
		System.out.println("2- Mostrar muniemones");
		System.out.println("3- Empezar combate");
		System.out.println("4- Salir del programa");
		
		int iOpcion = recogerEntero();
		return iOpcion;
	}
	
	private static int recogerEntero() {
		String sOpcion = sc.nextLine();
		int iOpcion = Integer.parseInt(sOpcion);
		return iOpcion;
	}

}
