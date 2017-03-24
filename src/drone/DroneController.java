package drone;

public class DroneController {

	public static void main(String[] args) {		
		Drone d=new Drone();
		System.out.println(d.getFormatedCoordinates());
		System.out.println("-----------Moving Up-------------");
		for(int i=0;i<12;i++)
			System.out.println(d.moveUp());
		System.out.println("-----------Moving Right-------------");
		for(int i=0;i<22;i++)
			System.out.println(d.moveRight());
		System.out.println("-----------Moving Up-------------");
		for(int i=0;i<23;i++)
			System.out.println(d.moveUp());
		System.out.println("-----------Moving Forth-------------");
		for(int i=0;i<16;i++)
			System.out.println(d.moveForth());
		System.out.println("-----------Moving Left-------------");
		for(int i=0;i<12;i++)
			System.out.println(d.moveLeft());
		System.out.println("-----------Moving Forth-------------");
		for(int i=0;i<5;i++)
			System.out.println(d.moveForth());
		System.out.println("-----------Moving Left-------------");
		for(int i=0;i<18;i++)
			System.out.println(d.moveLeft());
		System.out.println("-----------Moving Up-------------");
		for(int i=0;i<17;i++)
			System.out.println(d.moveUp());
		System.out.println("-----------Moving Back-------------");
		for(int i=0;i<21;i++)
			System.out.println(d.moveBack());
		System.out.println("-----------Moving Left-------------");
		for(int i=0;i<22;i++)
			System.out.println(d.moveLeft());
		System.out.println("-----------Moving Down-------------");
		for(int i=0;i<19;i++)
			System.out.println(d.moveDown());
		System.out.println(d.moveDown()+"//Goal");
		

	}
}
