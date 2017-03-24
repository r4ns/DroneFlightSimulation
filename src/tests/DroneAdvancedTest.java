package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import drone.Drone;

public class DroneAdvancedTest {
	/*moveUp() - 12,
 moveRight() - 21,
 moveUp() - 23,
 moveForth() - 16,
 moveLeft() - 12,
 moveForth() - 5,
 moveLeft() - 18,
 moveUp() - 17,
 moveBack() - 21,
 moveLeft() - 22,
 moveDown() - 20.
*/ 
	private int[] boundaries ={50,50,50};
	private int[] startCoordinates={30,0,30};
	private String[] funkcije = {"moveUp()-12", "moveRight()-21", "moveUp()-23", "moveForth()-16"," moveLeft()-12","moveForth()-5","moveLeft()-18", "moveUp()-17","moveBack()-21"," moveLeft()-22", "moveDown()-20"};
	Drone drone;
	
	@Test
	public void test() {
		drone = new Drone();
		String expectedCoordinates =  "("+Integer.toString(0 )+","+Integer.toString(30) +","+Integer.toString(30) +")";
		
		assertEquals( expectedCoordinates, help());
	}
	
	public String help() {
		
		for (int i=0; i<funkcije.length;i++) {
			String [] fk = funkcije[i].split("-");
			String part = fk[0];
			 if("moveUp()"==part){
				 int j = Integer.parseInt(fk[1]);
				 for(int m=0;m<j;m++) {
					 drone.moveUp();	 
				 }
				 
			 }
		}
		
		return "";
		
	}
}
