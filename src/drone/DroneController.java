package drone;

public class DroneController {

	public static void main(String[] args) {
		Drone dron = new Drone();
		System.out.println(dron.getFormatedCoordinates());
		System.out.println("-------------Moving up-------------");
		while(dron.isStop()){
			System.out.println(dron.moveUp());
		}
		dron.setStop(true);
		System.out.println("-------------Moving back-------------");
		while(dron.isStop()){
			System.out.println(dron.moveBack());
		}
		dron.setStop(true);
		System.out.println("-------------Moving up-------------");
		while(dron.isStop()){
			System.out.println(dron.moveUp());
		}
		System.out.println("-------------Moving forth-------------");
		for(int i=0; i<20; i++){
			System.out.println(dron.moveForth());
		}
		dron.setStop(true);
		System.out.println("-------------Moving down-------------");
		while(dron.isStop()){
			System.out.println(dron.moveDown());
		}
		System.out.println("-------------Moving right-------------");
		for(int i=0; i<3; i++){
			System.out.println(dron.moveRight());
		}
		dron.setStop(true);
		System.out.println("-------------Moving forth-------------");
		while(dron.isStop()){
			System.out.println(dron.moveForth());
		}
		dron.setStop(true);
		System.out.println("-------------Moving left-------------");
		while(dron.isStop()){
			System.out.println(dron.moveLeft());
		}
		System.out.println("-------------Moving down-------------");
		for(int i=0; i<10; i++){
			System.out.println(dron.moveDown());
		}
		dron.setStop(true);
		System.out.println("-------------Moving back-------------");
		while(dron.isStop()){
			System.out.println(dron.moveBack());
		}
	}
}
