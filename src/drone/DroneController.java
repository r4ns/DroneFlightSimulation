package drone;

public class DroneController {

	public static void main(String[] args) {		
			
		Drone drone=new Drone(30,0,30);
		
			drone.getFormatedCoordinates();
			
			System.out.println("*****GORE*****");
			for(int i=0;i<10;i++){
			drone.moveUp();
			}
			
			System.out.println("*****DESNO***** ");
			for(int i=0;i<20;i++){
			drone.moveRight();
			}
			
			System.out.println("*****GORE*****");
			for(int i=0;i<40;i++){
			drone.moveUp();
			}
			
			System.out.println("*****NAPRIJED*****");
			for(int i=0;i<30;i++){
			drone.moveForth();
			}
			
			System.out.println("*****LIJEVO*****");
			for(int i=0;i<20;i++){
			drone.moveLeft();
			}
			
			System.out.println("*****DOLE*****");
			for(int i=0;i<10;i++){
			drone.moveDown();
			}
			
			System.out.println("*****NAZAD*****");
			for(int i=0;i<30;i++){
			drone.moveBack();
			}
			
			System.out.println("*****LIJEVO*****");
			for(int i=0;i<30;i++){
			drone.moveLeft();
			}
			
			System.out.println("*****DOLE*****");
			for(int i=0;i<10;i++){
			drone.moveDown();
			}	
			
	}
}
