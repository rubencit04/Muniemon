package MuniemonV3;

import java.util.Scanner;

public class Combate {
	private Muniemon Muniemon1;
	private Muniemon Muniemon2;

	public Muniemon getMuniemon1() {
		return Muniemon1;
	}

	public void setMuniemon1(Muniemon muniemon1) {
		Muniemon1 = muniemon1;
	}

	public Muniemon getMuniemon2() {
		return Muniemon2;
	}

	public void setMuniemon2(Muniemon muniemon2) {
		Muniemon2 = muniemon2;
	}

	@Override
	public String toString() {
		return "Combate [Muniemon1=" + Muniemon1 + ", Muniemon2=" + Muniemon2 + "]";
	}

	public void empezarCombate() {
		Scanner sc = new Scanner(System.in);
		int turno = 1;
		do {
			
			System.out.println("Turno "+ turno);
		if (Muniemon1.getVelocidad() >= Muniemon2.getVelocidad()) {
			Muniemon1.atacar(Muniemon2);
			System.out.println("Vida restante--> "+Muniemon2.getVida());
			Muniemon2.atacar(Muniemon1);
			System.out.println("Vida restante--> "+Muniemon1.getVida());
			System.out.println("Presione Enter para pasar al siguiente turno");
			sc.nextLine();
		}else {
			Muniemon2.atacar(Muniemon1);
			System.out.println("Vida restante--> "+Muniemon1.getVida());
			Muniemon1.atacar(Muniemon2);
			System.out.println("Vida restante--> "+Muniemon2.getVida());
			System.out.println("Presione Enter para pasar al siguiente turno");
			sc.nextLine();
			
		}
		turno++;
		}while(Muniemon1.getVida()!= 0 && Muniemon2.getVida()!= 0);
			if(Muniemon1.getVida() == 0) {
				System.out.println(Muniemon2.getNombre()+"  ha derrotado a "+Muniemon1.getNombre());
			}else {
				System.out.println(Muniemon1.getNombre()+"  ha derrotado a "+Muniemon2.getNombre());
			}
		}
		
	
	

}
