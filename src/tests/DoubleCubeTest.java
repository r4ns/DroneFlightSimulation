package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;
import space.DoubleCubeDron;
import space.FlySpace;

public class DoubleCubeTest {


	FlySpace space = new FlySpace(new int[] {0,0,0},new int[] {50,50,50},10);	
	DoubleCubeDron drone;
	

	@Test
	public void validateDronePositionAfterMoveUpFirstCase(){
		
		
		drone = new DoubleCubeDron(0,0,0,space.getBoundaries(),space.getRazmak(),1);
		drone.setCallByTest(true);
		Cube cubePartOfDroneFirst = new Cube(new int[]{drone.getX(),drone.getY()+1,drone.getZ()},1);
		Cube cubePartOfDroneSecond = new Cube(new int[]{drone.getX()+drone.getDuzinaStranice(),drone.getY()+drone.getDuzinaStranice()+1,drone.getZ()},1);
		Cube cube = new Cube(new int[]{0,2,0},1);
		
		if(cube.checkCubeIntersection(cubePartOfDroneFirst)==false && cube.checkCubeIntersection(cubePartOfDroneSecond)==false){
			
			assertTrue(drone.validateDronePositionAfter("moveUp()"));
			drone.setCallByTest(false);
		}
		
		
	}
	

	@Test
	public void validateDronePositionAfterMoveUpSecondCase(){

		drone = new DoubleCubeDron(0,0,0,space.getBoundaries(),space.getRazmak(),1);
		drone.setCallByTest(true);
		Cube cubePartOfDroneFirst = new Cube(new int[]{drone.getX(),drone.getY(),drone.getZ()},1);
		Cube cubePartOfDroneSecond = new Cube(new int[]{drone.getX()+drone.getDuzinaStranice(),drone.getY()+drone.getDuzinaStranice(),drone.getZ()},1);
		Cube cube = new Cube(new int[]{0,1,0},1);
		
		if(cube.checkCubeIntersection(cubePartOfDroneFirst)==true || cube.checkCubeIntersection(cubePartOfDroneSecond)==true){
			
			assertFalse(drone.validateDronePositionAfter("moveUp()"));
			drone.setCallByTest(false);
		}
	}

	@Test
	public void validateDronePositionAfterMoveDownFirstCase(){

		drone = new DoubleCubeDron(40,20,20,space.getBoundaries(),space.getRazmak(),1);
		drone.setCallByTest(true);
		Cube cubePartOfDroneFirst = new Cube(new int[]{drone.getX(),drone.getY()-1,drone.getZ()},1);
		Cube cubePartOfDroneSecond = new Cube(new int[]{drone.getX()+drone.getDuzinaStranice(),drone.getY()+drone.getDuzinaStranice()-1,drone.getZ()},1);
		Cube cube = new Cube(new int[]{40,18,20},1);
		
		if(cube.checkCubeIntersection(cubePartOfDroneFirst)==false && cube.checkCubeIntersection(cubePartOfDroneSecond)==false){
			
			assertTrue(drone.validateDronePositionAfter("moveDown()"));
			drone.setCallByTest(false);
		}

	}

	@Test
	public void validateDronePositionAfterMoveDownSecondCase(){

		drone = new DoubleCubeDron(40,20,20,space.getBoundaries(),space.getRazmak(),1);
		drone.setCallByTest(true);
		Cube cubePartOfDroneFirst = new Cube(new int[]{drone.getX(),drone.getY(),drone.getZ()},1);
		Cube cubePartOfDroneSecond = new Cube(new int[]{drone.getX()+drone.getDuzinaStranice(),drone.getY()+drone.getDuzinaStranice(),drone.getZ()},1);
		Cube cube = new Cube(new int[]{40,19,20},1);
		
		if(cube.checkCubeIntersection(cubePartOfDroneFirst)==true|| cube.checkCubeIntersection(cubePartOfDroneSecond)==true){
			
			assertFalse(drone.validateDronePositionAfter("moveDown()"));
			drone.setCallByTest(false);
		}

	}

	@Test
	public void validateDronePositionAfterMoveLeftFirstCase(){

		drone = new DoubleCubeDron(10,10,10,space.getBoundaries(),space.getRazmak(),1);
		drone.setCallByTest(true);
		Cube cubePartOfDroneFirst = new Cube(new int[]{drone.getX()-1,drone.getY(),drone.getZ()},1);
		Cube cubePartOfDroneSecond = new Cube(new int[]{drone.getX()+drone.getDuzinaStranice()-1,drone.getY()+drone.getDuzinaStranice(),drone.getZ()},1);
		Cube cube = new Cube(new int[]{8,10,10},1);
		
		if(cube.checkCubeIntersection(cubePartOfDroneFirst)==false && cube.checkCubeIntersection(cubePartOfDroneSecond)==false){
			
			assertTrue(drone.validateDronePositionAfter("moveLeft()"));
			drone.setCallByTest(false);
		}

	}

	@Test
	public void validateDronePositionAfterMoveLeftSecondCase(){

		drone = new DoubleCubeDron(10,10,10,space.getBoundaries(),space.getRazmak(),1);
		drone.setCallByTest(true);
		Cube cubePartOfDroneFirst = new Cube(new int[]{drone.getX(),drone.getY(),drone.getZ()},1);
		Cube cubePartOfDroneSecond = new Cube(new int[]{drone.getX()+drone.getDuzinaStranice(),drone.getY()+drone.getDuzinaStranice(),drone.getZ()},1);
		Cube cube = new Cube(new int[]{9,10,10},1);
		
		if(cube.checkCubeIntersection(cubePartOfDroneFirst)==true|| cube.checkCubeIntersection(cubePartOfDroneSecond)==true){
			
			assertFalse(drone.validateDronePositionAfter("moveDown()"));
			drone.setCallByTest(false);
		}

	}


	@Test
	public void validateDronePositionAfterMoveRightFirstCase(){

		drone = new DoubleCubeDron(10,10,10,space.getBoundaries(),space.getRazmak(),1);
		drone.setCallByTest(true);
		Cube cubePartOfDroneFirst = new Cube(new int[]{drone.getX()+1,drone.getY(),drone.getZ()},1);
		Cube cubePartOfDroneSecond = new Cube(new int[]{drone.getX()+drone.getDuzinaStranice()+1,drone.getY()+drone.getDuzinaStranice(),drone.getZ()},1);
		Cube cube = new Cube(new int[]{12,10,10},1);
		
		if(cube.checkCubeIntersection(cubePartOfDroneFirst)==false && cube.checkCubeIntersection(cubePartOfDroneSecond)==false){
			
			assertTrue(drone.validateDronePositionAfter("moveRight()"));
			drone.setCallByTest(false);
		}

	}

	@Test
	public void validateDronePositionAfterMoveRightSecondCase(){

		drone = new DoubleCubeDron(10,10,10,space.getBoundaries(),space.getRazmak(),1);
		drone.setCallByTest(true);
		Cube cubePartOfDroneFirst = new Cube(new int[]{drone.getX(),drone.getY(),drone.getZ()},1);
		Cube cubePartOfDroneSecond = new Cube(new int[]{drone.getX()+drone.getDuzinaStranice(),drone.getY()+drone.getDuzinaStranice(),drone.getZ()},1);
		Cube cube = new Cube(new int[]{11,10,10},1);
		
		if(cube.checkCubeIntersection(cubePartOfDroneFirst)==true|| cube.checkCubeIntersection(cubePartOfDroneSecond)==true){
			
			assertFalse(drone.validateDronePositionAfter("moveRight()"));
			drone.setCallByTest(false);
		}

	}


	@Test
	public void validateDronePositionAfterMoveBackFirstCase(){

		drone = new DoubleCubeDron(1,1,1,space.getBoundaries(),space.getRazmak(),1);
		drone.setCallByTest(true);
		Cube cubePartOfDroneFirst = new Cube(new int[]{drone.getX(),drone.getY(),drone.getZ()+1},1);
		Cube cubePartOfDroneSecond = new Cube(new int[]{drone.getX()+drone.getDuzinaStranice(),drone.getY()+drone.getDuzinaStranice(),drone.getZ()+1},1);
		Cube cube = new Cube(new int[]{1,1,3},1);
		
		if(cube.checkCubeIntersection(cubePartOfDroneFirst)==false && cube.checkCubeIntersection(cubePartOfDroneSecond)==false){
			
			assertTrue(drone.validateDronePositionAfter("moveBack()"));
			drone.setCallByTest(false);
		}


	}

	@Test
	public void validateDronePositionAfterMoveBackSecondCase(){

		drone = new DoubleCubeDron(10,10,10,space.getBoundaries(),space.getRazmak(),1);
		drone.setCallByTest(true);
		Cube cubePartOfDroneFirst = new Cube(new int[]{drone.getX(),drone.getY(),drone.getZ()},1);
		Cube cubePartOfDroneSecond = new Cube(new int[]{drone.getX()+drone.getDuzinaStranice(),drone.getY()+drone.getDuzinaStranice(),drone.getZ()},1);
		Cube cube = new Cube(new int[]{10,10,11},1);
		
		if(cube.checkCubeIntersection(cubePartOfDroneFirst)==true|| cube.checkCubeIntersection(cubePartOfDroneSecond)==true){
			
			assertFalse(drone.validateDronePositionAfter("moveBack()"));
			drone.setCallByTest(false);
		}
	}



	@Test
	public void validateDronePositionAfterMoveForthFirstCase(){

		drone = new DoubleCubeDron(5,5,5,space.getBoundaries(),space.getRazmak(),1);
		drone.setCallByTest(true);
		Cube cubePartOfDroneFirst = new Cube(new int[]{drone.getX(),drone.getY(),drone.getZ()-1},1);
		Cube cubePartOfDroneSecond = new Cube(new int[]{drone.getX()+drone.getDuzinaStranice(),drone.getY()+drone.getDuzinaStranice(),drone.getZ()-1},1);
		Cube cube = new Cube(new int[]{5,5,3},1);
		
		if(cube.checkCubeIntersection(cubePartOfDroneFirst)==false && cube.checkCubeIntersection(cubePartOfDroneSecond)==false){
			
			assertTrue(drone.validateDronePositionAfter("moveForth()"));
			drone.setCallByTest(false);
		}

	}

	@Test
	public void validateDronePositionAfterMoveForthSecondCase(){

		drone = new DoubleCubeDron(10,10,10,space.getBoundaries(),space.getRazmak(),1);
		drone.setCallByTest(true);
		Cube cubePartOfDroneFirst = new Cube(new int[]{drone.getX(),drone.getY(),drone.getZ()},1);
		Cube cubePartOfDroneSecond = new Cube(new int[]{drone.getX()+drone.getDuzinaStranice(),drone.getY()+drone.getDuzinaStranice(),drone.getZ()},1);
		Cube cube = new Cube(new int[]{10,10,9},1);
		
		if(cube.checkCubeIntersection(cubePartOfDroneFirst)==true|| cube.checkCubeIntersection(cubePartOfDroneSecond)==true){
			
			assertFalse(drone.validateDronePositionAfter("moveForth()"));
			drone.setCallByTest(false);
		}

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

	/*@Test
	public void testFirstCaseMoveUp(){
		
		drone = new DoubleCubeDron(9,7,35,space.getBoundaries(),space.getRazmak(),1);
		drone.setExistCubes(false);
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
		drone.setExistCubes(false);
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
		drone.setExistCubes(false);
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
		drone.setExistCubes(false);
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
		drone.setExistCubes(false);
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
		drone.setExistCubes(false);
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

	}*/



}
