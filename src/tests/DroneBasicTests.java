package tests;
import static org.junit.Assert.*;

import org.junit.Test;

import drone.*;

public class DroneBasicTests {
	private int [] boundaries = {50,50,50};
	private int [] startCoordinates={30,0,30};
	private int [] brojIteracija;
	Drone dron;
	
	@Test()//u zagradi mu definisemo vreme koje je neophodno da bi se test izvrsio
	public void testInititalMoveUp()
	{
		dron = new Drone();
		dron.setX(30);
		dron.setY(0);
		dron.setZ(30);
		
		String expectedCoordinates = "Drone position: ("+Integer.toString(startCoordinates[0])+","+Integer.toString(startCoordinates[1]+brojIteracija[12])+","+Integer.toString(startCoordinates[2])+")";
		//assertEquals(testInitialMoveUpIteration(expectedCoordinates, dron.moveUp()));
		
	}
	//@Test
	/*public String testInitialMoveUpIteration(String ocekujemKoordinate,String vracamKoordinate, int [] brojPenjanja){
		for(int i=1;i<=brojPenjanja.length;i++){
			return Integer.parseInt(ocekujemKoordinate), dron.moveUp();
			
		}
	}
*/
	
}
