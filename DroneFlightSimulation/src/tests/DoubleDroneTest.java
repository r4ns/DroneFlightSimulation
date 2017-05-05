package tests;
 
import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;
import space.DoubleCubeDrone;
import space.FlyClass;

public class DoubleDroneTest { 
	
	FlyClass space = new FlyClass();
	DoubleCubeDrone drone;
	int[] topMax;
	int[] topMin;
	int[] botMax;
	int[] botMin;
	
	@Test
	public void testBoundariesMoveUpOne() {
		drone = new DoubleCubeDrone(new int[] {9, 9, 9}, 1);
		topMax = drone.getUpCube().getMaxCoordinates();
		topMin = drone.getUpCube().getMinCoordinates();
		botMax = drone.getDownCube().getMaxCoordinates();
		botMin = drone.getDownCube().getMinCoordinates();
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
		topMax = drone.getUpCube().getMaxCoordinates();
		topMin = drone.getUpCube().getMinCoordinates();
		botMax = drone.getDownCube().getMaxCoordinates();
		botMin = drone.getDownCube().getMinCoordinates();
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
		topMax = drone.getUpCube().getMaxCoordinates();
		topMin = drone.getUpCube().getMinCoordinates();
		botMax = drone.getDownCube().getMaxCoordinates();
		botMin = drone.getDownCube().getMinCoordinates();
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
		topMax = drone.getUpCube().getMaxCoordinates();
		topMin = drone.getUpCube().getMinCoordinates();
		botMax = drone.getDownCube().getMaxCoordinates();
		botMin = drone.getDownCube().getMinCoordinates();
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
		topMax = drone.getUpCube().getMaxCoordinates();
		topMin = drone.getUpCube().getMinCoordinates();
		botMax = drone.getDownCube().getMaxCoordinates();
		botMin = drone.getDownCube().getMinCoordinates();
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
		topMax = drone.getUpCube().getMaxCoordinates();
		topMin = drone.getUpCube().getMinCoordinates();
		botMax = drone.getDownCube().getMaxCoordinates();
		botMin = drone.getDownCube().getMinCoordinates();
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
		topMax = drone.getUpCube().getMaxCoordinates();
		topMin = drone.getUpCube().getMinCoordinates();
		botMax = drone.getDownCube().getMaxCoordinates();
		botMin = drone.getDownCube().getMinCoordinates();
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
		topMax = drone.getUpCube().getMaxCoordinates();
		topMin = drone.getUpCube().getMinCoordinates();
		botMax = drone.getDownCube().getMaxCoordinates();
		botMin = drone.getDownCube().getMinCoordinates();
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
		topMax = drone.getUpCube().getMaxCoordinates();
		topMin = drone.getUpCube().getMinCoordinates();
		botMax = drone.getDownCube().getMaxCoordinates();
		botMin = drone.getDownCube().getMinCoordinates();
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
		topMax = drone.getUpCube().getMaxCoordinates();
		topMin = drone.getUpCube().getMinCoordinates();
		botMax = drone.getDownCube().getMaxCoordinates();
		botMin = drone.getDownCube().getMinCoordinates();
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
		topMax = drone.getUpCube().getMaxCoordinates();
		topMin = drone.getUpCube().getMinCoordinates();
		botMax = drone.getDownCube().getMaxCoordinates();
		botMin = drone.getDownCube().getMinCoordinates();
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
		topMax = drone.getUpCube().getMaxCoordinates();
		topMin = drone.getUpCube().getMinCoordinates();
		botMax = drone.getDownCube().getMaxCoordinates();
		botMin = drone.getDownCube().getMinCoordinates();
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
	public void testObstacleMoveUp() {
		drone = new DoubleCubeDrone(new int[] {5, 2, 33}, 1);
		topMax = drone.getUpCube().getMaxCoordinates();
		topMin = drone.getUpCube().getMinCoordinates();
		botMax = drone.getDownCube().getMaxCoordinates();
		botMin = drone.getDownCube().getMinCoordinates();
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
	public void testObstacleMoveDown() {
		drone = new DoubleCubeDrone(new int[] {5, 4, 33}, 1);
		topMax = drone.getUpCube().getMaxCoordinates();
		topMin = drone.getUpCube().getMinCoordinates();
		botMax = drone.getDownCube().getMaxCoordinates();
		botMin = drone.getDownCube().getMinCoordinates();
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
	public void testObstacleMoveRight() {
		drone = new DoubleCubeDrone(new int[] {4, 3, 33}, 1);
		topMax = drone.getUpCube().getMaxCoordinates();
		topMin = drone.getUpCube().getMinCoordinates();
		botMax = drone.getDownCube().getMaxCoordinates();
		botMin = drone.getDownCube().getMinCoordinates();
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
	public void testObstacleMoveLeft() {
		drone = new DoubleCubeDrone(new int[] {6, 3, 33}, 1);
		topMax = drone.getUpCube().getMaxCoordinates();
		topMin = drone.getUpCube().getMinCoordinates();
		botMax = drone.getDownCube().getMaxCoordinates();
		botMin = drone.getDownCube().getMinCoordinates();
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
	public void testObstacleMoveBack() {
		drone = new DoubleCubeDrone(new int[] {5, 3, 32}, 1);
		topMax = drone.getUpCube().getMaxCoordinates();
		topMin = drone.getUpCube().getMinCoordinates();
		botMax = drone.getDownCube().getMaxCoordinates();
		botMin = drone.getDownCube().getMinCoordinates();
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
	public void testObstacleMoveForth() {
		drone = new DoubleCubeDrone(new int[] {5, 3, 34}, 1);
		topMax = drone.getUpCube().getMaxCoordinates();
		topMin = drone.getUpCube().getMinCoordinates();
		botMax = drone.getDownCube().getMaxCoordinates();
		botMin = drone.getDownCube().getMinCoordinates();
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
}