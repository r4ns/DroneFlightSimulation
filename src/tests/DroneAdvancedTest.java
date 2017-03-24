package tests;

import org.junit.Test;

import drone.Drone;

public class DroneAdvancedTest {
	private int[] startCoordinates = {30,0,30};
	private int[] endCoordinates = {0,30,30};
	private int[] brojPonavljanja= {12,21,23,16,12,5,18,17,21,22,20};
	private String[] nazivMetode={"moveUp","moveRight","moveUp","moveForth","moveLeft","moveForth",
			"moveLeft","moveUp","moveBack","moveLeft","moveDown"};
	
	Drone drone;
	
	@Test
	public void testClassRun(){
		drone= new Drone(startCoordinates[0],startCoordinates[1],startCoordinates[2]);
		
		String expectedCoordinates="Trenutna pozicija drona: ("
		+Integer.toString(endCoordinates[0])+","
		+Integer.toString(endCoordinates[1])+","
		+Integer.toString(endCoordinates[2])+")";
		
		
	}
	public String helpMethod(Drone helpDrone,int[] nizPonavljanja, String[] nazivMetoda){
		for(int i=0;i<nizPonavljanja.length;i++){
			
		}
		
		
		return "Trenutna pozicija drona: ("+helpDrone.getX()+","+helpDrone.getY()+","+helpDrone.getZ()+")";
	}
}
