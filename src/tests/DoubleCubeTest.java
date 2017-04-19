package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import space.DoubleCubeDron;
import space.FlySpace;

public class DoubleCubeTest {


	FlySpace space = new FlySpace(new int[]{0,0,0}, new int[] {50,50,50},10);	
	DoubleCubeDron drone;


	@Test
	public void validateDronePositionAfterMoveUpFirstCase(){

		drone = new DoubleCubeDron(39,8,39,space.getBoundaries(),space.getRazmak(),1);
		assertTrue(drone.validateDronePositionAfter("moveUp()"));
	}

	@Test
	public void validateDronePositionAfterMoveUpSecondCase(){

		drone = new DoubleCubeDron(39,9,20,space.getBoundaries(),space.getRazmak(),1);
		assertFalse(drone.validateDronePositionAfter("moveUp()"));
	}

	@Test
	public void validateDronePositionAfterMoveDownFirstCase(){

		drone = new DoubleCubeDron(40,20,20,space.getBoundaries(),space.getRazmak(),1);
		assertTrue(drone.validateDronePositionAfter("moveDown()"));

	}

	@Test
	public void validateDronePositionAfterMoveDownSecondCase(){

		drone = new DoubleCubeDron(30,40,30,space.getBoundaries(),space.getRazmak(),1);
		assertFalse(drone.validateDronePositionAfter("moveDown()"));

	}

	@Test
	public void validateDronePositionAfterMoveLeftFirstCase(){

		drone = new DoubleCubeDron(41,20,15,space.getBoundaries(),space.getRazmak(),1);
		assertTrue(drone.validateDronePositionAfter("moveLeft()"));

	}

	@Test
	public void validateDronePositionAfterMoveLeftSecondCase(){

		drone = new DoubleCubeDron(40,30,30,space.getBoundaries(),space.getRazmak(),1);
		assertFalse(drone.validateDronePositionAfter("moveLeft()"));

	}



	@Test
	public void validateDronePositionAfterMoveRightFirstCase(){

		drone = new DoubleCubeDron(30,9,15,space.getBoundaries(),space.getRazmak(),1);
		assertTrue(drone.validateDronePositionAfter("moveRight()"));

	}

	@Test
	public void validateDronePositionAfterMoveRightSecondCase(){

		drone = new DoubleCubeDron(48,9,15,space.getBoundaries(),space.getRazmak(),1);
		assertFalse(drone.validateDronePositionAfter("moveRight()"));

	}


	@Test
	public void validateDronePositionAfterMoveBackFirstCase(){

		drone = new DoubleCubeDron(15,15,8,space.getBoundaries(),space.getRazmak(),1);
		assertTrue(drone.validateDronePositionAfter("moveBack()"));

	}

	@Test
	public void validateDronePositionAfterMoveBackSecondCase(){

		drone = new DoubleCubeDron(30,30,10,space.getBoundaries(),space.getRazmak(),1);
		assertFalse(drone.validateDronePositionAfter("moveBack()"));

	}



	@Test
	public void validateDronePositionAfterMoveForthFirstCase(){

		drone = new DoubleCubeDron(38,11,41,space.getBoundaries(),space.getRazmak(),1);
		assertTrue(drone.validateDronePositionAfter("moveForth()"));

	}

	@Test
	public void validateDronePositionAfterMoveForthSecondCase(){

		drone = new DoubleCubeDron(30,30,40,space.getBoundaries(),space.getRazmak(),1);
		assertFalse(drone.validateDronePositionAfter("moveForth()"));

	}


	@Test(expected=NullPointerException.class)
	public void testNullBoundaries(){

		drone = new DoubleCubeDron(9,7,35,null,space.getRazmak(),1);
		drone.moveUp();

	}

	@Test(expected=NullPointerException.class)

	public void testNullCoordinates(){

		drone = new DoubleCubeDron(null,space.getBoundaries(),space.getRazmak(),1);
		drone.moveUp();
	}

	@Test
	public void testFirstCaseMoveUp(){

		drone = new DoubleCubeDron(9,7,35,space.getBoundaries(),space.getRazmak(),1);
		int x=drone.getX();
		int y=drone.getY()+1;
		int z= drone.getZ();
		int duzinaStranice=drone.getDuzinaStranice();
		String expectedCoordinates = "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";
		assertEquals(expectedCoordinates,drone.moveUp());

	}

	@Test
	public void testSecondCaseMoveUp(){

		drone = new DoubleCubeDron(39,8,39,space.getBoundaries(),space.getRazmak(),1);
		int x=drone.getX();
		int y=drone.getY()+1;
		int z= drone.getZ();
		int duzinaStranice=drone.getDuzinaStranice();
		String expectedCoordinates = "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";
		assertEquals(expectedCoordinates,drone.moveUp());

	}

	@Test
	public void testThirdCaseMoveUp(){

		drone = new DoubleCubeDron(9,39,10,space.getBoundaries(),space.getRazmak(),1);
		int x=drone.getX();
		int y=drone.getY()+1;
		int z= drone.getZ();
		int duzinaStranice=drone.getDuzinaStranice();
		String expectedCoordinates = "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";
		assertEquals(expectedCoordinates,drone.moveUp());

	}

	@Test
	public void testFirstCaseMoveDown(){

		drone = new DoubleCubeDron(39,0,10,space.getBoundaries(),space.getRazmak(),1);
		int x=drone.getX();
		int y=drone.getY();
		int z= drone.getZ();
		int duzinaStranice=drone.getDuzinaStranice();
		String expectedCoordinates = "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";
		assertEquals(expectedCoordinates,drone.moveDown());

	}

	@Test
	public void testSecondCaseMoveDown(){

		drone = new DoubleCubeDron(40,40,10,space.getBoundaries(),space.getRazmak(),1);
		int x=drone.getX();
		int y=drone.getY()-1;
		int z= drone.getZ();
		int duzinaStranice=drone.getDuzinaStranice();
		String expectedCoordinates = "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";
		assertEquals(expectedCoordinates,drone.moveDown());

	}

	@Test
	public void testThirdCaseMoveDown(){

		drone = new DoubleCubeDron(15,40,15,space.getBoundaries(),space.getRazmak(),1);
		int x=drone.getX();
		int y=drone.getY();
		int z= drone.getZ();
		int duzinaStranice=drone.getDuzinaStranice();
		String expectedCoordinates = "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";
		assertEquals(expectedCoordinates,drone.moveDown());

	}

	@Test
	public void testFirstCaseMoveLeft(){

		drone = new DoubleCubeDron(39,9,39,space.getBoundaries(),space.getRazmak(),1);
		int x=drone.getX();
		int y=drone.getY();
		int z= drone.getZ();
		int duzinaStranice=drone.getDuzinaStranice();
		String expectedCoordinates = "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";
		assertEquals(expectedCoordinates,drone.moveLeft());

	}

	@Test
	public void testSecondCaseMoveLeft(){

		drone = new DoubleCubeDron(0,39,15,space.getBoundaries(),space.getRazmak(),1);
		int x=drone.getX();
		int y=drone.getY();
		int z= drone.getZ();
		int duzinaStranice=drone.getDuzinaStranice();
		String expectedCoordinates = "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";
		assertEquals(expectedCoordinates,drone.moveLeft());

	}

	@Test
	public void testThirdCaseMoveLeft(){

		drone = new DoubleCubeDron(40,20,15,space.getBoundaries(),space.getRazmak(),1);
		int x=drone.getX();
		int y=drone.getY();
		int z= drone.getZ();
		int duzinaStranice=drone.getDuzinaStranice();
		String expectedCoordinates = "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";
		assertEquals(expectedCoordinates,drone.moveLeft());

	}

	@Test
	public void testFirstCaseMoveRight(){

		drone = new DoubleCubeDron(48,9,15,space.getBoundaries(),space.getRazmak(),1);
		int x=drone.getX();
		int y=drone.getY();
		int z= drone.getZ();
		int duzinaStranice=drone.getDuzinaStranice();
		String expectedCoordinates = "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";
		assertEquals(expectedCoordinates,drone.moveRight());

	}

	@Test
	public void testSecondCaseMoveRight(){

		drone = new DoubleCubeDron(9,39,15,space.getBoundaries(),space.getRazmak(),1);
		int x=drone.getX();
		int y=drone.getY();
		int z= drone.getZ();
		int duzinaStranice=drone.getDuzinaStranice();
		String expectedCoordinates = "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";
		assertEquals(expectedCoordinates,drone.moveRight());

	}

	@Test
	public void testThirdCaseMoveRight(){

		drone = new DoubleCubeDron(8,15,15,space.getBoundaries(),space.getRazmak(),1);
		int x=drone.getX();
		int y=drone.getY();
		int z= drone.getZ();
		int duzinaStranice=drone.getDuzinaStranice();
		String expectedCoordinates = "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";
		assertEquals(expectedCoordinates,drone.moveRight());

	}


	@Test
	public void testFirstCaseMoveBack(){

		drone = new DoubleCubeDron(39,9,49,space.getBoundaries(),space.getRazmak(),1);
		int x=drone.getX();
		int y=drone.getY();
		int z= drone.getZ();
		int duzinaStranice=drone.getDuzinaStranice();
		String expectedCoordinates = "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";
		assertEquals(expectedCoordinates,drone.moveBack());

	}

	@Test
	public void testSecondCaseMoveBack(){

		drone = new DoubleCubeDron(15,15,9,space.getBoundaries(),space.getRazmak(),1);
		int x=drone.getX();
		int y=drone.getY();
		int z= drone.getZ();
		int duzinaStranice=drone.getDuzinaStranice();
		String expectedCoordinates = "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";
		assertEquals(expectedCoordinates,drone.moveBack());

	}

	@Test
	public void testFirstCaseMoveForth(){

		drone = new DoubleCubeDron(39,9,0,space.getBoundaries(),space.getRazmak(),1);
		int x=drone.getX();
		int y=drone.getY();
		int z= drone.getZ();
		int duzinaStranice=drone.getDuzinaStranice();
		String expectedCoordinates = "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";
		assertEquals(expectedCoordinates,drone.moveForth());

	}

	@Test
	public void testSecondCaseMoveForth(){

		drone = new DoubleCubeDron(38,11,40,space.getBoundaries(),space.getRazmak(),1);
		int x=drone.getX();
		int y=drone.getY();
		int z= drone.getZ();
		int duzinaStranice=drone.getDuzinaStranice();
		String expectedCoordinates = "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";
		assertEquals(expectedCoordinates,drone.moveForth());

	}



}
