package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import drone.Drone;

public class DroneTestAdvanced {
	private int[] boundaries = {50,50,50};
	private int[] startCoordinates = {30,0,30};
	private int[] finishCoordinates = {0,30,30};
	Drone drone;
	
	private String []  direction = {"moveUp","moveRight",
									"moveUp","moveForth",
									"moveLeft","moveForth",
									"moveLeft","moveUp",
									"moveBack","moveLeft",
									"moveDown"};
	
	private int [] steps = {12,21,23,16,12,5,18,17,21,22,20};
	
	
	@Test
	public void testPath()
	{
		int n = steps.length;
		for(int i = 0;i<n;i++){
			if(direction[i]=="moveUp"){
				for(int j=0;j<steps[i];j++){
					drone.moveUp();
				}
			}
			if(direction[i]=="moveDown"){
				for(int j=0;j<steps[i];j++){
					drone.moveDown();
				}
			}
			if(direction[i]=="moveLeft"){
				for(int j=0;j<steps[i];j++){
					drone.moveLeft();
				}
			}
			if(direction[i]=="moveRight"){
				for(int j=0;j<steps[i];j++){
					drone.moveUp();
				}
			}
			if(direction[i]=="moveForth"){
				for(int j=0;j<steps[i];j++){
					drone.moveUp();
				}
			}
			if(direction[i]=="moveBack"){
				for(int j=0;j<steps[i];j++){
					drone.moveUp();
				}
			}
		}
	}
}
