package Test;
import static org.junit.Assert.* ;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.junit.Test;

import drone.Drone;

public class DroneTestBasic {
	
	private int[] boundaries  = {50,50,50};
	private int[] coordinates = {30,0,30};
	public Drone drone ;
	
	@Test(timeout = 1000)
	public void testInitialMoveUp(){
	drone = new Drone(30 ,0 ,30); 
	drone.moveUp(12);
	drone.moveRight(21);
	drone.moveUp(23);
	drone.moveForth(16);
	drone.moveLeft(12);
	drone.moveForth(5);
	drone.moveLeft(18);
	drone.moveUp(17);
	drone.moveLeft(22);
	drone.moveDown(20);
	
	
	
	}
	
}
