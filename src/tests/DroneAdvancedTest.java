package tests;

import org.junit.Test;

import static org.junit.Assert.*;

import drone.Drone;

public class DroneAdvancedTest {

	private int[] startCoordinates={30,0,30};
	private String[] niz={"moveUp():12","moveRight():21","moveUp():23","moveForth():16","moveLeft():12","moveForth():5","moveLeft():18","moveUp():17","moveBack():21","moveLeft():22","moveDown():20"};
	Drone drone;
	
	@Test(timeout=1000)
	public void test()
	{	
		for(int i=0;i<niz.length;i++)
		{
			helper(niz[i]);
		}		
	}
	
	public void helper(String naredba)
	{
		String expectedCoordinates="Drone position: (" + Integer.toString(startCoordinates[0])+","+ Integer.toString(startCoordinates[1]+1) +","+ Integer.toString(startCoordinates[2])+")";
		drone=new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		String[] dijelovi = naredba.split(":");
		String funkcija=dijelovi[0];
		int ponavljanja=Integer.parseInt(dijelovi[1]);
		
		String novi="drone."+funkcija;
		for(int i=0;i<ponavljanja;i++)
		{
			if(funkcija==drone.moveUp())
			{
				expectedCoordinates="Drone position: (" + Integer.toString(drone.getX())+","+ Integer.toString(drone.getY()+1) +","+ Integer.toString(drone.getZ())+")";
				assertEquals(expectedCoordinates, drone.moveUp());
			}
			
			if(funkcija==drone.moveDown())
			{
				expectedCoordinates="Drone position: (" + Integer.toString(drone.getX())+","+ Integer.toString(drone.getY()-1) +","+ Integer.toString(drone.getZ())+")";
				assertEquals(expectedCoordinates, drone.moveDown());
			}
			
			if(funkcija==drone.moveLeft())
			{
				expectedCoordinates="Drone position: (" + Integer.toString(drone.getX()-1)+","+ Integer.toString(drone.getY()) +","+ Integer.toString(drone.getZ())+")";
				assertEquals(expectedCoordinates, drone.moveLeft());
			}
			
			if(funkcija==drone.moveRight())
			{
				expectedCoordinates="Drone position: (" + Integer.toString(drone.getX()+1)+","+ Integer.toString(drone.getY()) +","+ Integer.toString(drone.getZ())+")";
				assertEquals(expectedCoordinates, drone.moveRight());
			}
			
			if(funkcija==drone.moveForth())
			{
				expectedCoordinates="Drone position: (" + Integer.toString(drone.getX())+","+ Integer.toString(drone.getY()) +","+ Integer.toString(drone.getZ()-1)+")";
				assertEquals(expectedCoordinates, drone.moveForth());
			}
			
			if(funkcija==drone.moveBack())
			{
				expectedCoordinates="Drone position: (" + Integer.toString(drone.getX())+","+ Integer.toString(drone.getY()) +","+ Integer.toString(drone.getZ()+1)+")";
				assertEquals(expectedCoordinates, drone.moveBack());
			}
		}
		
		
	
	}
}
