package drone;

import space.FlySpace;

import utility.Cube;

public class DroneController {

	
	public static void main(String[] args) {		
	
		
		Cube malaKocka = new Cube(new int[]{10,10,10},30);
		Cube velikaKocka = new Cube(new int[]{0,0,0},50);
		Cube prepreka = new Cube(new int [] {20,5,10},1);
	
		
		FlySpace fs = new FlySpace(velikaKocka, malaKocka, 10, prepreka);
		
		Cube k2 = new Cube(new int[]{20,3,10},1);
		Cube k1 = new Cube(new int[]{19,2,10},1);
		
	
		Drone dron = new Drone(k1,k2,fs);
		
		System.out.println("Move forth:");
		
		System.out.println(dron.moveForth(5));
	}
}
