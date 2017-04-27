package space;

public class DoubleCubeDroneController {

	public static void main(String[] args) {
			
			FlySpace fs = new FlySpace(new int[]{0,0,0},50,10);
			fs.dodajPrepreku(new int[]{30,4,30});
			DoubleCubeDron dron = new DoubleCubeDron(new int[] {30,0,30},1,fs);
			System.out.println(dron.toString());
			for(int i=0;i<10;i++){
				System.out.println(dron.moveUp());
			}
		

	}

}
