package tests;

import drone.Drone;
import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class DroneTestAdvanced {
	private int[]startCoordinates={30,0,30};
	private int[]finishCoordinates={0,30,30};
	
	@Test
	public void testDronePath(){
		Drone drone=new Drone(startCoordinates);
		String expectedCoordinates="Drone position: ("+ Integer.toString(finishCoordinates[0])+", "
				+ Integer.toString(finishCoordinates[1])+", "
				+ Integer.toString(finishCoordinates[2])+" )";
		Object[] path={
				"moveUp", 12, 
				"moveRight", 21,
				"moveUp", 23,
				"moveForth", 16,
				"moveLeft", 12,
				"moveForth", 5,
				"moveLeft", 18,
				"moveUp", 17,
				"moveBack", 21,
				"moveLeft", 22,
				"moveDown", 20
		};
		assertEquals(expectedCoordinates,moveDronHelper(path,drone));
					
	}
	
	public String moveDronHelper(Object[]path,Drone drone){
		int i=0;
		while(i<path.length)
		{
			switch((String)path[i]){
			case "MoveUp":
				for(int j=0;j<(int)path[i+1];j++){
 					drone.moveUp();
 				}
 				break;
 			case "moveDown":
 				for(int j=0;j<(int)path[i+1];j++){
 					drone.moveDown();
 				}
 				break;
 			case "moveRight":
 				for(int j=0;j<(int)path[i+1];j++){
 					drone.moveRight();
 				}
 				break;
 			case "moveLeft":
 				for(int j=0;j<(int)path[i+1];j++){
 					drone.moveLeft();
 				}
 				break;
 			case "moveForth":
 				for(int j=0;j<(int)path[i+1];j++){
 					drone.moveForth();
 				}
 				break;
			case "moveBack":
					for(int j=0;j<(int)path[i+1];j++){
 					drone.moveBack();
 				}
				break;
 			}
 		}
		
		return drone.getFormatedCoordinates();
	}

}
