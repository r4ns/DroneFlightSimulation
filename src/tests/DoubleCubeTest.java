package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import space.DoubleCubeDron;
import space.FlySpace;

public class DoubleCubeTest {
	
	
	FlySpace space = new FlySpace(new int[] {50,50,50},10);
	
	DoubleCubeDron drone;
	
	/*@Test
	public void testLowerFirstCaseMoveUp(){
		
		drone = new DoubleCubeDron(9,7,35,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveUp());
		
	}
	
	//moveUp
	@Test
	public void testLowerSecondCaseMoveUp(){
		
		drone = new DoubleCubeDron(39,9,35,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveUp());
		
	}
	
	@Test
	public void testUpperCaseMoveUp(){
		
		drone = new DoubleCubeDron(15,48,12,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveUp());
		
	}
	
	@Test
	public void testLeftCaseMoveUp(){
		
		drone = new DoubleCubeDron(8,48,12,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveUp());
		
	}
	
	@Test
	public void testRightCaseMoveUp(){
		
		drone = new DoubleCubeDron(42,48,12,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveUp());
		
	}
	
	@Test
	public void testForwardCaseMoveUp(){
		
		drone = new DoubleCubeDron(13,48,45,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveUp());
		
	}
	
	@Test
	public void testBackCaseMoveUp(){
		
		drone = new DoubleCubeDron(13,48,5,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveUp());
		
	}
	
	
	
	//moveDown
	
	@Test
	public void testLowerCaseMoveDown(){
		
		drone = new DoubleCubeDron(13,0,15,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveDown());
		
	}
	
	@Test
	public void testUpperCaseMoveDown(){
		
		drone = new DoubleCubeDron(13,40,15,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveDown());
		
	}
	
	@Test
	public void testLeftCaseMoveDown(){
		
		drone = new DoubleCubeDron(5,0,15,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveDown());
		
	}
	
	@Test
	public void testRightCaseMoveDown(){
		
		drone = new DoubleCubeDron(42,0,15,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveDown());
		
	}
	
	@Test
	public void testForwardCaseMoveDown(){
		
		drone = new DoubleCubeDron(15,0,45,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveDown());
		
	}
	
	@Test
	public void testBackCaseMoveDown(){
		
		drone = new DoubleCubeDron(15,0,5,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveDown());
		
	}
	
	
	//moveLeft
	
	@Test
	public void testLowerCaseMoveLeft(){
		
		drone = new DoubleCubeDron(0,5,15,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveLeft());
		
	}
	
	@Test
	public void testUpperCaseMoveLeft(){
		
		drone = new DoubleCubeDron(0,45,15,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveLeft());
		
	}
	
	@Test
	public void testLeftCaseMoveLeft(){
		
		drone = new DoubleCubeDron(0,15,15,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveLeft());
		
	}
	
	@Test
	public void testRightCaseMoveLeft(){
		
		drone = new DoubleCubeDron(40,15,15,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveLeft());
		
	}
	
	@Test
	public void testForwardCaseMoveLeft(){
		
		drone = new DoubleCubeDron(0,15,42,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveLeft());
		
	}
	
	@Test
	public void testBackCaseMoveLeft(){
		
		drone = new DoubleCubeDron(0,15,5,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveLeft());
		
	}
	
	//moveRight
	
	@Test
	public void testLowerCaseMoveRight(){
		
		drone = new DoubleCubeDron(48,5,15,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveRight());
		
	}
	
	@Test
	public void testUpperCaseMoveRight(){
		
		drone = new DoubleCubeDron(48,45,15,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveRight());
		
	}
	
	@Test
	public void testLeftCaseMoveRight(){
		
		drone = new DoubleCubeDron(8,15,15,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveRight());
		
	}
	
	@Test
	public void testRightCaseMoveRight(){
		
		drone = new DoubleCubeDron(48,15,15,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveRight());
		
	}
	
	@Test
	public void testForwardCaseMoveRight(){
		
		drone = new DoubleCubeDron(48,15,42,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveRight());
		
	}
	
	@Test
	public void testBackCaseMoveRight(){
		
		drone = new DoubleCubeDron(48,15,5,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveRight());
		
	}
	
	//moveBack
	
	@Test
	public void testLowerCaseMoveBack(){
		
		drone = new DoubleCubeDron(0,5,49,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveBack());
		
	}
	
	@Test
	public void testUpperCaseMoveBack(){
		
		drone = new DoubleCubeDron(0,45,49,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveBack());
		
	}
	
	@Test
	public void testLeftCaseMoveBack(){
		
		drone = new DoubleCubeDron(0,15,49,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveBack());
		
	}
	
	@Test
	public void testRightCaseMoveBack(){
		
		drone = new DoubleCubeDron(40,15,49,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveBack());
		
	}
	
	@Test
	public void testForwardCaseMoveBack(){
		
		drone = new DoubleCubeDron(0,15,49,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveBack());
		
	}
	
	@Test
	public void testBackCaseMoveBack(){
		
		drone = new DoubleCubeDron(15,15,9,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveBack());
		
	}
	
	//moveForth
	
	@Test
	public void testLowerCaseMoveForth(){
		
		drone = new DoubleCubeDron(0,5,1,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveForth());
		
	}
	
	@Test
	public void testUpperCaseMoveForth(){
		
		drone = new DoubleCubeDron(0,45,1,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveForth());
		
	}
	
	@Test
	public void testLeftCaseMoveForth(){
		
		drone = new DoubleCubeDron(0,15,1,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveForth());
		
	}
	
	@Test
	public void testRightCaseMoveForth(){
		
		drone = new DoubleCubeDron(40,15,1,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveForth());
		
	}
	
	@Test
	public void testForwardCaseMoveForth(){
		
		drone = new DoubleCubeDron(15,15,41,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveForth());
		
	}
	
	@Test
	public void testBackCaseMoveForth(){
		
		drone = new DoubleCubeDron(15,15,1,space.getBoundaries(),space.getRazmak(),1);
		String expectedCoordinates = "Drone position: ("+drone.getX()+","+drone.getY()+","+drone.getZ()+")";
		
		assertEquals(expectedCoordinates,drone.moveForth());
		
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
