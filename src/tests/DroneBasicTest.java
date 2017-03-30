package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import drone.Drone;

public class DroneBasicTest {
	
	Drone drone;
	private int[] boundaries={50,50,50};
	private int[] startCoordinates={30,0,30};
	//uvek fiksiramo vrednosti koje su konstante i provlacimo ih kroz sve testove
	
	
	@Test
	public void testInitialMoveUp(){
		
		drone=new Drone(startCoordinates);
		String expectedCoordinates="Drone position: ("
		         +Integer.toString(startCoordinates[0])+", "
				 +Integer.toString(startCoordinates[1]+1)+", "
				 +Integer.toString(startCoordinates[2])+")";
		
		assertEquals(expectedCoordinates,drone.moveUp());
			
	}
	
	/*@Test
	public void testMoveUpHitBottominnerSquareBorder(){
		
		startCoordinates[1]=10;
		drone=new Drone(startCoordinates);
		String expectedCoordinates="Drone position: ("
				+Integer.toString(startCoordinates[0])+", "
				+Integer.toString(10)+","
				+Integer.toString(startCoordinates[2])+") ";
		
	   assertEquals(expectedCoordinates, drone.moveUp());
	}*/
	
	@Test
	public void testInitialMoveDown(){
		
		drone=new Drone(startCoordinates);
		String expectedCoordinates="Drone position: ("
		         +Integer.toString(startCoordinates[0])+", "
				 +Integer.toString(startCoordinates[1])+", "
				 +Integer.toString(startCoordinates[2])+")";
		
		assertEquals(expectedCoordinates,drone.moveDown());
			
	}
	
	
	@Test
	public void testInitialMoveLeft(){
		
		drone=new Drone(startCoordinates);
		String expectedCoordinates="Drone position: ("
		         +Integer.toString(startCoordinates[0]-1)+", "
				 +Integer.toString(startCoordinates[1])+", "
				 +Integer.toString(startCoordinates[2])+")";
		
		assertEquals(expectedCoordinates,drone.moveLeft());
			
	}
	
	
	@Test
	public void testInitialMoveRight(){
		
		drone=new Drone(startCoordinates);
		String expectedCoordinates="Drone position: ("
		         +Integer.toString(startCoordinates[0]+1)+", "
				 +Integer.toString(startCoordinates[1])+", "
				 +Integer.toString(startCoordinates[2])+")";
		
		assertEquals(expectedCoordinates,drone.moveRight());		
	}
	
	@Test
	public void testInitialMoveBack(){
		
		drone=new Drone(startCoordinates);
		String expectedCoordinates="Drone position: ("
		         +Integer.toString(startCoordinates[0])+", "
				 +Integer.toString(startCoordinates[1])+", "
				 +Integer.toString(startCoordinates[2]+1)+")";
		
		assertEquals(expectedCoordinates,drone.moveBack());
			
	}
	
	@Test
	public void testInitialMoveForth(){
		
		drone=new Drone(startCoordinates);
		String expectedCoordinates="Drone position: ("
		         +Integer.toString(startCoordinates[0])+", "
				 +Integer.toString(startCoordinates[1])+", "
				 +Integer.toString(startCoordinates[2]-1)+")";
		
		assertEquals(expectedCoordinates,drone.moveForth());
			
	}
	
	
	
	
	
	
	
	
	
	

}
