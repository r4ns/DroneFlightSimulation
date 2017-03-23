package drone;

public class DroneController {
	
	public static void main(String[] args) {		
		Drone dron=new Drone(30,0,30);
		int unuStrana=10;
		int spoljStrana=50;
		int cilj=30;
		int cilj1=0;
		System.out.println("Dron pocinje sa letom.");
		dron.getFormatedCoordinates();
		System.out.println("-----Dron ide gore-----");
		while(dron.getY()<unuStrana){
			System.out.println(dron.moveUp());
		}
		System.out.println("-----Dron ide desno-----");
		while(dron.getX()<spoljStrana){
			System.out.println(dron.moveRight());
		}
		System.out.println("-----Dron ide gore-----");
		while(dron.getY()<spoljStrana){
			System.out.println(dron.moveUp());	
		}
		System.out.println("-----Dron ide levo-----");
		while(dron.getX()>cilj){
			System.out.println(dron.moveLeft());
		}
		System.out.println("-----Dron ide nazad-----");
		while(dron.getZ()<spoljStrana){
			System.out.println(dron.moveBack());	
		}
		System.out.println("-----Dron ide dole-----");
		while(dron.getY()>cilj){
			System.out.println(dron.moveDown());
		}
		System.out.println("-----Dron ide levo-----");
		while(dron.getX()>cilj1){
			System.out.println(dron.moveLeft());		
		}
		System.out.println("-----Dron ide napred-----");
		while(dron.getZ()>cilj){
			System.out.println(dron.moveForth());		
		}
	}
}
