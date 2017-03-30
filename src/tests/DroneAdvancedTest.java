package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneAdvancedTest {

	Drone drone = new Drone(30,0,30);
	
	@Test
	public void advancedTest()
	{		
		Object[] niz = new Object[] {
				
			"moveUp()", 12,
			"moveRight()", 21,
			"moveUp()", 23,
			"moveForth()", 16,
			"moveLeft()", 12,
			"moveForth()", 5,
			"moveLeft()", 18,
			"moveUp()", 17,
			"moveBack()", 21,
			"moveLeft()", 22,
			"moveDown()", 20
			
		};
		
		String expected = "Drone position: (0,30,30)";
		String actual = helperAdvancedTest(niz);
		
		assertEquals(expected, actual);
	}
	
	
	
	public String helperAdvancedTest(Object[] array)
	{
		//za neparne
		int counter = 1;
		
		//prolazimo kroz sve parne elemente i proveravamo kojoj metodi odgovara string (koju metodu da pozovemo)
		for (int i = 0; i < array.length; i+=2)
		{
			if (array[i].equals("moveUp()"))
			{
				//kada pronadjemo koja metoda se poziva, pozivamo je onoliko puta koliko je zadato posle nje u nizu (neparan broj - nas counter)
				for (int j = 0; j < (int)array[counter]; j++)
				{
					drone.moveUp();
				}
			}
			else if (array[i].equals("moveDown()"))
			{
				for (int j = 0; j < (int)array[counter]; j++)
				{
					drone.moveDown();
				}
			}
			else if (array[i].equals("moveRight()"))
			{
				for (int j = 0; j < (int)array[counter]; j++)
				{
					drone.moveRight();
				}
			}
			else if (array[i].equals("moveLeft()"))
			{
				for (int j = 0; j < (int)array[counter]; j++)
				{
					drone.moveLeft();
				}
			}
			else if (array[i].equals("moveForth()"))
			{
				for (int j = 0; j < (int)array[counter]; j++)
				{
					drone.moveForth();
				}
			}
			else if (array[i].equals("moveBack()"))
			{
				for (int j = 0; j < (int)array[counter]; j++)
				{
					drone.moveBack();
				}
			}
			
			//increaseujemo counter za dva jer trazimo samo neparne brojeve
			counter += 2;
		}
		
		return "Drone position: (" + drone.getX() + "," + drone.getY() + "," + drone.getZ() + ")";
	}
}
