package tests;

import org.junit.Test;

import static org.junit.Assert.*;

import drone.Drone;

public class DroneAdvancedTest {

	private int[] startCoordinates={30,0,30};
	private int[] endCoordinates={0,30,30};
	
	Drone drone;
	
	@Test(timeout=1000)
	public void test()
	{	
		Drone drone=new Drone(startCoordinates[0],startCoordinates[1],startCoordinates[2]);
		String[] niz={"moveUp():12","moveRight():21","moveUp():23","moveForth():16","moveLeft():12","moveForth():5","moveLeft():18","moveUp():17","moveBack():21","moveLeft():22","moveDown():20"};
		String expectedCoordinates="Drone position: (" + Integer.toString(endCoordinates[0])+","+ Integer.toString(endCoordinates[1]) +","+ Integer.toString(endCoordinates[2])+")";
		assertEquals(expectedCoordinates, helperMove(niz,drone));	
	}
	
	public String helperMove(String[] niz,Drone drone)
	{
		
		for(int i=0;i<niz.length;i++){
			String[] dijelovi = niz[i].split(":");
			String funkcija=dijelovi[0];
			int ponavljanja=Integer.parseInt(dijelovi[1]);
			
			for(int j=0;j<ponavljanja;j++)
			{
			if(funkcija.equals("moveUp()"))
			{
				drone.moveUp();
			}
			if(funkcija.equals("moveDown()"))
			{
				drone.moveDown();
			}
			if(funkcija.equals("moveLeft()"))
			{
				drone.moveLeft();
			}
			if(funkcija.equals("moveRight()"))
			{
				drone.moveRight();
			}
			if(funkcija.equals("moveBack()"))
			{
				drone.moveBack();
			}
			if(funkcija.equals("moveForth()"))
			{
				drone.moveForth();
			}
			
		}
	}
			return drone.getFormatedCoordinates(); 
	
	}
}

