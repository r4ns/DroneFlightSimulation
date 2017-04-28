package tests;

import org.junit.Test;
import static org.junit.Assert.*;

import drone.Cube;

import space.DoubleCubeDrone;
import space.DoubleCubeDrone;
import space.FlySpace;

public class DoubleCubeDroneTest {
	DoubleCubeDrone dron;

	FlySpace fs=new FlySpace(new int[]{0,0,0},50,10);
	
	@Test  
	public void testUpSideBoundaries()  {  
		dron=new DoubleCubeDrone(new int[]{30,48,30},1,fs);
		String ocekivanIzlaz="Drone position: ("  + Integer.toString(dron.getPrvaKocka().getMinCoordinates()[0]) + ","    + Integer.toString(dron.getPrvaKocka().getMinCoordinates()[1]) + ","      + Integer.toString(dron.getPrvaKocka().getMinCoordinates()[2]) + "), ("    + Integer.toString(dron.getPrvaKocka().getMaxCoordinates()[0]) + ","    + Integer.toString(dron.getPrvaKocka().getMaxCoordinates()[1]) + ","      + Integer.toString(dron.getPrvaKocka().getMaxCoordinates()[2]) + ")"
				+", ("  + Integer.toString(dron.getDrugaKocka().getMinCoordinates()[0]) + ","    + Integer.toString(dron.getDrugaKocka().getMinCoordinates()[1]) +","      + Integer.toString(dron.getDrugaKocka().getMinCoordinates()[2]) + "), (" + Integer.toString(dron.getDrugaKocka().getMaxCoordinates()[0]) + ","    + Integer.toString(dron.getDrugaKocka().getMaxCoordinates()[1]) + ","      + Integer.toString(dron.getDrugaKocka().getMaxCoordinates()[2]) + ")"; 
		
		assertEquals(ocekivanIzlaz,dron.moveUp());
		
		}  
	@Test  
	public void testDownSideBoundaries()  {  
		dron=new DoubleCubeDrone(new int[]{30,41,30},1,fs);
		String ocekivanIzlaz="Drone position: ("  + Integer.toString(dron.getPrvaKocka().getMinCoordinates()[0]) + ","    + Integer.toString(dron.getPrvaKocka().getMinCoordinates()[1]-1) + ","      + Integer.toString(dron.getPrvaKocka().getMinCoordinates()[2]) + "), ("    + Integer.toString(dron.getPrvaKocka().getMaxCoordinates()[0]) + ","    + Integer.toString(dron.getPrvaKocka().getMaxCoordinates()[1]-1) + ","      + Integer.toString(dron.getPrvaKocka().getMaxCoordinates()[2]) + ")"
				+", ("  + Integer.toString(dron.getDrugaKocka().getMinCoordinates()[0]) + ","    + Integer.toString(dron.getDrugaKocka().getMinCoordinates()[1]-1) +","      + Integer.toString(dron.getDrugaKocka().getMinCoordinates()[2]) + "), (" + Integer.toString(dron.getDrugaKocka().getMaxCoordinates()[0]) + ","    + Integer.toString(dron.getDrugaKocka().getMaxCoordinates()[1]-1) + ","      + Integer.toString(dron.getDrugaKocka().getMaxCoordinates()[2]) + ")"; 
		dron.moveDown();
		assertEquals(ocekivanIzlaz,dron.moveDown());
		
		} 
	@Test  
	public void testRightSideBoundaries()  {  
		dron=new DoubleCubeDrone(new int[]{8,20,30},1,fs);
		String ocekivanIzlaz="Drone position: ("  + Integer.toString(dron.getPrvaKocka().getMinCoordinates()[0]) + ","    + Integer.toString(dron.getPrvaKocka().getMinCoordinates()[1]) + ","      + Integer.toString(dron.getPrvaKocka().getMinCoordinates()[2]) + "), ("    + Integer.toString(dron.getPrvaKocka().getMaxCoordinates()[0]) + ","    + Integer.toString(dron.getPrvaKocka().getMaxCoordinates()[1]) + ","      + Integer.toString(dron.getPrvaKocka().getMaxCoordinates()[2]) + ")"
				+", ("  + Integer.toString(dron.getDrugaKocka().getMinCoordinates()[0]) + ","    + Integer.toString(dron.getDrugaKocka().getMinCoordinates()[1]) +","      + Integer.toString(dron.getDrugaKocka().getMinCoordinates()[2]) + "), (" + Integer.toString(dron.getDrugaKocka().getMaxCoordinates()[0]) + ","    + Integer.toString(dron.getDrugaKocka().getMaxCoordinates()[1]) + ","      + Integer.toString(dron.getDrugaKocka().getMaxCoordinates()[2]) + ")"; 
		
		assertEquals(ocekivanIzlaz,dron.moveRight());
		
		} 
	@Test  
	public void testLeftSideBoundaries()  {  
		dron=new DoubleCubeDrone(new int[]{0,20,30},1,fs);
		String ocekivanIzlaz="Drone position: ("  + Integer.toString(dron.getPrvaKocka().getMinCoordinates()[0]) + ","    + Integer.toString(dron.getPrvaKocka().getMinCoordinates()[1]) + ","      + Integer.toString(dron.getPrvaKocka().getMinCoordinates()[2]) + "), ("    + Integer.toString(dron.getPrvaKocka().getMaxCoordinates()[0]) + ","    + Integer.toString(dron.getPrvaKocka().getMaxCoordinates()[1]) + ","      + Integer.toString(dron.getPrvaKocka().getMaxCoordinates()[2]) + ")"
				+", ("  + Integer.toString(dron.getDrugaKocka().getMinCoordinates()[0]) + ","    + Integer.toString(dron.getDrugaKocka().getMinCoordinates()[1]) +","      + Integer.toString(dron.getDrugaKocka().getMinCoordinates()[2]) + "), (" + Integer.toString(dron.getDrugaKocka().getMaxCoordinates()[0]) + ","    + Integer.toString(dron.getDrugaKocka().getMaxCoordinates()[1]) + ","      + Integer.toString(dron.getDrugaKocka().getMaxCoordinates()[2]) + ")"; 
		
		assertEquals(ocekivanIzlaz,dron.moveLeft());
		
		} 
	@Test  
	public void testForthSideBoundaries()  {  
		dron=new DoubleCubeDrone(new int[]{20,20,9},1,fs);
		String ocekivanIzlaz="Drone position: ("  + Integer.toString(dron.getPrvaKocka().getMinCoordinates()[0]) + ","    + Integer.toString(dron.getPrvaKocka().getMinCoordinates()[1]) + ","      + Integer.toString(dron.getPrvaKocka().getMinCoordinates()[2]) + "), ("    + Integer.toString(dron.getPrvaKocka().getMaxCoordinates()[0]) + ","    + Integer.toString(dron.getPrvaKocka().getMaxCoordinates()[1]) + ","      + Integer.toString(dron.getPrvaKocka().getMaxCoordinates()[2]) + ")"
				+", ("  + Integer.toString(dron.getDrugaKocka().getMinCoordinates()[0]) + ","    + Integer.toString(dron.getDrugaKocka().getMinCoordinates()[1]) +","      + Integer.toString(dron.getDrugaKocka().getMinCoordinates()[2]) + "), (" + Integer.toString(dron.getDrugaKocka().getMaxCoordinates()[0]) + ","    + Integer.toString(dron.getDrugaKocka().getMaxCoordinates()[1]) + ","      + Integer.toString(dron.getDrugaKocka().getMaxCoordinates()[2]) + ")"; 
		
		assertEquals(ocekivanIzlaz,dron.moveForth());
		
		} 
	@Test  
	public void testBackSideBoundaries()  {  
		dron=new DoubleCubeDrone(new int[]{10,20,0},1,fs);
		String ocekivanIzlaz="Drone position: ("  + Integer.toString(dron.getPrvaKocka().getMinCoordinates()[0]) + ","    + Integer.toString(dron.getPrvaKocka().getMinCoordinates()[1]) + ","      + Integer.toString(dron.getPrvaKocka().getMinCoordinates()[2]) + "), ("    + Integer.toString(dron.getPrvaKocka().getMaxCoordinates()[0]) + ","    + Integer.toString(dron.getPrvaKocka().getMaxCoordinates()[1]) + ","      + Integer.toString(dron.getPrvaKocka().getMaxCoordinates()[2]) + ")"
				+", ("  + Integer.toString(dron.getDrugaKocka().getMinCoordinates()[0]) + ","    + Integer.toString(dron.getDrugaKocka().getMinCoordinates()[1]) +","      + Integer.toString(dron.getDrugaKocka().getMinCoordinates()[2]) + "), (" + Integer.toString(dron.getDrugaKocka().getMaxCoordinates()[0]) + ","    + Integer.toString(dron.getDrugaKocka().getMaxCoordinates()[1]) + ","      + Integer.toString(dron.getDrugaKocka().getMaxCoordinates()[2]) + ")"; 
		
		assertEquals(ocekivanIzlaz,dron.moveBack());
		
		} 
	@Test  
	public void testObstacleUpSide()  {  
		dron=new DoubleCubeDrone(new int[]{30,0,30},1,fs);
		fs.dodajPrepreku(new int[]{29,1,30});
		String ocekivanIzlaz="Drone position: ("  + Integer.toString(dron.getPrvaKocka().getMinCoordinates()[0]) + ","    + Integer.toString(dron.getPrvaKocka().getMinCoordinates()[1]) + ","      + Integer.toString(dron.getPrvaKocka().getMinCoordinates()[2]) + "), ("    + Integer.toString(dron.getPrvaKocka().getMaxCoordinates()[0]) + ","    + Integer.toString(dron.getPrvaKocka().getMaxCoordinates()[1]) + ","      + Integer.toString(dron.getPrvaKocka().getMaxCoordinates()[2]) + ")"
				+", ("  + Integer.toString(dron.getDrugaKocka().getMinCoordinates()[0]) + ","    + Integer.toString(dron.getDrugaKocka().getMinCoordinates()[1]) +","      + Integer.toString(dron.getDrugaKocka().getMinCoordinates()[2]) + "), (" + Integer.toString(dron.getDrugaKocka().getMaxCoordinates()[0]) + ","    + Integer.toString(dron.getDrugaKocka().getMaxCoordinates()[1]) + ","      + Integer.toString(dron.getDrugaKocka().getMaxCoordinates()[2]) + ")"; 
		
		assertEquals(ocekivanIzlaz,dron.moveUp());
		
		} 
	@Test  
	public void testObstacleDownSide()  {  
		dron=new DoubleCubeDrone(new int[]{30,6,30},1,fs);
		fs.dodajPrepreku(new int[]{29,4,30});
		String ocekivanIzlaz="Drone position: ("  + Integer.toString(dron.getPrvaKocka().getMinCoordinates()[0]) + ","    + Integer.toString(dron.getPrvaKocka().getMinCoordinates()[1]) + ","      + Integer.toString(dron.getPrvaKocka().getMinCoordinates()[2]) + "), ("    + Integer.toString(dron.getPrvaKocka().getMaxCoordinates()[0]) + ","    + Integer.toString(dron.getPrvaKocka().getMaxCoordinates()[1]) + ","      + Integer.toString(dron.getPrvaKocka().getMaxCoordinates()[2]) + ")"
				+", ("  + Integer.toString(dron.getDrugaKocka().getMinCoordinates()[0]) + ","    + Integer.toString(dron.getDrugaKocka().getMinCoordinates()[1]) +","      + Integer.toString(dron.getDrugaKocka().getMinCoordinates()[2]) + "), (" + Integer.toString(dron.getDrugaKocka().getMaxCoordinates()[0]) + ","    + Integer.toString(dron.getDrugaKocka().getMaxCoordinates()[1]) + ","      + Integer.toString(dron.getDrugaKocka().getMaxCoordinates()[2]) + ")"; 
		
		assertEquals(ocekivanIzlaz,dron.moveDown());
		
		} 
	@Test  
	public void testObstacleRightSide()  {  
		dron=new DoubleCubeDrone(new int[]{30,6,30},1,fs);
		fs.dodajPrepreku(new int[]{31,5,30});
		String ocekivanIzlaz="Drone position: ("  + Integer.toString(dron.getPrvaKocka().getMinCoordinates()[0]) + ","    + Integer.toString(dron.getPrvaKocka().getMinCoordinates()[1]) + ","      + Integer.toString(dron.getPrvaKocka().getMinCoordinates()[2]) + "), ("    + Integer.toString(dron.getPrvaKocka().getMaxCoordinates()[0]) + ","    + Integer.toString(dron.getPrvaKocka().getMaxCoordinates()[1]) + ","      + Integer.toString(dron.getPrvaKocka().getMaxCoordinates()[2]) + ")"
				+", ("  + Integer.toString(dron.getDrugaKocka().getMinCoordinates()[0]) + ","    + Integer.toString(dron.getDrugaKocka().getMinCoordinates()[1]) +","      + Integer.toString(dron.getDrugaKocka().getMinCoordinates()[2]) + "), (" + Integer.toString(dron.getDrugaKocka().getMaxCoordinates()[0]) + ","    + Integer.toString(dron.getDrugaKocka().getMaxCoordinates()[1]) + ","      + Integer.toString(dron.getDrugaKocka().getMaxCoordinates()[2]) + ")"; 
		
		assertEquals(ocekivanIzlaz,dron.moveRight());
		
		} 
	@Test  
	public void testObstacleLeftSide()  {  
		dron=new DoubleCubeDrone(new int[]{30,6,30},1,fs);
		fs.dodajPrepreku(new int[]{28,5,30});
		String ocekivanIzlaz="Drone position: ("  + Integer.toString(dron.getPrvaKocka().getMinCoordinates()[0]) + ","    + Integer.toString(dron.getPrvaKocka().getMinCoordinates()[1]) + ","      + Integer.toString(dron.getPrvaKocka().getMinCoordinates()[2]) + "), ("    + Integer.toString(dron.getPrvaKocka().getMaxCoordinates()[0]) + ","    + Integer.toString(dron.getPrvaKocka().getMaxCoordinates()[1]) + ","      + Integer.toString(dron.getPrvaKocka().getMaxCoordinates()[2]) + ")"
				+", ("  + Integer.toString(dron.getDrugaKocka().getMinCoordinates()[0]) + ","    + Integer.toString(dron.getDrugaKocka().getMinCoordinates()[1]) +","      + Integer.toString(dron.getDrugaKocka().getMinCoordinates()[2]) + "), (" + Integer.toString(dron.getDrugaKocka().getMaxCoordinates()[0]) + ","    + Integer.toString(dron.getDrugaKocka().getMaxCoordinates()[1]) + ","      + Integer.toString(dron.getDrugaKocka().getMaxCoordinates()[2]) + ")"; 
		
		assertEquals(ocekivanIzlaz,dron.moveLeft());
		
		} 

}