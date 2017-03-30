package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert.*;

import drone.*;

public class DroneBasicTests {
	private int [] startCoordinates={30,0,30};
	private int [] startLoop;
	private String rtrn=null;
	Drone dron;
	
	
	//
	//Prvi deo zadatka
	@Test()//u zagradi mu definisemo vreme koje je neophodno da bi se test izvrsio
	public void testInititalMoveUp()
	{
		dron = new Drone();
		String expectedCoordinates = "Drone position: ("+Integer.toString(startCoordinates[0])+","+Integer.toString(startCoordinates[1]+1)+","+Integer.toString(startCoordinates[2])+")";
		assertEquals(dron.moveUp(), expectedCoordinates);
	}
	@Test
	public void testInititalMoveDown()
	{
		dron = new Drone();
		startCoordinates[1]=1;
		
		String expectedCoordinates = "Drone position: ("+Integer.toString(startCoordinates[0])+","+Integer.toString((startCoordinates[1])-1)+","+Integer.toString(dron.getZ())+")";
		assertEquals(dron.moveDown(), expectedCoordinates);
	}
	@Test
	public void testInititalMoveLeft()
	{
		dron = new Drone();
		startCoordinates[1]=10;
		dron.setY(10);		
		String expectedCoordinates = "Drone position: ("+Integer.toString(startCoordinates[0]-1)+","+Integer.toString(startCoordinates[1])+","+Integer.toString(startCoordinates[2])+")";
		assertEquals(dron.moveLeft(), expectedCoordinates);
	}
	@Test
	public void testInititalMoveRight()
	{
		dron = new Drone();
		startCoordinates[1]=10;
		dron.setY(10);
		String expectedCoordinates = "Drone position: ("+Integer.toString(startCoordinates[0]+1)+","+Integer.toString(startCoordinates[1])+","+Integer.toString(startCoordinates[2])+")";
		assertEquals(dron.moveRight(), expectedCoordinates);
	}
	@Test
	public void testInititalMoveForth()
	{
		dron = new Drone();
		startCoordinates[1]=10;
		dron.setY(10);
		String expectedCoordinates = "Drone position: ("+Integer.toString(startCoordinates[0])+","+Integer.toString(startCoordinates[1])+","+Integer.toString(startCoordinates[2]-1)+")";
		assertEquals(dron.moveForth(), expectedCoordinates);
	}
	@Test
	public void testInititalMoveBack()
	{
		dron = new Drone();
		startCoordinates[1]=10;
		dron.setY(10);
		String expectedCoordinates = "Drone position: ("+Integer.toString(startCoordinates[0])+","+Integer.toString(startCoordinates[1])+","+Integer.toString(startCoordinates[2]+1)+")";
		assertEquals(dron.moveBack(), expectedCoordinates);
	}
	
	//Treci deo zadatka
	
	public String helperTestBoundaries(String smerKretanja){
			if(smerKretanja == "moveUp"){
				for(int i=0;i<50;i++){
					dron.moveUp();
					rtrn=dron.getFormatedCoordinates();
				}
						
			}
			if(smerKretanja == "moveDown"){
				for(int i=0;i<50;i++){
					dron.moveDown();
					rtrn=dron.getFormatedCoordinates();
				}
						
			}
			if(smerKretanja == "moveLeft"){
				for(int i=0;i<50;i++){
					dron.moveLeft();
					rtrn=dron.getFormatedCoordinates();
				}
						
			}
			if(smerKretanja == "moveRight"){
				for(int i=0;i<50;i++){
					dron.moveRight();
					rtrn=dron.getFormatedCoordinates();
				}
						
			}
			if(smerKretanja == "moveForth"){
				for(int i=0;i<50;i++){
					dron.moveForth();
					rtrn=dron.getFormatedCoordinates();
				}
						
			}
			if(smerKretanja == "moveBack"){
				for(int i=0;i<50;i++){
					dron.moveBack();
					rtrn=dron.getFormatedCoordinates();
				}
						
			}
			
			return dron.getFormatedCoordinates();
			
		
	}
	@Test
	public void testInitialBoundariesMoveUp(){
		dron=new Drone();
		String expectedString= "Drone position: (" +Integer.toString(startCoordinates[0])+","+Integer.toString(startCoordinates[1]+10)+ ","+Integer.toString(startCoordinates[2])+")";
		assertEquals(helperTestBoundaries("moveUp"),expectedString );
	}
	@Test()
	public void testInitialBoundariesMoveDown(){
		dron=new Drone();
		startCoordinates[1]=10;
		String expectedString= "Drone position: (" +Integer.toString(startCoordinates[0])+","+Integer.toString(startCoordinates[1]-10)+ ","+Integer.toString(startCoordinates[2])+")";
		assertEquals(helperTestBoundaries("moveDown"),expectedString );
	}
	@Test()
	public void testInitialBoundariesMoveLeft(){
		dron=new Drone();
		dron.setY(10);
		startCoordinates[1]=10;
		String expectedString= "Drone position: (" +Integer.toString(startCoordinates[0]-30)+","+Integer.toString(startCoordinates[1])+ ","+Integer.toString(startCoordinates[2])+")";
		assertEquals(helperTestBoundaries("moveLeft"),expectedString );
	}
	@Test()
	public void testInitialBoundariesMoveRight(){
		dron=new Drone();
		dron.setY(10);
		String expectedString= "Drone position: (" +Integer.toString(startCoordinates[0]+20)+","+Integer.toString(startCoordinates[1]+10)+ ","+Integer.toString(startCoordinates[2])+")";
		assertEquals(helperTestBoundaries("moveRight"),expectedString );
	}
	@Test()
	public void testInitialBoundariesMoveForth(){
		dron=new Drone();
		dron.setY(10);
		String expectedString= "Drone position: (" +Integer.toString(startCoordinates[0])+","+Integer.toString(startCoordinates[1]+10)+ ","+Integer.toString(startCoordinates[2]-30)+")";
		assertEquals(helperTestBoundaries("moveForth"),expectedString );
	}
	@Test()
	public void testInitialBoundariesMoveBack(){
		dron=new Drone();
		dron.setY(10);
		String expectedString= "Drone position: (" +Integer.toString(startCoordinates[0])+","+Integer.toString(startCoordinates[1]+10)+ ","+Integer.toString(startCoordinates[2]+20)+")";
		assertEquals(helperTestBoundaries("moveBack"),expectedString );
	}
	
	
	
	
	
}
