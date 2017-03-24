package tests;

import java.awt.List;
import java.util.ArrayList;

import org.junit.Test;

import drone.Drone;

public class DroneAdvancedTest {

	private int[] startCoordinates = {30,0,30};
	
	Drone drone;
	String expectedCoordinates = "Drone position (0,30,30)";
	
	@Test
	public void testDrone(){
		String niz_metoda = new String{
	}
	
	

String helper(String ime_metode,int broj_ponavljanja){
	if(ime_metode == "moveUp()")
	{
		for (int i = 0; i < broj_ponavljanja; i++) {
			drone.moveUp();
		}
	}
	if(ime_metode == "moveDown()")
	{
		for (int i = 0; i < broj_ponavljanja; i++) {
			drone.moveDown();
		}
	}
	if(ime_metode == "moveLeft()")
	{
		for (int i = 0; i < broj_ponavljanja; i++) {
			drone.moveLeft();
		}
	}
	if(ime_metode == "moveRight()")
	{
		for (int i = 0; i < broj_ponavljanja; i++) {
			drone.moveRight();
		}
	}
	if(ime_metode == "moveBack()")
	{
		for (int i = 0; i < broj_ponavljanja; i++) {
			drone.moveBack();
		}
	}
	if(ime_metode == "moveForth()")
	{
		for (int i = 0; i < broj_ponavljanja; i++) {
			drone.moveBack();
		}
	}
	return drone.getFormatedCoordinates();
}
	
}
