package tests;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;

import drone.Drone;

public class DroneAdvancedTest {
	Drone drone;
	@Test
	public void testPath(){
		String expectedCoordinates="Drone position: "+"("+Integer.toString(0)+","+Integer.toString(30)+","+Integer.toString(30)+")";
		String smer[]={"up","right","up","back","left","back","left","up","forth","left","down"};
		int ponavljanja[]={12,21,23,16,12,5,18,17,21,22,20};
		
		
		assertEquals(expectedCoordinates, helperDrone(smer,ponavljanja));
		
		
	}
	
	public String helperDrone(String smer[],int ponavljanja[]){
		drone=new Drone();
		for(int i=0;i<ponavljanja.length;i++){
			if(smer[i]=="up"){
				for(int j=0;j<ponavljanja[i];j++)
					drone.moveUp();
			}
			if(smer[i]=="down"){
				for(int j=0;j<ponavljanja[i];j++)
					drone.moveDown();
			}
			if(smer[i]=="right"){
				for(int j=0;j<ponavljanja[i];j++)
					drone.moveRight();
			}
			if(smer[i]=="left"){
				for(int j=0;j<ponavljanja[i];j++)
					drone.moveLeft();
			}
			if(smer[i]=="back"){
				for(int j=0;j<ponavljanja[i];j++)
					drone.moveBack();
			}
			if(smer[i]=="forth"){
				for(int j=0;j<ponavljanja[i];j++)
					drone.moveForth();
			}
		
				
				
			
		}
		return drone.getFormatedCoordinates();
		
		
	}

}
