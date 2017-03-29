package test;

import org.junit.Test;
import static org.junit.Assert.*;

import drone.Drone;

public class DroneBasicTest {

	private int[] startCoordinates={30,0,30};
	Drone dron;

	@Test
	public void testInitialMoveUp () {
		dron = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(startCoordinates[0])+ ", " 
				+ Integer.toString(startCoordinates[1] + 1) + ", " 
				+ Integer.toString(startCoordinates[2]) + ")";

		assertEquals(expectedCoordinates, dron.moveUp());
	}

	@Test
	public void testInitialMoveDown () {
		dron = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(startCoordinates[0])+ ", " 
				+ Integer.toString(startCoordinates[1]) + ", " 
				+ Integer.toString(startCoordinates[2]) + ")";

		dron.moveUp();

		assertEquals(expectedCoordinates, dron.moveDown());
	}

	@Test
	public void testInitialMoveRight () {
		dron = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(startCoordinates[0] + 1)+ ", " 
				+ Integer.toString(startCoordinates[1]) + ", " 
				+ Integer.toString(startCoordinates[2]) + ")";

		assertEquals(expectedCoordinates, dron.moveRight());
	}

	@Test
	public void testInitialMoveLeft () {
		dron = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(startCoordinates[0] - 1)+ ", " 
				+ Integer.toString(startCoordinates[1]) + ", " 
				+ Integer.toString(startCoordinates[2]) + ")";

		assertEquals(expectedCoordinates, dron.moveLeft());
	}

	@Test
	public void testInitialMoveForth () {
		dron = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(startCoordinates[0])+ ", " 
				+ Integer.toString(startCoordinates[1]) + ", " 
				+ Integer.toString(startCoordinates[2] - 1) + ")";

		assertEquals(expectedCoordinates, dron.moveForth());
	}

	@Test
	public void testInitialMoveBack () {
		dron = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(startCoordinates[0])+ ", " 
				+ Integer.toString(startCoordinates[1]) + ", " 
				+ Integer.toString(startCoordinates[2] + 1) + ")";

		assertEquals(expectedCoordinates, dron.moveBack());
	}

	//testiranje granica

	@Test
	public void testLimitMoveUp () {
		dron = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(startCoordinates[0])+ ", " 
				+ Integer.toString(startCoordinates[1] + 10) + ", " 
				+ Integer.toString(startCoordinates[2]) + ")";

		assertEquals(expectedCoordinates, helper(dron, 60, "moveup"));
	}

	@Test
	public void testLimitMoveDown () {
		dron = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(startCoordinates[0])+ ", " 
				+ Integer.toString(startCoordinates[1]) + ", " 
				+ Integer.toString(startCoordinates[2]) + ")";

		assertEquals(expectedCoordinates, helper(dron, 60, "movedown"));
	}

	@Test
	public void testLimitMoveRight () {
		dron = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(startCoordinates[0] + 20)+ ", " 
				+ Integer.toString(startCoordinates[1]) + ", " 
				+ Integer.toString(startCoordinates[2]) + ")";

		assertEquals(expectedCoordinates, helper(dron, 60, "moveright"));
	}

	@Test
	public void testLimitMoveLeft () {
		dron = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(startCoordinates[0] - 30)+ ", " 
				+ Integer.toString(startCoordinates[1]) + ", " 
				+ Integer.toString(startCoordinates[2]) + ")";

		assertEquals(expectedCoordinates, helper(dron, 60, "moveleft"));
	}

	@Test
	public void testLimitMoveForth () {
		dron = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(startCoordinates[0])+ ", " 
				+ Integer.toString(startCoordinates[1]) + ", " 
				+ Integer.toString(startCoordinates[2] - 30) + ")";

		assertEquals(expectedCoordinates, helper(dron, 60, "moveforth"));
	}

	@Test
	public void testLimitMoveBack () {
		dron = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(startCoordinates[0])+ ", " 
				+ Integer.toString(startCoordinates[1]) + ", " 
				+ Integer.toString(startCoordinates[2] + 20) + ")";

		assertEquals(expectedCoordinates, helper(dron, 60, "moveback"));
	}
	
	public String helper(Drone drone, int moves, String direction) {
			
			if (direction.equals("moveup")){
				for (int i = 0; i < moves; i++)
					drone.moveUp();
			}
			else if (direction.equals("movedown")){
				for (int i = 0; i < moves; i++)
					drone.moveDown();
			}
			else if (direction.equals("moveleft")){
				for (int i = 0; i < moves; i++)
					drone.moveLeft();
			}
			else if (direction.equals("moveright")){
				for (int i = 0; i < moves; i++)
					drone.moveRight();
			}
			else if (direction.equals("moveforth")){
				for (int i = 0; i < moves; i++)
					drone.moveForth();
			}
			else if (direction.equals("moveback")){
				for (int i = 0; i < moves; i++)
					drone.moveBack();
			}
		
		System.out.println("Drone final position: "+ drone.getFormatedCoordinates());
		return drone.getFormatedCoordinates();
	}

}
