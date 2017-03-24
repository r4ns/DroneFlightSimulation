package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import drone.Drone;

public class DroneAdvancedTest {
	
	//private int[] boundariers = {50,50,50};
	private int[] startCoordinates = {30,0,30};

	Drone drone  = new Drone(startCoordinates);
	
	@Test
	public void testKretanjeDronaPutanja1(){

		String expectedCoordinates;
		System.out.println(drone.getFormatedCoordinates() + "//start");
		int[] Coordinates = this.startCoordinates;
		
		System.out.println("----Moving up----");
		helperMoveUp(12);
		Coordinates[1]+=10;
		expectedCoordinates = String.format("My position is: (%d,%d,%d) ", Coordinates[0],Coordinates[1],Coordinates[2]);
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
		
		 	
		System.out.println("----Moving right----");
		helperMoveRight(21);
		Coordinates[0]+=20;
		expectedCoordinates = String.format("My position is: (%d,%d,%d) ", Coordinates[0],Coordinates[1],Coordinates[2]);
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
		
		
		System.out.println("----Moving up----");
		helperMoveUp(23);
		Coordinates[1]+=23;
		expectedCoordinates = String.format("My position is: (%d,%d,%d) ", Coordinates[0],Coordinates[1],Coordinates[2]);
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
		
		
		System.out.println("----Moving forth----");
		helperMoveForth(16);
		Coordinates[2]-=16;
		expectedCoordinates = String.format("My position is: (%d,%d,%d) ", Coordinates[0],Coordinates[1],Coordinates[2]);
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
		
		
		System.out.println("----Moving left----");
		helperMoveLeft(12);
		Coordinates[0]=40;
		expectedCoordinates = String.format("My position is: (%d,%d,%d) ", Coordinates[0],Coordinates[1],Coordinates[2]);
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
		
		
		System.out.println("----Moving forth----");
		helperMoveForth(5);
		Coordinates[2]-=5;
		expectedCoordinates = String.format("My position is: (%d,%d,%d) ", Coordinates[0],Coordinates[1],Coordinates[2]);
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
		
		
		System.out.println("----Moving left----");
		helperMoveLeft(18);
		Coordinates[0]-=18;
		expectedCoordinates = String.format("My position is: (%d,%d,%d) ", Coordinates[0],Coordinates[1],Coordinates[2]);
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
		
		
		System.out.println("----Moving up----");
		helperMoveUp(17);
		Coordinates[1]+=17;
		expectedCoordinates = String.format("My position is: (%d,%d,%d) //udario", Coordinates[0],Coordinates[1],Coordinates[2]);
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
		
		
		System.out.println("----Moving back----");
		helperMoveBack(21);
		Coordinates[2]+=21;
		expectedCoordinates = String.format("My position is: (%d,%d,%d) ", Coordinates[0],Coordinates[1],Coordinates[2]);
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
		
		
		System.out.println("----Moving left----");
		helperMoveLeft(22);
		Coordinates[0]-=22;
		expectedCoordinates = String.format("My position is: (%d,%d,%d) //udario", Coordinates[0],Coordinates[1],Coordinates[2]);
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
		
		
		System.out.println("----Moving down----");
		helperMoveDown(20);
		Coordinates[1]-=20;
		expectedCoordinates = String.format("My position is: (%d,%d,%d) //stigao na cilj", Coordinates[0],Coordinates[1],Coordinates[2]);
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
		
	}
	
	public void helperMoveUp(int n){
		for(int i = 0; i < n; i++){
			System.out.println(drone.moveUp());
		}
	}
	
	public void helperMoveDown(int n){
		for(int i = 0; i < n; i++){
			System.out.println(drone.moveDown());
		}
	}
	
	public void helperMoveRight(int n){
		for(int i = 0; i < n; i++){
			System.out.println(drone.moveRight());
		}
	}
	
	public void helperMoveLeft(int n){
		for(int i = 0; i < n; i++){
			System.out.println(drone.moveLeft());
		}
	}
	
	public void helperMoveForth(int n){
		for(int i = 0; i < n; i++){
			System.out.println(drone.moveForth());
		}
	}
	
	public void helperMoveBack(int n){
		for(int i = 0; i < n; i++){
			System.out.println(drone.moveBack());
		}
	}
	
}
