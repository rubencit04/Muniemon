package MuniemonV3;

import java.util.Scanner;
import java.util.ArrayList;

public class MainMuniemon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---Muniemon V3---");
		boolean encendido = true;
		ArrayList<Muniemon> listaMuniemons = new ArrayList<>();
		String nombre;
		int vida;
		int defensa;
		int ataque;
		int velocidad;
		do {
			System.out.println("Seleccione la opcion");
			System.out.println("1.Dar de alta Muniemon(Maximo 2)");
			System.out.println("2.Mostar Muniemons");
			System.out.println("3.Empezar combate");
			System.out.println("4.Salir del programa");
			System.out.println("-------------------------");
			int opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				Muniemon muniemon = new Muniemon();
				System.out.println("Escribe el nombre del muniemon");
				nombre = sc.next();
				System.out.println("Escribe la vida del muniemon");
				vida = sc.nextInt();
				System.out.println("Escribe el ataque del muniemon");
				ataque = sc.nextInt();
				System.out.println("Escribe la defensa del muniemon");
				defensa = sc.nextInt();
				System.out.println("Escribe la velocidad del muniemon");
				velocidad = sc.nextInt();
				System.out.println("Seleccione el tipo del muniemon: ");
				for (int i = 0; i < Tipo.values().length; i++) {
					System.out.println(i + "-" + Tipo.values()[i]);
				}
				System.out.println("------------------");
				int seleccion = sc.nextInt();
				Tipo tipo = Tipo.values()[seleccion];
				muniemon.setNombre(nombre);
				muniemon.setVida(vida);
				muniemon.setAtaque(ataque);
				muniemon.setDefensa(defensa);
				muniemon.setTipo(tipo);
				muniemon.setVelocidad(velocidad);
				Combate combate = new Combate();
				if (combate.getMuniemon1() == null) {
					combate.setMuniemon1(muniemon);
				} else {
					combate.setMuniemon2(muniemon);
				}

				listaMuniemons.add(muniemon);

				break;
			case 2:
				System.out.println(listaMuniemons);
				break;
			case 3:
				Combate muniemons = new Combate();
				muniemons.setMuniemon1(listaMuniemons.get(0));
				muniemons.setMuniemon2(listaMuniemons.get(1));
				muniemons.empezarCombate();
				
				break;
			case 4:
				System.out.println("Vuelva a jugar pronto");
				encendido = false;
			}
		} while (encendido == true);

	}
}
