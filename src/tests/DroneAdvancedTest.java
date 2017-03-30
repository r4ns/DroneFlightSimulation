package tests;

import org.junit.Test;
import static org.junit.Assert.*;

import drone.Drone;

public class DroneAdvancedTest {
	
	private int[] boundaries = {50,50,50};
	private int[] startCoordinates = {30,0,30};
	Drone drone;
	
	
	String expectedCoordinates = "Drone position: (" 
			 + Integer.toString(0) + ","
			 + Integer.toString(30) + ","
			 + Integer.toString(30) + ")";
	
	String[] commands = {
			"moveUp 12", "moveRight 21", "moveUp 23", "moveForth 16", "moveLeft 12", "moveForth 5",
			"moveLeft 18", "moveUp 17", "moveBack 21", "moveLeft 22", "moveDown 20"};
	
		public String helperMoveDrone(String [] commands){
			drone = new Drone();
			int i = 0;
			while(i<commands.length){
				int command = Integer.parseInt(commands[i]);
				if(commands[1] == "moveUp"){
					int j = 0;
					while(j<command){
						String s = drone.moveUp();
						j++;
					}
				}
				else if(commands[i] == "moveDown"){
					int j = 0;
					while(j<command){
						String s = drone.moveDown();
						j++;
					}
				}
				else if(commands[i] == "moveLeft"){
					int j = 0;
					while(j<command){
						String s = drone.moveLeft();
						j++;
					}
				}
				else if(commands[i] == "moveRight"){
					int j = 0;
					while(j<command){
						String s = drone.moveRight();
						j++;
					}
				}
				else if(commands[i] == "moveForth"){
					int j = 0;
					while(j<command){
						String s = drone.moveForth();
						j++;
					}
				}
				else if(commands[i] == "moveBack"){
					int j = 0;
					while(j<command){
						String s = drone.moveBack();
						j++;
					}
				}
				i++;
			}
			return drone.getFormatedCoordinates();
		}
}

