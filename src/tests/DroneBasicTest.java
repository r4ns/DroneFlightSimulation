package tests;

import org.junit.Test;
import drone.Drone;
import static org.junit.Assert.*;
public class DroneBasicTest {

	
	
	private int[] boundaries={50,50,50};
	private int[] startCoordinates={30,0,30};
	Drone drone;
	
	
	@Test
	public void testInitialMoveUp() {
		
		drone=new Drone(boundaries,startCoordinates);

   String expectedCoordinates= "Drone position: (" + 
		   						Integer.toString(startCoordinates[0]) + ", " +Integer.toString(startCoordinates[1]+1) + ", " + Integer.toString(startCoordinates[2]) + ")";
   
   assertEquals(expectedCoordinates, drone.moveUp());
	} 
	
	@Test
	public void testInitialMoveDown() {
		drone=new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates= "Drone position: (" 
								+Integer.toString(startCoordinates[0]) + ", "
								+Integer.toString(startCoordinates[1])+ ", "
								+Integer.toString(startCoordinates[2]) + ")";
		
		 extracted(expectedCoordinates);
		
	}

	private void extracted(String expectedCoordinates) {
		assertEquals(expectedCoordinates, drone.moveDown());
	}
	
	@Test
	public void testInitialMoveLeft() {
		drone=new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates= "Drone position: (" 
								+Integer.toString(startCoordinates[0]-1) + ", "
								+Integer.toString(startCoordinates[1]) + ", "
								+Integer.toString(startCoordinates[2]) + ")";
		
		 assertEquals(expectedCoordinates, drone.moveLeft());
		
	}
	
	@Test
	public void testInitialMoveRight() {
		drone=new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates= "Drone position: (" 
								+Integer.toString(startCoordinates[0]+1) + ", "
								+Integer.toString(startCoordinates[1]) + ", "
								+Integer.toString(startCoordinates[2]) + ")";
		
		 assertEquals(expectedCoordinates, drone.moveRight());
		
	}
	
	
	@Test
	public void testInitialMoveForth() {
		drone=new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates= "Drone position: (" 
								+Integer.toString(startCoordinates[0]) + ", "
								+Integer.toString(startCoordinates[1]) + ", "
								+Integer.toString(startCoordinates[2]-1) + ")";
		
		 assertEquals(expectedCoordinates, drone.moveForth());
		
	}
	
	
	@Test
	public void testInitialMoveBack() {
		drone=new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates= "Drone position: (" 
								+Integer.toString(startCoordinates[0]) + ", "
								+Integer.toString(startCoordinates[1]) + ", "
								+Integer.toString(startCoordinates[2]+1) + ")";
		
		 assertEquals(expectedCoordinates, drone.moveBack());
		
	}
	@Test
	 	public void testiranjeGranicaGore () {
	 		drone = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
	 		String expectedCoordinates = "Drone position: (" 
	 				+ Integer.toString(startCoordinates[0])+ ", " 
	 				+ Integer.toString(startCoordinates[1] + 10) + ", " 
	 				+ Integer.toString(startCoordinates[2]) + ")";
	 
	 		assertEquals(expectedCoordinates, helper(drone, 20, "moveup"));
	 	}
	 
	 	@Test
	 	public void testiranjeGranicaDole () {
	 		drone = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
	 		String expectedCoordinates = "Drone position: (" 
	 				+ Integer.toString(startCoordinates[0])+ ", " 
	 				+ Integer.toString(startCoordinates[1]) + ", " 
	 				+ Integer.toString(startCoordinates[2]) + ")";
	 
	 		assertEquals(expectedCoordinates, helper(drone,20 , "movedown"));
	 	}
	 
 	@Test
	 	public void testiranjeGranicaDesno () {
	 		drone = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
	 		String expectedCoordinates = "Drone position: (" 
	 				+ Integer.toString(startCoordinates[0] + 20)+ ", " 
	 				+ Integer.toString(startCoordinates[1]) + ", " 
	 				+ Integer.toString(startCoordinates[2]) + ")";
	 
	 		assertEquals(expectedCoordinates, helper(drone, 20, "moveright"));
	 	}
	 
	 	@Test
	 	public void testiranjeGranicaLevo () {
	 		drone = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
	 		String expectedCoordinates = "Drone position: (" 
	 				+ Integer.toString(startCoordinates[0] - 30)+ ", " 
	 				+ Integer.toString(startCoordinates[1]) + ", " 
	 				+ Integer.toString(startCoordinates[2]) + ")";
	 
	 		assertEquals(expectedCoordinates, helper(drone, 70, "moveleft"));
	 	}
	 
	 	@Test
	 	public void testiranjeGranicaNapred () {
	 		drone = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
	 		String expectedCoordinates = "Drone position: (" 
	 				+ Integer.toString(startCoordinates[0])+ ", " 
	 				+ Integer.toString(startCoordinates[1]) + ", " 
	 				+ Integer.toString(startCoordinates[2] - 30) + ")";
	 
	 		assertEquals(expectedCoordinates, helper(drone, 70, "moveforth"));
	 	}
	 
	 	@Test
	 	public void testiranjeGranicaNazad () {
	 		drone = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
	 		String expectedCoordinates = "Drone position: (" 
	 				+ Integer.toString(startCoordinates[0])+ ", " 
	 				+ Integer.toString(startCoordinates[1]) + ", " 
	 				+ Integer.toString(startCoordinates[2] + 20) + ")";
	 
	 		assertEquals(expectedCoordinates, helper(drone, 20, "moveback"));
	 	}
	 	
	 public String helper(Drone drone, int moves, String direction) {
	 		 		
	 		 			if (direction.equals("moveup")){
	 		 				for (int i = 0; i < moves; i++)
	 		 					drone.moveUp();
	 		 			}
	 		 			else if (direction.equals("movedown")){
	 		 				for (int i = 0; i < moves; i++)
	 		 					drone.moveDown();
	 		 			}
	 		 			else if (direction.equals("moveleft")){
	 		 				for (int i = 0; i < moves; i++)
	 		 					drone.moveLeft();
	 		 			}
	 		 			else if (direction.equals("moveright")){
	 		 				for (int i = 0; i < moves; i++)
	 		 				drone.moveRight();
	 		 			}
	 		 			else if (direction.equals("moveforth")){
	 		 				for (int i = 0; i < moves; i++)
	 		 					drone.moveForth();
	 		 			}
	 		 			else if (direction.equals("moveback")){
	 		 				for (int i = 0; i < moves; i++)
	 		 					drone.moveBack();
	 		 			}
	 		 		
	 		 		System.out.println("Krajnja pozicija drona: "+ drone.getFormatedCoordinates());
	 		 		return drone.getFormatedCoordinates();
	 		 	}
	}	
