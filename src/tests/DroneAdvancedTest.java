package tests;

import static org.junit.Assert.assertEquals;

import java.awt.List;

import org.junit.Test;

import drone.Drone;

public class DroneAdvancedTest {

	private int[] boundaries = {50,50,50};
	private int [] startCoordinates = {30,0,30};
	Drone drone;
	
	String[] movements = {drone.moveUp(),drone.moveDown(),drone.moveBack(),drone.moveForth(),drone.moveLeft(),drone.moveRight()};
	int [] multipleTimes = {12,21,23,16,12,5,18,17,21,22,20};
	
	@Test
	public void testDroneMovementFromStartToEndTestCase(){
		HelperMovingDroneUp(movements, multipleTimes);
		
		}
	
	
	String HelperMovingDroneUp(String[] movements,int[] multipleTimes){
		if(movements=="drone.MoveUp()"){
		for (int i = 0; i < multipleTimes[0]; i++) {
			
			assertEquals(expectedCoordinates, drone.moveUp());
		}
	
		return drone.getFormatedCoordinates();
	}
	
}
