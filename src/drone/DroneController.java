package drone;

public class DroneController {

	public static void main(String[] args) {	
		
		Drone dron=new Drone(30,0,30);
		System.out.println(dron.getFormatedCoordinates());
		
		System.out.println("-------Moving up-------");
	    while(dron.getY()<10){
	    	
		 	dron.moveUp();
		 	System.out.println(dron.getFormatedCoordinates());
		 }
	    
	    System.out.println("-------Moving right-------");
		 while(dron.getX()<45){
			 
		 	dron.moveRight();
		 	System.out.println(dron.getFormatedCoordinates());
		 }
		 
		 System.out.println("-------Moving forth-------");
		 while(dron.getZ()>5){
			 
		 	dron.moveForth();
		 	System.out.println(dron.getFormatedCoordinates());
		 }
		 
		 System.out.println("-------Moving up-------");
		 while(dron.getY()<50){
			 
		 	dron.moveUp();
		 	System.out.println(dron.getFormatedCoordinates());
		 }
		 
		 System.out.println("-------Moving left-------");
		 while(dron.getX()>30){
			 
		 	dron.moveLeft();
		 	System.out.println(dron.getFormatedCoordinates());
		 }
		 
		 System.out.println("-------Moving back-------");
		 while(dron.getZ()<30){
			 
		 	dron.moveBack();
		 	System.out.println(dron.getFormatedCoordinates());
		 }
		 
		 System.out.println("-------Moving left-------");
		 while(dron.getX()>0){
			 
		 	dron.moveLeft();
		 	System.out.println(dron.getFormatedCoordinates());
		 }
		 
		 System.out.println("-------Moving down-------");
		 while(dron.getY()>30){
			 
		 	dron.moveDown();
		 	System.out.println(dron.getFormatedCoordinates());
		 }


	}
}
