package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import drone.Drone;


    public class DroneTestAdvanced {
	private Drone drone;
	private int[] startCoordinates={30,0,30};
	String expectedCoordinates;
	private String[] methods = {"moveUp", "moveRight", "moveUp", "moveForth", "moveLeft", "moveForth","moveLeft","moveUp","moveBack","moveLeft","moveDown"};

	private int[] putanja = {12, 21, 23, 16, 12, 5, 18, 17, 21, 22, 20};

	public int[] pomocne={0,30,30};
	
	@Test
	public void testPutanja(){
		expectedCoordinates="("+pomocne[0]+","+pomocne[1]+","+pomocne[2]+")";
		assertEquals(expectedCoordinates, helper(methods,putanja));

	}
		public String helper(String[] metode,int[] putanja){
		drone = new Drone(startCoordinates);
		for(int i=0;i<metode.length;i++){
			for(int j=0;j<putanja[i];j++){
				if(methods[i]=="moveUp")
					drone.moveUp();
				else if(methods[i]=="moveDown")
					drone.moveDown();
				else if(methods[i]=="moveRight")
					drone.moveRight();
				else if(methods[i]=="moveLeft")
					drone.moveLeft();
				else if(methods[i]=="moveForth")
					drone.moveForth();
				else
				{
					drone.moveBack();
				}
			}
		}

		return drone.getFormatedCoordinates();
	}
}
