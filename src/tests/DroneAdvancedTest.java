package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import drone.Drone;

public class DroneAdvancedTest {
	
	private int[] destinationCoordinates = { 0, 30, 30 };
	Drone drone;
	
	@Test
	public void testMoveToDestination(){
		drone = new Drone();
		String expectedOutput =  "Drone position: x:" +Integer.toString(destinationCoordinates[0]) + " y:" + Integer.toString(destinationCoordinates[1]) + " z:" + Integer.toString(destinationCoordinates[2]);
		String[] methodList = { "MoveUp-12", "MoveRight-21", "MoveUp-23", "MoveForth-16", "MoveLeft-12", "MoveForth-5",
				"MoveLeft-18", "MoveUp-17", "MoveBack-21", "MoveLeft-22", "MoveDown-20" };
		assertEquals(expectedOutput, helperDrone(methodList, drone));
	}
	
	
	private String helperDrone(String[] methodList, Drone targetDrone) {

		for (String method : methodList) {
			String[] tmp = method.split("-");
			switch (tmp[0].toLowerCase()) {
			case "moveup":
				for (int i = 0; i < Integer.parseInt(tmp[1]); i++)
					targetDrone.moveUp();
				break;
			case "movedown":
				for (int i = 0; i < Integer.parseInt(tmp[1]); i++)
					targetDrone.moveDown();
				break;
			case "moveleft":
				for (int i = 0; i < Integer.parseInt(tmp[1]); i++)
					targetDrone.moveLeft();
				break;
			case "moveright":
				for (int i = 0; i < Integer.parseInt(tmp[1]); i++)
					targetDrone.moveRight();
				break;
			case "moveforth":
				for (int i = 0; i < Integer.parseInt(tmp[1]); i++)
					targetDrone.moveForth();
				break;
			case "moveback":
				for (int i = 0; i < Integer.parseInt(tmp[1]); i++)
					targetDrone.moveBack();
				break;
			}
		}
		System.out.println("Drone finished at - " + targetDrone.getFormatedCoordinates());
		return targetDrone.getFormatedCoordinates();
	}

}
