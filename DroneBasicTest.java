package tests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import drone.Drone;

public class DroneBasicTest {
	
	
	@Test
	public void testMovingUpOneStep(){
		
		Drone drone = new Drone();
		
		String expectedCoordinates="("+Integer.toString(drone.getX())
			+","+Integer.toString(drone.getY()+1)
			+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveUp());
	}
	
	@Test
	public void testMovingUpOneStepWhenItsBoundary(){
		
		Drone drone = new Drone();
		
		drone.setY(10);
		String expectedCoordinates="("+Integer.toString(drone.getX())
			+","+Integer.toString(drone.getY())
			+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveUp());
		
		drone.setY(50);
		expectedCoordinates="("+Integer.toString(drone.getX())
			+","+Integer.toString(drone.getY())
			+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveUp());
	}
	
	@Test
	public void testMovingDownOneStep(){
		
		Drone drone = new Drone();
		
		drone.setY(1);
		String expectedCoordinates="("+Integer.toString(drone.getX())
			+","+Integer.toString(drone.getY()-1)
			+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveDown());
	}
	
	@Test
	public void testMovingDownOneStepWhenItsBoundary(){
		
		Drone drone = new Drone();
		
		String expectedCoordinates="("+Integer.toString(drone.getX())
			+","+Integer.toString(drone.getY())
			+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveDown());
		
		drone.setY(40);
		expectedCoordinates="("+Integer.toString(drone.getX())
			+","+Integer.toString(drone.getY())
			+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveDown());
	}
	
	@Test
	public void testMovingRightOneStep(){
		
		Drone drone = new Drone();
		
		String expectedCoordinates="("+Integer.toString(drone.getX()+1)
			+","+Integer.toString(drone.getY())
			+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveRight());
	}
	
	@Test
	public void testMovingRightOneStepWhenItsBoundary(){
		
		Drone drone = new Drone();
		
		drone.setX(50);
		String expectedCoordinates="("+Integer.toString(drone.getX())
			+","+Integer.toString(drone.getY())
			+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveRight());
		
		drone.setX(10);
		drone.setY(30);
		expectedCoordinates="("+Integer.toString(drone.getX())
			+","+Integer.toString(drone.getY())
			+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveRight());
	}
	
	@Test
	public void testMovingLeftOneStep(){
		Drone drone = new Drone();
		
		String expectedCoordinates="("+Integer.toString(drone.getX()-1)
		+","+Integer.toString(drone.getY())
		+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveLeft());
	}
	
	@Test
	public void testMovingLeftOneStepWhenItsBoundary(){
		Drone drone = new Drone();
		
		drone.setX(0);
		String expectedCoordinates="("+Integer.toString(drone.getX())
		+","+Integer.toString(drone.getY())
		+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveLeft());
		
		drone.setX(40);
		drone.setY(30);
		expectedCoordinates="("+Integer.toString(drone.getX())
		+","+Integer.toString(drone.getY())
		+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveLeft());
	}
	
	@Test
	public void testMovingForthOneStep(){
		
		Drone drone = new Drone();
		
		String expectedCoordinates="("+Integer.toString(drone.getX())
		+","+Integer.toString(drone.getY())
		+","+Integer.toString(drone.getZ()-1)+")";
		assertEquals("Drone position: " +expectedCoordinates, drone.moveForth());
	}
	
	@Test
	public void testMovingForthOneStepWhenItsBoundary(){
		Drone drone = new Drone();
		
		drone.setZ(0);
		String expectedCoordinates="("+Integer.toString(drone.getX())
		+","+Integer.toString(drone.getY())
		+","+Integer.toString(drone.getZ())+")";
		
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveForth());
		
		drone.setZ(40);
		drone.setY(30);
		expectedCoordinates="("+Integer.toString(drone.getX())
		+","+Integer.toString(drone.getY())
		+","+Integer.toString(drone.getZ())+")";
		
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveForth());
	}
	
	@Test
	public void testMovingBackOneStep(){
		Drone drone = new Drone();
		
		String expectedCoordinates="("+Integer.toString(drone.getX())
		+","+Integer.toString(drone.getY())
		+","+Integer.toString(drone.getZ()+1)+")";
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveBack());
	}
	
	@Test
	public void testMovingBackOneStepWhenItsBoundary(){
		Drone drone = new Drone();
		
		drone.setZ(50);
		String expectedCoordinates="("+Integer.toString(drone.getX())
		+","+Integer.toString(drone.getY())
		+","+Integer.toString(drone.getZ())+")";
		
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveBack());
		
		drone.setZ(10);
		drone.setY(30);
		expectedCoordinates="("+Integer.toString(drone.getX())
		+","+Integer.toString(drone.getY())
		+","+Integer.toString(drone.getZ())+")";
		
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveBack());
	}

}
