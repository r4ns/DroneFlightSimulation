package space;

public class DoubleCubeDroneController {

	public static void main(String[] args) {
			
			FlySpace fs = new FlySpace(new int[]{0,0,0},50,10);
			fs.dodajPrepreku(new int[]{5,0,0});
			DoubleCubeDron dron = new DoubleCubeDron(new int[] {0,0,0},1,fs);
			System.out.println(dron.toString());
			for(int i=0;i<7;i++){
				System.out.println(dron.moveRight());
			}
		

	}

}
