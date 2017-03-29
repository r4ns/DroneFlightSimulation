package drone;

public class DroneController {

	public static void main(String[] args) {		
		Drone dron=new Drone(30,0,30);
		System.out.println("Dron pocinje sa letom.");
		dron.getFormatedCoordinates();
		
		System.out.println("-----Dron ide gore-----");
		for(int i=0;i<12;i++){
			System.out.println(dron.moveUp());
		}
		System.out.println("-----Dron ide desno-----");
		for(int i=0;i<21;i++){
			System.out.println(dron.moveRight());
		}
		System.out.println("-----Dron ide gore-----");
		for(int i=0;i<23;i++){
			System.out.println(dron.moveUp());	
		}
		System.out.println("-----Dron ide napred-----");
		for(int i=0;i<16;i++){
			System.out.println(dron.moveForth());		
		}
		System.out.println("-----Dron ide levo-----");
		for(int i=0;i<12;i++){
			System.out.println(dron.moveLeft());
		}
		System.out.println("-----Dron ide napred-----");
		for(int i=0;i<5;i++){
			System.out.println(dron.moveForth());		
		}
		System.out.println("-----Dron ide levo-----");
		for(int i=0;i<18;i++){
			System.out.println(dron.moveLeft());		
		}
		System.out.println("-----Dron ide gore-----");
		for(int i=0;i<17;i++){
			System.out.println(dron.moveUp());	
		}
		System.out.println("-----Dron ide nazad-----");
		for(int i=0;i<21;i++){
			System.out.println(dron.moveBack());	
		}
		System.out.println("-----Dron ide levo-----");
		for(int i=0;i<22;i++){
			System.out.println(dron.moveLeft());		
		}
		System.out.println("-----Dron ide dole-----");
		for(int i=0;i<20;i++){
			System.out.println(dron.moveDown());
		}
	}
}
