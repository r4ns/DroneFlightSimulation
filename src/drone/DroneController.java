package drone;

public class DroneController extends Drone{

	public static void main(String[] args) {		
		
		Drone dron=new Drone();
		int[] granicaGornja={50,50,50};
		int[] granicaDonja={40,40,40};
		dron.setGranicaGornja(granicaGornja);
		dron.setGranicaDonja(granicaDonja);
		
		dron.moveUp(10);
		dron.moveForth(20);
		System.out.println("Dodirujem prvu stranicu kocke!");
		dron.moveUp(40);
		dron.moveBack(10);
		System.out.println("Dodirujem drugu stranicu kocke!");
		dron.moveDown(10);
		dron.moveBack(40);
		System.out.println("Dodirujem trecu stranicu kocke!");
		dron.moveRight(10);
		dron.moveForth(20);
		dron.moveRight(10);
		System.out.println("Dodirujem cetvrtu stranicu kocke!");
		dron.moveUp(10);
		dron.moveLeft(50);
		dron.moveDown(20);
		System.out.println("Dodirujem petu stranicu kocke!");
		dron.moveDown(10);
		dron.moveForth(10);
		System.out.println("Dostigao sam krajnju poziciju!");
		
		
		


	}
}
