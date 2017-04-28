package tests;
 
import org.junit.Test;
import static org.junit.Assert.*;

import drone.Cube;

import space.DoubleCubeDrone;
import space.FlyClass;

public class CubeTest {
	Cube cube;    
	int[] coordinates;
	@Test  
	public void testIfCoordinatesAreInCube()  {  
		//implementacija
		coordinates=new int[]{10,10,10};
		cube = new Cube(new int[]{0,0,0},20);
		assertTrue(cube.checkCoordinates(coordinates));
		
		}    
	@Test  
	public void testIfCubeIsInSomePartContainedInOtherCube()  
	{ //implementacija 
		cube = new Cube(new int[]{31,20,30},1);
		Cube cube1 = new Cube(new int[]{10,10,10},30);
		assertTrue(cube1.checkCubeIntersection(cube));
	}     
	@Test  
	public void testIfCubesAreTouchingFromInsideInOnePoint()  {  
		//implementacija  
		cube = new Cube(new int[] {0,0,0},30);
		Cube cube1 = new Cube(new int[]{10,10,10},20);
		assertTrue(cube.checkIfCubesAreTouchingFromInside(cube1));
		}    
	@Test  public void testIfCubesAreTouchingFromInsideAlongOneCubeSide()  
	{   //implementacija 
		cube = new Cube(new int[] {0,0,0},30);
		Cube cube1 = new Cube(new int[]{10,0,10},20);
		assertTrue(cube.checkIfCubesAreTouchingFromInside(cube1));
			
	}    
	@Test  
	public void testIfCubesAreTouchingFromOutsideInOnePoint()  { 
		//implementacija 
		cube = new Cube(new int[]{0,0,0},20);
		Cube cube1 = new Cube(new int[]{20,20,20},20);
		assertTrue(cube.checkIfCubesAreTouchingFromOutside(cube1));
		} 
	@Test  
	public void testIfCubesAreTouchingFromOutsideAlongOneCubeSide()  {   
		//implementacija 
		cube = new Cube(new int[]{0,0,0},20);
		Cube cube1 = new Cube(new int[]{20,0,0},20);
		assertTrue(cube.checkIfCubesAreTouchingFromOutside(cube1));
		}    
	@Test  public void testIfCubesAreTouchingFromOutside()  {   
		//implementacija  
		cube = new Cube(new int[]{0,0,0},20);
		Cube cube1 = new Cube(new int[]{20,20,0},20);
		assertTrue(cube.checkIfCubesAreTouchingFromOutside(cube1));
		}    
	@Test  public void testIfCubesAreTouchingFromInside()  {   
		//implementacija  
		cube = new Cube(new int[] {0,0,0},30);
		Cube cube1 = new Cube(new int[]{10,10,10},20);
		assertTrue(cube.checkIfCubesAreTouchingFromInside(cube1));
		} 
}