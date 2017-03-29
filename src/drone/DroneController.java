package drone;

public class DroneController {

	public static void main(String[] args) {		

		Drone dron = new Drone(30,0,30);
		System.out.println("Drone position: ("+dron.getX()+","+dron.getY()+","+dron.getZ()+")");
		
		System.out.println("-----Moving up-----");
		for(int i=0; i<15; i++){
			
			
			dron.moveUp();
			
		}
		
		
		System.out.println("-----Moving right-----");
		for(int i=0; i<25; i++){
			
			
			dron.moveRight();
			
		}
		
		System.out.println("-----Moving up-----");
		for(int i=0; i<23; i++){
			
			
			dron.moveUp();
			
		}
		
		System.out.println("-----Moving forth-----");
		for(int i=0; i<16; i++){
			
			
			dron.moveForth();
			
		}
		
		System.out.println("-----Moving left-----");
		for(int i=0; i<10; i++){
			
			
			dron.moveLeft();
			
		}
		
		
		System.out.println("-----Moving forth-----");
		for(int i=0; i<5; i++){
			
			
			dron.moveForth();
			
		}
		
		System.out.println("-----Moving left-----");
		for(int i=0; i<18; i++){
			
			
			dron.moveLeft();
			
		}
		
		
		System.out.println("-----Moving up-----");
		for(int i=0; i<17; i++){
			
			
			dron.moveUp();
			
		}
		
		System.out.println("-----Moving back-----");
		for(int i=0; i<21; i++){
			
			
			dron.moveBack();
			
		}
		
		System.out.println("-----Moving left-----");
		for(int i=0; i<22; i++){
			
			
			dron.moveLeft();
			
		}
		
		System.out.println("-----Moving down-----");
		for(int i=0; i<20; i++){
			
			
			dron.moveDown();
			
		}
		
		
		
		
		
	}
}
