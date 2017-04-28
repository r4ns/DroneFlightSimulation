package test;

import org.junit.Test;
import static org.junit.Assert.*;

import drone.Drone;

public class DroneAdvancedTest {
	private int[] startCoordinates={30,0,30};
	private int[] finalCoordinates={0,30,30};
	Drone dron;

	@Test
	public void testDronePathToDestination () {
		dron = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(finalCoordinates[0])+ ", " 
				+ Integer.toString(finalCoordinates[1]) + ", " 
				+ Integer.toString(finalCoordinates[2]) + ")";

		String[] dronePath = {"moveup-12", "moveright-21", "moveup-23", "moveforth-16", "moveleft-12", "moveforth-5",
				"moveleft-18", "moveup-17", "moveback-21", "moveleft-22", "movedown-20"};

		assertEquals(expectedCoordinates, helper(dronePath, dron));

	}


	public String helper(String[] dronePath, Drone drone) {
		for (String move : dronePath){
			String[] tmp = move.split("-");
			if (tmp[0].equals("moveup")){
				for (int i = 0; i < Integer.parseInt(tmp[1]); i++)
					drone.moveUp();
			}
			else if (tmp[0].equals("movedown")){
				for (int i = 0; i < Integer.parseInt(tmp[1]); i++)
					drone.moveDown();
			}
			else if (tmp[0].equals("moveleft")){
				for (int i = 0; i < Integer.parseInt(tmp[1]); i++)
					drone.moveLeft();
			}
			else if (tmp[0].equals("moveright")){
				for (int i = 0; i < Integer.parseInt(tmp[1]); i++)
					drone.moveRight();
			}
			else if (tmp[0].equals("moveforth")){
				for (int i = 0; i < Integer.parseInt(tmp[1]); i++)
					drone.moveForth();
			}
			else if (tmp[0].equals("moveback")){
				for (int i = 0; i < Integer.parseInt(tmp[1]); i++)
					drone.moveBack();
			}
		}
		System.out.println("Drone final position: "+ drone.getFormatedCoordinates());
		return drone.getFormatedCoordinates();
	}
}
