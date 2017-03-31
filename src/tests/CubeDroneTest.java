package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import drone.StandardDrone;
import space.DroneTacka;
import space.FlySpace;

public class CubeDroneTest {
	@Test
	public void test1(){
		
	
		
		int[] startCoordinates = {30,0,30};
		DroneTacka d = new DroneTacka(startCoordinates);
		
		System.out.println("sgranica1: " + d.space.getsGranica2()[0] + " ugranica 1: " + d.space.getuGranica2()[0]);
		
		System.out.println("-------------Moving up-------------");
		for(int i = 0; i <= 12; i++){
			System.out.println(d.moveUp());
		}
		
		System.out.println("-------------Moving right-------------");
		for(int i = 0; i <= 20; i++){
			System.out.println(d.moveRight());
		}
		
		System.out.println("-------------Moving up-------------");
		for(int i = 0; i <= 22; i++){
			System.out.println(d.moveUp());
		}
		
		System.out.println("-------------Moving forth-------------");
		for(int i = 0; i <= 15; i++){
			System.out.println(d.moveForth());
		}
		
		System.out.println("-------------Moving left-------------");
		for(int i = 0; i <= 11; i++){
			System.out.println(d.moveLeft());
		}
		
		System.out.println("-------------Moving forth-------------");
		for(int i = 0; i <= 4; i++){
			System.out.println(d.moveForth());
		}
		
				
		System.out.println("-------------Moving left-------------");
		for(int i = 0; i <= 17; i++){
			System.out.println(d.moveLeft());
		}
		
		System.out.println("-------------Moving up-------------");
		for(int i = 0; i <= 16; i++){
			System.out.println(d.moveUp());
		}
		
		System.out.println("-------------Moving back-------------");
		for(int i = 0; i <= 20; i++){
			System.out.println(d.moveBack());
		}
		
		
		System.out.println("-------------Moving left-------------");
		for(int i = 0; i <= 21; i++){
			System.out.println(d.moveLeft());
		}
		
		System.out.println("-------------Moving down-------------");
		for(int i = 0; i <= 19; i++){
			System.out.println(d.moveDown());
		}
		
		System.out.println(d.granice());
		
		assertEquals("0,10,40,50---0,10,40,50---0,10,40,50---", d.granice());
	}
	
	
	
	
}
