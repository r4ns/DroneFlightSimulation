/*package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.*;

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
		
		String expectedCoordinates = "Drone position: ("+ Integer.toString(finishCoordinates[0])+","+
		Integer.toString(finishCoordinates[1])+","+ Integer.toString(finishCoordinates[2])+")";
		
		Object[] kretnje=
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
		
		assertEquals(expectedCoordinates, testDronePathHelper(drone,kretnje));
		
	}
	
	public String testDronePathHelper(Drone d1,Object[] k){
		for(int i=0;i<k.length;i+=2){
			switch((String)k[i]){
			case "moveUp":
				for(int j=0;j<(int)k[i+1];j++){
					d1.moveUp();
				}
				break;
			case "moveDown":
				for(int j=0;j<(int)k[i+1];j++){
					d1.moveDown();
				}
				break;
			case "moveRight":
				for(int j=0;j<(int)k[i+1];j++){
					d1.moveRight();
				}
				break;
			case "moveLeft":
				for(int j=0;j<(int)k[i+1];j++){
					d1.moveLeft();
				}
				break;
			case "moveForth":
				for(int j=0;j<(int)k[i+1];j++){
					d1.moveForth();
				}
				break;
			case "moveBack":
				for(int j=0;j<(int)k[i+1];j++){
					d1.moveBack();
				}
				break;
			}
		}
		return d1.getFormatedCoordinates();
	}
}*/