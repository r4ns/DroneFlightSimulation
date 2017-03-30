package test;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneBasicTest {
	
	@Test
	public void testUpMovement(){
		Drone dron = new Drone();
		String expected = "Pozicija drona: "+Integer.toString(dron.getX())+", "+Integer.toString(dron.getY()+1)+", "+Integer.toString(dron.getZ());
		assertEquals(expected, dron.moveUp());
	}
	
	@Test
	public void testDownMovement(){
		Drone dron = new Drone();
		String expected = "Pozicija drona: "+Integer.toString(dron.getX())+", "+Integer.toString(dron.getY())+", "+Integer.toString(dron.getZ());
		assertEquals(expected, dron.moveDown());
	}
	
	@Test
	public void testLeftMovement(){
		Drone dron = new Drone();
		String expected = "Pozicija drona: "+Integer.toString(dron.getX()-1)+", "+Integer.toString(dron.getY())+", "+Integer.toString(dron.getZ());
		assertEquals(expected, dron.moveLeft());
	}
	
	@Test
	public void testRightMovement(){
		Drone dron = new Drone();
		String expected = "Pozicija drona: "+Integer.toString(dron.getX()+1)+", "+Integer.toString(dron.getY())+", "+Integer.toString(dron.getZ());
		assertEquals(expected, dron.moveRight());
	}
	
	@Test
	public void testFarwardMovement(){
		Drone dron = new Drone();
		String expected = "Pozicija drona: "+Integer.toString(dron.getX())+", "+Integer.toString(dron.getY())+", "+Integer.toString(dron.getZ()-1);
		assertEquals(expected, dron.moveForth());
	}
	
	@Test
	public void testBackwardMovement(){
		Drone dron = new Drone();
		String expected = "Pozicija drona: "+Integer.toString(dron.getX())+", "+Integer.toString(dron.getY())+", "+Integer.toString(dron.getZ()+1);
		assertEquals(expected, dron.moveBack());
	}
}
