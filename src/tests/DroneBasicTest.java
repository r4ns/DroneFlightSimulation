package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;
public class DroneBasicTest {
	
/*
	Drone drone;
	private int [] boundaries={50,50};
	private int [] startCoordinates = {30,0,30};
	
	
	
	@Test
	public void testInitialMoveUp()
		{
			drone = new Drone(boundaries, startCoordinates);
			String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]+1) +
					"," + Integer.toString(startCoordinates[2])+")";
			assertEquals(expectedCoordinates, drone.moveUp());
			
		}
	@Test
	public void testInitialMoveUpHitBottomInnerSquareBorder(){
		
		startCoordinates[1]=10;
		drone = new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(10) +
				"," + Integer.toString(startCoordinates[2])+")";
		
		assertEquals(expectedCoordinates, drone.moveUp());
		
	}
	
	@Test
	public void testInitialMoveUpHitTopOutterSquare(){ //udara u gornju granicu velike kocke
		startCoordinates[1]=50;
		drone = new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(50) +
				"," + Integer.toString(startCoordinates[2])+")";
		
		assertEquals(expectedCoordinates, drone.moveUp());
		
		
	}
	
	@Test
	public void testMoveDownBreakBottomBorder(){ //probija donju granicu
		
		drone = new Drone(boundaries, startCoordinates);
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) +
				"," + Integer.toString(startCoordinates[2])+")";
		assertEquals(expectedCoordinates, drone.moveDown());
		
	}
	
	@Test
	public void testInitialMoveDown(){
		startCoordinates[1]=50;
		drone = new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]-1) +
				"," + Integer.toString(startCoordinates[2])+")";
		
		assertEquals(expectedCoordinates, drone.moveDown());
		
	}
	
	@Test
	public void testMoveDownHitTopInnerSquare(){
		startCoordinates[1]=40;
		drone = new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(40) +
				"," + Integer.toString(startCoordinates[2])+")";
		
		assertEquals(expectedCoordinates, drone.moveDown());
		
	}
	
	@Test
	public void testInitialMoveLeft(){
		
		drone = new Drone(boundaries, startCoordinates);
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]-1) + "," + Integer.toString(startCoordinates[1]) +
				"," + Integer.toString(startCoordinates[2])+")";
		assertEquals(expectedCoordinates, drone.moveLeft());
		
	}
	
	@Test
	public void testMoveLeftHitRightSideInnerSquare(){
		startCoordinates[0]=40;
		startCoordinates[1]=30;
		drone = new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) +
				"," + Integer.toString(startCoordinates[2])+")";
		
		assertEquals(expectedCoordinates, drone.moveLeft());
		
	}
	
	@Test
	public void testMoveLeftHitLeftSideOutterSquare(){
		startCoordinates[0]=0;
		drone = new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) +
				"," + Integer.toString(startCoordinates[2])+")";
		
		assertEquals(expectedCoordinates, drone.moveLeft());
		
	}
	
	@Test
	public void testInitialMoveRight(){
		drone = new Drone(boundaries, startCoordinates);
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]+1) + "," + Integer.toString(startCoordinates[1]) +
				"," + Integer.toString(startCoordinates[2])+")";
		assertEquals(expectedCoordinates, drone.moveRight());
		
	}
	
	@Test
	public void testMoveRightHitLeftSideInnerSquare(){
		startCoordinates[0]=10;
		startCoordinates[1]=30;
		drone = new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) +
				"," + Integer.toString(startCoordinates[2])+")";
		
		assertEquals(expectedCoordinates, drone.moveRight());
		
	}
	
	@Test
	public void testMoveRightHitRightSideOutterSquare(){
		startCoordinates[0]=50;
		drone = new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) +
				"," + Integer.toString(startCoordinates[2])+")";
		
		assertEquals(expectedCoordinates, drone.moveRight());
		
	}
	@Test
	public void testInitialMoveBack(){
		drone = new Drone(boundaries, startCoordinates);
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) +
				"," + Integer.toString(startCoordinates[2]-1)+")";
		assertEquals(expectedCoordinates, drone.moveBack());
		
	}
	
	@Test
	public void testMoveBackHitFrontInnerSquare(){
		startCoordinates[2]=10;
		startCoordinates[0]=30;
		startCoordinates[1]=30;
		drone = new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) +
				"," + Integer.toString(startCoordinates[2])+")";
		
		assertEquals(expectedCoordinates, drone.moveBack());
		
	}
	@Test
	public void testMoveBackHitBackSideOutterSquare(){
		startCoordinates[2]=0;
		startCoordinates[0]=30;
		startCoordinates[1]=30;
		drone = new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) +
				"," + Integer.toString(0)+")";
		
		assertEquals(expectedCoordinates, drone.moveBack());
		
	}
	
	@Test
	public void testInitialMoveForth(){
		drone = new Drone(boundaries, startCoordinates);
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) +
				"," + Integer.toString(startCoordinates[2]+1)+")";
		assertEquals(expectedCoordinates, drone.moveForth());
		
	}
	@Test
	public void testMoveForthHitFrontSideOutterSquare(){
		startCoordinates[2]=50;
		startCoordinates[0]=30;
		startCoordinates[1]=30;
		drone = new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) +
				"," + Integer.toString(startCoordinates[2])+")";
		
		assertEquals(expectedCoordinates, drone.moveForth());
		
		
		///
	}
	@Test
	public void testMoveForthHitBackSideInnerSquare(){
		startCoordinates[2]=10;
		startCoordinates[0]=30;
		startCoordinates[1]=30;
		drone = new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) +
				"," + Integer.toString(10)+")";
		
		assertEquals(expectedCoordinates, drone.moveForth());
		
	}
	*/
	
}
