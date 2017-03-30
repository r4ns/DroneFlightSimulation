package tests;
import org.junit.Test;
import static org.junit.Assert.*;
import drone.Drone;

public class DroneAdvancedTest {

	private int[] startCoordinates={30,0,30};
	private int[] endCoordinates={0,30,30};
	
	Drone drone;
	
	@Test
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
			String[] part = niz[i].split(":");
			String func =part[0];
			int number=Integer.parseInt(part[1]);
			
			for(int counter=0;counter<number;counter++)
			{
			if(func.equals("moveUp()"))
			{
				drone.moveUp();
			}
			if(func.equals("moveDown()"))
			{
				drone.moveDown();
			}
			if(func.equals("moveLeft()"))
			{
				drone.moveLeft();
			}
			if(func.equals("moveRight()"))
			{
				drone.moveRight();
			}
			if(func.equals("moveBack()"))
			{
				drone.moveBack();
			}
			if(func.equals("moveForth()"))
			{
				drone.moveForth();
			}
			
		}
	}
			return drone.getFormatedCoordinates(); 
	
	}
}