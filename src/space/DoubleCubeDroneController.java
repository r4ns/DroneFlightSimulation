package space;

public class DoubleCubeDroneController {

	public static void main(String[] args) {
		int[] start={9,8,39};
		int[] boundaries={50,50,50};
		int razmak=10;
		FlySpace fs= new FlySpace(boundaries,razmak);
		DoubleCubeDron cubeDron=new DoubleCubeDron(start,fs);
		for(int i=0;i<13;i++){
			System.out.println(cubeDron.moveUp());
		}

	}

}
