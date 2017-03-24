package tests;
import static org.junit.Assert.*;

import org.junit.Test;

import drone.*;

public class DroneBasicTests {
	private int [] boundaries = {50,50,50};
	private int [] startCoordinates={30,0,30};
	Drone dron;
	
	@Test()//u zagradi mu definisemo vreme koje je neophodno da bi se test izvrsio
	public void testInititalMoveUp()
	{
		dron = new Drone();
		dron.setX(30);
		dron.setY(0);
		dron.setZ(30);
		
		String expectedCoordinates = "Drone position: ("+Integer.toString(startCoordinates[0])+","+Integer.toString(startCoordinates[1]+1)+","+Integer.toString(startCoordinates[2])+")";
		assertEquals(expectedCoordinates, dron.moveUp());
		
	}
	@Test
	public void testInitialMoveUpIteration(int [] startCoordinates){
		for(int i = 0; i < 12;i++){
			startCoordinates[1]+=i;
		}
		
	}
}
