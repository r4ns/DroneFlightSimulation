package drone;

public class DroneController {

	public static void main(String[] args) {	
		Drone d1=new Drone();
		System.out.println(d1);
		int i=0;
		while(i<12){
			d1.movement("YG");
			i++;
		}
	}
}
