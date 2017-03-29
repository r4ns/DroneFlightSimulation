package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneAdvancedTest {
	Drone dron;
	private int[] finishCoordinates = {0, 30, 30};
	private String[] kretanjeDrona = {"moveUp", "moveRight","moveUp","moveForth", "moveLeft","moveForth","moveLeft","moveUp","moveBack","moveLeft", "moveDown"};
	private int[] brojIzvrsavanja = {12, 21, 23, 16, 12, 5, 18, 17, 21, 22, 20};

	@Test
	public void testDroneTrialPath(){
		String expectedCoordinates ="Pozicija drona: (" + Integer.toString(finishCoordinates[0]) + "," 
														+ Integer.toString(finishCoordinates[1]) + "," 
														+ Integer.toString(finishCoordinates[2]) + ")";

		assertEquals(expectedCoordinates,helperDroneTrialPath(kretanjeDrona,brojIzvrsavanja));
	}

	public String helperDroneTrialPath(String[] kretanjeDrona, int[] brojIzvrsavanja){
		dron = new Drone(30,0,30);
		for(int i=0;i<kretanjeDrona.length;i++)
		{
			for(int j=0;j<brojIzvrsavanja[i];j++)
			{
				if(kretanjeDrona[i]=="moveUp"){

					dron.moveUp();	
				}
				else if(kretanjeDrona[i]=="moveDown")
				{
					dron.moveDown();	
				}
				else if(kretanjeDrona[i]=="moveLeft")
				{
					dron.moveLeft();	
				}
				else if(kretanjeDrona[i]=="moveRight")
				{
					dron.moveRight();	
				}
				else if(kretanjeDrona[i]=="moveBack")
				{
					dron.moveBack();	
				}
				else if(kretanjeDrona[i]=="moveForth")
				{
					dron.moveForth();	
				}
			}
		}
		return dron.getFormatedCoordinates();
	}
}