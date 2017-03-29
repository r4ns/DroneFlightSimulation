
package tests;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.junit.Test;

import drone.Drone;

public class DroneAdvancedTest {
	Drone drone;
	private int [] boundaries={50,50,50};
	private int [] startCoordinates = {30,0,30};
	
	@Test
	public void celaPutanja(){
		drone = new Drone(boundaries, startCoordinates);
		System.out.println("Drone position: (30,0,30)");
		System.out.println("-------------Moving up-------------");
		for(int i=0; i<12; i++)
		{
			System.out.println(drone.moveUp());
		}
		
		System.out.println("-------------Moving right-------------");
		for(int i=0; i<21; i++)
		{
			System.out.println(drone.moveRight());
		}
		
		System.out.println("-------------Moving up-------------");
		for(int i=0; i<23; i++)
		{
			System.out.println(drone.moveUp());
		}
		
		System.out.println("-------------Moving forth(back)-------------");
		//treba back a ne forth zato sto se z smanjuje
		
		for(int i=0; i<16; i++)
		{
			System.out.println(drone.moveBack());
		}
		
		System.out.println("-------------Moving left-------------");
		for(int i=0; i<12; i++)
		{
			System.out.println(drone.moveLeft());
		}
		
		System.out.println("-------------Moving forth(back)-------------");
		for(int i=0; i<5; i++)
		{
			System.out.println(drone.moveBack());
		}
		
		System.out.println("-------------Moving left-------------");
		for(int i=0; i<18; i++)
		{
			System.out.println(drone.moveLeft());
		}
		
		System.out.println("-------------Moving up-------------");
		for(int i=0; i<17; i++)
		{
			System.out.println(drone.moveUp());
		}
		
		System.out.println("-------------Moving back(forth)-------------");
		for(int i=0; i<21; i++)
		{
			System.out.println(drone.moveForth());
		}
		System.out.println("-------------Moving left-------------");
		for(int i=0; i<22; i++)
		{
			System.out.println(drone.moveLeft());
		}
		System.out.println("-------------Moving down-------------");
		for(int i=0; i<20; i++)
		{
			System.out.println(drone.moveDown());
		}
	}

}