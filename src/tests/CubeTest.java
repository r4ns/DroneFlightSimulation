package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import utility.Cube;

public class CubeTest {
	Cube kocka;

	@Test
	public void testIfCoordinatesAreInCube()
	{
		
	kocka=new Cube (new int[]{10,10,10}, 5);
	assertEquals(kocka.checkCoordinates(new int[]{10,15,10}), true);
	
	}
	@Test
	public void testIfCubeIsInSomePartContainedInOtherCube()
	{

		kocka = new Cube(new int[]{4,4,4}, 5);
		Cube testKocka = new Cube(new int[]{3,3,3}, 5);
		assertEquals(kocka.checkCubeIntersection(testKocka), true);
	}
	@Test
	public void testIfCubesAreTouchingFromInsideInOnePoint()
	{
	
		kocka = new Cube(new int[]{3, 3, 3}, 10);
		
		Cube testKocka = new Cube(new int[]{2, 2, 2}, 10);
		assertEquals(kocka.checkIfCubesAreTouching(testKocka), false);
	}
	@Test
	public void testIfCubesAreTouchingFromInsideAlongOneCubeSide()
	{
	
		
		kocka = new Cube(new int[]{0,0,0}, 20);
		Cube testKocka = new Cube(new int[]{15,0,0}, 15);
		assertEquals(kocka.checkIfCubesAreTouchingFromOutside(testKocka), true);
	}
	@Test
	public void testIfCubesAreTouchingFromOutsideInOnePoint()
	{
		
		
		kocka = new Cube(new int[]{0,0,0}, 5);
		
		Cube testKocka = new Cube(new int[]{5,5,0}, 10);
		assertEquals(kocka.checkIfCubesAreTouchingFromOutside(testKocka), true);
	}
	@Test
	public void testIfCubesAreTouchingFromOutsideAlongOneCubeSide()
	{
	//implementacija
		kocka = new Cube(new int[]{0,0,0}, 10);
		
		Cube testKocka = new Cube(new int[]{10,0,0}, 10);
		assertEquals(kocka.checkIfCubesAreTouchingFromOutside(testKocka), true);
	}
	@Test
	public void testIfCubesAreTouchingFromOutside()
	{
	//sad radi test
		kocka = new Cube(new int[] {15,10,10}, 10);
	
		Cube testKocka = new Cube(new int[] {25,10,10}, 5);
		assertEquals(kocka.checkIfCubesAreTouchingFromOutside(testKocka), true);
	}
	@Test
	public void testIfCubesAreTouchingFromInside()
	{
	//ne prolazi
		kocka = new Cube(new int[]{0,0,0}, 10);
		Cube testKocka = new Cube(new int[]{1,1,1}, 9);
		assertEquals(kocka.checkIfCubesAreTouchingFromInside(testKocka), true);
	}

}