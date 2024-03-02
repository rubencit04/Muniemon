package MuniemonV2;

import java.util.Scanner;

public class MainMuniemon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---Muniemon V1---");
		boolean encendido = true;
		Muniemon muniemon1 = new Muniemon();
		Muniemon muniemon2 = new Muniemon();
		String nombre;
		int vida;
		int defensa;
		int ataque;
		do{
		System.out.println("Seleccione la opcion");
		System.out.println("1.Dar de alta primer Muniemon");
		System.out.println("2.Dar de alta segundo Muniemon");
		System.out.println("3.Mostar primer Muniemon");
		System.out.println("4.Mostrar segundo Muniemon");
		System.out.println("5.Atacar primer Muniemon a segundo");
		System.out.println("6.Atacar segundo Muniemon a primer");
		System.out.println("7.Salir del programa");
		System.out.println("-------------------------");
		int opcion = sc.nextInt();
		switch(opcion) {
		case 1:
			System.out.println("Escribe el nombre del muniemon");
			nombre = sc.next();
			System.out.println("Escribe la vida del muniemon");
			vida = sc.nextInt();
			System.out.println("Escribe el ataque del muniemon");
			ataque = sc.nextInt();
			System.out.println("Escribe la defensa del muniemon");
			defensa = sc.nextInt();
			System.out.println("Seleccione el tipo del muniemon: ");
			for(int i = 0; i < Tipo.values().length;i++) {
				System.out.println(i+"-"+Tipo.values()[i]);
			}
			System.out.println("------------------");
			int seleccion = sc.nextInt();
			Tipo tipo = Tipo.values()[seleccion];
			muniemon1.setNombre(nombre);
			muniemon1.setVida(vida);
			muniemon1.setAtaque(ataque);
			muniemon1.setDefensa(defensa);
			muniemon1.setTipo(tipo);
			break;
		case 2:
			System.out.println("Escribe el nombre del muniemon");
			nombre = sc.next();
			System.out.println("Escribe la vida del muniemon");
			vida = sc.nextInt();
			System.out.println("Escribe el ataque del muniemon");
			ataque = sc.nextInt();
			System.out.println("Escribe la defensa del muniemon");
			defensa = sc.nextInt();
			System.out.println("Seleccione el tipo del muniemon: ");
			for(int i = 0; i < Tipo.values().length;i++) {
				System.out.println(i+"-"+Tipo.values()[i]);
			}
			System.out.println("------------------");
			int seleccion2 = sc.nextInt();
			Tipo tipo2 = Tipo.values()[seleccion2];
			muniemon2.setNombre(nombre);
			muniemon2.setVida(vida);
			muniemon2.setAtaque(ataque);
			muniemon2.setDefensa(defensa);
			muniemon2.setTipo(tipo2);
			break;
		case 3:
			if(muniemon1.getVida()>=0) {
				System.out.println(muniemon1);
				System.out.println("------------------");
				}else {
					System.out.println(muniemon1.getNombre()+" esta muerto");
					System.out.println("------------------");
				}
			break;
		case 4:
			if(muniemon2.getVida()>=0) {
			System.out.println(muniemon2);
			System.out.println("------------------");
			}else {
				System.out.println(muniemon2.getNombre()+" esta muerto");
				System.out.println("------------------");
			}
			break;
		case 5:
			System.out.println("El Muniemon " +muniemon1.getNombre()+" esta atacando a "+muniemon2.getNombre());
			muniemon1.atacar(muniemon2);
			System.out.println("------------------");
			break;
		case 6:
			System.out.println("El Muniemon " +muniemon2.getNombre()+" esta atacando a "+muniemon1.getNombre());
			muniemon2.atacar(muniemon1);
			System.out.println("------------------");
			break;
		case 7:
			System.out.println("Vulva a jugar pronto");
			encendido = false;
			
		}
		}while(encendido == true);
		

	}
}
