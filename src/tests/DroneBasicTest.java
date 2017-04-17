package tests;

import static org.junit.Assert.*;

import javax.swing.plaf.ActionMapUIResource;

import org.junit.Test;

import drone.Drone;

public class DroneBasicTest {
	
	Drone drone;
	
	private int[] boundaries = {50,50,50};
	private int[] startCoordinates = {30, 0, 30};
	
	
	@Test
	public void testInitialMoveUp()
	{
		drone = new Drone(startCoordinates);
		
		String expectedCoordinates = "Drone position: (" + Integer.toString(startCoordinates[0]) + ","
										+ Integer.toString(startCoordinates[1]+1) + ","
										+ Integer.toString(startCoordinates[2]) + ")"; 
		
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	@Test
	public void testInitialMoveDown()
	{
		startCoordinates[1]=50;
		drone = new Drone(startCoordinates);
		
		String expectedCoordinates = "Drone position: (" + Integer.toString(startCoordinates[0]) + ","
										+ Integer.toString(startCoordinates[1]-1) + ","
										+ Integer.toString(startCoordinates[2]) + ")"; 
		
		assertEquals(expectedCoordinates, drone.moveDown());
	}
	
	@Test
	public void testInitialMoveLeft()
	{
		startCoordinates[0]=50;
		drone = new Drone(startCoordinates);
		
		String expectedCoordinates = "Drone position: (" + Integer.toString(startCoordinates[0]-1) + ","
										+ Integer.toString(startCoordinates[1]) + ","
										+ Integer.toString(startCoordinates[2]) + ")"; 
		
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	
	@Test
	public void testInitialMoveRight()
	{
		startCoordinates[0]=0;
		drone = new Drone(startCoordinates);
		
		String expectedCoordinates = "Drone position: (" + Integer.toString(startCoordinates[0]+1) + ","
										+ Integer.toString(startCoordinates[1]) + ","
										+ Integer.toString(startCoordinates[2]) + ")"; 
		
		assertEquals(expectedCoordinates, drone.moveRight());
	}
	
	@Test
	public void testInitialMoveForth()
	{
		startCoordinates[2]=50;
		drone = new Drone(startCoordinates);
		
		String expectedCoordinates = "Drone position: (" + Integer.toString(startCoordinates[0]) + ","
										+ Integer.toString(startCoordinates[1]) + ","
										+ Integer.toString(startCoordinates[2]-1) + ")"; 
		
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	
	@Test
	public void testInitialMoveBack()
	{
		startCoordinates[2]=0;
		drone = new Drone(startCoordinates);
		
		String expectedCoordinates = "Drone position: (" + Integer.toString(startCoordinates[0]) + ","
										+ Integer.toString(startCoordinates[1]) + ","
										+ Integer.toString(startCoordinates[2]+1) + ")"; 
		
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	
	
	@Test
	public void testDonjaGranicaUnutrasnjeKockePoOrdinati()
	{
		startCoordinates[1] = 10;
		drone = new Drone(startCoordinates);
		
		String expectedCoordinates = "Drone position: (" + Integer.toString(startCoordinates[0]) + ","
										+ Integer.toString(startCoordinates[1]) + ","
										+ Integer.toString(startCoordinates[2]) + ")"; 
		
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	
	
	@Test
	public void testGornjaGranicaSpoljasnjeKockePoOrdinati()
	{
		startCoordinates[1] = 50;
		drone = new Drone(startCoordinates);
		
		String expectedCoordinates = "Drone position: (" + Integer.toString(startCoordinates[0]) + ","
										+ Integer.toString(startCoordinates[1]) + ","
										+ Integer.toString(startCoordinates[2]) + ")"; 
		
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	
	
	@Test
	public void testDonjaGranicaSpoljasnjeKockePoOrdinati()
	{
		startCoordinates[1] = 0;
		drone = new Drone(startCoordinates);
		
		String expectedCoordinates = "Drone position: (" + Integer.toString(startCoordinates[0]) + ","
										+ Integer.toString(startCoordinates[1]) + ","
										+ Integer.toString(startCoordinates[2]) + ")"; 
		
		assertEquals(expectedCoordinates, drone.moveDown());
	}
	
	
	
	@Test
	public void testGornjaGranicaUnutrasnjeKockePoOrdinati()
	{
		startCoordinates[1] = 40;
		drone = new Drone(startCoordinates);
		
		String expectedCoordinates = "Drone position: (" + Integer.toString(startCoordinates[0]) + ","
										+ Integer.toString(startCoordinates[1]) + ","
										+ Integer.toString(startCoordinates[2]) + ")"; 
		
		assertEquals(expectedCoordinates, drone.moveDown());
	}
	
	
	
	@Test
	public void testDonjaGranicaUnutrasnjeKockePoApscisi()
	{
		int[] startCoordinates = {10, 30, 30};
		drone = new Drone(startCoordinates);
		
		String expectedCoordinates = "Drone position: (" + Integer.toString(startCoordinates[0]) + ","
										+ Integer.toString(startCoordinates[1]) + ","
										+ Integer.toString(startCoordinates[2]) + ")"; 
		
		assertEquals(expectedCoordinates, drone.moveRight());
	}
	
	@Test
	public void testGornjaGranicaSpoljasnjeKockePoApscisi()
	{
		startCoordinates[0] = 50;
		drone = new Drone(startCoordinates);
		
		String expectedCoordinates = "Drone position: (" + Integer.toString(startCoordinates[0]) + ","
										+ Integer.toString(startCoordinates[1]) + ","
										+ Integer.toString(startCoordinates[2]) + ")"; 
		
		assertEquals(expectedCoordinates, drone.moveRight());
	}
	
	@Test
	public void testGornjaGranicaUnutrasnjeKockePoApscisi()
	{
		int[] startCoordinates = {40, 30, 30};
		drone = new Drone(startCoordinates);
		
		String expectedCoordinates = "Drone position: (" + Integer.toString(startCoordinates[0]) + ","
										+ Integer.toString(startCoordinates[1]) + ","
										+ Integer.toString(startCoordinates[2]) + ")"; 
		
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	@Test
	public void testDonjaGranicaSpoljasnjeKockePoApscisi()
	{
		startCoordinates[0] = 0;
		drone = new Drone(startCoordinates);
		
		String expectedCoordinates = "Drone position: (" + Integer.toString(startCoordinates[0]) + ","
										+ Integer.toString(startCoordinates[1]) + ","
										+ Integer.toString(startCoordinates[2]) + ")"; 
		
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	@Test
	public void testGornjaGranicaUnutrasnjeKockePoAplikati()
	{
		int[] startCoordinates = {30, 30, 40};
		drone = new Drone(startCoordinates);
		
		String expectedCoordinates = "Drone position: (" + Integer.toString(startCoordinates[0]) + ","
										+ Integer.toString(startCoordinates[1]) + ","
										+ Integer.toString(startCoordinates[2]) + ")"; 
		
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	@Test
	public void testDonjaGranicaSpoljasnjeKockePoAplikati()
	{
		int[] startCoordinates = {30, 0, 0};
		drone = new Drone(startCoordinates);
		
		String expectedCoordinates = "Drone position: (" + Integer.toString(startCoordinates[0]) + ","
										+ Integer.toString(startCoordinates[1]) + ","
										+ Integer.toString(startCoordinates[2]) + ")"; 
		
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	@Test
	public void testDonjaGranicaUnutrasnjeKockePoAplikati()
	{
		int[] startCoordinates = {30, 30, 10};
		drone = new Drone(startCoordinates);
		
		String expectedCoordinates = "Drone position: (" + Integer.toString(startCoordinates[0]) + ","
										+ Integer.toString(startCoordinates[1]) + ","
										+ Integer.toString(startCoordinates[2]) + ")"; 
		
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	@Test
	public void testGornjaGranicaSpoljasnjeKockePoAplikati()
	{
		startCoordinates[2] = 50;
		drone = new Drone(startCoordinates);
		
		String expectedCoordinates = "Drone position: (" + Integer.toString(startCoordinates[0]) + ","
										+ Integer.toString(startCoordinates[1]) + ","
										+ Integer.toString(startCoordinates[2]) + ")"; 
		
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
}
