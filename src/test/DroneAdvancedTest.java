package test;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneAdvancedTest {
	
	public String helperMovement(Drone dron, String[] smer, int[] brPomeranja){
		
		int i = 0;
		
		while(i < smer.length)
		{
			switch(smer[i])
			{
				case "moveUp": {
					//System.out.println("---Dron ide gore---");
					for(int j = 0; j < brPomeranja[i]; j++)
						System.out.println(dron.moveUp());
					break;
				}
				case "moveDown": {
					//System.out.println("---Dron ide dole---");
					for(int j = 0; j < brPomeranja[i]; j++)
						System.out.println(dron.moveDown());
					break;
				}
				case "moveLeft": {
					//System.out.println("---Dron ide levo---");
					for(int j = 0; j < brPomeranja[i]; j++)
						System.out.println(dron.moveLeft());
					break;
				}
				case "moveRight": {
					//System.out.println("---Dron ide desno---");
					for(int j = 0; j < brPomeranja[i]; j++)
						System.out.println(dron.moveRight());
					break;
				}
				case "moveForth": {
					//System.out.println("---Dron ide napred---");
					for(int j = 0; j < brPomeranja[i]; j++)
						System.out.println(dron.moveForth());
					break;
				}
				case "moveBack": {
					//System.out.println("---Dron ide nazad---");
					for(int j = 0; j < brPomeranja[i]; j++)
						System.out.println(dron.moveBack());
					break;
				}
			}
			i++;
		}
		
		return dron.getFormatedCoordinates();
	}
	
	@Test
	public void testDroneMovementOnGivenPath(){
		Drone dron = new Drone();
		String[] smer = {"moveUp","moveRight","moveUp","moveForth","moveLeft","moveForth","moveLeft","moveUp","moveBack", "moveLeft","moveDown"};
		int[] brPomeranja = {12, 21, 23, 16, 12, 5 ,18, 17, 21, 22, 20};
		String expected = "Pozicija drona: "+Integer.toString(0)+", "+Integer.toString(30)+", "+Integer.toString(30);
		assertEquals(helperMovement(dron, smer, brPomeranja),expected);	
	}
	
	public String helperMoveToUpBoundary(Drone dron){
		for(int i = 0; i < 52; i++)
			dron.moveUp();
		return dron.getFormatedCoordinates();
	}
	
	@Test
	public void testOutOfBoundariesUp(){
		Drone dron = new Drone(30,0,5);
		String expected = "Pozicija drona: "+Integer.toString(30)+", "+Integer.toString(50)+", "+Integer.toString(5);
		assertEquals(expected, helperMoveToUpBoundary(dron));
	}

	public String helperMoveToDownBoundary(Drone dron){
		for(int i = 0; i < 12; i++)
			dron.moveDown();
		return dron.getFormatedCoordinates();
	}
	
	@Test
	public void testOutOfBoundariesDown(){
		Drone dron = new Drone(30,10,5);
		String expected = "Pozicija drona: "+Integer.toString(30)+", "+Integer.toString(0)+", "+Integer.toString(5);
		assertEquals(expected, helperMoveToDownBoundary(dron));
	}
	
	public String helperMoveToLeftBoundary(Drone dron){
		for(int i = 0; i < 32; i++)
			dron.moveLeft();
		return dron.getFormatedCoordinates();
	}
	
	@Test
	public void testOutOfBoundariesLeft(){
		Drone dron = new Drone(30,10,5);
		String expected = "Pozicija drona: "+Integer.toString(0)+", "+Integer.toString(10)+", "+Integer.toString(5);
		assertEquals(expected, helperMoveToLeftBoundary(dron));
	}

	public String helperMoveToRightBoundary(Drone dron){
		for(int i = 0; i < 22; i++)
			dron.moveRight();
		return dron.getFormatedCoordinates();
	}
	
	@Test
	public void testOutOfBoundariesRight(){
		Drone dron = new Drone(30,10,5);
		String expected = "Pozicija drona: "+Integer.toString(50)+", "+Integer.toString(10)+", "+Integer.toString(5);
		assertEquals(expected, helperMoveToRightBoundary(dron));
	}
	
	public String helperMoveToFrontBoundary(Drone dron){
		for(int i = 0; i < 7; i++)
			dron.moveForth();
		return dron.getFormatedCoordinates();
	}
	
	@Test
	public void testOutOfBoundariesFront(){
		Drone dron = new Drone(30,10,5);
		String expected = "Pozicija drona: "+Integer.toString(30)+", "+Integer.toString(10)+", "+Integer.toString(0);
		assertEquals(expected, helperMoveToFrontBoundary(dron));
	}
	
	public String helperMoveToBackBoundary(Drone dron){
		for(int i = 0; i < 46; i++)
			dron.moveBack();
		return dron.getFormatedCoordinates();
	}
	
	@Test
	public void testOutOfBoundariesBack(){
		Drone dron = new Drone(30,10,5);
		String expected = "Pozicija drona: "+Integer.toString(30)+", "+Integer.toString(10)+", "+Integer.toString(50);
		assertEquals(expected, helperMoveToBackBoundary(dron));
	}
	
	
	
}
