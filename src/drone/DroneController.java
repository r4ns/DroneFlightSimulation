package drone;

public class DroneController{

	public static void main(String[] args) {	
		
		Drone d = new Drone(30,0,30);
		System.out.println(d.getFormatedCoordinates());
		
		System.out.println("-------------Moving up-------------");
		for(int i = 0; i <= 12; i++){
			System.out.println(d.moveUp());
		}
		
		System.out.println("-------------Moving right-------------");
		for(int i = 0; i <= 20; i++){
			System.out.println(d.moveRight());
		}
		
		System.out.println("-------------Moving up-------------");
		for(int i = 0; i <= 22; i++){
			System.out.println(d.moveUp());
		}
		
		System.out.println("-------------Moving forth-------------");
		for(int i = 0; i <= 15; i++){
			System.out.println(d.moveForth());
		}
		
		System.out.println("-------------Moving left-------------");
		for(int i = 0; i <= 11; i++){
			System.out.println(d.moveLeft());
		}
		
		System.out.println("-------------Moving forth-------------");
		for(int i = 0; i <= 4; i++){
			System.out.println(d.moveForth());
		}
		
				
		System.out.println("-------------Moving left-------------");
		for(int i = 0; i <= 17; i++){
			System.out.println(d.moveLeft());
		}
		
		System.out.println("-------------Moving up-------------");
		for(int i = 0; i <= 16; i++){
			System.out.println(d.moveUp());
		}
		
		System.out.println("-------------Moving back-------------");
		for(int i = 0; i <= 20; i++){
			System.out.println(d.moveBack());
		}
		
		
		System.out.println("-------------Moving left-------------");
		for(int i = 0; i <= 21; i++){
			System.out.println(d.moveLeft());
		}
		
		System.out.println("-------------Moving down-------------");
		for(int i = 0; i <= 19; i++){
			System.out.println(d.moveDown());
		}
		
		

	}
}
