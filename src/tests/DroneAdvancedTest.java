package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneAdvancedTest {
	
	int[] startCoordinates = {30, 0, 30};
	Drone drone = new Drone(startCoordinates);
	
	@Test
	public void testPutanja1ZaKretanjeDrona() {
		int[] currentCoordinates = startCoordinates;
		String expectedCoordinates;
		
		System.out.println(String.format("Drone position: (%d,%d,%d)", currentCoordinates[0],currentCoordinates[1],currentCoordinates[2]));
		System.out.println("------Moving up------");
		helperMoving("up", 12, drone);
		currentCoordinates[1] = 10;
		expectedCoordinates = String.format("Drone position: (%d,%d,%d)", currentCoordinates[0],currentCoordinates[1],currentCoordinates[2]);
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
		
		System.out.println("------Moving right------");
		helperMoving("right", 21, drone);
		currentCoordinates[0] = 50;
		expectedCoordinates = String.format("Drone position: (%d,%d,%d)", currentCoordinates[0],currentCoordinates[1],currentCoordinates[2]);
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
		
		System.out.println("------Moving up------");
		helperMoving("up", 23, drone);
		currentCoordinates[1] = 33;
		expectedCoordinates = String.format("Drone position: (%d,%d,%d)", currentCoordinates[0],currentCoordinates[1],currentCoordinates[2]);
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
		
		System.out.println("------Moving forth------");
		helperMoving("forth", 16, drone);
		currentCoordinates[2] = 14;
		expectedCoordinates = String.format("Drone position: (%d,%d,%d)", currentCoordinates[0],currentCoordinates[1],currentCoordinates[2]);
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
		
		System.out.println("------Moving left------");
		helperMoving("left", 12, drone);
		currentCoordinates[0] = 40;
		expectedCoordinates = String.format("Drone position: (%d,%d,%d)", currentCoordinates[0],currentCoordinates[1],currentCoordinates[2]);
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
		
		System.out.println("------Moving forth------");
		helperMoving("forth", 5, drone);
		currentCoordinates[2] = 9;
		expectedCoordinates = String.format("Drone position: (%d,%d,%d)", currentCoordinates[0],currentCoordinates[1],currentCoordinates[2]);
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
		
		System.out.println("------Moving left------");
		helperMoving("left", 18, drone);
		currentCoordinates[0] = 22;
		expectedCoordinates = String.format("Drone position: (%d,%d,%d)", currentCoordinates[0],currentCoordinates[1],currentCoordinates[2]);
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
		
		System.out.println("------Moving up------");
		helperMoving("up", 17, drone);
		currentCoordinates[1] = 50;
		expectedCoordinates = String.format("Drone position: (%d,%d,%d)", currentCoordinates[0],currentCoordinates[1],currentCoordinates[2]);
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
		
		System.out.println("------Moving back------");
		helperMoving("back", 21, drone);
		currentCoordinates[2] = 30;
		expectedCoordinates = String.format("Drone position: (%d,%d,%d)", currentCoordinates[0],currentCoordinates[1],currentCoordinates[2]);
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
		
		System.out.println("------Moving left------");
		helperMoving("left", 22, drone);
		currentCoordinates[0] = 0;
		expectedCoordinates = String.format("Drone position: (%d,%d,%d)", currentCoordinates[0],currentCoordinates[1],currentCoordinates[2]);
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
		
		System.out.println("------Moving down------");
		helperMoving("down", 20, drone);
		currentCoordinates[1] = 30;
		expectedCoordinates = String.format("Drone position: (%d,%d,%d)", currentCoordinates[0],currentCoordinates[1],currentCoordinates[2]);
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
	}
	
	public void helperMoving(String move, int numOfTimes, Drone dron){
		move = move.toLowerCase();
		if(move == "up"){
			for (int i = 0; i < numOfTimes; i++) {
				System.out.println(dron.moveUp());
			}
		} else if(move == "down"){
			for (int i = 0; i < numOfTimes; i++) {
				System.out.println(dron.moveDown());
			}
		} else if(move == "left"){
			for (int i = 0; i < numOfTimes; i++) {
				System.out.println(dron.moveLeft());
			}
		} else if(move == "right"){
			for (int i = 0; i < numOfTimes; i++) {
				System.out.println(dron.moveRight());
			}
		} else if(move == "back"){
			for (int i = 0; i < numOfTimes; i++) {
				System.out.println(dron.moveBack());
			}
		} else if(move == "forth"){
			for (int i = 0; i < numOfTimes; i++) {
				System.out.println(dron.moveForth());
			}
		} 
	}
	
}
