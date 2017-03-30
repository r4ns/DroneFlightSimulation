package test;

import static org.junit.Assert.*;

import java.util.LinkedHashMap;

import org.junit.Test;

import drone.Drone;

public class DroneAdvancedTest {

	Drone drone;
	
	@Test
	public void testPath(){
		drone = new Drone();
		Object[] array = {
					"moveUp", 12, 
					"moveRight", 21,
					"moveUp", 23,
					"moveForth", 16,
					"moveLeft", 12,
					"moveForth", 5,
					"moveLeft", 18,
					"moveUp", 17,
					"moveBack", 21,
					"moveLeft", 22,
					"moveDown", 20
		};
		String expectedResult = "[" + 0 + ", " + 30 + ", " +  30 + "]";
		assertEquals(helperMoveDrone(array, drone), expectedResult);
	}
	
	public String helperMoveDrone(Object[] array, Drone drone){
		int i = 0;
		String result = null;
		while (i < array.length){
			switch((String)array[i]){
			case "moveUp": {
				
				for (int j = 0; j < (int)array[i + 1]; j++)
					result = drone.moveUp();
				break;
			}
			case "moveDown":{
				for (int j = 0; j < (int)array[i + 1]; j++)
					result = drone.moveDown();
				break;
			}
			case "moveForth":{
				for (int j = 0; j < (int)array[i + 1]; j++)
					result = drone.moveForth();
				break;
			}
			case "moveBack":{
				for (int j = 0; j < (int)array[i + 1]; j++)
					result = drone.moveBack();
				break;
				
			}
			case "moveRight":{
				for (int j = 0; j < (int)array[i + 1]; j++)
					result = drone.moveRight();
				break;
				
			}
			case "moveLeft":{
				for (int j = 0; j < (int)array[i + 1]; j++)
					result = drone.moveLeft();
				break;
				
			}
				default: {
					System.out.println((String)array[i]);
					i++;
				}
				
			}
			i += 2;
		}
		return drone.getFormatedCoordinates();
		
	}
}
