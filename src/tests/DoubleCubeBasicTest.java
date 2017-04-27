package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.DroneOne;
import space.DoubleCubeDrone;
import space.FlySpace;

public class DoubleCubeBasicTest {
	
	FlySpace space = new FlySpace();
	DoubleCubeDrone drone;
	int[] topMax;
	int[] topMin;
	int[] botMax;
	int[] botMin;
	
	@Test
	public void testBoundariesMoveUpOne() {
		drone = new DoubleCubeDrone(new int[] {9, 9, 9}, 1);
		topMax = drone.getCubeTop().getMaxCoordinates();
		topMin = drone.getCubeTop().getMinCoordinates();
		botMax = drone.getCubeBottom().getMaxCoordinates();
		botMin = drone.getCubeBottom().getMinCoordinates();
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(botMin[0]) + ","
				+ Integer.toString(botMin[1]) + ","
				+ Integer.toString(botMin[2]) + "), ("
				+ Integer.toString(botMax[0]) + ","
				+ Integer.toString(botMax[1]) + ","
				+ Integer.toString(botMax[2]) + ")"
				+ "Drone position: ("
				+ Integer.toString(topMin[0]) + ","
				+ Integer.toString(topMin[1]) + ","
				+ Integer.toString(topMin[2]) + "), ("
				+ Integer.toString(topMax[0]) + ","
				+ Integer.toString(topMax[1]) + ","
				+ Integer.toString(topMax[2]) + ")";
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	@Test
	public void testBoundariesMoveUTwo() {
		drone = new DoubleCubeDrone(new int[] {49, 49, 49}, 1);
		topMax = drone.getCubeTop().getMaxCoordinates();
		topMin = drone.getCubeTop().getMinCoordinates();
		botMax = drone.getCubeBottom().getMaxCoordinates();
		botMin = drone.getCubeBottom().getMinCoordinates();
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(botMin[0]) + ","
				+ Integer.toString(botMin[1]) + ","
				+ Integer.toString(botMin[2]) + "), ("
				+ Integer.toString(botMax[0]) + ","
				+ Integer.toString(botMax[1]) + ","
				+ Integer.toString(botMax[2]) + ")"
				+ "Drone position: ("
				+ Integer.toString(topMin[0]) + ","
				+ Integer.toString(topMin[1]) + ","
				+ Integer.toString(topMin[2]) + "), ("
				+ Integer.toString(topMax[0]) + ","
				+ Integer.toString(topMax[1]) + ","
				+ Integer.toString(topMax[2]) + ")";
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	@Test
	public void testBoundariesMoveDownOne() {
		drone = new DoubleCubeDrone(new int[] {0, 0, 0}, 1);
		topMax = drone.getCubeTop().getMaxCoordinates();
		topMin = drone.getCubeTop().getMinCoordinates();
		botMax = drone.getCubeBottom().getMaxCoordinates();
		botMin = drone.getCubeBottom().getMinCoordinates();
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(botMin[0]) + ","
				+ Integer.toString(botMin[1]) + ","
				+ Integer.toString(botMin[2]) + "), ("
				+ Integer.toString(botMax[0]) + ","
				+ Integer.toString(botMax[1]) + ","
				+ Integer.toString(botMax[2]) + ")"
				+ "Drone position: ("
				+ Integer.toString(topMin[0]) + ","
				+ Integer.toString(topMin[1]) + ","
				+ Integer.toString(topMin[2]) + "), ("
				+ Integer.toString(topMax[0]) + ","
				+ Integer.toString(topMax[1]) + ","
				+ Integer.toString(topMax[2]) + ")";
		assertEquals(expectedCoordinates, drone.moveDown());
	}
	
	@Test
	public void testBoundariesMoveDownTwo() {
		drone = new DoubleCubeDrone(new int[] {30, 40, 30}, 1);
		topMax = drone.getCubeTop().getMaxCoordinates();
		topMin = drone.getCubeTop().getMinCoordinates();
		botMax = drone.getCubeBottom().getMaxCoordinates();
		botMin = drone.getCubeBottom().getMinCoordinates();
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(botMin[0]) + ","
				+ Integer.toString(botMin[1]) + ","
				+ Integer.toString(botMin[2]) + "), ("
				+ Integer.toString(botMax[0]) + ","
				+ Integer.toString(botMax[1]) + ","
				+ Integer.toString(botMax[2]) + ")"
				+ "Drone position: ("
				+ Integer.toString(topMin[0]) + ","
				+ Integer.toString(topMin[1]) + ","
				+ Integer.toString(topMin[2]) + "), ("
				+ Integer.toString(topMax[0]) + ","
				+ Integer.toString(topMax[1]) + ","
				+ Integer.toString(topMax[2]) + ")";
		assertEquals(expectedCoordinates, drone.moveDown());
	}
	
	@Test
	public void testBoundariesMoveRightOne() {
		drone = new DoubleCubeDrone(new int[] {9, 9, 9}, 1);
		topMax = drone.getCubeTop().getMaxCoordinates();
		topMin = drone.getCubeTop().getMinCoordinates();
		botMax = drone.getCubeBottom().getMaxCoordinates();
		botMin = drone.getCubeBottom().getMinCoordinates();
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(botMin[0]) + ","
				+ Integer.toString(botMin[1]) + ","
				+ Integer.toString(botMin[2]) + "), ("
				+ Integer.toString(botMax[0]) + ","
				+ Integer.toString(botMax[1]) + ","
				+ Integer.toString(botMax[2]) + ")"
				+ "Drone position: ("
				+ Integer.toString(topMin[0]) + ","
				+ Integer.toString(topMin[1]) + ","
				+ Integer.toString(topMin[2]) + "), ("
				+ Integer.toString(topMax[0]) + ","
				+ Integer.toString(topMax[1]) + ","
				+ Integer.toString(topMax[2]) + ")";
		assertEquals(expectedCoordinates, drone.moveRight());
	}
	
	@Test
	public void testBoundariesMoveRightTwo() {
		drone = new DoubleCubeDrone(new int[] {49, 9, 9}, 1);
		topMax = drone.getCubeTop().getMaxCoordinates();
		topMin = drone.getCubeTop().getMinCoordinates();
		botMax = drone.getCubeBottom().getMaxCoordinates();
		botMin = drone.getCubeBottom().getMinCoordinates();
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(botMin[0]) + ","
				+ Integer.toString(botMin[1]) + ","
				+ Integer.toString(botMin[2]) + "), ("
				+ Integer.toString(botMax[0]) + ","
				+ Integer.toString(botMax[1]) + ","
				+ Integer.toString(botMax[2]) + ")"
				+ "Drone position: ("
				+ Integer.toString(topMin[0]) + ","
				+ Integer.toString(topMin[1]) + ","
				+ Integer.toString(topMin[2]) + "), ("
				+ Integer.toString(topMax[0]) + ","
				+ Integer.toString(topMax[1]) + ","
				+ Integer.toString(topMax[2]) + ")";
		assertEquals(expectedCoordinates, drone.moveRight());
	}
	
	@Test
	public void testBoundariesMoveLeftOne() {
		drone = new DoubleCubeDrone(new int[] {0, 9, 9}, 1);
		topMax = drone.getCubeTop().getMaxCoordinates();
		topMin = drone.getCubeTop().getMinCoordinates();
		botMax = drone.getCubeBottom().getMaxCoordinates();
		botMin = drone.getCubeBottom().getMinCoordinates();
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(botMin[0]) + ","
				+ Integer.toString(botMin[1]) + ","
				+ Integer.toString(botMin[2]) + "), ("
				+ Integer.toString(botMax[0]) + ","
				+ Integer.toString(botMax[1]) + ","
				+ Integer.toString(botMax[2]) + ")"
				+ "Drone position: ("
				+ Integer.toString(topMin[0]) + ","
				+ Integer.toString(topMin[1]) + ","
				+ Integer.toString(topMin[2]) + "), ("
				+ Integer.toString(topMax[0]) + ","
				+ Integer.toString(topMax[1]) + ","
				+ Integer.toString(topMax[2]) + ")";
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	
	@Test
	public void testBoundariesMoveLeftTwo() {
		drone = new DoubleCubeDrone(new int[] {40, 39, 39}, 1);
		topMax = drone.getCubeTop().getMaxCoordinates();
		topMin = drone.getCubeTop().getMinCoordinates();
		botMax = drone.getCubeBottom().getMaxCoordinates();
		botMin = drone.getCubeBottom().getMinCoordinates();
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(botMin[0]) + ","
				+ Integer.toString(botMin[1]) + ","
				+ Integer.toString(botMin[2]) + "), ("
				+ Integer.toString(botMax[0]) + ","
				+ Integer.toString(botMax[1]) + ","
				+ Integer.toString(botMax[2]) + ")"
				+ "Drone position: ("
				+ Integer.toString(topMin[0]) + ","
				+ Integer.toString(topMin[1]) + ","
				+ Integer.toString(topMin[2]) + "), ("
				+ Integer.toString(topMax[0]) + ","
				+ Integer.toString(topMax[1]) + ","
				+ Integer.toString(topMax[2]) + ")";
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	@Test
	public void testBoundariesMoveBackOne() {
		drone = new DoubleCubeDrone(new int[] {9, 9, 9}, 1);
		topMax = drone.getCubeTop().getMaxCoordinates();
		topMin = drone.getCubeTop().getMinCoordinates();
		botMax = drone.getCubeBottom().getMaxCoordinates();
		botMin = drone.getCubeBottom().getMinCoordinates();
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(botMin[0]) + ","
				+ Integer.toString(botMin[1]) + ","
				+ Integer.toString(botMin[2]) + "), ("
				+ Integer.toString(botMax[0]) + ","
				+ Integer.toString(botMax[1]) + ","
				+ Integer.toString(botMax[2]) + ")"
				+ "Drone position: ("
				+ Integer.toString(topMin[0]) + ","
				+ Integer.toString(topMin[1]) + ","
				+ Integer.toString(topMin[2]) + "), ("
				+ Integer.toString(topMax[0]) + ","
				+ Integer.toString(topMax[1]) + ","
				+ Integer.toString(topMax[2]) + ")";
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	@Test
	public void testBoundariesMoveBackTwo() {
		drone = new DoubleCubeDrone(new int[] {39, 39, 50}, 1);
		topMax = drone.getCubeTop().getMaxCoordinates();
		topMin = drone.getCubeTop().getMinCoordinates();
		botMax = drone.getCubeBottom().getMaxCoordinates();
		botMin = drone.getCubeBottom().getMinCoordinates();
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(botMin[0]) + ","
				+ Integer.toString(botMin[1]) + ","
				+ Integer.toString(botMin[2]) + "), ("
				+ Integer.toString(botMax[0]) + ","
				+ Integer.toString(botMax[1]) + ","
				+ Integer.toString(botMax[2]) + ")"
				+ "Drone position: ("
				+ Integer.toString(topMin[0]) + ","
				+ Integer.toString(topMin[1]) + ","
				+ Integer.toString(topMin[2]) + "), ("
				+ Integer.toString(topMax[0]) + ","
				+ Integer.toString(topMax[1]) + ","
				+ Integer.toString(topMax[2]) + ")";
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	@Test
	public void testBoundariesMoveForthOne() {
		drone = new DoubleCubeDrone(new int[] {39, 39, 0}, 1);
		topMax = drone.getCubeTop().getMaxCoordinates();
		topMin = drone.getCubeTop().getMinCoordinates();
		botMax = drone.getCubeBottom().getMaxCoordinates();
		botMin = drone.getCubeBottom().getMinCoordinates();
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(botMin[0]) + ","
				+ Integer.toString(botMin[1]) + ","
				+ Integer.toString(botMin[2]) + "), ("
				+ Integer.toString(botMax[0]) + ","
				+ Integer.toString(botMax[1]) + ","
				+ Integer.toString(botMax[2]) + ")"
				+ "Drone position: ("
				+ Integer.toString(topMin[0]) + ","
				+ Integer.toString(topMin[1]) + ","
				+ Integer.toString(topMin[2]) + "), ("
				+ Integer.toString(topMax[0]) + ","
				+ Integer.toString(topMax[1]) + ","
				+ Integer.toString(topMax[2]) + ")";
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	
	@Test
	public void testBoundariesMoveForthTwo() {
		drone = new DoubleCubeDrone(new int[] {39, 39, 40}, 1);
		topMax = drone.getCubeTop().getMaxCoordinates();
		topMin = drone.getCubeTop().getMinCoordinates();
		botMax = drone.getCubeBottom().getMaxCoordinates();
		botMin = drone.getCubeBottom().getMinCoordinates();
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(botMin[0]) + ","
				+ Integer.toString(botMin[1]) + ","
				+ Integer.toString(botMin[2]) + "), ("
				+ Integer.toString(botMax[0]) + ","
				+ Integer.toString(botMax[1]) + ","
				+ Integer.toString(botMax[2]) + ")"
				+ "Drone position: ("
				+ Integer.toString(topMin[0]) + ","
				+ Integer.toString(topMin[1]) + ","
				+ Integer.toString(topMin[2]) + "), ("
				+ Integer.toString(topMax[0]) + ","
				+ Integer.toString(topMax[1]) + ","
				+ Integer.toString(topMax[2]) + ")";
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	/*@Test
	public void testInitialMoveUpOne(){
		
		drone = new DoubleCubeDrone(new DroneOne(9, 7, 36), new DroneOne(10, 8, 36), new DroneOne(10, 8, 35), new DroneOne(11, 9, 35));
		String expectedCoordinates = "Dole desna: (" + Integer.toString(drone.gettDoleDesno().getX()) + ", " + Integer.toString(drone.gettDoleDesno().getY() + 1) + ", " + Integer.toString(drone.gettDoleDesno().getZ()) + ")  "
					+ "Sredina desna: (" + Integer.toString(drone.gettSredinaDesno().getX()) + ", " + Integer.toString(drone.gettSredinaDesno().getY() + 1) + ", " + Integer.toString(drone.gettSredinaDesno().getZ()) + ")  "
					+ "Sredina leva: (" + Integer.toString(drone.gettSredinaLevo().getX()) + ", " + Integer.toString(drone.gettSredinaLevo().getY() + 1) + ", " + Integer.toString(drone.gettSredinaLevo().getZ()) + ")  "
					+ "Gore leva: (" + Integer.toString(drone.gettGoreLevo().getX()) + ", " + Integer.toString(drone.gettGoreLevo().getY() + 1) + ", " + Integer.toString(drone.gettGoreLevo().getZ()) + ")";
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	@Test
	public void testInitialMoveUpTwo(){
		
		drone = new DoubleCubeDrone(new DroneOne(39, 8, 40), new DroneOne(40, 9, 40), new DroneOne(40, 9, 39), new DroneOne(41, 10, 39));
		String expectedCoordinates = "Dole desna: (" + Integer.toString(drone.gettDoleDesno().getX()) + ", " + Integer.toString(drone.gettDoleDesno().getY() + 1) + ", " + Integer.toString(drone.gettDoleDesno().getZ()) + ")  "
					+ "Sredina desna: (" + Integer.toString(drone.gettSredinaDesno().getX()) + ", " + Integer.toString(drone.gettSredinaDesno().getY() + 1) + ", " + Integer.toString(drone.gettSredinaDesno().getZ()) + ")  "
					+ "Sredina leva: (" + Integer.toString(drone.gettSredinaLevo().getX()) + ", " + Integer.toString(drone.gettSredinaLevo().getY() + 1) + ", " + Integer.toString(drone.gettSredinaLevo().getZ()) + ")  "
					+ "Gore leva: (" + Integer.toString(drone.gettGoreLevo().getX()) + ", " + Integer.toString(drone.gettGoreLevo().getY() + 1) + ", " + Integer.toString(drone.gettGoreLevo().getZ()) + ")";
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	@Test
	public void testBoundariesMoveUpTwo(){
		
		drone = new DoubleCubeDrone(new DroneOne(35, 48, 36), new DroneOne(36, 49, 36), new DroneOne(36, 49, 35), new DroneOne(37, 50, 35));
		String expectedCoordinates = "Dole desna: (" + Integer.toString(drone.gettDoleDesno().getX()) + ", " + Integer.toString(drone.gettDoleDesno().getY()) + ", " + Integer.toString(drone.gettDoleDesno().getZ()) + ")  "
					+ "Sredina desna: (" + Integer.toString(drone.gettSredinaDesno().getX()) + ", " + Integer.toString(drone.gettSredinaDesno().getY()) + ", " + Integer.toString(drone.gettSredinaDesno().getZ()) + ")  "
					+ "Sredina leva: (" + Integer.toString(drone.gettSredinaLevo().getX()) + ", " + Integer.toString(drone.gettSredinaLevo().getY()) + ", " + Integer.toString(drone.gettSredinaLevo().getZ()) + ")  "
					+ "Gore leva: (" + Integer.toString(drone.gettGoreLevo().getX()) + ", " + Integer.toString(drone.gettGoreLevo().getY()) + ", " + Integer.toString(drone.gettGoreLevo().getZ()) + ")";
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	@Test
	public void testBoundariesMoveDownOne(){
		
		drone = new DoubleCubeDrone(new DroneOne(35, 40, 36), new DroneOne(36, 41, 36), new DroneOne(36, 41, 35), new DroneOne(37, 42, 35));
		String expectedCoordinates = "Dole desna: (" + Integer.toString(drone.gettDoleDesno().getX()) + ", " + Integer.toString(drone.gettDoleDesno().getY()) + ", " + Integer.toString(drone.gettDoleDesno().getZ()) + ")  "
					+ "Sredina desna: (" + Integer.toString(drone.gettSredinaDesno().getX()) + ", " + Integer.toString(drone.gettSredinaDesno().getY()) + ", " + Integer.toString(drone.gettSredinaDesno().getZ()) + ")  "
					+ "Sredina leva: (" + Integer.toString(drone.gettSredinaLevo().getX()) + ", " + Integer.toString(drone.gettSredinaLevo().getY()) + ", " + Integer.toString(drone.gettSredinaLevo().getZ()) + ")  "
					+ "Gore leva: (" + Integer.toString(drone.gettGoreLevo().getX()) + ", " + Integer.toString(drone.gettGoreLevo().getY()) + ", " + Integer.toString(drone.gettGoreLevo().getZ()) + ")";
		assertEquals(expectedCoordinates, drone.moveDown());
	}
	
	@Test
	public void testBoundariesMoveDownTwo(){
		
		drone = new DoubleCubeDrone(new DroneOne(35, 0, 36), new DroneOne(36, 1, 36), new DroneOne(36, 1, 35), new DroneOne(37, 2, 35));
		String expectedCoordinates = "Dole desna: (" + Integer.toString(drone.gettDoleDesno().getX()) + ", " + Integer.toString(drone.gettDoleDesno().getY()) + ", " + Integer.toString(drone.gettDoleDesno().getZ()) + ")  "
					+ "Sredina desna: (" + Integer.toString(drone.gettSredinaDesno().getX()) + ", " + Integer.toString(drone.gettSredinaDesno().getY()) + ", " + Integer.toString(drone.gettSredinaDesno().getZ()) + ")  "
					+ "Sredina leva: (" + Integer.toString(drone.gettSredinaLevo().getX()) + ", " + Integer.toString(drone.gettSredinaLevo().getY()) + ", " + Integer.toString(drone.gettSredinaLevo().getZ()) + ")  "
					+ "Gore leva: (" + Integer.toString(drone.gettGoreLevo().getX()) + ", " + Integer.toString(drone.gettGoreLevo().getY()) + ", " + Integer.toString(drone.gettGoreLevo().getZ()) + ")";
		assertEquals(expectedCoordinates, drone.moveDown());
	}
	
	@Test
	public void testBoundariesMoveLeftOne(){
		
		drone = new DoubleCubeDrone(new DroneOne(0, 7, 36), new DroneOne(1, 8, 36), new DroneOne(1, 8, 35), new DroneOne(2, 9, 35));
		String expectedCoordinates = "Dole desna: (" + Integer.toString(drone.gettDoleDesno().getX()) + ", " + Integer.toString(drone.gettDoleDesno().getY()) + ", " + Integer.toString(drone.gettDoleDesno().getZ()) + ")  "
					+ "Sredina desna: (" + Integer.toString(drone.gettSredinaDesno().getX()) + ", " + Integer.toString(drone.gettSredinaDesno().getY()) + ", " + Integer.toString(drone.gettSredinaDesno().getZ()) + ")  "
					+ "Sredina leva: (" + Integer.toString(drone.gettSredinaLevo().getX()) + ", " + Integer.toString(drone.gettSredinaLevo().getY()) + ", " + Integer.toString(drone.gettSredinaLevo().getZ()) + ")  "
					+ "Gore leva: (" + Integer.toString(drone.gettGoreLevo().getX()) + ", " + Integer.toString(drone.gettGoreLevo().getY()) + ", " + Integer.toString(drone.gettGoreLevo().getZ()) + ")";
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	
	@Test
	public void testBoundariesMoveLeftTwo(){
		
		drone = new DoubleCubeDrone(new DroneOne(40, 37, 36), new DroneOne(41, 38, 36), new DroneOne(41, 38, 35), new DroneOne(42, 39, 35));
		String expectedCoordinates = "Dole desna: (" + Integer.toString(drone.gettDoleDesno().getX()) + ", " + Integer.toString(drone.gettDoleDesno().getY()) + ", " + Integer.toString(drone.gettDoleDesno().getZ()) + ")  "
					+ "Sredina desna: (" + Integer.toString(drone.gettSredinaDesno().getX()) + ", " + Integer.toString(drone.gettSredinaDesno().getY()) + ", " + Integer.toString(drone.gettSredinaDesno().getZ()) + ")  "
					+ "Sredina leva: (" + Integer.toString(drone.gettSredinaLevo().getX()) + ", " + Integer.toString(drone.gettSredinaLevo().getY()) + ", " + Integer.toString(drone.gettSredinaLevo().getZ()) + ")  "
					+ "Gore leva: (" + Integer.toString(drone.gettGoreLevo().getX()) + ", " + Integer.toString(drone.gettGoreLevo().getY()) + ", " + Integer.toString(drone.gettGoreLevo().getZ()) + ")";
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	
	@Test
	public void testBoundariesMoveRightOne(){
		
		drone = new DoubleCubeDrone(new DroneOne(8, 37, 36), new DroneOne(9, 38, 36), new DroneOne(9, 38, 35), new DroneOne(10, 39, 35));
		String expectedCoordinates = "Dole desna: (" + Integer.toString(drone.gettDoleDesno().getX()) + ", " + Integer.toString(drone.gettDoleDesno().getY()) + ", " + Integer.toString(drone.gettDoleDesno().getZ()) + ")  "
					+ "Sredina desna: (" + Integer.toString(drone.gettSredinaDesno().getX()) + ", " + Integer.toString(drone.gettSredinaDesno().getY()) + ", " + Integer.toString(drone.gettSredinaDesno().getZ()) + ")  "
					+ "Sredina leva: (" + Integer.toString(drone.gettSredinaLevo().getX()) + ", " + Integer.toString(drone.gettSredinaLevo().getY()) + ", " + Integer.toString(drone.gettSredinaLevo().getZ()) + ")  "
					+ "Gore leva: (" + Integer.toString(drone.gettGoreLevo().getX()) + ", " + Integer.toString(drone.gettGoreLevo().getY()) + ", " + Integer.toString(drone.gettGoreLevo().getZ()) + ")";
		assertEquals(expectedCoordinates, drone.moveRight());
	}
	
	@Test
	public void testBoundariesRightTwo(){
		
		drone = new DoubleCubeDrone(new DroneOne(48, 7, 36), new DroneOne(49, 8, 36), new DroneOne(49, 8, 35), new DroneOne(50, 9, 35));
		String expectedCoordinates = "Dole desna: (" + Integer.toString(drone.gettDoleDesno().getX()) + ", " + Integer.toString(drone.gettDoleDesno().getY()) + ", " + Integer.toString(drone.gettDoleDesno().getZ()) + ")  "
					+ "Sredina desna: (" + Integer.toString(drone.gettSredinaDesno().getX()) + ", " + Integer.toString(drone.gettSredinaDesno().getY()) + ", " + Integer.toString(drone.gettSredinaDesno().getZ()) + ")  "
					+ "Sredina leva: (" + Integer.toString(drone.gettSredinaLevo().getX()) + ", " + Integer.toString(drone.gettSredinaLevo().getY()) + ", " + Integer.toString(drone.gettSredinaLevo().getZ()) + ")  "
					+ "Gore leva: (" + Integer.toString(drone.gettGoreLevo().getX()) + ", " + Integer.toString(drone.gettGoreLevo().getY()) + ", " + Integer.toString(drone.gettGoreLevo().getZ()) + ")";
		assertEquals(expectedCoordinates, drone.moveRight());
	}
	
	@Test
	public void testBoundariesMoveBackOne(){
		
		drone = new DoubleCubeDrone(new DroneOne(29, 27, 50), new DroneOne(30, 28, 50), new DroneOne(30, 28, 49), new DroneOne(31, 29, 49));
		String expectedCoordinates = "Dole desna: (" + Integer.toString(drone.gettDoleDesno().getX()) + ", " + Integer.toString(drone.gettDoleDesno().getY()) + ", " + Integer.toString(drone.gettDoleDesno().getZ()) + ")  "
					+ "Sredina desna: (" + Integer.toString(drone.gettSredinaDesno().getX()) + ", " + Integer.toString(drone.gettSredinaDesno().getY()) + ", " + Integer.toString(drone.gettSredinaDesno().getZ()) + ")  "
					+ "Sredina leva: (" + Integer.toString(drone.gettSredinaLevo().getX()) + ", " + Integer.toString(drone.gettSredinaLevo().getY()) + ", " + Integer.toString(drone.gettSredinaLevo().getZ()) + ")  "
					+ "Gore leva: (" + Integer.toString(drone.gettGoreLevo().getX()) + ", " + Integer.toString(drone.gettGoreLevo().getY()) + ", " + Integer.toString(drone.gettGoreLevo().getZ()) + ")";
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	@Test
	public void testBoundariesMoveBackTwo(){
		
		drone = new DoubleCubeDrone(new DroneOne(29, 27, 10), new DroneOne(30, 28, 10), new DroneOne(30, 28, 9), new DroneOne(31, 29, 9));
		String expectedCoordinates = "Dole desna: (" + Integer.toString(drone.gettDoleDesno().getX()) + ", " + Integer.toString(drone.gettDoleDesno().getY()) + ", " + Integer.toString(drone.gettDoleDesno().getZ()) + ")  "
					+ "Sredina desna: (" + Integer.toString(drone.gettSredinaDesno().getX()) + ", " + Integer.toString(drone.gettSredinaDesno().getY()) + ", " + Integer.toString(drone.gettSredinaDesno().getZ()) + ")  "
					+ "Sredina leva: (" + Integer.toString(drone.gettSredinaLevo().getX()) + ", " + Integer.toString(drone.gettSredinaLevo().getY()) + ", " + Integer.toString(drone.gettSredinaLevo().getZ()) + ")  "
					+ "Gore leva: (" + Integer.toString(drone.gettGoreLevo().getX()) + ", " + Integer.toString(drone.gettGoreLevo().getY()) + ", " + Integer.toString(drone.gettGoreLevo().getZ()) + ")";
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	@Test
	public void testBoundariesMoveForthOne(){
		
		drone = new DoubleCubeDrone(new DroneOne(9, 7, 1), new DroneOne(10, 8, 1), new DroneOne(10, 8, 0), new DroneOne(11, 9, 0));
		String expectedCoordinates = "Dole desna: (" + Integer.toString(drone.gettDoleDesno().getX()) + ", " + Integer.toString(drone.gettDoleDesno().getY()) + ", " + Integer.toString(drone.gettDoleDesno().getZ()) + ")  "
					+ "Sredina desna: (" + Integer.toString(drone.gettSredinaDesno().getX()) + ", " + Integer.toString(drone.gettSredinaDesno().getY()) + ", " + Integer.toString(drone.gettSredinaDesno().getZ()) + ")  "
					+ "Sredina leva: (" + Integer.toString(drone.gettSredinaLevo().getX()) + ", " + Integer.toString(drone.gettSredinaLevo().getY()) + ", " + Integer.toString(drone.gettSredinaLevo().getZ()) + ")  "
					+ "Gore leva: (" + Integer.toString(drone.gettGoreLevo().getX()) + ", " + Integer.toString(drone.gettGoreLevo().getY()) + ", " + Integer.toString(drone.gettGoreLevo().getZ()) + ")";
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	
	@Test
	public void testBoundariesMoveForthTwo(){
		
		drone = new DoubleCubeDrone(new DroneOne(29, 27, 41), new DroneOne(30, 28, 41), new DroneOne(30, 28, 40), new DroneOne(31, 29, 40));
		String expectedCoordinates = "Dole desna: (" + Integer.toString(drone.gettDoleDesno().getX()) + ", " + Integer.toString(drone.gettDoleDesno().getY()) + ", " + Integer.toString(drone.gettDoleDesno().getZ()) + ")  "
					+ "Sredina desna: (" + Integer.toString(drone.gettSredinaDesno().getX()) + ", " + Integer.toString(drone.gettSredinaDesno().getY()) + ", " + Integer.toString(drone.gettSredinaDesno().getZ()) + ")  "
					+ "Sredina leva: (" + Integer.toString(drone.gettSredinaLevo().getX()) + ", " + Integer.toString(drone.gettSredinaLevo().getY()) + ", " + Integer.toString(drone.gettSredinaLevo().getZ()) + ")  "
					+ "Gore leva: (" + Integer.toString(drone.gettGoreLevo().getX()) + ", " + Integer.toString(drone.gettGoreLevo().getY()) + ", " + Integer.toString(drone.gettGoreLevo().getZ()) + ")";
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	
	@Test(expected=NullPointerException.class)
	public void nullTestWithoutBoundaries() {
		FlySpace space = null;
		drone = new DoubleCubeDrone(new DroneOne(35, 48, 36, space), new DroneOne(36, 49, 36, space), new DroneOne(36, 49, 35, space), new DroneOne(37, 50, 35, space));
		drone.moveDown();
	}
	
	@Test(expected=NullPointerException.class)
	public void nullTestWithoutStartCoordinates() {
		drone = new DoubleCubeDrone(null, null, null, null);
		drone.moveUp();
	}*/
	
}
