package tests;
 
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import drone.Drone;
import space.DoubleCubeDrone;
import space.FlyClass;
 
public class DroneBasicTest {
	Drone drone;
	int[] start={9,8,35};
	int[] boundaries={50,50,50};
	int razmak=10;
	FlyClass fs= new FlyClass(boundaries,razmak);
	DoubleCubeDrone cubeDrone;
	
	/*@Test(expected=NullPointerException.class)
	public void testNullBoundaries(){
		start=new int[]{9,7,35};
		cubeDrone=new DoubleCubeDrone(start,null);
		drone.moveUp();

		

}
	
	@Test(expected=NullPointerException.class)
	public void testNullCoordinates(){
		cubeDrone=new DoubleCubeDrone(null,fs);

		cubeDrone.moveUp();

	}*/
	/*@Test
	public void testBoundaryLevelMoveUpCube(){
		start=new int[]{9,8,35};
		cubeDrone=new DoubleCubeDrone(start,fs);
		String expectedCoordinates="Drone position: "+"("+Integer.toString(cubeDrone.getDroneA1().getX())+","+Integer.toString(cubeDrone.getDroneA1().getY())+","+Integer.toString(cubeDrone.getDroneA1().getY())+")"
				 +"("+Integer.toString(cubeDrone.getDroneB1().getX())+","+Integer.toString(cubeDrone.getDroneB1().getY())+","+Integer.toString(cubeDrone.getDroneB1().getY())+")"
				 +"("+Integer.toString(cubeDrone.getDroneC1().getX())+","+Integer.toString(cubeDrone.getDroneC1().getY())+","+Integer.toString(cubeDrone.getDroneC1().getY())+")"
				 +"("+Integer.toString(cubeDrone.getDroneD1().getX())+","+Integer.toString(cubeDrone.getDroneD1().getY())+","+Integer.toString(cubeDrone.getDroneD1().getY())+")";
		
		assertEquals(expectedCoordinates, cubeDrone.moveUp());
		
		
	}
	@Test
	public void testBoundaryLevelMoveUpCube1(){
		start=new int[]{38,8,39};
		cubeDrone=new DoubleCubeDrone(start,fs);
		String expectedCoordinates="Drone position: "+"("+Integer.toString(cubeDrone.getDroneA1().getX())+","+Integer.toString(cubeDrone.getDroneA1().getY())+","+Integer.toString(cubeDrone.getDroneA1().getY())+")"
				 +"("+Integer.toString(cubeDrone.getDroneB1().getX())+","+Integer.toString(cubeDrone.getDroneB1().getY())+","+Integer.toString(cubeDrone.getDroneB1().getY())+")"
				 +"("+Integer.toString(cubeDrone.getDroneC1().getX())+","+Integer.toString(cubeDrone.getDroneC1().getY())+","+Integer.toString(cubeDrone.getDroneC1().getY())+")"
				 +"("+Integer.toString(cubeDrone.getDroneD1().getX())+","+Integer.toString(cubeDrone.getDroneD1().getY())+","+Integer.toString(cubeDrone.getDroneD1().getY())+")";
		
		assertEquals(expectedCoordinates, cubeDrone.moveUp());
		
		
	}
	@Test
	public void testBoundaryLevelMoveDownCube(){
		start=new int[]{9,39,25};
		cubeDrone=new DoubleCubeDrone(start,fs);
		String expectedCoordinates="Drone position: "+"("+Integer.toString(cubeDrone.getDroneA1().getX())+","+Integer.toString(cubeDrone.getDroneA1().getY())+","+Integer.toString(cubeDrone.getDroneA1().getY())+")"
				 +"("+Integer.toString(cubeDrone.getDroneB1().getX())+","+Integer.toString(cubeDrone.getDroneB1().getY())+","+Integer.toString(cubeDrone.getDroneB1().getY())+")"
				 +"("+Integer.toString(cubeDrone.getDroneC1().getX())+","+Integer.toString(cubeDrone.getDroneC1().getY())+","+Integer.toString(cubeDrone.getDroneC1().getY())+")"
				 +"("+Integer.toString(cubeDrone.getDroneD1().getX())+","+Integer.toString(cubeDrone.getDroneD1().getY())+","+Integer.toString(cubeDrone.getDroneD1().getY())+")";
		
		assertEquals(expectedCoordinates, cubeDrone.moveDown());
		
		
	}
	@Test
	public void testBoundaryLevelMoveLeftCube(){
		start=new int[]{39,9,10};
		cubeDrone=new DoubleCubeDrone(start,fs);
		String expectedCoordinates="Drone position: "+"("+Integer.toString(cubeDrone.getDroneA1().getX())+","+Integer.toString(cubeDrone.getDroneA1().getY())+","+Integer.toString(cubeDrone.getDroneA1().getY())+")"
				 +"("+Integer.toString(cubeDrone.getDroneB1().getX())+","+Integer.toString(cubeDrone.getDroneB1().getY())+","+Integer.toString(cubeDrone.getDroneB1().getY())+")"
				 +"("+Integer.toString(cubeDrone.getDroneC1().getX())+","+Integer.toString(cubeDrone.getDroneC1().getY())+","+Integer.toString(cubeDrone.getDroneC1().getY())+")"
				 +"("+Integer.toString(cubeDrone.getDroneD1().getX())+","+Integer.toString(cubeDrone.getDroneD1().getY())+","+Integer.toString(cubeDrone.getDroneD1().getY())+")";
		
		assertEquals(expectedCoordinates, cubeDrone.moveLeft());
		
		
	}
	@Test
	public void testBoundaryLevelMoveRightCube(){
		start=new int[]{9,39,39};
		cubeDrone=new DoubleCubeDrone(start,fs);
		String expectedCoordinates="Drone position: "+"("+Integer.toString(cubeDrone.getDroneA1().getX())+","+Integer.toString(cubeDrone.getDroneA1().getY())+","+Integer.toString(cubeDrone.getDroneA1().getY())+")"
				 +"("+Integer.toString(cubeDrone.getDroneB1().getX())+","+Integer.toString(cubeDrone.getDroneB1().getY())+","+Integer.toString(cubeDrone.getDroneB1().getY())+")"
				 +"("+Integer.toString(cubeDrone.getDroneC1().getX())+","+Integer.toString(cubeDrone.getDroneC1().getY())+","+Integer.toString(cubeDrone.getDroneC1().getY())+")"
				 +"("+Integer.toString(cubeDrone.getDroneD1().getX())+","+Integer.toString(cubeDrone.getDroneD1().getY())+","+Integer.toString(cubeDrone.getDroneD1().getY())+")";
		
		assertEquals(expectedCoordinates, cubeDrone.moveRight());
		
		
	}
	@Test
	public void testBoundaryLevelMoveForthCube(){
		start=new int[]{9,38,10};
		cubeDrone=new DoubleCubeDrone(start,fs);
		String expectedCoordinates="Drone position: "+"("+Integer.toString(cubeDrone.getDroneA1().getX())+","+Integer.toString(cubeDrone.getDroneA1().getY())+","+Integer.toString(cubeDrone.getDroneA1().getY())+")"
				 +"("+Integer.toString(cubeDrone.getDroneB1().getX())+","+Integer.toString(cubeDrone.getDroneB1().getY())+","+Integer.toString(cubeDrone.getDroneB1().getY())+")"
				 +"("+Integer.toString(cubeDrone.getDroneC1().getX())+","+Integer.toString(cubeDrone.getDroneC1().getY())+","+Integer.toString(cubeDrone.getDroneC1().getY())+")"
				 +"("+Integer.toString(cubeDrone.getDroneD1().getX())+","+Integer.toString(cubeDrone.getDroneD1().getY())+","+Integer.toString(cubeDrone.getDroneD1().getY())+")";
		
		assertEquals(expectedCoordinates, cubeDrone.moveForth());
		
		
	}
	@Test
	public void testBoundaryLevelMoveBackCube(){
		start=new int[]{9,38,40};
		cubeDrone=new DoubleCubeDrone(start,fs);
		String expectedCoordinates="Drone position: "+"("+Integer.toString(cubeDrone.getDroneA1().getX())+","+Integer.toString(cubeDrone.getDroneA1().getY())+","+Integer.toString(cubeDrone.getDroneA1().getY())+")"
				 +"("+Integer.toString(cubeDrone.getDroneB1().getX())+","+Integer.toString(cubeDrone.getDroneB1().getY())+","+Integer.toString(cubeDrone.getDroneB1().getY())+")"
				 +"("+Integer.toString(cubeDrone.getDroneC1().getX())+","+Integer.toString(cubeDrone.getDroneC1().getY())+","+Integer.toString(cubeDrone.getDroneC1().getY())+")"
				 +"("+Integer.toString(cubeDrone.getDroneD1().getX())+","+Integer.toString(cubeDrone.getDroneD1().getY())+","+Integer.toString(cubeDrone.getDroneD1().getY())+")";
		
		assertEquals(expectedCoordinates, cubeDrone.moveBack());
		
		
}*/
	
	
	@Test
	public void testMovingUpOneStep(){
		
		Drone drone = new Drone();
		
		String expectedCoordinates="("+Integer.toString(drone.getX())
			+","+Integer.toString(drone.getY()+1)
			+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveUp());
	}
	
	@Test
	public void testMovingUpOneStepWhenItsBoundaryWhen10(){
		
		Drone drone = new Drone();
		
		drone.setY(10);
		String expectedCoordinates="("+Integer.toString(drone.getX())
			+","+Integer.toString(drone.getY())
			+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveUp());
		
	}
	@Test
	public void testMovingUpOneStepWhenItsBoundaryWhen50(){
		
		Drone drone= new Drone();
		
		drone.setY(50);
		String expectedCoordinates="("+Integer.toString(drone.getX())
			+","+Integer.toString(drone.getY())
			+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveUp());
	}
	
	@Test
	public void testMovingDownOneStep(){
		
		Drone drone = new Drone();
		
		drone.setY(1);
		String expectedCoordinates="("+Integer.toString(drone.getX())
			+","+Integer.toString(drone.getY()-1)
			+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveDown());
	}
	
	@Test
	public void testMovingDownOneStepWhenItsBoundaryWhen0(){
		
		Drone drone = new Drone();
		
		String expectedCoordinates="("+Integer.toString(drone.getX())
			+","+Integer.toString(drone.getY())
			+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveDown());
		
	}
	
	@Test
	public void testMovingDownOneStepWhenItsBoundaryWhen40(){
		
		Drone drone = new Drone();
		drone.setY(40);
		drone.setX(30);
		String expectedCoordinates="("+Integer.toString(drone.getX())
			+","+Integer.toString(drone.getY())
			+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveDown());
	}
	
	@Test
	public void testMovingRightOneStep(){
		
		Drone drone = new Drone();
		
		String expectedCoordinates="("+Integer.toString(drone.getX()+1)
			+","+Integer.toString(drone.getY())
			+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveRight());
	}
	
	@Test
	public void testMovingRightOneStepWhenItsBoundaryWhen50(){
		
		Drone drone = new Drone();
		
		drone.setX(50);
		String expectedCoordinates="("+Integer.toString(drone.getX())
			+","+Integer.toString(drone.getY())
			+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveRight());
		
	}
	
	@Test
	public void testMovingRightOneStepWhenItsBoundaryWhen10(){
		Drone drone = new Drone();
		drone.setX(10);
		drone.setY(30);
		String expectedCoordinates="("+Integer.toString(drone.getX())
			+","+Integer.toString(drone.getY())
			+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveRight());
	}
	
	@Test
	public void testMovingLeftOneStep(){
		Drone drone = new Drone();
		
		String expectedCoordinates="("+Integer.toString(drone.getX()-1)
		+","+Integer.toString(drone.getY())
		+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveLeft());
	}
	
	@Test
	public void testMovingLeftOneStepWhenItsBoundaryWhen0(){
		Drone drone = new Drone();
		
		drone.setX(0);
		String expectedCoordinates="("+Integer.toString(drone.getX())
		+","+Integer.toString(drone.getY())
		+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveLeft());
		
		
	}
	
	@Test
	public void testMovingLeftOneStepWhenItsBoundaryWhen40(){
		Drone drone = new Drone();
		
		drone.setX(40);
		drone.setY(30);
		String expectedCoordinates="("+Integer.toString(drone.getX())
		+","+Integer.toString(drone.getY())
		+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveLeft());
	}
	
	@Test
	public void testMovingForthOneStep(){
		
		Drone drone = new Drone();
		
		String expectedCoordinates="("+Integer.toString(drone.getX())
		+","+Integer.toString(drone.getY())
		+","+Integer.toString(drone.getZ()-1)+")";
		assertEquals("Drone position: " +expectedCoordinates, drone.moveForth());
	}
	
	@Test
	public void testMovingForthOneStepWhenItsBoundaryWhen0(){
		Drone drone = new Drone();
		
		drone.setZ(0);
		String expectedCoordinates="("+Integer.toString(drone.getX())
		+","+Integer.toString(drone.getY())
		+","+Integer.toString(drone.getZ())+")";
		
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveForth());
		
		
	}
	
	@Test
	public void testMovingForthOneStepWhenItsBoundaryWhen40(){
		Drone drone = new Drone();
		
		drone.setZ(40);
		drone.setY(30);
		String expectedCoordinates="("+Integer.toString(drone.getX())
		+","+Integer.toString(drone.getY())
		+","+Integer.toString(drone.getZ())+")";
		
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveForth());
	}
	
	@Test
	public void testMovingBackOneStep(){
		Drone drone = new Drone();
		
		String expectedCoordinates="("+Integer.toString(drone.getX())
		+","+Integer.toString(drone.getY())
		+","+Integer.toString(drone.getZ()+1)+")";
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveBack());
	}
	
	@Test
	public void testMovingBackOneStepWhenItsBoundaryWhen50(){
		Drone drone = new Drone();
		
		drone.setZ(50);
		String expectedCoordinates="("+Integer.toString(drone.getX())
		+","+Integer.toString(drone.getY())
		+","+Integer.toString(drone.getZ())+")";
		
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveBack());
		
	}
	
	@Test
	public void testMovingBackOneStepWhenItsBoundaryWhen10(){
		Drone drone = new Drone();
		
		drone.setZ(10);
		drone.setY(30);
		String expectedCoordinates="("+Integer.toString(drone.getX())
		+","+Integer.toString(drone.getY())
		+","+Integer.toString(drone.getZ())+")";
		
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveBack());
	}

}
