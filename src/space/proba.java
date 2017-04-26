package space;

import drone.Cube;

public class proba {

	public static void main(String[] args) throws DroneException {


		/*int x = -2;
		
		try{
			
			checkNumber(x);
		} catch(DroneException e){
			
			System.out.println(e + "\n");
		}
		
		


	}
	
	public static void checkNumber(int x) throws DroneException{
		
		if(x<0){
			
			throw new DroneException(false);
		}
	}*/
		
		/*String [] methods = new String[6];
		
		methods[0] = "moveUp";
		
		methods[5] = "moveLeft";
		
		for(int i = 0; i<methods.length; i++){
			
			System.out.println(methods[i]);
		}*/
		
	Cube cubeFirst = new Cube(new int[] {0,0,0},1);
	Cube cubeSecond = new Cube(new int[] {0,1,0},1);
	
	try{
		
		check(cubeFirst,cubeSecond);
		
	} catch(DroneException e){
		
		System.out.println(e);
	}
	
	
	}
	
	
	public static void check(Cube cubeFirst, Cube cubeSecond) throws DroneException{
		
		if(cubeFirst.checkIfCubesAreTouching(cubeSecond) == true){
			
			throw new DroneException();
		}
	}
}
