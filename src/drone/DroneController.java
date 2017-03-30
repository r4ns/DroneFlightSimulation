package drone;

public class DroneController {

	public static void main(String[] args) {		

		//Kreiranje drona na zadatim koordinatama
		Drone d = new Drone(30, 0, 30);
		String poruka;
		
		
		while(d.getZ() < 50){
			poruka = d.moveBack();
			if(poruka == "Dron ne moze da izvrsi ovu komandu"){
				System.out.println(poruka);
				break;
			}
			else
				System.out.println(poruka);
		}	
		while(d.getY() < 30){
			poruka = d.moveUp();
			if(poruka == "Dron ne moze da izvrsi ovu komandu"){
				System.out.println(poruka);
				break;
			}
			else
				System.out.println(poruka);
		}
		while(d.getX() <= 50){
			poruka = d.moveRight();
			if(poruka == "Dron ne moze da izvrsi ovu komandu"){
				System.out.println(poruka);
				break;
			}
			else
				System.out.println(poruka);
		}
		while(d.getZ() > 0){
			poruka = d.moveForth();
			if(poruka == "Dron ne moze da izvrsi ovu komandu"){
				System.out.println(poruka);
				break;
			}
			else
				System.out.println(poruka);
		}
		while(d.getX() > 0){
			poruka = d.moveLeft();
			if(poruka == "Dron ne moze da izvrsi ovu komandu"){
				System.out.println(poruka);
				break;
			}
			else
				System.out.println(poruka);
		}
		while(d.getZ() < 30){
			poruka = d.moveBack();
			if(poruka == "Dron ne moze da izvrsi ovu komandu"){
				System.out.println(poruka);
				break;
			}
			else
				System.out.println(poruka);
		}
	}
}
