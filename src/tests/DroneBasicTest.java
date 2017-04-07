package tests;

import org.junit.Test;
import static org.junit.Assert.*;

import drone.Drone;
import space.DoubleCubeDron;
import space.FlySpace;

public class DroneBasicTest {
	
	//private int[] boundaries = {50,50,50};
	//private int[] startCoordinates = {30,0,30};
	Drone drone;
	int[] start={9,8,35};
	int[] boundaries={50,50,50};
	int razmak=10;
	FlySpace fs= new FlySpace(boundaries,razmak);
	DoubleCubeDron cubeDron;
	
	@Test(expected=NullPointerException.class)
	public void testNullBoundaries(){
		start=new int[]{9,7,35};
		cubeDron=new DoubleCubeDron(start,null);
		drone.moveUp();

		

	}

	

	@Test(expected=NullPointerException.class)
	public void testNullCoordinates(){
		cubeDron=new DoubleCubeDron(null,fs);

		drone.moveUp();

	}
	@Test
	public void testBoundaryLevelMoveUpCube(){
		start=new int[]{9,8,35};
		cubeDron=new DoubleCubeDron(start,fs);
		String expectedCoordinates="("+"("+Integer.toString(cubeDron.getTacka1().getX())+","+Integer.toString(cubeDron.getTacka1().getY())+","+Integer.toString(cubeDron.getTacka1().getZ())+"),"
				+"("+Integer.toString(cubeDron.getTacka2().getX())+","+Integer.toString(cubeDron.getTacka2().getY())+","+Integer.toString(cubeDron.getTacka2().getZ())+"),"
				+"("+Integer.toString(cubeDron.getTacka3().getX())+","+Integer.toString(cubeDron.getTacka3().getY())+","+Integer.toString(cubeDron.getTacka3().getZ())+"),"
				+"("+Integer.toString(cubeDron.getTacka4().getX())+","+Integer.toString(cubeDron.getTacka4().getY())+","+Integer.toString(cubeDron.getTacka4().getZ())+")"+")";
		
		assertEquals(expectedCoordinates, cubeDron.moveUp());
		
		
	}
	@Test
	public void testBoundaryLevelMoveUpCube1(){
		start=new int[]{38,8,39};
		cubeDron=new DoubleCubeDron(start,fs);
		String expectedCoordinates="("+"("+Integer.toString(cubeDron.getTacka1().getX())+","+Integer.toString(cubeDron.getTacka1().getY())+","+Integer.toString(cubeDron.getTacka1().getZ())+"),"
				+"("+Integer.toString(cubeDron.getTacka2().getX())+","+Integer.toString(cubeDron.getTacka2().getY())+","+Integer.toString(cubeDron.getTacka2().getZ())+"),"
				+"("+Integer.toString(cubeDron.getTacka3().getX())+","+Integer.toString(cubeDron.getTacka3().getY())+","+Integer.toString(cubeDron.getTacka3().getZ())+"),"
				+"("+Integer.toString(cubeDron.getTacka4().getX())+","+Integer.toString(cubeDron.getTacka4().getY())+","+Integer.toString(cubeDron.getTacka4().getZ())+")"+")";
		
		assertEquals(expectedCoordinates, cubeDron.moveUp());
		
		
	}
	@Test
	public void testBoundaryLevelMoveDownCube(){
		start=new int[]{9,39,25};
		cubeDron=new DoubleCubeDron(start,fs);
		String expectedCoordinates="("+"("+Integer.toString(cubeDron.getTacka1().getX())+","+Integer.toString(cubeDron.getTacka1().getY())+","+Integer.toString(cubeDron.getTacka1().getZ())+"),"
				+"("+Integer.toString(cubeDron.getTacka2().getX())+","+Integer.toString(cubeDron.getTacka2().getY())+","+Integer.toString(cubeDron.getTacka2().getZ())+"),"
				+"("+Integer.toString(cubeDron.getTacka3().getX())+","+Integer.toString(cubeDron.getTacka3().getY())+","+Integer.toString(cubeDron.getTacka3().getZ())+"),"
				+"("+Integer.toString(cubeDron.getTacka4().getX())+","+Integer.toString(cubeDron.getTacka4().getY())+","+Integer.toString(cubeDron.getTacka4().getZ())+")"+")";
		
		assertEquals(expectedCoordinates, cubeDron.moveDown());
		
		
	}
	@Test
	public void testBoundaryLevelMoveLeftCube(){
		start=new int[]{39,9,10};
		cubeDron=new DoubleCubeDron(start,fs);
		String expectedCoordinates="("+"("+Integer.toString(cubeDron.getTacka1().getX())+","+Integer.toString(cubeDron.getTacka1().getY())+","+Integer.toString(cubeDron.getTacka1().getZ())+"),"
				+"("+Integer.toString(cubeDron.getTacka2().getX())+","+Integer.toString(cubeDron.getTacka2().getY())+","+Integer.toString(cubeDron.getTacka2().getZ())+"),"
				+"("+Integer.toString(cubeDron.getTacka3().getX())+","+Integer.toString(cubeDron.getTacka3().getY())+","+Integer.toString(cubeDron.getTacka3().getZ())+"),"
				+"("+Integer.toString(cubeDron.getTacka4().getX())+","+Integer.toString(cubeDron.getTacka4().getY())+","+Integer.toString(cubeDron.getTacka4().getZ())+")"+")";
		
		assertEquals(expectedCoordinates, cubeDron.moveLeft());
		
		
	}
	@Test
	public void testBoundaryLevelMoveRightCube(){
		start=new int[]{9,39,39};
		cubeDron=new DoubleCubeDron(start,fs);
		String expectedCoordinates="("+"("+Integer.toString(cubeDron.getTacka1().getX())+","+Integer.toString(cubeDron.getTacka1().getY())+","+Integer.toString(cubeDron.getTacka1().getZ())+"),"
				+"("+Integer.toString(cubeDron.getTacka2().getX())+","+Integer.toString(cubeDron.getTacka2().getY())+","+Integer.toString(cubeDron.getTacka2().getZ())+"),"
				+"("+Integer.toString(cubeDron.getTacka3().getX())+","+Integer.toString(cubeDron.getTacka3().getY())+","+Integer.toString(cubeDron.getTacka3().getZ())+"),"
				+"("+Integer.toString(cubeDron.getTacka4().getX())+","+Integer.toString(cubeDron.getTacka4().getY())+","+Integer.toString(cubeDron.getTacka4().getZ())+")"+")";
		
		assertEquals(expectedCoordinates, cubeDron.moveRight());
		
		
	}
	@Test
	public void testBoundaryLevelMoveForthCube(){
		start=new int[]{9,38,10};
		cubeDron=new DoubleCubeDron(start,fs);
		String expectedCoordinates="("+"("+Integer.toString(cubeDron.getTacka1().getX())+","+Integer.toString(cubeDron.getTacka1().getY())+","+Integer.toString(cubeDron.getTacka1().getZ())+"),"
				+"("+Integer.toString(cubeDron.getTacka2().getX())+","+Integer.toString(cubeDron.getTacka2().getY())+","+Integer.toString(cubeDron.getTacka2().getZ())+"),"
				+"("+Integer.toString(cubeDron.getTacka3().getX())+","+Integer.toString(cubeDron.getTacka3().getY())+","+Integer.toString(cubeDron.getTacka3().getZ())+"),"
				+"("+Integer.toString(cubeDron.getTacka4().getX())+","+Integer.toString(cubeDron.getTacka4().getY())+","+Integer.toString(cubeDron.getTacka4().getZ())+")"+")";
		
		assertEquals(expectedCoordinates, cubeDron.moveForth());
		
		
	}
	@Test
	public void testBoundaryLevelMoveBackCube(){
		start=new int[]{9,38,40};
		cubeDron=new DoubleCubeDron(start,fs);
		String expectedCoordinates="("+"("+Integer.toString(cubeDron.getTacka1().getX())+","+Integer.toString(cubeDron.getTacka1().getY())+","+Integer.toString(cubeDron.getTacka1().getZ())+"),"
				+"("+Integer.toString(cubeDron.getTacka2().getX())+","+Integer.toString(cubeDron.getTacka2().getY())+","+Integer.toString(cubeDron.getTacka2().getZ())+"),"
				+"("+Integer.toString(cubeDron.getTacka3().getX())+","+Integer.toString(cubeDron.getTacka3().getY())+","+Integer.toString(cubeDron.getTacka3().getZ())+"),"
				+"("+Integer.toString(cubeDron.getTacka4().getX())+","+Integer.toString(cubeDron.getTacka4().getY())+","+Integer.toString(cubeDron.getTacka4().getZ())+")"+")";
		
		assertEquals(expectedCoordinates, cubeDron.moveBack());
		
		
	}
	
	
	
	
	
	
	@Test
	public void testInitialMoveUp(){
		drone= new Drone();
		String expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY()+1)+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveUp());
		
		
	}
	
	@Test
	public void testInitalMoveDown(){
		drone= new Drone();
		drone.setY(10);
		String expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY()-1)+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveDown());
		
		
	}
	
	
	@Test
	public void testInitialMoveRight(){
		drone= new Drone();
		String expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX()+1)+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveRight());
		
		
	}
	@Test
	public void testInitialMoveLeft(){
		drone= new Drone();
		String expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX()-1)+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveLeft());
		
		
	}
	@Test
	public void testInitialMoveForth(){
		drone= new Drone();
		String expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ()+1)+")";
		
		assertEquals(expectedCoordinates, drone.moveForth());
		
		
	}
	@Test
	public void testInitialMoveBack(){
		drone= new Drone();
		String expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ()-1)+")";
		
		assertEquals(expectedCoordinates, drone.moveBack());
		
		
	}
	@Test
	public void testBorderlineMoveDown(){
		drone= new Drone();
		String expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveDown());
		
		
		
	}
	@Test
	public void testBorderlineMoveDown1(){
		drone= new Drone();
		drone.setY(40);
		String expectedCoordinates;
		expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveDown());
	
	}
	@Test
	public void testBorderlineMoveUp(){
		drone= new Drone();
		drone.setY(10);
		String expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveUp());
	
		
		
	}
	@Test
	public void testBorderlineMoveUp1(){
		drone=new Drone();
		drone.setY(50);
		String expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveUp());
		
	}
	@Test
	public void testBorderlineMoveLeft(){
		drone= new Drone();
		drone.setX(0);
		String expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveLeft());
		drone.setX(40);
		drone.setY(30);

		 expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveLeft());
		
		
	}
	@Test
	public void testBorderlineMoveLeft1(){
		drone=new Drone();
		drone.setX(40);
		drone.setY(30);

		 String expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveLeft());
		
	}
	@Test
	public void testBorderlineMoveRight(){
		drone= new Drone();
		drone.setX(50);
		String expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveRight());
		
		
		
	}
	@Test
	public void testBorderlineMoveRight1(){
		drone = new Drone();
		drone.setX(10);
		drone.setY(30);

		 String expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveRight());
		
	}
	@Test
	public void testBorderlineMoveBack(){
		drone= new Drone();
		drone.setZ(0);
		String expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveBack());
		
		
		
	}
	@Test
	public void testBorderlineMoveBack1(){
		drone= new Drone();
		drone.setZ(40);
		drone.setY(30);

		String expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveBack());
		
	}
	@Test
	public void testBorderlineMoveForth(){
		drone= new Drone();
		drone.setZ(50);
		String expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveForth());
		
		
		
	}
	@Test
	public void testBorderlineMoveForth1(){
		drone = new Drone();
		drone.setZ(10);
		drone.setY(30);

		 String expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveForth());
		
	}
	

}
