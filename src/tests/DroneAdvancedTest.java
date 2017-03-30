package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneAdvancedTest {
		
	private int[] startCoordinates = {30,0,30};
	private int[] finishCoordinates={0,30,30};
	Drone drone;
	
	@Test
	public void testDronePath(){
		drone=new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1]);
		drone.setZ(startCoordinates[2]);
		
		String expectedCoordinates = "Drone position(x:"+ Integer.toString(finishCoordinates[0])+" y:"+
		Integer.toString(finishCoordinates[1])+" z:"+ Integer.toString(finishCoordinates[2])+")";
		
		Object[] path=
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
		
		assertEquals(expectedCoordinates, testDronePathHelper(drone,path));
		
	}
	
	public String testDronePathHelper(Drone drone1,Object[] k){
		for(int i=0;i<k.length;i+=2){
			switch((String)k[i]){
			case "moveUp":
				for(int j=0;j<(int)k[i+1];j++){
					drone1.moveUp();
				}
				break;
			case "moveDown":
				for(int j=0;j<(int)k[i+1];j++){
					drone1.moveDown();
				}
				break;
			case "moveRight":
				for(int j=0;j<(int)k[i+1];j++){
					drone1.moveRight();
				}
				break;
			case "moveLeft":
				for(int j=0;j<(int)k[i+1];j++){
					drone1.moveLeft();
				}
				break;
			case "moveForth":
				for(int j=0;j<(int)k[i+1];j++){
					drone1.moveForth();
				}
				break;
			case "moveBack":
				for(int j=0;j<(int)k[i+1];j++){
					drone1.moveBack();
				}
				break;
			}
		}
		return drone1.getFormatedCoordinates();
	}
}
