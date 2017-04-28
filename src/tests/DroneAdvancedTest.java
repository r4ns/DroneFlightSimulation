package tests;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

import drone.Drone;

public class DroneAdvancedTest {
		private String[] niz = {"up,12","right,21","up,23","back,16","left,12","back,5",
								"left,18","up,17","forth,21","left,22","down,20",};
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
			
			assertEquals(expectedCoordinates, helper(niz, drone, startCoordinates));
		}
		
		public String helper(String[] niz, Drone drone, int[] startCoordinates){
			drone = new Drone();
			drone.setX(startCoordinates[0]);
			drone.setY(startCoordinates[1]);
			drone.setZ(startCoordinates[2]);
			for(int i=0; i<niz.length; i++){
				String [] pomoc = niz[i].split(",");
					if(pomoc[0].matches("up")){
						for(int j=0; j<Integer.parseInt(pomoc[1]); j++){
                        drone.moveUp();
						}
					}
					else if(pomoc[0].matches("down")){
						for(int j=0; j<Integer.parseInt(pomoc[1]); j++){
						drone.moveDown();
						}
					}
					else if(pomoc[0].matches("left")){
						for(int j=0; j<Integer.parseInt(pomoc[1]); j++){
					    drone.moveLeft();
						}
					}
					else if(pomoc[0].matches("right")){
						for(int j=0; j<Integer.parseInt(pomoc[1]); j++){
						drone.moveRight();
						}
					}
					else if (pomoc[0].matches("forth")){
						for(int j=0; j<Integer.parseInt(pomoc[1]); j++){
						drone.moveForth();
						}
				    }
					else if (pomoc[0].matches("back")){
						for(int j=0; j<Integer.parseInt(pomoc[1]); j++){
					    drone.moveBack();
						}
					}	
			}
			return drone.getFormatedCoordinates();
		}
		//KRAJj
}