package drone;

public class DroneController {

	public static void main(String[] args) {

		
		Drone dron= new Drone(30,0,30);//0,30,30

		System.out.println(dron.getFormatedCoordinates());
		for(int i =0;i<12;i++){
			if(dron.getY()==0)
				System.out.println("--------Moving up-------");
			System.out.println(dron.moveUp());
		}
		for(int i =0;i<21;i++){
			if(dron.getX()==30)
				System.out.println("--------Moving Rigth-------");
			System.out.println(dron.moveRight());
		}
		for(int i =0;i<23;i++){
			if(dron.getY()==10)
				System.out.println("--------Moving up-------");
			System.out.println(dron.moveUp());
		}
		for(int i =0;i<16;i++){
			if(dron.getZ()==30)
				System.out.println("--------Moving Forth-------");
			System.out.println(dron.moveForth());
		}
		for(int i =0;i<12;i++){
			if(dron.getX()==50)
				System.out.println("--------Moving Left-------");
			System.out.println(dron.moveLeft());
		}
		for(int i =0;i<5;i++){
			if(dron.getZ()==14)
				System.out.println("--------Moving Forth-------");
			System.out.println(dron.moveForth());
		}
		for(int i =0;i<18;i++){
			if(dron.getX()==40)
				System.out.println("--------Moving Left-------");
			System.out.println(dron.moveLeft());
		}
		for(int i =0;i<17;i++){
			if(dron.getY()==33)
				System.out.println("--------Moving up-------");
			System.out.println(dron.moveUp());
		}
		for(int i =0;i<21;i++){
			if(dron.getZ()==9)
				System.out.println("--------Moving back-------");
			System.out.println(dron.moveBack());
		}
		for(int i =0;i<22;i++){
			if(dron.getX()==22)
				System.out.println("--------Moving left-------");
			System.out.println(dron.moveLeft());
		}
		for(int i =0;i<20;i++){
			if(dron.getY()==50)
				System.out.println("--------Moving down-------");
			System.out.println(dron.moveDown());
}
	}			
}

