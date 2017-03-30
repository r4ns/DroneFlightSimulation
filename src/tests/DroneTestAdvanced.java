package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneTestAdvanced {
	
	Drone drone;
	private int[] startCo = {30,0,30};
	private int[] finishCo = {0,30,30};
	
	@Test
	public void testDronePath(){
		
		drone = new Drone();
		drone.setX(30);
		drone.setY(0);
		drone.setZ(30);
		
		int[] moves = {12,21,23,16,12,5,18,17,21,22,20};
		String[] types = {"moveUp", "moveRight","moveUp","moveForth","moveLeft","moveForth",
						  "moveLeft","moveUp","moveBack","moveLeft","moveDown"}; 
		
		
		String expectedCoordinates = "Drone position: (" + Integer.toString(finishCo[0]) + ","
				 									     + Integer.toString(finishCo[1]) + ","
				 									     + Integer.toString(finishCo[2]) + ")";

		assertEquals(expectedCoordinates, testDronePathHelpMethod(drone, moves, types)); 
		
	}
		

	
	
	public String testDronePathHelpMethod(Drone d, int[] moves, String[] types){
		for(int i =0; i<types.length; i++){
			switch(types[i]){
			
			case "moveUp":
				for(int j = 0; j<moves[i]; j++){
					d.moveUp();
				} break;
				
			case "moveDown":
				for(int j = 0; j<moves[i]; j++){
					d.moveDown();
				} break;
				
			case "moveLeft":
				for(int j = 0; j<moves[i]; j++){
					d.moveLeft();
				} break;
				
			case "moveRight":
				for(int j = 0; j<moves[i]; j++){
					d.moveRight();
				} break;
				
			case "moveForth":
				for(int j = 0; j<moves[i]; j++){
					d.moveForth();
				} break;
				
			case "moveBack":
				for(int j = 0; j<moves[i]; j++){
					d.moveBack();
				} break;
			}
			
		}
		return d.getFormatedCoordinates();
		
		
	}
	

}
