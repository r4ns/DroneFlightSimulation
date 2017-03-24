package drone;

public class DroneController {

	public static void main(String[] args) {	
		Drone dr = new Drone();
		System.out.println(dr.getFormatedCoordinates());
		System.out.println("moveUp:");
		int i=0;
		while(i < 10){
			System.out.println(dr.moveUp());
			i++;
		}
		System.out.println("moveRight:");
		while(i<20){
			System.out.println(dr.moveRight());
			i++;
		}
		System.out.println("moveUp:");
		while(i<13){
			System.out.println(dr.moveUp());
			i++;
		}
		System.out.println("moveForth:");
		while(i<15){
			System.out.println(dr.moveForth());
			i++;
		}
		System.out.println("moveLeft:");
		while(i<10){
			System.out.println(dr.moveLeft());
			i++;
		}
		
		System.out.println("moveForth:");
		while(i<5){
			System.out.println(dr.moveForth());
			i++;
		}
		System.out.println("moveLeft:");
		while(i<18){
			System.out.println(dr.moveLeft());
			i++;
		}
		System.out.println("moveUp:");
		while(i<16){
			System.out.println(dr.moveUp());
			i++;
		}
		System.out.println("moveBack:");
		while(i<20){
			System.out.println(dr.moveBack());
			i++;
		}
		System.out.println("moveLeft:");
		while(i<21){
			System.out.println(dr.moveLeft());
			i++;
	}
		System.out.println("moveDown:");
		while(i<20){
			System.out.println(dr.moveDown());
			i++;
	     }
	}

}