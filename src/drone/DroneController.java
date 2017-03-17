package drone;

public class DroneController {

	public static void main(String[] args) {		

		
		Drone d = new Drone(30, 0, 30);
		
		
		while(d.getzKordinata() < 50)
			System.out.println(d.moveForth());
		while(d.getyKordinata() < 30)
			System.out.println(d.moveUp());
		while(d.getxKordinata() < 50)
			System.out.println(d.moveRight());
		while(d.getzKordinata() > 0)
			System.out.println(d.moveBack());
		
		while(d.getxKordinata() > 0)
			System.out.println(d.moveLeft());
		
		while(d.getzKordinata() < 30)
			System.out.println(d.moveForth());
		
	}
}
