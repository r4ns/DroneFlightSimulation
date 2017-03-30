package drone;

public class DroneController {
public static void main(String[] args) {	
		
	 		Drone dron = new Drone(30,0,30);
	 		Drone dron1 = new Drone();
	  		
	 		System.out.println(">>>Moving up<<<");
	  		for (int i = 1; i<5; i++)
	  		{
	  			dron1.moveUp();
	  		}
	  		System.out.println();
	  		
	 		System.out.println(">>>Moving right<<<");
	  		for (int i = 1; i<13; i++)
	  		{
	  			dron1.moveRight();
	  		}
	  		System.out.println();
	  		
	 		System.out.println(">>>Moving up<<<");
	  		for (int i = 1; i<42; i++)
	  		{
	  			dron1.moveUp();
	  		}
	  		System.out.println();
	  		
	 		System.out.println(">>>Moving left<<<");		
	 		for(int i = 1; i<18; i++)
	  		{
	  			dron1.moveLeft();
	  		}
	  		System.out.println();
	 		for(int i = 1; i<13;i++)
	 		
	 	System.out.println(">>>Moving forth<<<");
	 		for(int i = 1; i<23;i++)
	  		{
	  			dron1.moveForth();
	  		}
	  		System.out.println();
	 		for(int i = 1;i<16; i++)
	 		
	 		System.out.println(">>>Moving down<<<");
	 		for(int i =1; i <16; i++)
	  		{
	  			dron1.moveDown();
	  		}
	  		System.out.println();
	 		for(int i =1; i <23; i++)
	 		
	 		System.out.println(">>>Moving left<<<");
	 		for (int i = 1; i<20; i++)
	  		{
	  			dron1.moveLeft();
	  		}
	  		System.out.println();
	 		for (int i = 1; i<13; i++)
	 		
	 		System.out.println(">>>Moving back<<<");		
	 		for (int i=1; i<23; i++)
	  		{
	  			dron1.moveBack();
	  		}
	  		System.out.println();
	 		for(int i = 1; i<4;i++)
	 		
	 		System.out.println(">>>Moving left<<<");
	 		for(int i = 1; i<7;i++)
	  		{
	  			dron1.moveLeft();
	  		}
	  		
	 		
	  
	  
	  	}
}