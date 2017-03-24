package drone;

public class DroneController {

	public static void main(String[] args) {	
		
		Drone drone = new Drone(30, 0, 30);
		
		System.out.println("moveUP");
		int i=0;
		
		while (i < 10 )
		{
			System.out.println(drone.moveUp());
			i++;
		}
		
		System.out.println("moveRight");
		i=0;
		
		while ( i < 20)
		{
			System.out.println(drone.moveRight());
			i++;
		}
		
		System.out.println("moveUp");
		i=0;
		
		while ( i < 23)
		{
			System.out.println(drone.moveUp());
			i++;
		}
		
		System.out.println("moveForth");
		i=0;
		
		while ( i < 15)
		{
			System.out.println(drone.moveForth());
			i++;
		}
		
		System.out.println("moveLeft");
		i=0;
		
		while ( i < 11)
		{
			System.out.println(drone.moveLeft());
			i++;
		}
		
		System.out.println("moveForth");
		i=0;
		
		while(i<5)
		{
			System.out.println(drone.moveForth());
			i++;
		}
		
		System.out.println("moveLeft");
		i=0;
		
		while(i<20)
		{
			System.out.println(drone.moveLeft());
			i++;
		}
		
		System.out.println("moveUp");
		i=0;
		
		while(i<18)
		{
			System.out.println(drone.moveUp());
			i++;
		}
		
		System.out.println("moveBack");
		i=0;
		
		while(i<20)
		{
			System.out.println(drone.moveBack());
			i++;
		}
		
		System.out.println("moveLeft");
		i=0;
		
		while(i<22)
		{
			System.out.println(drone.moveLeft());
			i++;
		}
		
		System.out.println("moveDown");
		i=0;
		
		while(i<20)
		{
			System.out.println(drone.moveDown());
			i++;
		}
		

	}
}
