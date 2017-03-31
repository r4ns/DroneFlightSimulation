package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import drone.StandardDrone;
import space.DoubleCubeDrone;
import space.DroneTacka;
import space.FlySpace;

public class CubeDroneTest {
	@Test
	public void testGranicniUp1(){

		int[] startCoordinates = {39,8,39};
		
		DoubleCubeDrone d = new DoubleCubeDrone(startCoordinates);
		
		helperMoveUp(5, d);
		
		assertEquals(d.getFormatedCoordinates(), "(39,9,39) ");
	}
	
	
	@Test
	public void testGranicniUp2(){

		int[] startCoordinates = {9,7,35};
		
		DoubleCubeDrone d = new DoubleCubeDrone(startCoordinates);
		
		helperMoveUp(5, d);
		
		assertEquals(d.getFormatedCoordinates(), "(9,8,35) ");
	}
	
	@Test
	public void testGranicniDown1(){

		int[] startCoordinates = {39,41,39};
		
		DoubleCubeDrone d = new DoubleCubeDrone(startCoordinates);
		
		helperMoveDown(5, d);
		
		assertEquals(d.getFormatedCoordinates(), "(39,40,39) ");
	}
	
	
	@Test
	public void testGranicnDown2(){

		int[] startCoordinates = {9,41,35};
		
		DoubleCubeDrone d = new DoubleCubeDrone(startCoordinates);
		
		helperMoveDown(5, d);
		
		assertEquals(d.getFormatedCoordinates(), "(9,39,35) ");
	}
	
	
	
	@Test
	public void testGranicniRight1(){

		int[] startCoordinates = {8,39,39};
		
		DoubleCubeDrone d = new DoubleCubeDrone(startCoordinates);
		
		helperMoveRight(5, d);
		
		assertEquals(d.getFormatedCoordinates(), "(9,39,39) ");
	}
	
	@Test
	public void testGranicniRight2(){

		int[] startCoordinates = {7,9,39};
		
		DoubleCubeDrone d = new DoubleCubeDrone(startCoordinates);
		
		helperMoveRight(5, d);
		
		assertEquals(d.getFormatedCoordinates(), "(8,9,39) ");
	}
	
	
	@Test
	public void testGranicniLeft1(){

		int[] startCoordinates = {41,39,39};
		
		DoubleCubeDrone d = new DoubleCubeDrone(startCoordinates);
		
		helperMoveLeft(5, d);
		
		assertEquals(d.getFormatedCoordinates(), "(40,39,39) ");
	}
	
	@Test
	public void testGranicniLeft2(){

		int[] startCoordinates = {41,9,39};
		
		DoubleCubeDrone d = new DoubleCubeDrone(startCoordinates);
		
		helperMoveLeft(5, d);
		
		assertEquals(d.getFormatedCoordinates(), "(39,9,39) ");
	}
	
	@Test
	public void testGranicniForth1(){

		int[] startCoordinates = {39,39,42};
		
		DoubleCubeDrone d = new DoubleCubeDrone(startCoordinates);
		
		helperMoveForth(5, d);
		
		assertEquals(d.getFormatedCoordinates(), "(39,39,41) ");
	}
	
	@Test
	public void testGranicniForth2(){

		int[] startCoordinates = {9,39,42};
		
		DoubleCubeDrone d = new DoubleCubeDrone(startCoordinates);
		
		helperMoveForth(5, d);
		
		assertEquals(d.getFormatedCoordinates(), "(9,39,37) ");
	}
	
	@Test
	public void testGranicniBack1(){

		int[] startCoordinates = {39,39,9};
		
		DoubleCubeDrone d = new DoubleCubeDrone(startCoordinates);
		
		helperMoveBack(5, d);
		
		assertEquals(d.getFormatedCoordinates(), "(39,39,10) ");
	}
	
	
	@Test
	public void testGranicniBack2(){

		int[] startCoordinates = {9,39,8};
		
		DoubleCubeDrone d = new DoubleCubeDrone(startCoordinates);
		
		helperMoveBack(5, d);
		
		assertEquals(d.getFormatedCoordinates(), "(9,39,13) ");
	}
	
	
	@Test
	public void testNullKoordinate(){

		
		
		DoubleCubeDrone d = new DoubleCubeDrone();
		
		assertEquals(d.getFormatedCoordinates(), "(30,0,30) ");
	}
	
	@Test
	public void testNullGranice(){

		
		
		DoubleCubeDrone d = new DoubleCubeDrone();
		
		
		assertEquals(d.space.getOkvir()[0], 50);
	}
	
	public void helperMoveUp(int n,DoubleCubeDrone drone ){
		for(int i = 0; i < n; i++){
			drone.moveUp();
		}
	}
	
	public void helperMoveDown(int n,DoubleCubeDrone drone){
		for(int i = 0; i < n; i++){
			drone.moveDown();
		}
	}
	
	public void helperMoveRight(int n,DoubleCubeDrone drone){
		for(int i = 0; i < n; i++){
			drone.moveRight();
		}
	}
	
	public void helperMoveLeft(int n,DoubleCubeDrone drone){
		for(int i = 0; i < n; i++){
			drone.moveLeft();
		}
	}
	
	public void helperMoveForth(int n,DoubleCubeDrone drone){
		for(int i = 0; i < n; i++){
			drone.moveForth();
		}
	}
	
	public void helperMoveBack(int n,DoubleCubeDrone drone){
		for(int i = 0; i < n; i++){
			drone.moveBack();
		}
	}
	
	
	
}
