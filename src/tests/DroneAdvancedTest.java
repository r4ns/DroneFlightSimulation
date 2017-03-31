package tests;

import java.util.List;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.Assert.*;




import drone.Drone;

public class DroneAdvancedTest {

	private String movements[] = {"moveUp()", "moveRight()", "moveUp()", "moveForth()"
			,"moveLeft()","moveForth()","moveLeft()", "moveUp()","moveBack()"
			,"moveLeft()", "moveDown()"};
	
	int howManyTimes[]={12,21,23,16,12,5,18,17,21,22,20};
	
	Drone drone;
	
	@Test
	public void testMovementFromStartToEnd(){
		 drone = new Drone();
		
		String expectedCoordinates = "(0,30,30)";
		
		assertEquals("Drone position: "+expectedCoordinates,helperMovementFromStartToEnd(movements,howManyTimes));
		
	}
	
	public String helperMovementFromStartToEnd(String movements[], int howManyTimes[]){
		
		for (int i = 0; i < movements.length; i++) {
			if(movements[i]=="moveUp()"){
				for (int j = 0; j < howManyTimes[i]; j++) {
					drone.moveUp();
				}
			}
			
			
			if(movements[i]=="moveDown()" ){
				for (int j = 0; j < howManyTimes[i]; j++) {
					drone.moveDown();
					}
				}
			
			if(movements[i]=="moveRight()"){
				for (int j = 0; j < howManyTimes[i]; j++) {
					drone.moveRight();
					}
				}
			
			if(movements[i]=="moveLeft()" ){
				for (int j = 0; j < howManyTimes[i]; j++) {
					drone.moveLeft();
					}
				}
			
			
			if(movements[i]=="moveBack()" ){
				for (int j = 0; j < howManyTimes[i]; j++) {
					drone.moveBack();
					}
				}
			
			if(movements[i]=="moveForth()"){
				for (int j = 0; j < howManyTimes[i]; j++) {
					drone.moveForth();
					}
				}
		}
		
		return drone.getFormatedCoordinates();
	}
}
