package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneTestAdvanced {
		
	private int[] pocetneKordinate = {30,0,30};
	private int[] krajnjeKordinate={0,30,30};
	Drone drone;
	
	@Test
	public void testDronePath(){
		drone=new Drone(pocetneKordinate[0],pocetneKordinate[1],pocetneKordinate[2]);

		String expectedCoordinates = "("+Integer.toString(krajnjeKordinate[0])+","+
				 Integer.toString(krajnjeKordinate[1])+","+
				 Integer.toString(krajnjeKordinate[2])+")";
		
		Object[] putanja=
			  {	"moveUp",12,
				"moveRight",21,
				"moveUp",23,
				"moveForth",16,
				"moveLeft",12,
				"moveForth",5,
				"moveLeft",18,
				"moveUp",17,
				"moveBack",21,
				"moveLeft",22,
				"moveDown",20
				};
		
		assertEquals(expectedCoordinates, testDronePathHelper(drone,putanja));
		
	}
	
	public String testDronePathHelper(Drone drone1,Object[] putanja){
		
		int n = putanja.length;
		for(int i=0;i<n;i+=2){
			switch((String)putanja[i]){
			case "moveUp":
				for(int j=0;j<(int)putanja[i+1];j++){
					drone1.moveUp();
				}
				break;
			case "moveDown":
				for(int j=0;j<(int)putanja[i+1];j++){
					drone1.moveDown();
				}
				break;
			case "moveRight":
				for(int j=0;j<(int)putanja[i+1];j++){
					drone1.moveRight();
				}
				break;
			case "moveLeft":
				for(int j=0;j<(int)putanja[i+1];j++){
					drone1.moveLeft();
				}
				break;
			case "moveForth":
				for(int j=0;j<(int)putanja[i+1];j++){
					drone1.moveForth();
				}
				break;
			case "moveBack":
				for(int j=0;j<(int)putanja[i+1];j++){
					drone1.moveBack();
				}
				break;
			}
		}
		return drone1.getFormatedCoordinates();
	}
}



