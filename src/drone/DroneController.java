package drone;

import space.FlySpace;
import utility.Cube;

public class DroneController {

	
	public static void main(String[] args) {
		
		Cube malaKocka = new Cube(new int[]{10,10,10},30);
		Cube velikaKocka = new Cube(new int[]{0,0,0},50);
		Cube prepreka = new Cube(new int [] {20,6,10},1);
		Cube prepreka1 = new Cube(new int [] {28,5,10},1);
		//Cube [] nizPrepreka = new Cube []{new Cube(new int []{25,5,10},1), new Cube (new int[]{30,8,10},1)};
		FlySpace fs = new FlySpace(velikaKocka, malaKocka, 10, prepreka,prepreka1);
		//FlySpace fs = new FlySpace(velikaKocka, malaKocka, 10, nizPrepreka);
		Cube k2 = new Cube(new int[]{20,5,10},1);
		Cube k1 = new Cube(new int[]{19,4,10},1);
		
	
		DoubleCubeDron dron = new DoubleCubeDron(k1,k2,fs);
		
		System.out.println("Move up:");
		System.out.println(dron.moveUp(5));
		System.out.println("Move right:");
		System.out.println(dron.moveRight(6));
		
		
	}
}
