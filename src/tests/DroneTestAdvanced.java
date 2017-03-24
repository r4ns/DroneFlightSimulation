package tests;

import org.junit.Test;

import drone.Drone;

public class DroneTestAdvanced {
	
	Drone drone;
	int up;
	String upString;
	int down;
	String downString;
	int left;
	String leftString;
	int right;
	String rightString;
	int back;
	String backString;
	int forth;
	String forthString;
	
	@Test
	public void testDronePath(){
		
		drone = new Drone();
		drone.setX(30);
		drone.setY(0);
		drone.setZ(30);
	}
		

	
	@Test
	public void testDronePathHelpMethod(){
		for(int i = 0; i<12; i++){
			drone.moveUp(); up++;
			upString = drone.getFormatedCoordinates();
			
		}
		for(int i = 0; i<21; i++){
			drone.moveRight(); right++;
			rightString = drone.getFormatedCoordinates();
			
		}
		
		for(int i = 0; i<23; i++){
			drone.moveUp(); up++;
			upString = drone.getFormatedCoordinates();
			
		}
		
		
		
	}
	

}
