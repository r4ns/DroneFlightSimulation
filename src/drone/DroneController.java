package drone;

public class DroneController {

	public static void main(String[] args) {
		
		Drone dron = new Drone();
		for(int i=0;i<=13;i++){
			System.out.println(dron.moveUp());
		}
		System.out.println("Gotovo");
		for(int i=0;i<=22;i++){
			System.out.println(dron.moveRight());
		}
		System.out.println("Gotovo");
		for(int i=0;i<=23;i++){
			System.out.println(dron.moveUp());
		}
		System.out.println("Gotovo");
		for(int i=0;i<=16;i++){
			System.out.println(dron.moveForth());
		}
		System.out.println("Gotovo");
		for(int i=0;i<=10;i++){
			System.out.println(dron.moveLeft());
		}
		System.out.println("Gotovo");
		for(int i=0;i<=5;i++){
			System.out.println(dron.moveForth());
		}
		System.out.println("Gotovo");
		for(int i=0;i<=18;i++){
			System.out.println(dron.moveLeft());
		}
		System.out.println("Gotovo");
		for(int i=0;i<=17;i++){
			System.out.println(dron.moveUp());
		}
		System.out.println("Gotovo");
		for(int i=0;i<=19;i++){
			System.out.println(dron.moveBack());
		}
		System.out.println("Gotovo");
		for(int i=0;i<=23;i++){
			System.out.println(dron.moveLeft());
		}
		System.out.println("Gotovo");
		for(int i=0;i<=19;i++){
			System.out.println(dron.moveDown());
		}
		if(dron.getX()==0&&dron.getY()==30&&dron.getZ()==30)
			System.out.println("Uspeo");
		else
			System.out.println("Probaj ponovo");


	}
}
