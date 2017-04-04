package space;

public class DoubleCubeDronController {

	public static void main(String[] args) {
		
		
		DoubleCubeDron dron = new DoubleCubeDron(30,0,30, new int[] {50,50,50},10,1);
		for(int i=0; i<10; i++){
			
			dron.moveUp();
		}
			
		
		
		

	}

}
