package drone;

public class DroneController {

	public static void main(String[] args) {		

			int pocetnoX = 30;
			int pocetnoy = 0;
			int pocetnoZ = 30;
			
			Drone drone = new Drone(pocetnoX,pocetnoy,pocetnoZ);
			System.out.println("TRENUTNE KOORDINATE DRONA ! ! ! " + drone.getFormatedCoordinates());
			System.out.println("Polecemo!!!");
			System.out.println("--------GORE--------");
			int i = 0;
			while(i<5){
				System.out.println(drone.moveUp());
				i++;
			}
			System.out.println("TRENUTNE KOORDINATE DRONA ! ! ! " + drone.getFormatedCoordinates());
			System.out.println("--------NAZAD--------");
			int j = 0;
			while(j<15){
				System.out.println(drone.moveBack());
				j++;
			}
			System.out.println("TRENUTNE KOORDINATE DRONA ! ! ! " + drone.getFormatedCoordinates());
			System.out.println("--------GORE--------");
			
			int z = 0;
			while(z<40){
				System.out.println(drone.moveUp());
				z++;
			}
			System.out.println("TRENUTNE KOORDINATE DRONA ! ! ! " + drone.getFormatedCoordinates());
			System.out.println("--------NAPRED--------");
			int y = 0;
			while(y<40){
				System.out.println(drone.moveForth());
				y++;
			}
			System.out.println("TRENUTNE KOORDINATE DRONA ! ! ! " + drone.getFormatedCoordinates());
			System.out.println("--------DOLE--------");
			int k = 0;
			while(k<40){
				System.out.println(drone.moveDown());
				k++;
			}
			System.out.println("TRENUTNE KOORDINATE DRONA ! ! ! " + drone.getFormatedCoordinates());
			System.out.println("--------DESNO--------");
			int m = 0;
			while(m<15){
				System.out.println(drone.moveRight());
				m++;
			}
			System.out.println("TRENUTNE KOORDINATE DRONA ! ! ! " + drone.getFormatedCoordinates());
			System.out.println("--------NAZAD--------");
			
			int n = 0;
			while(n<25){
				System.out.println(drone.moveBack());
				n++;
			}
			System.out.println("TRENUTNE KOORDINATE DRONA ! ! ! " + drone.getFormatedCoordinates());
			System.out.println("--------GORE--------");
			int c = 0;
			while(c<40){
				System.out.println(drone.moveUp());
				c++;
			}			
			System.out.println("TRENUTNE KOORDINATE DRONA ! ! ! " + drone.getFormatedCoordinates());
			
			System.out.println("--------LEVO--------");
			
			int v = 0;
			while(v<40){
				System.out.println(drone.moveLeft());
				v++;
			}
			System.out.println("TRENUTNE KOORDINATE DRONA ! ! ! " + drone.getFormatedCoordinates());
			System.out.println("--------DOLE--------");
			
			int g = 0;
			while(g<15){
				System.out.println(drone.moveDown());
				g++;
			}
			System.out.println("TRENUTNE KOORDINATE DRONA ! ! ! " + drone.getFormatedCoordinates());
			System.out.println("--------LEVO--------");
			
			int p = 0;
			while(p<5){
				System.out.println(drone.moveLeft());
				p++;
			}

	}
}
