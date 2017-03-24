package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import drone.Drone;

public class DroneAdvancedTest {
	private int[] coordinates = {0, 30, 30};
	Drone dron = new Drone();
	int [] niz = {12, 21, 23, 16, 12, 5, 18, 17, 21 , 22, 20};
	String [] nizStringova = {"gore", "desno", "gore", "napred", "levo", "napred", "levo", "gore", "nazad", "levo", "dole", "nazad"};
	
	@Test
	public void TestDronPutanja(){
		
		
		
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(coordinates[0]) + ", "
				+ Integer.toString(coordinates[1]) + ", "
				+ Integer.toString(coordinates[2]) + ")";
		
		assertEquals(coordinates, pomocna(niz, nizStringova));
	}
	public String pomocna(int[] k, String[] string){
		int f=0;
		for(int i=0; i<k.length;i++, f++){
			if(string[f]=="gore")
				dron.moveUp();
			else if(string[f]== "dole")
				dron.moveDown();
			else if(string[f]=="levo")
				dron.moveLeft();
			else if(string[f]=="desno")
				dron.moveRight();
			else if(string[f]=="napred")
				dron.moveForth();
			else if(string[f]=="nazad")
				dron.moveBack();
			
		}
		return dron.getFormatedCoordinates();
		
	}
}