package drone;



public class DroneController  {

	public static void main(String[] args) {		

		int x = 30;
		int y = 0;
		int z = 30;
		
		
		
		Drone dronPravi = new Drone(x,y,z);
		System.out.println(dronPravi.getFormatedCoordinates());
		System.out.println("Going UP!");
		int yGranica = 0;
		while(yGranica<10)
		{
			System.out.println(dronPravi.moveUp());
			yGranica++;
		}
		System.out.println("Warning!");
		System.out.println("Going BACK!");
		int GranicaNap = 0;
		while ( GranicaNap < 20 )
		{
			System.out.println(dronPravi.moveBack());
			GranicaNap++;
		}
		System.out.println("Warning!");
		System.out.println("Going UP");
		int gGranica = 0;
		while( gGranica < 40)
		{
			System.out.println(dronPravi.moveUp());
			gGranica++;
		}
		System.out.println("Warning!");
		System.out.println("Moving FORTH!");
		int fGranica = 0;
		while(fGranica < 20)
		{
			System.out.println(dronPravi.moveForth());
			fGranica++;
		}
		System.out.println("Warning!");
		System.out.println("Moving LEFT!");
		int lGranica = 0;
		while (lGranica < 30)
		{
			System.out.println(dronPravi.moveLeft());
			lGranica++;
		}
		System.out.println("Warning!");
		System.out.println("Moving DOWN!");
		int dGranica = 0;
		while ( dGranica < 20)
		{
			System.out.println(dronPravi.moveDown());
			dGranica++;
		}
		System.out.println("YOU ARRIVED!");
		
		
	}
}
