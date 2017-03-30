package tests;

import org.junit.Test;
import static org.junit.Assert.*;
import drone.Drone;

public class DroneBasicTest {
	
	private int[] boundaries = {50, 50, 50};
	private int[] startCoordinates = {30, 0, 30};
	
	Drone drone;
	
	@Test(timeout = 1000)
	public void testInitialMoveUp()		//proveravanje kretanja ka gore za 1
	{
		drone = new Drone();
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1] + 1) + "," + Integer.toString(startCoordinates[2]) + ").";
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	@Test(timeout = 1000)
	public void testInitialMoveDown()	//proveravanje kretanja ka dole za 1
	{
		drone = new Drone();
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) + "," + Integer.toString(startCoordinates[2]) + ").";
		assertEquals(expectedCoordinates, drone.moveDown());
	}
	
	@Test(timeout = 1000)
	public void testInitialMoveLeft()	//proveravanje kretanja ulevo za 1
	{
		drone = new Drone();
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(startCoordinates[0] - 1) + "," + Integer.toString(startCoordinates[1]) + "," + Integer.toString(startCoordinates[2]) + ").";
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	
	@Test(timeout = 1000)
	public void testInitialMoveRight()	//proveravanje kretanja udesno za 1
	{
		drone = new Drone();
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(startCoordinates[0] + 1) + "," + Integer.toString(startCoordinates[1]) + "," + Integer.toString(startCoordinates[2]) + ").";
		assertEquals(expectedCoordinates, drone.moveRight());
	}
	
	@Test(timeout = 1000)
	public void testInitialMoveForth()	//proveravanje kretanja napred za 1
	{
		drone = new Drone();
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) + "," + Integer.toString(startCoordinates[2] - 1) + ").";
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	
	@Test(timeout = 1000)
	public void testInitialMoveBack()	//proveravanje kretanja nazad za 1
	{
		drone = new Drone();
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) + "," + Integer.toString(startCoordinates[2] + 1) + ").";
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(timeout = 1000)
	public void testOuterFrontBoundary()	//proveravanje probijanja spoljasnje granice kretanjem napred
	{
		int[] initCoordinates = {30, 40, 0};
		
		drone = new Drone(initCoordinates);
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(initCoordinates[0]) + "," + Integer.toString(initCoordinates[1]) + "," + Integer.toString(initCoordinates[2]) + ").";
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	
	@Test(timeout = 1000)
	public void testInnerFrontBoundary()	//proveravanje probijanja unutrasnje granice kretanjem napred
	{
		int[] initCoordinates = {30, 39, 40};
		
		drone = new Drone(initCoordinates);
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(initCoordinates[0]) + "," + Integer.toString(initCoordinates[1]) + "," + Integer.toString(initCoordinates[2]) + ").";
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	
	@Test(timeout = 1000)
	public void testOuterBackBoundary()		//proveravanje probijanja spoljasnje granice kretanjem unazad
	{
		int[] initCoordinates = {30, 40, 50};
		
		drone = new Drone(initCoordinates);
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(initCoordinates[0]) + "," + Integer.toString(initCoordinates[1]) + "," + Integer.toString(initCoordinates[2]) + ").";
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	@Test(timeout = 1000)
	public void testInnerBackBoundary()		//proveravanje probijanja unutrasnje granice kretanjem unazad
	{
		int[] initCoordinates = {30, 39, 10};
		
		drone = new Drone(initCoordinates);
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(initCoordinates[0]) + "," + Integer.toString(initCoordinates[1]) + "," + Integer.toString(initCoordinates[2]) + ").";
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	@Test(timeout = 1000)
	public void testOuterLeftBoundary()		//proveravanje probijanja spoljasnje granice kretanjem ulevo
	{
		int[] initCoordinates = {0, 40, 50};
		
		drone = new Drone(initCoordinates);
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(initCoordinates[0]) + "," + Integer.toString(initCoordinates[1]) + "," + Integer.toString(initCoordinates[2]) + ").";
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	
	@Test(timeout = 1000)
	public void testInnerLeftBoundary()		//proveravanje probijanja unutrasnje granice kretanjem ulevo
	{
		int[] initCoordinates = {40, 39, 39};
		
		drone = new Drone(initCoordinates);
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(initCoordinates[0]) + "," + Integer.toString(initCoordinates[1]) + "," + Integer.toString(initCoordinates[2]) + ").";
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	
	@Test(timeout = 1000)
	public void testOuterRightBoundary()	//proveravanje probijanja spoljasnje granice kretanjem udesno
	{
		int[] initCoordinates = {50, 40, 50};
		
		drone = new Drone(initCoordinates);
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(initCoordinates[0]) + "," + Integer.toString(initCoordinates[1]) + "," + Integer.toString(initCoordinates[2]) + ").";
		assertEquals(expectedCoordinates, drone.moveRight());
	}
	
	@Test(timeout = 1000)
	public void testInnerRightBoundary()	//proveravanje probijanja unutrasnje granice kretanjem udesno
	{
		int[] initCoordinates = {10, 39, 39};
		
		drone = new Drone(initCoordinates);
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(initCoordinates[0]) + "," + Integer.toString(initCoordinates[1]) + "," + Integer.toString(initCoordinates[2]) + ").";
		assertEquals(expectedCoordinates, drone.moveRight());
	}
	
	@Test(timeout = 1000)
	public void testOuterBottomBoundary()	//proveravanje probijanja spoljasnje granice kretanem ka dole
	{
		int[] initCoordinates = {25, 0, 25};
		
		drone = new Drone(initCoordinates);
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(initCoordinates[0]) + "," + Integer.toString(initCoordinates[1]) + "," + Integer.toString(initCoordinates[2]) + ").";
		assertEquals(expectedCoordinates, drone.moveDown());
	}
	
	@Test(timeout = 1000)
	public void testInnerBottomBoundary()	//proveravanje probijanja unutrasnje granice kretanem ka dole
	{
		int[] initCoordinates = {25, 40, 25};
		
		drone = new Drone(initCoordinates);
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(initCoordinates[0]) + "," + Integer.toString(initCoordinates[1]) + "," + Integer.toString(initCoordinates[2]) + ").";
		assertEquals(expectedCoordinates, drone.moveDown());
	}

	@Test(timeout = 1000)
	public void testOuterTopBoundary() //proveravanje probijanja spoljasnje granice kretanjem na gore
	{
		int[] initCoordinates = {25, 50, 25};
		
		drone = new Drone(initCoordinates);
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(initCoordinates[0]) + "," + Integer.toString(initCoordinates[1]) + "," + Integer.toString(initCoordinates[2]) + ").";
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	@Test(timeout = 1000)
	public void testInnerTopBoundary() //proveravanje probijanja unutrasnje granice kretanjem na gore
	{
		int[] initCoordinates = {25, 10, 25};
		
		drone = new Drone(initCoordinates);
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(initCoordinates[0]) + "," + Integer.toString(initCoordinates[1]) + "," + Integer.toString(initCoordinates[2]) + ").";
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
}
