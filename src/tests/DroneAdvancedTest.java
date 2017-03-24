package tests;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

import drone.Drone;

public class DroneAdvancedTest {
		private String[] niz = {"up,12","right,21","up,23","forth,16","left,12","forth,5",
								"left,18","up,17","up,12","back,21","left,22","down,20",};
		private int[] startCoordinates = {30,0,30};
		private int[] endCoordinates = {0,30,30};
		Drone drone;
		
		@Test 
		public void testInitial(){
			drone = new Drone();
			drone.setX(startCoordinates[0]);
			drone.setY(startCoordinates[1]);
			drone.setZ(startCoordinates[2]);
			
			String expectedCoordinates = "Drone position: ("
					+ Integer.toString(endCoordinates[0]) + ","
					+ Integer.toString(endCoordinates[1]) + ","
					+ Integer.toString(endCoordinates[2]) + ")";
			
			assertEquals(expectedCoordinates, helper(startCoordinates));
		}
		
		public String helper(int[] startCoordinates){
			for(int i=0; i<niz.length; i++){
				String [] pomoc = niz[i].split(",");
				for(i=0; i<Integer.parseInt(pomoc[1]); i++){
					if(pomoc[0]=="up"){
						drone.moveUp();		
					}
					else if(pomoc[0]=="down"){
						drone.moveDown();
					}
					else if(pomoc[0]=="left"){
						drone.moveLeft();
					}
					else if(pomoc[0]=="right"){
						drone.moveRight();
					}
					else drone.moveForth();
				}
			}
			return drone.getFormatedCoordinates();
		}
}
