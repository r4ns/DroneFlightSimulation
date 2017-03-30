package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import drone.Drone;

public class DroneAdvancedTest {
	private int[] coordinates = {0, 30, 30};
	Drone dron = new Drone();
	
	int [] niz = {12, 21, 23, 16, 12, 5, 18, 17, 21 , 22, 20};
	String [] nizStringova = {"gore", "desno", "gore", "napred", "levo", "napred", "levo", "gore", "nazad", "levo", "dole"};
	
	@Test
	public void TestDronPutanja(){
		
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(coordinates[0]) + ", "
				+ Integer.toString(coordinates[1]) + ", "
				+ Integer.toString(coordinates[2]) + ")";
		assertEquals(expectedCoordinates, pomocna(niz, nizStringova));
	}
	public String pomocna(int[] k, String[] string){
		for(int i=0; i<k.length;i++){
			if(string[i]=="gore"){
				for (int j = 0; j < k[i]; j++)
					dron.moveUp();
			} else if(string[i]== "dole"){
					for (int j = 0; j < k[i]; j++)
						dron.moveDown();
			} else if(string[i]== "desno"){
				for (int j = 0; j < k[i]; j++)
					dron.moveRight();
			} else if(string[i]== "levo"){
				for (int j = 0; j < k[i]; j++)
					dron.moveLeft();
			} else if(string[i]== "napred"){
				for (int j = 0; j < k[i]; j++)
					dron.moveForth();
			} else if(string[i]== "nazad"){
				for (int j = 0; j < k[i]; j++)
					dron.moveBack();
			}		
			
		}
		
		return dron.getFormatedCoordinates();
		
	}
}