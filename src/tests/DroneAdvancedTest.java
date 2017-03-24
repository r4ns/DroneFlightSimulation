package tests;

import java.util.HashMap;

import drone.Drone;

public class DroneAdvancedTest {

	private int[] startCoordinates={30,0,30};
	private HashMap<String, Integer> lista=new HashMap<String, Integer>();
	Drone drone;
	
	
	public void test()
	{
		drone=new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		lista.put("MoveUp()", 12);
		lista.put("moveRight()", 21);
		lista.put("moveUp()", 23);
		lista.put("moveForth()", 16);
		lista.put("moveLeft()", 12);
		lista.put("moveForth()", 5);
		lista.put("moveLeft()", 18);
		lista.put("moveUp()", 17);
		lista.put("moveBack()", 21);
		lista.put("moveLeft()", 22);
		lista.put("moveDown()", 20);
		
	
		
		
	}
	public String helper(String funkcija, int brojPonavljanja)
	{
	
	for(int i=brojPonavljanja;i>0;i--)
	{
		
	}
	
	
		return null;
	}
}
