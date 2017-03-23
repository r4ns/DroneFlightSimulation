package drone;

public class DroneController {

	public static void main(String[] args) {		
		
		Drone d = new Drone();
		System.out.println(d.getFormatedCoordinates());
		System.out.println("---Penje se gore---");
		for(int i=0; i<12; i++){
		System.out.println(d.moveUp());
		}
		
		System.out.println("---Pomera se u desno---");
		for(int i=0; i<21; i++){
		System.out.println(d.moveRight());
		}
		
		System.out.println("---Penje se gore---");
		for(int i=0; i<23; i++){
		System.out.println(d.moveUp());
		}
		
		System.out.println("---Pomera se napred---");
		for(int i=0; i<16; i++){
		System.out.println(d.moveForth());
		}
		
		System.out.println("---Pomera se u levo---");
		for(int i=0; i<18; i++){
		System.out.println(d.moveLeft());
		}
		
		System.out.println("---Pomera se napred---");
		for(int i=0; i<5; i++){
		System.out.println(d.moveForth());
		}
		
		System.out.println("---Pomera se u levo---");
		for(int i=0; i<18; i++){
		System.out.println(d.moveLeft());
		}
		
		System.out.println("---Penje se gore---");
		for(int i=0; i<17; i++){
		System.out.println(d.moveUp());
		}
		
		System.out.println("---Pomera se nazad---");
		for(int i=0; i<21; i++){
		System.out.println(d.moveBack());
		}
		
		System.out.println("---Pomera se u levo---");
		for(int i=0; i<22; i++){
		System.out.println(d.moveLeft());
		}
		
		System.out.println("---Spusta se dole---");
		for(int i=0; i<20; i++){
		System.out.println(d.moveDown());
		}
		

	}
}
