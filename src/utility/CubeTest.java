package utility;

import static org.junit.Assert.*;

import org.junit.Test;

import space.DoubleCubeDrone;

public class CubeTest {

	Cube cube;
	
	
	
	
	@Test
	public void testIfCoordinatesAreInCube()
	{
		cube = new Cube(new int[]{0,0,0}, 5);
	
		assertEquals(cube.checkCoordinates(new int[]{0,5,0}), true);
	}
	@Test
	public void testIfCubeIsInSomePartContainedInOtherCube()
	{
		cube = new Cube(new int[]{3,3,3}, 5);
		
		Cube testCube = new Cube(new int[]{2,2,2}, 5);
		assertEquals(cube.checkCubeIntersection(testCube), true);
	}
	@Test
	public void testIfCubesAreTouchingFromInsideInOnePoint()
	{
		//implementacija
		cube = new Cube(new int[]{2, 2, 2}, 10);
		
		Cube testCube = new Cube(new int[]{1, 1, 1}, 10);
		assertEquals(cube.checkIfCubesAreTouching(testCube), true);
	}
	@Test
	public void testIfCubesAreTouchingFromInsideAlongOneCubeSide()
	{
		cube = new Cube(new int[] {0,0,0}, 10);
		Cube testCube = new Cube(new int[]{5,0,0}, 5);
		
		assertEquals(cube.checkIfCubesAreTouchingFromInside(testCube), true);
	}
	@Test
	public void testIfCubesAreTouchingFromOutsideInOnePoint()
	{
	
		cube = new Cube(new int[]{0,0,0}, 5);
		
		Cube testCube = new Cube(new int[]{5,5,5}, 10);
		assertEquals(cube.checkIfCubesAreTouchingFromOutside(testCube), true);
	}
	
	@Test
	public void testIfCubesAreTouchingFromOutsideAlongOneCubeSide()
	{
		cube = new Cube(new int[]{0,0,0}, 5);
		
		Cube testCube = new Cube(new int[]{5,0,0}, 5);
		assertEquals(cube.checkIfCubesAreTouchingFromOutside(testCube), true);
	}
	@Test
	public void testIfCubesAreTouchingFromOutside()
	{
		cube = new Cube(new int[] {0,0,0}, 5);
		
		Cube testCube = new Cube(new int[] {5,5,1}, 3);
		assertEquals(cube.checkIfCubesAreTouchingFromOutside(testCube), true);
	}
	@Test
	public void testIfCubesAreTouchingFromInside()
	{
		cube = new Cube(new int[]{0,0,0}, 15);
		Cube testCube = new Cube(new int[]{10,10,10}, 5);
		
		assertEquals(cube.checkIfCubesAreTouchingFromInside(testCube), true);
	}
	@Test
	public void testMoveDroneUp(){
		DoubleCubeDrone dron = new DoubleCubeDrone(new int[]{30,0,30},1);
		String expectedCoordinates = "Drone position: (30,1,30), (31,2,31)-->Drone position: (31,2,30), (32,3,31)";
		
		assertEquals(expectedCoordinates, dron.moveUp());
	}
	
	@Test
	public void testMoveDroneDown(){
		DoubleCubeDrone dron = new DoubleCubeDrone(new int[]{30,3,30},1);
		String expectedCoordinates = "Drone position: (30,2,30), (31,3,31)-->Drone position: (31,3,30), (32,4,31)";
		
		assertEquals(expectedCoordinates, dron.moveDown());
	}
	
	@Test
	public void testMoveDroneRight(){
		DoubleCubeDrone dron = new DoubleCubeDrone(new int[]{30,1,30},1);
		String expectedCoordinates = "Drone position: (31,1,30), (32,2,31)-->Drone position: (32,2,30), (33,3,31)";
		
		assertEquals(expectedCoordinates, dron.moveRight());
	}
	@Test
	public void testMoveDroneLeft(){
		DoubleCubeDrone dron = new DoubleCubeDrone(new int[]{48,25,30},1);
		String expectedCoordinates = "Drone position: (47,25,30), (48,26,31)-->Drone position: (48,26,30), (49,27,31)";
		
		assertEquals(expectedCoordinates, dron.moveLeft());
	}
	
	@Test
	public void testMoveDroneBack(){
		DoubleCubeDrone dron = new DoubleCubeDrone(new int[]{40,48,30},1);
		String expectedCoordinates = "Drone position: (40,48,29), (41,49,30)-->Drone position: (41,49,29), (42,50,30)";
		
		assertEquals(expectedCoordinates, dron.moveBack());
	}
	
	@Test
	public void testMoveDroneForth(){
		DoubleCubeDrone dron = new DoubleCubeDrone(new int[]{40,43,5},1);
		String expectedCoordinates = "Drone position: (40,43,6), (41,44,7)-->Drone position: (41,44,6), (42,45,7)";
		
		assertEquals(expectedCoordinates, dron.moveForth());
	}
	@Test
	public void testMoveDroneUpAndTouchingInsideCubeDownBoundries(){
		DoubleCubeDrone dron = new DoubleCubeDrone(new int[]{30,0,30},1);
		String expectedCoordinates = "Drone position: (18,40,29), (19,41,30)-->Drone position: (19,41,29), (20,42,30)";
		
		Object[] kretnje=
			{	"moveUp",12,
				"moveRight",21,
				"moveUp",23,
				"moveForth",16,
				"moveLeft",12,
				"moveForth",5,
				"moveLeft",18,
				"moveUp",17,
				"moveBack",21,
				"moveDown",20
				};
		
		assertEquals(expectedCoordinates, testDronePathHelper(dron,kretnje));
	}
	
	public String testDronePathHelper(DoubleCubeDrone d1,Object[] k){
		for(int i=0;i<k.length;i+=2){
			switch((String)k[i]){
			case "moveUp":
				for(int j=0;j<(int)k[i+1];j++){
					d1.moveUp();
				}
				break;
			case "moveDown":
				for(int j=0;j<(int)k[i+1];j++){
					d1.moveDown();
				}
				break;
			case "moveRight":
				for(int j=0;j<(int)k[i+1];j++){
					d1.moveRight();
				}
				break;
			case "moveLeft":
				for(int j=0;j<(int)k[i+1];j++){
					d1.moveLeft();
				}
				break;
			case "moveForth":
				for(int j=0;j<(int)k[i+1];j++){
					d1.moveForth();
				}
				break;
			case "moveBack":
				for(int j=0;j<(int)k[i+1];j++){
					d1.moveBack();
				}
				break;
			}
		}
		return d1.getFormatedCoordinates();
	}
}
