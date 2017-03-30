package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneAdvancedTest {
	
	Drone drone;
	
	@Test
	public void testPath(){
		Integer[] nizKoraka = {12, 21, 23, 16, 12, 5, 18, 17, 21, 22, 20};
		String[] nizSmerova = {"moveUp", "moveRight", "moveUp", "moveForth",
				"moveLeft", "moveForth", "moveLeft", "moveUp",
				"moveBack", "moveLeft", "moveDown"};
		
		String expectedResult = "Drone position: (" + 0 + "," + 30 + "," +  30 + ")"
				+ "\n Dron je stigao do cilja!!!"
				+"\n Broj dotaknutih ivica: 4";
		assertEquals(expectedResult,putanjaDrona(nizKoraka, nizSmerova, drone));
	}

	public String putanjaDrona(Integer[] nizKoraka, String[] nizSmerova, Drone drone){
		String poruka = "";
		drone = new Drone(30, 0, 30);
		for(int i = 0; i < 11; i++){
			for(int j = 0; j < nizKoraka[i]; j++){
				switch(nizSmerova[i]){
				case "moveUp":	   drone.moveUp();	   break;
				case "moveDown":   drone.moveDown();	break;
				case "moveRight":  drone.moveRight();	break;
				case "moveLeft":   drone.moveLeft() ;	break;
				case "moveBack":   drone.moveBack() ;	break;
				case "moveForth":  drone.moveForth();   break;
				}
			}
		}
		
		poruka = drone.getFormatedCoordinates();
		return poruka;
	}
}
