package drone;

public class DroneController {

	public static void main(String[] args) {	
		Drone d1=new Drone();
		System.out.println(d1.getFormatedCoordinates());
		System.out.println("-----------Moving Up-------------");
		for(int i=0;i<12;i++)
			System.out.println(d1.moveUp());
		System.out.println("-----------Moving Right-------------");
		for(int i=0;i<22;i++)
			System.out.println(d1.moveRight());
		System.out.println("-----------Moving Up-------------");
		for(int i=0;i<23;i++)
			System.out.println(d1.moveUp());
		System.out.println("-----------Moving Forth-------------");
		for(int i=0;i<16;i++)
			System.out.println(d1.moveForth());
		System.out.println("-----------Moving Left-------------");
		for(int i=0;i<12;i++)
			System.out.println(d1.moveLeft());
		System.out.println("-----------Moving Forth-------------");
		for(int i=0;i<5;i++)
			System.out.println(d1.moveForth());
		System.out.println("-----------Moving Left-------------");
		for(int i=0;i<18;i++)
			System.out.println(d1.moveLeft());
		System.out.println("-----------Moving Up-------------");
		for(int i=0;i<17;i++)
			System.out.println(d1.moveUp());
		System.out.println("-----------Moving Back-------------");
		for(int i=0;i<21;i++)
			System.out.println(d1.moveBack());
		System.out.println("-----------Moving Left-------------");
		for(int i=0;i<22;i++)
			System.out.println(d1.moveLeft());
		System.out.println("-----------Moving Down-------------");
		for(int i=0;i<21;i++){
			if(d1.getX()==0&&d1.getY()==30&&d1.getZ()==30)
				System.out.println(d1.getFormatedCoordinates()+"//target reached !!");
			else 
				System.out.println(d1.moveDown());
		}
	}
}
