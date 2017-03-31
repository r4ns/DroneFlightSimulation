package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import drone.Drone;

public class DroneTestAdvanced {
 
	private int[] boundaries ={50,50,50};
	private int[] startCoordinates={30,0,30};
	private String[] poziviFunkcija = {"moveUp()-12", "moveRight()-21", "moveUp()-23", "moveForth()-16","moveLeft()-12","moveForth()-5","moveLeft()-18", "moveUp()-17","moveBack()-21","moveLeft()-22", "moveDown()-20"};
	Drone drone;
	
	@Test
	public void test() {
		
		String expectedCoordinates =  "("+0 +","+30 +","+30 +")";
		
		assertEquals( expectedCoordinates, pom());
		
	}
	
	public String pom() {
		drone = new Drone(30,0,30, boundaries);
		for (int i=0; i<poziviFunkcija.length;i++) {
			String [] fk = poziviFunkcija[i].split("-");
			
				
			
			String part = fk[0];
			
			 if(part.equals("moveUp()"))
			 	{
				 int j = Integer.parseInt(fk[1]);
				 for(int m=0;m<j;m++) {
					 drone.moveUp();
					 
				 }
				 
			 }
			  else if(part.equals("moveDown()")){
				 int j = Integer.parseInt(fk[1]);
				 for(int m=0;m<j;m++) {
					 drone.moveDown();	 
				 }
				 
			 }
			 else if(part.equals("moveRight()")){
				 int j = Integer.parseInt(fk[1]);
				 for(int m=0;m<j;m++) {
					 drone.moveRight();	 
				 }
				 
			 }
			 else if(part.equals("moveLeft()")){
				 int j = Integer.parseInt(fk[1]);
				 for(int m=0;m<j;m++) {
					 drone.moveLeft();	 
				 }
				 
			 }
			 else if(part.equals("moveBack()")){
				 int j = Integer.parseInt(fk[1]);
				 for(int m=0;m<j;m++) {
					 drone.moveBack();	 
				 }
				 
			 }
			 else if(part.equals("moveForth()")){
				 int j = Integer.parseInt(fk[1]);
				 for(int m=0;m<j;m++) {
					 drone.moveForth();	 
				 }
				 
			 }
			
		}
		
		
		
		return  "("+drone.getX() +","+drone.getY() +","+drone.getZ() +")"; 
		
	}
}
