package MuniemonV1;

import java.util.Scanner;

public class MainMuniemon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---Muniemon V1---");
		boolean encendido = true;
		Muniemon muniemon = new Muniemon();
		do{
		System.out.println("Seleccione la opcion");
		System.out.println("1.Dar de alta Muniemon");
		System.out.println("2.Mostar Muniemon");
		System.out.println("3.Salir del programa");
		System.out.println("-------------------------");
		int opcion = sc.nextInt();
		switch(opcion) {
		case 1:
			String nombre;
			int vida;
			int defensa;
			int ataque;
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
			int seleccion = sc.nextInt();
			Tipo tipo = Tipo.values()[seleccion];
			muniemon.setNombre(nombre);
			muniemon.setVida(vida);
			muniemon.setAtaque(ataque);
			muniemon.setDefensa(defensa);
			muniemon.setTipo(tipo);
			break;
		case 2:
			System.out.println(muniemon);
			System.out.println("------------------");
			break;
		case 3:
			System.out.println("Vulva pronto");
			encendido = false;
			
		}
		}while(encendido == true);
		

	}
}
