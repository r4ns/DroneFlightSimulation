package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import drone.Drone;

public class DroneAdvancedTest {

	Drone drone;
	private String[] droneMovements = {"moveUp", 
										"moveRight",
										"moveUp",
										"moveForth", 
										"moveLeft",
										"moveForth",
										"moveLeft",
										"moveUp",
										"moveBack",
										"moveLeft", 
										"moveDown"};
	
	private int[] numberOfExecution = {12, 21, 23, 16, 12, 5, 18, 17, 21, 22, 20};
	
	private int[] finishCoordinates = {0, 30, 30};
	
	@Test
	public void testDronePath(){

		String expectedCoordinates = "Drone position: (" +Integer.toString(finishCoordinates[0])
		+ ", "+Integer.toString(finishCoordinates[1])+", "+Integer.toString(finishCoordinates[2])+ ")";
		
		assertEquals(expectedCoordinates,helperMethod(droneMovements,numberOfExecution));
		
	}
	
	public String helperMethod(String[] methods, int[] execution){
		
		drone = new Drone(30,0,30);
		int i=0;
		
		while(i<methods.length)
		{
			if(methods[i]=="moveUp"){
				for(int j=0;j<execution[i];j++)
					drone.moveUp();	
			}
			else if(methods[i]=="moveDown")
			{
				for(int j=0;j<execution[i];j++)
					drone.moveDown();	
			}
			else if(methods[i]=="moveLeft")
			{
				for(int j=0;j<execution[i];j++)
					drone.moveLeft();	
			}
			else if(methods[i]=="moveRight")
			{
				for(int j=0;j<execution[i];j++)
					drone.moveRight();	
			}
			else if(methods[i]=="moveBack")
			{
				for(int j=0;j<execution[i];j++)
					drone.moveBack();	
			}
			else if(methods[i]=="moveForth")
			{
				for(int j=0;j<execution[i];j++)
					drone.moveForth();	
			}
			
			i++;
			
		}
		return drone.getFormatedCoordinates();
		
		
	}
	
	
}
