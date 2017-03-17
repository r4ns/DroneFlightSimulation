package drone;

public class DroneController {

	public static void main(String[] args) {		

			int pocetnoX = 30;
			int pocetnoy = 0;
			int pocetnoZ = 30;
			
			Drone gore = new Drone(pocetnoX,pocetnoy,pocetnoZ);
			
			System.out.println("Polecemo!!!");
			int i = 0;
			while(i<5){
				System.out.println(gore.moveUp());
				i++;
			}
			System.out.println("Popeli smo se po y za 5 !!!");
			
			int j = 0;
			while(j<15){
				System.out.println(gore.moveBack());
				j++;
			}
			System.out.println("Vratili smo se nazad po z za 15 !!!");
			
			int z = 0;
			while(z<40){
				System.out.println(gore.moveUp());
				z++;
			}
			System.out.println("Penjemo se  smo po y za 40 !!!");
			
			int y = 0;
			while(y<40){
				System.out.println(gore.moveForth());
				y++;
			}
			System.out.println("Idemo napred po z za 40 !!!");
			
			int k = 0;
			while(k<40){
				System.out.println(gore.moveDown());
				k++;
			}
			System.out.println("Idemo dole po y za 40 !!!");
			
			int m = 0;
			while(m<15){
				System.out.println(gore.moveRight());
				m++;
			}
			System.out.println("Idemo desno po x za 15 !!!");
			
			int n = 0;
			while(n<25){
				System.out.println(gore.moveBack());
				n++;
			}
			System.out.println("Vracamo se nazad po z za 30 !!!");
			
			int c = 0;
			while(c<40){
				System.out.println(gore.moveUp());
				c++;
			}
			System.out.println("Idemo gore po y za 40");
			
			int v = 0;
			while(v<40){
				System.out.println(gore.moveLeft());
				v++;
			}
			System.out.println("Idemo levo po x");
			
			int g = 0;
			while(g<15){
				System.out.println(gore.moveDown());
				g++;
			}
			System.out.println("Idemo dole po y za 15");
			
			int p = 0;
			while(p<5){
				System.out.println(gore.moveLeft());
				p++;
			}
			System.out.println("Idemo levo po x za 5");
	}
}
