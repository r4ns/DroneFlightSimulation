package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import drone.Drone;
import space.DoubleCubeDrone;

public class DoubleCubeBasicTest {
	
	int[] boundaries={50,50,50};
	DoubleCubeDrone dblDrone;
	
	@Test
	public void testInitialMoveUp()
	{
		dblDrone = new DoubleCubeDrone(9,7,35,boundaries);

		
		String expectedCoordinates =  "Tacka dole desno: ("+Integer.toString(dblDrone.gettDoleDesno().getX())+","+Integer.toString(dblDrone.gettDoleDesno().getY()+1) +","+Integer.toString(dblDrone.gettDoleDesno().getZ()) +") Tacka dole levo: ("+Integer.toString(dblDrone.gettDoleLevo().getX() )+","+Integer.toString(dblDrone.gettDoleLevo().getY()+1) +","+Integer.toString(dblDrone.gettDoleLevo().getZ()) +") Tacka srednje desno: ("+Integer.toString(dblDrone.gettSrednjeDesno().getX() )+","+Integer.toString(dblDrone.gettSrednjeDesno().getY()+1) +","+Integer.toString(dblDrone.gettSrednjeDesno().getZ()) +") Tacka gore desno: ("+Integer.toString(dblDrone.gettGoreDesno().getX() )+","+Integer.toString(dblDrone.gettGoreDesno().getY()+1) +","+Integer.toString(dblDrone.gettGoreDesno().getZ())+")";
				
		assertEquals( expectedCoordinates, dblDrone.moveUp());
		
		
	}
	
	@Test
	public void testInitialMoveDown()
	{
		dblDrone = new DoubleCubeDrone(9,7,35,boundaries);
		
		String expectedCoordinates =  "Tacka dole desno: ("+Integer.toString(dblDrone.gettDoleDesno().getX())+","+Integer.toString(dblDrone.gettDoleDesno().getY()-1) +","+Integer.toString(dblDrone.gettDoleDesno().getZ()) +") Tacka dole levo: ("+Integer.toString(dblDrone.gettDoleLevo().getX() )+","+Integer.toString(dblDrone.gettDoleLevo().getY()-1) +","+Integer.toString(dblDrone.gettDoleLevo().getZ()) +") Tacka srednje desno: ("+Integer.toString(dblDrone.gettSrednjeDesno().getX() )+","+Integer.toString(dblDrone.gettSrednjeDesno().getY()-1) +","+Integer.toString(dblDrone.gettSrednjeDesno().getZ()) +") Tacka gore desno: ("+Integer.toString(dblDrone.gettGoreDesno().getX() )+","+Integer.toString(dblDrone.gettGoreDesno().getY()-1) +","+Integer.toString(dblDrone.gettGoreDesno().getZ())+")";
				
		assertEquals( expectedCoordinates, dblDrone.moveDown());
		
		
	}

	@Test
	public void testInitialMoveLeft()
	{
		dblDrone = new DoubleCubeDrone(9,7,35,boundaries);
		
		String expectedCoordinates =  "Tacka dole desno: ("+Integer.toString(dblDrone.gettDoleDesno().getX()-1)+","+Integer.toString(dblDrone.gettDoleDesno().getY()) +","+Integer.toString(dblDrone.gettDoleDesno().getZ()) +") Tacka dole levo: ("+Integer.toString(dblDrone.gettDoleLevo().getX()-1 )+","+Integer.toString(dblDrone.gettDoleLevo().getY()) +","+Integer.toString(dblDrone.gettDoleLevo().getZ()) +") Tacka srednje desno: ("+Integer.toString(dblDrone.gettSrednjeDesno().getX() -1)+","+Integer.toString(dblDrone.gettSrednjeDesno().getY()) +","+Integer.toString(dblDrone.gettSrednjeDesno().getZ()) +") Tacka gore desno: ("+Integer.toString(dblDrone.gettGoreDesno().getX()-1 )+","+Integer.toString(dblDrone.gettGoreDesno().getY()) +","+Integer.toString(dblDrone.gettGoreDesno().getZ())+")";
				
		assertEquals( expectedCoordinates, dblDrone.moveLeft());
		
		
	}
	
	@Test
	public void testInitialMoveRight()
	{
		dblDrone = new DoubleCubeDrone(9,7,35,boundaries);
		
		String expectedCoordinates =  "Tacka dole desno: ("+Integer.toString(dblDrone.gettDoleDesno().getX()+1)+","+Integer.toString(dblDrone.gettDoleDesno().getY()) +","+Integer.toString(dblDrone.gettDoleDesno().getZ()) +") Tacka dole levo: ("+Integer.toString(dblDrone.gettDoleLevo().getX()+1 )+","+Integer.toString(dblDrone.gettDoleLevo().getY()) +","+Integer.toString(dblDrone.gettDoleLevo().getZ()) +") Tacka srednje desno: ("+Integer.toString(dblDrone.gettSrednjeDesno().getX() +1)+","+Integer.toString(dblDrone.gettSrednjeDesno().getY()) +","+Integer.toString(dblDrone.gettSrednjeDesno().getZ()) +") Tacka gore desno: ("+Integer.toString(dblDrone.gettGoreDesno().getX()+1 )+","+Integer.toString(dblDrone.gettGoreDesno().getY()) +","+Integer.toString(dblDrone.gettGoreDesno().getZ())+")";
				
		assertEquals( expectedCoordinates, dblDrone.moveRight());
		
		
	}
	
	@Test
	public void testInitialMoveBack()
	{
		dblDrone = new DoubleCubeDrone(9,7,35,boundaries);
		
		String expectedCoordinates =  "Tacka dole desno: ("+Integer.toString(dblDrone.gettDoleDesno().getX())+","+Integer.toString(dblDrone.gettDoleDesno().getY()) +","+Integer.toString(dblDrone.gettDoleDesno().getZ()+1) +") Tacka dole levo: ("+Integer.toString(dblDrone.gettDoleLevo().getX() )+","+Integer.toString(dblDrone.gettDoleLevo().getY()) +","+Integer.toString(dblDrone.gettDoleLevo().getZ()+1) +") Tacka srednje desno: ("+Integer.toString(dblDrone.gettSrednjeDesno().getX() )+","+Integer.toString(dblDrone.gettSrednjeDesno().getY()) +","+Integer.toString(dblDrone.gettSrednjeDesno().getZ()+1) +") Tacka gore desno: ("+Integer.toString(dblDrone.gettGoreDesno().getX() )+","+Integer.toString(dblDrone.gettGoreDesno().getY()) +","+Integer.toString(dblDrone.gettGoreDesno().getZ()+1)+")";
				
		assertEquals( expectedCoordinates, dblDrone.moveBack());
		
		
	}
	
	@Test
	public void testInitialMoveForth()
	{
		dblDrone = new DoubleCubeDrone(9,7,35,boundaries);
		
		String expectedCoordinates =  "Tacka dole desno: ("+Integer.toString(dblDrone.gettDoleDesno().getX())+","+Integer.toString(dblDrone.gettDoleDesno().getY()) +","+Integer.toString(dblDrone.gettDoleDesno().getZ()-1) +") Tacka dole levo: ("+Integer.toString(dblDrone.gettDoleLevo().getX() )+","+Integer.toString(dblDrone.gettDoleLevo().getY()) +","+Integer.toString(dblDrone.gettDoleLevo().getZ()-1) +") Tacka srednje desno: ("+Integer.toString(dblDrone.gettSrednjeDesno().getX() )+","+Integer.toString(dblDrone.gettSrednjeDesno().getY()) +","+Integer.toString(dblDrone.gettSrednjeDesno().getZ()-1) +") Tacka gore desno: ("+Integer.toString(dblDrone.gettGoreDesno().getX() )+","+Integer.toString(dblDrone.gettGoreDesno().getY()) +","+Integer.toString(dblDrone.gettGoreDesno().getZ()-1)+")";
				
		assertEquals( expectedCoordinates, dblDrone.moveForth());
		
		
	}
	@Test
	public void testInitialMoveUpTwo()
	{
		dblDrone = new DoubleCubeDrone(39,8,39,boundaries);

		
		String expectedCoordinates =  "Tacka dole desno: ("+Integer.toString(dblDrone.gettDoleDesno().getX())+","+Integer.toString(dblDrone.gettDoleDesno().getY()+1) +","+Integer.toString(dblDrone.gettDoleDesno().getZ()) +") Tacka dole levo: ("+Integer.toString(dblDrone.gettDoleLevo().getX() )+","+Integer.toString(dblDrone.gettDoleLevo().getY()+1) +","+Integer.toString(dblDrone.gettDoleLevo().getZ()) +") Tacka srednje desno: ("+Integer.toString(dblDrone.gettSrednjeDesno().getX() )+","+Integer.toString(dblDrone.gettSrednjeDesno().getY()+1) +","+Integer.toString(dblDrone.gettSrednjeDesno().getZ()) +") Tacka gore desno: ("+Integer.toString(dblDrone.gettGoreDesno().getX() )+","+Integer.toString(dblDrone.gettGoreDesno().getY()+1) +","+Integer.toString(dblDrone.gettGoreDesno().getZ())+")";
				
		assertEquals( expectedCoordinates, dblDrone.moveUp());
		
		
	}
	
	@Test
	public void testInitialMoveDownTwo()
	{
		dblDrone = new DoubleCubeDrone(39,8,39,boundaries);
		
		String expectedCoordinates =  "Tacka dole desno: ("+Integer.toString(dblDrone.gettDoleDesno().getX())+","+Integer.toString(dblDrone.gettDoleDesno().getY()-1) +","+Integer.toString(dblDrone.gettDoleDesno().getZ()) +") Tacka dole levo: ("+Integer.toString(dblDrone.gettDoleLevo().getX() )+","+Integer.toString(dblDrone.gettDoleLevo().getY()-1) +","+Integer.toString(dblDrone.gettDoleLevo().getZ()) +") Tacka srednje desno: ("+Integer.toString(dblDrone.gettSrednjeDesno().getX() )+","+Integer.toString(dblDrone.gettSrednjeDesno().getY()-1) +","+Integer.toString(dblDrone.gettSrednjeDesno().getZ()) +") Tacka gore desno: ("+Integer.toString(dblDrone.gettGoreDesno().getX() )+","+Integer.toString(dblDrone.gettGoreDesno().getY()-1) +","+Integer.toString(dblDrone.gettGoreDesno().getZ())+")";
				
		assertEquals( expectedCoordinates, dblDrone.moveDown());
		
		
	}

	@Test
	public void testInitialMoveLeftTwo()
	{
		dblDrone = new DoubleCubeDrone(39,8,39,boundaries);
		
		String expectedCoordinates =  "Tacka dole desno: ("+Integer.toString(dblDrone.gettDoleDesno().getX()-1)+","+Integer.toString(dblDrone.gettDoleDesno().getY()) +","+Integer.toString(dblDrone.gettDoleDesno().getZ()) +") Tacka dole levo: ("+Integer.toString(dblDrone.gettDoleLevo().getX()-1 )+","+Integer.toString(dblDrone.gettDoleLevo().getY()) +","+Integer.toString(dblDrone.gettDoleLevo().getZ()) +") Tacka srednje desno: ("+Integer.toString(dblDrone.gettSrednjeDesno().getX() -1)+","+Integer.toString(dblDrone.gettSrednjeDesno().getY()) +","+Integer.toString(dblDrone.gettSrednjeDesno().getZ()) +") Tacka gore desno: ("+Integer.toString(dblDrone.gettGoreDesno().getX()-1 )+","+Integer.toString(dblDrone.gettGoreDesno().getY()) +","+Integer.toString(dblDrone.gettGoreDesno().getZ())+")";
				
		assertEquals( expectedCoordinates, dblDrone.moveLeft());
		
		
	}
	
	@Test
	public void testInitialMoveRightTwo()
	{
		dblDrone = new DoubleCubeDrone(39,8,39,boundaries);
		
		String expectedCoordinates =  "Tacka dole desno: ("+Integer.toString(dblDrone.gettDoleDesno().getX()+1)+","+Integer.toString(dblDrone.gettDoleDesno().getY()) +","+Integer.toString(dblDrone.gettDoleDesno().getZ()) +") Tacka dole levo: ("+Integer.toString(dblDrone.gettDoleLevo().getX() +1)+","+Integer.toString(dblDrone.gettDoleLevo().getY()) +","+Integer.toString(dblDrone.gettDoleLevo().getZ()) +") Tacka srednje desno: ("+Integer.toString(dblDrone.gettSrednjeDesno().getX()+1)+","+Integer.toString(dblDrone.gettSrednjeDesno().getY()) +","+Integer.toString(dblDrone.gettSrednjeDesno().getZ()) +") Tacka gore desno: ("+Integer.toString(dblDrone.gettGoreDesno().getX()+1)+","+Integer.toString(dblDrone.gettGoreDesno().getY()) +","+Integer.toString(dblDrone.gettGoreDesno().getZ())+")";
				
		assertEquals( expectedCoordinates, dblDrone.moveRight());
		
		
	}
	
	@Test
	public void testInitialMoveBackTwo()
	{
		dblDrone = new DoubleCubeDrone(39,8,39,boundaries);
		
		String expectedCoordinates =  "Tacka dole desno: ("+Integer.toString(dblDrone.gettDoleDesno().getX())+","+Integer.toString(dblDrone.gettDoleDesno().getY()) +","+Integer.toString(dblDrone.gettDoleDesno().getZ()+1) +") Tacka dole levo: ("+Integer.toString(dblDrone.gettDoleLevo().getX() )+","+Integer.toString(dblDrone.gettDoleLevo().getY()) +","+Integer.toString(dblDrone.gettDoleLevo().getZ()+1) +") Tacka srednje desno: ("+Integer.toString(dblDrone.gettSrednjeDesno().getX() )+","+Integer.toString(dblDrone.gettSrednjeDesno().getY()) +","+Integer.toString(dblDrone.gettSrednjeDesno().getZ()+1) +") Tacka gore desno: ("+Integer.toString(dblDrone.gettGoreDesno().getX() )+","+Integer.toString(dblDrone.gettGoreDesno().getY()) +","+Integer.toString(dblDrone.gettGoreDesno().getZ()+1)+")";
				
		assertEquals( expectedCoordinates, dblDrone.moveBack());
			
		
	}
	
	@Test
	public void testInitialMoveForthTwo()
	{
		dblDrone = new DoubleCubeDrone(39,8,39,boundaries);
		
		String expectedCoordinates =  "Tacka dole desno: ("+Integer.toString(dblDrone.gettDoleDesno().getX())+","+Integer.toString(dblDrone.gettDoleDesno().getY()) +","+Integer.toString(dblDrone.gettDoleDesno().getZ()-1) +") Tacka dole levo: ("+Integer.toString(dblDrone.gettDoleLevo().getX() )+","+Integer.toString(dblDrone.gettDoleLevo().getY()) +","+Integer.toString(dblDrone.gettDoleLevo().getZ()-1) +") Tacka srednje desno: ("+Integer.toString(dblDrone.gettSrednjeDesno().getX() )+","+Integer.toString(dblDrone.gettSrednjeDesno().getY()) +","+Integer.toString(dblDrone.gettSrednjeDesno().getZ()-1) +") Tacka gore desno: ("+Integer.toString(dblDrone.gettGoreDesno().getX() )+","+Integer.toString(dblDrone.gettGoreDesno().getY()) +","+Integer.toString(dblDrone.gettGoreDesno().getZ()-1)+")";
				
		assertEquals( expectedCoordinates, dblDrone.moveForth());
		
		
	}
	



}