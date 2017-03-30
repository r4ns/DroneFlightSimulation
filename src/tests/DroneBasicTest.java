package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneBasicTest {
	
		Drone drone;
		private int[] boundaries = {50,50,50}; 
		private int[] StartCoordinates = {30,0,30};
		
		//////////InitialMoving//////////
		
		@Test
		public void testInitialMoveUp()
		{
			drone = new Drone(boundaries, StartCoordinates);
			String expectedCoordinates = "(" + Integer.toString(StartCoordinates[0]) + ","
					+ Integer.toString(StartCoordinates[1] + 1) + ","
					+ Integer.toString(StartCoordinates[2]) + ")";
			
			
			assertEquals(expectedCoordinates, drone.moveUp());			
			
		}
		
		@Test
		public void testInitialMoveDown()
		{
			drone = new Drone(boundaries, StartCoordinates);
			String expectedCoordinates = "(" + Integer.toString(StartCoordinates[0]) + ","
					+ Integer.toString(0) + ","
					+ Integer.toString(StartCoordinates[2]) + ")";
			
			
			assertEquals(expectedCoordinates, drone.moveDown());			
			
		}
		
		@Test
		public void testInitialMoveLeft()
		{
			drone = new Drone(boundaries, StartCoordinates);
			String expectedCoordinates = "(" + Integer.toString(StartCoordinates[0] - 1) + ","
					+ Integer.toString(StartCoordinates[1]) + ","
					+ Integer.toString(StartCoordinates[2]) + ")";
			
			
			assertEquals(expectedCoordinates, drone.moveLeft());			
			
		}
		
		@Test
		public void testInitialMoveRight()
		{
			drone = new Drone(boundaries, StartCoordinates);
			String expectedCoordinates = "(" + Integer.toString(StartCoordinates[0] + 1) + ","
					+ Integer.toString(StartCoordinates[1]) + ","
					+ Integer.toString(StartCoordinates[2]) + ")";
			
			
			assertEquals(expectedCoordinates, drone.moveRight());			
			
		}
		
		@Test
		public void testInitialMoveForth()
		{
			drone = new Drone(boundaries, StartCoordinates);
			String expectedCoordinates = "(" + Integer.toString(StartCoordinates[0]) + ","
					+ Integer.toString(StartCoordinates[1]) + ","
					+ Integer.toString(StartCoordinates[2] - 1 ) + ")";
			
			
			assertEquals(expectedCoordinates, drone.moveForth());			
			
		}
		@Test
		public void testInitialMoveBack()
		{
			drone = new Drone(boundaries, StartCoordinates);
			String expectedCoordinates = "(" + Integer.toString(StartCoordinates[0]) + ","
					+ Integer.toString(StartCoordinates[1]) + ","
					+ Integer.toString(StartCoordinates[2] + 1 ) + ")";
			
			
			assertEquals(expectedCoordinates, drone.moveBack());			
			
		}
		
		
		//////////BoundariesMoving//////////
		

		@Test		
		public void testMovingUp()
				{
					StartCoordinates[1] = 10;
					
					drone = new Drone(boundaries, StartCoordinates);
					String expectedCoordinates = "(" + Integer.toString(StartCoordinates[0]) + ","
							+ Integer.toString(10) + ","
							+ Integer.toString(StartCoordinates[2]) + ")";
					
					
					assertEquals(expectedCoordinates, drone.moveUp());	
					
					
				}
		@Test	
		public void testMovingUpp()
		{
			StartCoordinates[1] = 50;
			
			drone = new Drone(boundaries, StartCoordinates);
			String expectedCoordinates = "(" + Integer.toString(StartCoordinates[0]) + ","
					+ Integer.toString(50) + ","
					+ Integer.toString(StartCoordinates[2]) + ")";
			
			
			assertEquals(expectedCoordinates, drone.moveUp());	
			
			
		}
		@Test		
		public void testMovingDown()
				{
					
					
					drone = new Drone(boundaries, StartCoordinates);
					String expectedCoordinates = "(" + Integer.toString(StartCoordinates[0]) + ","
							+ Integer.toString(StartCoordinates[1]) + ","
							+ Integer.toString(StartCoordinates[2]) + ")";
					
					
					assertEquals(expectedCoordinates, drone.moveDown());	
					
					
				}
		
		@Test		
		public void testMovingDownn()
				{
					StartCoordinates[1] = 40;
					
					drone = new Drone(boundaries, StartCoordinates);
					String expectedCoordinates = "(" + Integer.toString(StartCoordinates[0]) + ","
							+ Integer.toString(40) + ","
							+ Integer.toString(StartCoordinates[2]) + ")";
					
					
					assertEquals(expectedCoordinates, drone.moveDown());	
					
					
				}
		
		
		
		@Test		
		public void testMovingLeft()
				{
					StartCoordinates[0] = 0;
					
					drone = new Drone(boundaries, StartCoordinates);
					String expectedCoordinates = "(" + Integer.toString(0) + ","
							+ Integer.toString(StartCoordinates[1]) + ","
							+ Integer.toString(StartCoordinates[2]) + ")";
					
					
					assertEquals(expectedCoordinates, drone.moveLeft());	
					
					
				}
		
		
		
		@Test		
		public void testMovingRight()
				{
					StartCoordinates[0] = 50;
					
					drone = new Drone(boundaries, StartCoordinates);
					String expectedCoordinates = "(" + Integer.toString(50) + ","
							+ Integer.toString(StartCoordinates[1]) + ","
							+ Integer.toString(StartCoordinates[2]) + ")";
					
					
					assertEquals(expectedCoordinates, drone.moveRight());	
					
					
				}
		
		@Test		
		public void testMovingBack()
				{
					StartCoordinates[2] = 50;
					
					drone = new Drone(boundaries, StartCoordinates);
					String expectedCoordinates = "(" + Integer.toString(StartCoordinates[0]) + ","
							+ Integer.toString(StartCoordinates[1]) + ","
							+ Integer.toString(50) + ")";
					
					
					assertEquals(expectedCoordinates, drone.moveBack());	
					
					
				}
		
		@Test		
		public void testMovingForth()
				{
					StartCoordinates[2] = 0;
					
					drone = new Drone(boundaries, StartCoordinates);
					String expectedCoordinates = "(" + Integer.toString(StartCoordinates[0]) + ","
							+ Integer.toString(StartCoordinates[1]) + ","
							+ Integer.toString(0) + ")";
					
					
					assertEquals(expectedCoordinates, drone.moveForth());	
					
					
				}

		
		
}
